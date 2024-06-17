package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface ProdPropMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据PropId查询
	 */
	 T selectByPropId(@Param("propId") Long propId);

	/**
	 * 根据PropId更新
	 */
	 Integer updateByPropId(@Param("bean") T t, @Param("propId") Long propId);

	/**
	 * 根据PropId删除
	 */
	 Integer deleteByPropId(@Param("propId") Long propId);

}