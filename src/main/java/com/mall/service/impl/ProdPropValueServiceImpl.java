package com.mall.service.impl;

import com.mall.entity.po.ProdPropValue;
import com.mall.mapper.ProdPropValueMapper;
import com.mall.service.ProdPropValueService;
import com.mall.entity.query.ProdPropValueQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: ProdPropValueServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("prodPropValueServiceImpl")
public class ProdPropValueServiceImpl implements ProdPropValueService {
	@Autowired
	private ProdPropValueMapper<ProdPropValue, ProdPropValueQuery> prodPropValueMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<ProdPropValue> selectListByCondition(ProdPropValueQuery prodPropValueQuery) {
		return prodPropValueMapper.selectList(prodPropValueQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(ProdPropValueQuery prodPropValueQuery) {
		return prodPropValueMapper.selectCount(prodPropValueQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<ProdPropValue> selectList(ProdPropValueQuery prodPropValueQuery) {
		int count = Math.toIntExact(this.selectCount(prodPropValueQuery));
		int pageSize = prodPropValueQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : prodPropValueQuery.getPageSize();
		SimplePage simplePage = new SimplePage(prodPropValueQuery.getPageNo(), count, pageSize);
		prodPropValueQuery.setSimplePage(simplePage);
		List<ProdPropValue> prodPropValue = this.selectListByCondition(prodPropValueQuery);
		return new PaginationResultVo<ProdPropValue>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), prodPropValue);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(ProdPropValue prodPropValue) {
		return prodPropValueMapper.insert(prodPropValue);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<ProdPropValue> prodPropValueList) {
		return prodPropValueMapper.insertBatch(prodPropValueList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<ProdPropValue> prodPropValueList) {
		return prodPropValueMapper.insertBatch(prodPropValueList);
	}

	/**
	 * 根据ValueId查询
	 */
	@Override
	public ProdPropValue selectByValueId(Long valueId) {
		return prodPropValueMapper.selectByValueId(valueId);
	}

	/**
	 * 根据ValueId更新
	 */
	@Override
	public Integer updateByValueId(ProdPropValue prodPropValue, Long valueId) {
		return prodPropValueMapper.updateByValueId(prodPropValue, valueId);
	}

	/**
	 * 根据ValueId删除
	 */
	@Override
	public Integer deleteByValueId(Long valueId) {
		return prodPropValueMapper.deleteByValueId(valueId);
	}
}