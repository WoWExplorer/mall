package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: 用户订单配送地址Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface UserAddrOrderMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据AddrOrderId查询
	 */
	 T selectByAddrOrderId(@Param("addrOrderId") Long addrOrderId);

	/**
	 * 根据AddrOrderId更新
	 */
	 Integer updateByAddrOrderId(@Param("bean") T t, @Param("addrOrderId") Long addrOrderId);

	/**
	 * 根据AddrOrderId删除
	 */
	 Integer deleteByAddrOrderId(@Param("addrOrderId") Long addrOrderId);

}