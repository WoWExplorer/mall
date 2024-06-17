package com.mall.service.impl;

import com.mall.entity.po.ProdFavorite;
import com.mall.mapper.ProdFavoriteMapper;
import com.mall.service.ProdFavoriteService;
import com.mall.entity.query.ProdFavoriteQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: 商品收藏表ProdFavoriteServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("prodFavoriteServiceImpl")
public class ProdFavoriteServiceImpl implements ProdFavoriteService {
	@Autowired
	private ProdFavoriteMapper<ProdFavorite, ProdFavoriteQuery> prodFavoriteMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<ProdFavorite> selectListByCondition(ProdFavoriteQuery prodFavoriteQuery) {
		return prodFavoriteMapper.selectList(prodFavoriteQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(ProdFavoriteQuery prodFavoriteQuery) {
		return prodFavoriteMapper.selectCount(prodFavoriteQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<ProdFavorite> selectList(ProdFavoriteQuery prodFavoriteQuery) {
		int count = Math.toIntExact(this.selectCount(prodFavoriteQuery));
		int pageSize = prodFavoriteQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : prodFavoriteQuery.getPageSize();
		SimplePage simplePage = new SimplePage(prodFavoriteQuery.getPageNo(), count, pageSize);
		prodFavoriteQuery.setSimplePage(simplePage);
		List<ProdFavorite> prodFavorite = this.selectListByCondition(prodFavoriteQuery);
		return new PaginationResultVo<ProdFavorite>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), prodFavorite);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(ProdFavorite prodFavorite) {
		return prodFavoriteMapper.insert(prodFavorite);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<ProdFavorite> prodFavoriteList) {
		return prodFavoriteMapper.insertBatch(prodFavoriteList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<ProdFavorite> prodFavoriteList) {
		return prodFavoriteMapper.insertBatch(prodFavoriteList);
	}

	/**
	 * 根据FavoriteId查询
	 */
	@Override
	public ProdFavorite selectByFavoriteId(Long favoriteId) {
		return prodFavoriteMapper.selectByFavoriteId(favoriteId);
	}

	/**
	 * 根据FavoriteId更新
	 */
	@Override
	public Integer updateByFavoriteId(ProdFavorite prodFavorite, Long favoriteId) {
		return prodFavoriteMapper.updateByFavoriteId(prodFavorite, favoriteId);
	}

	/**
	 * 根据FavoriteId删除
	 */
	@Override
	public Integer deleteByFavoriteId(Long favoriteId) {
		return prodFavoriteMapper.deleteByFavoriteId(favoriteId);
	}
}