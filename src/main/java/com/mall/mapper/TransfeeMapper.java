package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface TransfeeMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据TransfeeId查询
	 */
	 T selectByTransfeeId(@Param("transfeeId") Long transfeeId);

	/**
	 * 根据TransfeeId更新
	 */
	 Integer updateByTransfeeId(@Param("bean") T t, @Param("transfeeId") Long transfeeId);

	/**
	 * 根据TransfeeId删除
	 */
	 Integer deleteByTransfeeId(@Param("transfeeId") Long transfeeId);

}