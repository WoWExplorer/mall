package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: 单品SKU表Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface SkuMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据SkuId查询
	 */
	 T selectBySkuId(@Param("skuId") Long skuId);

	/**
	 * 根据SkuId更新
	 */
	 Integer updateBySkuId(@Param("bean") T t, @Param("skuId") Long skuId);

	/**
	 * 根据SkuId删除
	 */
	 Integer deleteBySkuId(@Param("skuId") Long skuId);

}