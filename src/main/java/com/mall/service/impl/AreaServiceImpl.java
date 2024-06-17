package com.mall.service.impl;

import com.mall.entity.po.Area;
import com.mall.mapper.AreaMapper;
import com.mall.service.AreaService;
import com.mall.entity.query.AreaQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: AreaServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("areaServiceImpl")
public class AreaServiceImpl implements AreaService {
	@Autowired
	private AreaMapper<Area, AreaQuery> areaMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<Area> selectListByCondition(AreaQuery areaQuery) {
		return areaMapper.selectList(areaQuery);
	}

	@Override
	public List<Area> getAllRegions() {
		return areaMapper.getAllRegions();
	}

	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(AreaQuery areaQuery) {
		return areaMapper.selectCount(areaQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<Area> selectList(AreaQuery areaQuery) {
		int count = Math.toIntExact(this.selectCount(areaQuery));
		int pageSize = areaQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : areaQuery.getPageSize();
		SimplePage simplePage = new SimplePage(areaQuery.getPageNo(), count, pageSize);
		areaQuery.setSimplePage(simplePage);
		List<Area> area = this.selectListByCondition(areaQuery);
		return new PaginationResultVo<Area>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), area);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(Area area) {
		return areaMapper.insert(area);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<Area> areaList) {
		return areaMapper.insertBatch(areaList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<Area> areaList) {
		return areaMapper.insertBatch(areaList);
	}

	/**
	 * 根据AreaId查询
	 */
	@Override
	public Area selectByAreaId(Long areaId) {
		return areaMapper.selectByAreaId(areaId);
	}

	/**
	 * 根据AreaId更新
	 */
	@Override
	public Integer updateByAreaId(Area area, Long areaId) {
		return areaMapper.updateByAreaId(area, areaId);
	}

	/**
	 * 根据AreaId删除
	 */
	@Override
	public Integer deleteByAreaId(Long areaId) {
		return areaMapper.deleteByAreaId(areaId);
	}
}