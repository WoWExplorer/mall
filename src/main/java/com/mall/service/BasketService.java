package com.mall.service;

import com.mall.entity.po.Basket;
import com.mall.entity.query.BasketQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: 购物车Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface BasketService {

	/**
	 * 根据条件查询列表
	 */
	List<Basket> selectListByCondition(BasketQuery basketQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(BasketQuery basketQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<Basket> selectList(BasketQuery basketQuery);

	/**
	 * 新增
	 */
	Integer insert(Basket basket);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<Basket> basket);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<Basket> basketList);

	/**
	 * 根据BasketId查询
	 */
	Basket selectByBasketId(Long basketId);

	/**
	 * 根据BasketId更新
	 */
	Integer updateByBasketId(Basket BasketQuery, Long basketId);

	/**
	 * 根据BasketId删除
	 */
	Integer deleteByBasketId(Long basketId);

	/**
	 * 根据SkuIdAndUserIdAndShopId查询
	 */
	Basket selectBySkuIdAndUserIdAndShopId(Long skuId, String userId, Long shopId);

	/**
	 * 根据SkuIdAndUserIdAndShopId更新
	 */
	Integer updateBySkuIdAndUserIdAndShopId(Basket BasketQuery, Long skuId, String userId, Long shopId);

	/**
	 * 根据SkuIdAndUserIdAndShopId删除
	 */
	Integer deleteBySkuIdAndUserIdAndShopId(Long skuId, String userId, Long shopId);


}