package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface OrderRefundMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据RefundId查询
	 */
	 T selectByRefundId(@Param("refundId") Long refundId);

	/**
	 * 根据RefundId更新
	 */
	 Integer updateByRefundId(@Param("bean") T t, @Param("refundId") Long refundId);

	/**
	 * 根据RefundId删除
	 */
	 Integer deleteByRefundId(@Param("refundId") Long refundId);

	/**
	 * 根据RefundSn查询
	 */
	 T selectByRefundSn(@Param("refundSn") String refundSn);

	/**
	 * 根据RefundSn更新
	 */
	 Integer updateByRefundSn(@Param("bean") T t, @Param("refundSn") String refundSn);

	/**
	 * 根据RefundSn删除
	 */
	 Integer deleteByRefundSn(@Param("refundSn") String refundSn);

}