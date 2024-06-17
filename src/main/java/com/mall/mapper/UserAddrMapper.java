package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: 用户配送地址Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface UserAddrMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据AddrId查询
	 */
	 T selectByAddrId(@Param("addrId") Long addrId);

	/**
	 * 根据AddrId更新
	 */
	 Integer updateByAddrId(@Param("bean") T t, @Param("addrId") Long addrId);

	/**
	 * 根据AddrId删除
	 */
	 Integer deleteByAddrId(@Param("addrId") Long addrId);

}