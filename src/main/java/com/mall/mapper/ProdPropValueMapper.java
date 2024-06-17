package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface ProdPropValueMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据ValueId查询
	 */
	 T selectByValueId(@Param("valueId") Long valueId);

	/**
	 * 根据ValueId更新
	 */
	 Integer updateByValueId(@Param("bean") T t, @Param("valueId") Long valueId);

	/**
	 * 根据ValueId删除
	 */
	 Integer deleteByValueId(@Param("valueId") Long valueId);

}