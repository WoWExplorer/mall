package com.mall.service.impl;

import com.mall.entity.po.HotSearch;
import com.mall.mapper.HotSearchMapper;
import com.mall.service.HotSearchService;
import com.mall.entity.query.HotSearchQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: 热搜HotSearchServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("hotSearchServiceImpl")
public class HotSearchServiceImpl implements HotSearchService {
	@Autowired
	private HotSearchMapper<HotSearch, HotSearchQuery> hotSearchMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<HotSearch> selectListByCondition(HotSearchQuery hotSearchQuery) {
		return hotSearchMapper.selectList(hotSearchQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(HotSearchQuery hotSearchQuery) {
		return hotSearchMapper.selectCount(hotSearchQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<HotSearch> selectList(HotSearchQuery hotSearchQuery) {
		int count = Math.toIntExact(this.selectCount(hotSearchQuery));
		int pageSize = hotSearchQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : hotSearchQuery.getPageSize();
		SimplePage simplePage = new SimplePage(hotSearchQuery.getPageNo(), count, pageSize);
		hotSearchQuery.setSimplePage(simplePage);
		List<HotSearch> hotSearch = this.selectListByCondition(hotSearchQuery);
		return new PaginationResultVo<HotSearch>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), hotSearch);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(HotSearch hotSearch) {
		return hotSearchMapper.insert(hotSearch);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<HotSearch> hotSearchList) {
		return hotSearchMapper.insertBatch(hotSearchList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<HotSearch> hotSearchList) {
		return hotSearchMapper.insertBatch(hotSearchList);
	}

	/**
	 * 根据HotSearchId查询
	 */
	@Override
	public HotSearch selectByHotSearchId(Long hotSearchId) {
		return hotSearchMapper.selectByHotSearchId(hotSearchId);
	}

	/**
	 * 根据HotSearchId更新
	 */
	@Override
	public Integer updateByHotSearchId(HotSearch hotSearch, Long hotSearchId) {
		return hotSearchMapper.updateByHotSearchId(hotSearch, hotSearchId);
	}

	/**
	 * 根据HotSearchId删除
	 */
	@Override
	public Integer deleteByHotSearchId(Long hotSearchId) {
		return hotSearchMapper.deleteByHotSearchId(hotSearchId);
	}
}