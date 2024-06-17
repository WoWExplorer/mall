package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: 购物车Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface BasketMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据BasketId查询
	 */
	 T selectByBasketId(@Param("basketId") Long basketId);

	/**
	 * 根据BasketId更新
	 */
	 Integer updateByBasketId(@Param("bean") T t, @Param("basketId") Long basketId);

	/**
	 * 根据BasketId删除
	 */
	 Integer deleteByBasketId(@Param("basketId") Long basketId);

	/**
	 * 根据SkuIdAndUserIdAndShopId查询
	 */
	 T selectBySkuIdAndUserIdAndShopId(@Param("skuId") Long skuId, @Param("userId") String userId, @Param("shopId") Long shopId);

	/**
	 * 根据SkuIdAndUserIdAndShopId更新
	 */
	 Integer updateBySkuIdAndUserIdAndShopId(@Param("bean") T t, @Param("skuId") Long skuId, @Param("userId") String userId, @Param("shopId") Long shopId);

	/**
	 * 根据SkuIdAndUserIdAndShopId删除
	 */
	 Integer deleteBySkuIdAndUserIdAndShopId(@Param("skuId") Long skuId, @Param("userId") String userId, @Param("shopId") Long shopId);

}