package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface ShopDetailMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据ShopId查询
	 */
	 T selectByShopId(@Param("shopId") Long shopId);

	/**
	 * 根据ShopId更新
	 */
	 Integer updateByShopId(@Param("bean") T t, @Param("shopId") Long shopId);

	/**
	 * 根据ShopId删除
	 */
	 Integer deleteByShopId(@Param("shopId") Long shopId);

	/**
	 * 根据Mobile查询
	 */
	 T selectByMobile(@Param("mobile") String mobile);

	/**
	 * 根据Mobile更新
	 */
	 Integer updateByMobile(@Param("bean") T t, @Param("mobile") String mobile);

	/**
	 * 根据Mobile删除
	 */
	 Integer deleteByMobile(@Param("mobile") String mobile);

	/**
	 * 根据UserId查询
	 */
	 T selectByUserId(@Param("userId") String userId);

	/**
	 * 根据UserId更新
	 */
	 Integer updateByUserId(@Param("bean") T t, @Param("userId") String userId);

	/**
	 * 根据UserId删除
	 */
	 Integer deleteByUserId(@Param("userId") String userId);

}