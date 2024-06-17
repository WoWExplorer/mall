package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: 产品类目Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface CategoryMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据CategoryId查询
	 */
	 T selectByCategoryId(@Param("categoryId") Long categoryId);

	/**
	 * 根据CategoryId更新
	 */
	 Integer updateByCategoryId(@Param("bean") T t, @Param("categoryId") Long categoryId);

	/**
	 * 根据CategoryId删除
	 */
	 Integer deleteByCategoryId(@Param("categoryId") Long categoryId);

}