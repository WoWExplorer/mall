package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: 商品收藏表Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface ProdFavoriteMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据FavoriteId查询
	 */
	 T selectByFavoriteId(@Param("favoriteId") Long favoriteId);

	/**
	 * 根据FavoriteId更新
	 */
	 Integer updateByFavoriteId(@Param("bean") T t, @Param("favoriteId") Long favoriteId);

	/**
	 * 根据FavoriteId删除
	 */
	 Integer deleteByFavoriteId(@Param("favoriteId") Long favoriteId);

}