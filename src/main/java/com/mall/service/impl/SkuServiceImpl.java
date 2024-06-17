package com.mall.service.impl;

import com.mall.entity.po.Sku;
import com.mall.mapper.SkuMapper;
import com.mall.service.SkuService;
import com.mall.entity.query.SkuQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: 单品SKU表SkuServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("skuServiceImpl")
public class SkuServiceImpl implements SkuService {
	@Autowired
	private SkuMapper<Sku, SkuQuery> skuMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<Sku> selectListByCondition(SkuQuery skuQuery) {
		return skuMapper.selectList(skuQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(SkuQuery skuQuery) {
		return skuMapper.selectCount(skuQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<Sku> selectList(SkuQuery skuQuery) {
		int count = Math.toIntExact(this.selectCount(skuQuery));
		int pageSize = skuQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : skuQuery.getPageSize();
		SimplePage simplePage = new SimplePage(skuQuery.getPageNo(), count, pageSize);
		skuQuery.setSimplePage(simplePage);
		List<Sku> sku = this.selectListByCondition(skuQuery);
		return new PaginationResultVo<Sku>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), sku);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(Sku sku) {
		return skuMapper.insert(sku);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<Sku> skuList) {
		return skuMapper.insertBatch(skuList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<Sku> skuList) {
		return skuMapper.insertBatch(skuList);
	}

	/**
	 * 根据SkuId查询
	 */
	@Override
	public Sku selectBySkuId(Long skuId) {
		return skuMapper.selectBySkuId(skuId);
	}

	/**
	 * 根据SkuId更新
	 */
	@Override
	public Integer updateBySkuId(Sku sku, Long skuId) {
		return skuMapper.updateBySkuId(sku, skuId);
	}

	/**
	 * 根据SkuId删除
	 */
	@Override
	public Integer deleteBySkuId(Long skuId) {
		return skuMapper.deleteBySkuId(skuId);
	}
}