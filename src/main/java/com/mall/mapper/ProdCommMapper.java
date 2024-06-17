package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: 商品评论Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface ProdCommMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据ProdCommId查询
	 */
	 T selectByProdCommId(@Param("prodCommId") Long prodCommId);

	/**
	 * 根据ProdCommId更新
	 */
	 Integer updateByProdCommId(@Param("bean") T t, @Param("prodCommId") Long prodCommId);

	/**
	 * 根据ProdCommId删除
	 */
	 Integer deleteByProdCommId(@Param("prodCommId") Long prodCommId);

}