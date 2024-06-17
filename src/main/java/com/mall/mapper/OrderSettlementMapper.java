package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface OrderSettlementMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据SettlementId查询
	 */
	 T selectBySettlementId(@Param("settlementId") Long settlementId);

	/**
	 * 根据SettlementId更新
	 */
	 Integer updateBySettlementId(@Param("bean") T t, @Param("settlementId") Long settlementId);

	/**
	 * 根据SettlementId删除
	 */
	 Integer deleteBySettlementId(@Param("settlementId") Long settlementId);

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

}