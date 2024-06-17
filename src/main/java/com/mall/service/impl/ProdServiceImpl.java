package com.mall.service.impl;

import com.mall.entity.po.Prod;
import com.mall.mapper.ProdMapper;
import com.mall.service.ProdService;
import com.mall.entity.query.ProdQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: 商品ProdServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("prodServiceImpl")
public class ProdServiceImpl implements ProdService {
	@Autowired
	private ProdMapper<Prod, ProdQuery> prodMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<Prod> selectListByCondition(ProdQuery prodQuery) {
		return prodMapper.selectList(prodQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(ProdQuery prodQuery) {
		return prodMapper.selectCount(prodQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<Prod> selectList(ProdQuery prodQuery) {
		int count = Math.toIntExact(this.selectCount(prodQuery));
		int pageSize = prodQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : prodQuery.getPageSize();
		SimplePage simplePage = new SimplePage(prodQuery.getPageNo(), count, pageSize);
		prodQuery.setSimplePage(simplePage);
		List<Prod> prod = this.selectListByCondition(prodQuery);
		return new PaginationResultVo<Prod>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), prod);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(Prod prod) {
		return prodMapper.insert(prod);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<Prod> prodList) {
		return prodMapper.insertBatch(prodList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<Prod> prodList) {
		return prodMapper.insertBatch(prodList);
	}

	/**
	 * 根据ProdId查询
	 */
	@Override
	public Prod selectByProdId(Long prodId) {
		return prodMapper.selectByProdId(prodId);
	}

	/**
	 * 根据ProdId更新
	 */
	@Override
	public Integer updateByProdId(Prod prod, Long prodId) {
		return prodMapper.updateByProdId(prod, prodId);
	}

	/**
	 * 根据ProdId删除
	 */
	@Override
	public Integer deleteByProdId(Long prodId) {
		return prodMapper.deleteByProdId(prodId);
	}
}