package com.mall.service.impl;

import com.mall.entity.po.ProdProp;
import com.mall.mapper.ProdPropMapper;
import com.mall.service.ProdPropService;
import com.mall.entity.query.ProdPropQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: ProdPropServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("prodPropServiceImpl")
public class ProdPropServiceImpl implements ProdPropService {
	@Autowired
	private ProdPropMapper<ProdProp, ProdPropQuery> prodPropMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<ProdProp> selectListByCondition(ProdPropQuery prodPropQuery) {
		return prodPropMapper.selectList(prodPropQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(ProdPropQuery prodPropQuery) {
		return prodPropMapper.selectCount(prodPropQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<ProdProp> selectList(ProdPropQuery prodPropQuery) {
		int count = Math.toIntExact(this.selectCount(prodPropQuery));
		int pageSize = prodPropQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : prodPropQuery.getPageSize();
		SimplePage simplePage = new SimplePage(prodPropQuery.getPageNo(), count, pageSize);
		prodPropQuery.setSimplePage(simplePage);
		List<ProdProp> prodProp = this.selectListByCondition(prodPropQuery);
		return new PaginationResultVo<ProdProp>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), prodProp);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(ProdProp prodProp) {
		return prodPropMapper.insert(prodProp);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<ProdProp> prodPropList) {
		return prodPropMapper.insertBatch(prodPropList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<ProdProp> prodPropList) {
		return prodPropMapper.insertBatch(prodPropList);
	}

	/**
	 * 根据PropId查询
	 */
	@Override
	public ProdProp selectByPropId(Long propId) {
		return prodPropMapper.selectByPropId(propId);
	}

	/**
	 * 根据PropId更新
	 */
	@Override
	public Integer updateByPropId(ProdProp prodProp, Long propId) {
		return prodPropMapper.updateByPropId(prodProp, propId);
	}

	/**
	 * 根据PropId删除
	 */
	@Override
	public Integer deleteByPropId(Long propId) {
		return prodPropMapper.deleteByPropId(propId);
	}
}