package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface TransportMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据TransportId查询
	 */
	 T selectByTransportId(@Param("transportId") Long transportId);

	/**
	 * 根据TransportId更新
	 */
	 Integer updateByTransportId(@Param("bean") T t, @Param("transportId") Long transportId);

	/**
	 * 根据TransportId删除
	 */
	 Integer deleteByTransportId(@Param("transportId") Long transportId);

}