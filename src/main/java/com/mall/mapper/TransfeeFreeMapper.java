package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface TransfeeFreeMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据TransfeeFreeId查询
	 */
	 T selectByTransfeeFreeId(@Param("transfeeFreeId") Long transfeeFreeId);

	/**
	 * 根据TransfeeFreeId更新
	 */
	 Integer updateByTransfeeFreeId(@Param("bean") T t, @Param("transfeeFreeId") Long transfeeFreeId);

	/**
	 * 根据TransfeeFreeId删除
	 */
	 Integer deleteByTransfeeFreeId(@Param("transfeeFreeId") Long transfeeFreeId);

}