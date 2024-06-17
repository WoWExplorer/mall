package com.mall.service;

import com.mall.entity.po.Sku;
import com.mall.entity.query.SkuQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: 单品SKU表Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface SkuService {

	/**
	 * 根据条件查询列表
	 */
	List<Sku> selectListByCondition(SkuQuery skuQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(SkuQuery skuQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<Sku> selectList(SkuQuery skuQuery);

	/**
	 * 新增
	 */
	Integer insert(Sku sku);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<Sku> sku);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<Sku> skuList);

	/**
	 * 根据SkuId查询
	 */
	Sku selectBySkuId(Long skuId);

	/**
	 * 根据SkuId更新
	 */
	Integer updateBySkuId(Sku SkuQuery, Long skuId);

	/**
	 * 根据SkuId删除
	 */
	Integer deleteBySkuId(Long skuId);


}