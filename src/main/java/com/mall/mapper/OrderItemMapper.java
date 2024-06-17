package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: 订单项Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface OrderItemMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据OrderItemId查询
	 */
	 T selectByOrderItemId(@Param("orderItemId") Long orderItemId);

	/**
	 * 根据OrderItemId更新
	 */
	 Integer updateByOrderItemId(@Param("bean") T t, @Param("orderItemId") Long orderItemId);

	/**
	 * 根据OrderItemId删除
	 */
	 Integer deleteByOrderItemId(@Param("orderItemId") Long orderItemId);

}