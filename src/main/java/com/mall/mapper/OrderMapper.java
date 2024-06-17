package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: 订单表Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface OrderMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据OrderId查询
	 */
	 T selectByOrderId(@Param("orderId") Long orderId);

	/**
	 * 根据OrderId更新
	 */
	 Integer updateByOrderId(@Param("bean") T t, @Param("orderId") Long orderId);

	/**
	 * 根据OrderId删除
	 */
	 Integer deleteByOrderId(@Param("orderId") Long orderId);

	/**
	 * 根据OrderNumber查询
	 */
	 T selectByOrderNumber(@Param("orderNumber") String orderNumber);

	/**
	 * 根据OrderNumber更新
	 */
	 Integer updateByOrderNumber(@Param("bean") T t, @Param("orderNumber") String orderNumber);

	/**
	 * 根据OrderNumber删除
	 */
	 Integer deleteByOrderNumber(@Param("orderNumber") String orderNumber);

	/**
	 * 根据UserIdAndOrderNumber查询
	 */
	 T selectByUserIdAndOrderNumber(@Param("userId") String userId, @Param("orderNumber") String orderNumber);

	/**
	 * 根据UserIdAndOrderNumber更新
	 */
	 Integer updateByUserIdAndOrderNumber(@Param("bean") T t, @Param("userId") String userId, @Param("orderNumber") String orderNumber);

	/**
	 * 根据UserIdAndOrderNumber删除
	 */
	 Integer deleteByUserIdAndOrderNumber(@Param("userId") String userId, @Param("orderNumber") String orderNumber);

}