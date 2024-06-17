package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: 商品Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface ProdMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据ProdId查询
	 */
	 T selectByProdId(@Param("prodId") Long prodId);

	/**
	 * 根据ProdId更新
	 */
	 Integer updateByProdId(@Param("bean") T t, @Param("prodId") Long prodId);

	/**
	 * 根据ProdId删除
	 */
	 Integer deleteByProdId(@Param("prodId") Long prodId);

}