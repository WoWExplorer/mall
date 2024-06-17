package com.mall.service;

import com.mall.entity.po.ProdFavorite;
import com.mall.entity.query.ProdFavoriteQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: 商品收藏表Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface ProdFavoriteService {

	/**
	 * 根据条件查询列表
	 */
	List<ProdFavorite> selectListByCondition(ProdFavoriteQuery prodFavoriteQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(ProdFavoriteQuery prodFavoriteQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<ProdFavorite> selectList(ProdFavoriteQuery prodFavoriteQuery);

	/**
	 * 新增
	 */
	Integer insert(ProdFavorite prodFavorite);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<ProdFavorite> prodFavorite);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<ProdFavorite> prodFavoriteList);

	/**
	 * 根据FavoriteId查询
	 */
	ProdFavorite selectByFavoriteId(Long favoriteId);

	/**
	 * 根据FavoriteId更新
	 */
	Integer updateByFavoriteId(ProdFavorite ProdFavoriteQuery, Long favoriteId);

	/**
	 * 根据FavoriteId删除
	 */
	Integer deleteByFavoriteId(Long favoriteId);


}