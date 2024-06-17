package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: 品牌表Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface BrandMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据BrandId查询
	 */
	 T selectByBrandId(@Param("brandId") Long brandId);

	/**
	 * 根据BrandId更新
	 */
	 Integer updateByBrandId(@Param("bean") T t, @Param("brandId") Long brandId);

	/**
	 * 根据BrandId删除
	 */
	 Integer deleteByBrandId(@Param("brandId") Long brandId);

}