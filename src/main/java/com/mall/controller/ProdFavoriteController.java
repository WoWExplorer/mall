package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.ProdFavoriteServiceImpl;
import com.mall.entity.po.ProdFavorite;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.ProdFavoriteQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: 商品收藏表ProdFavoriteController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/prodFavorite")
public class ProdFavoriteController extends BaseController {
	@Autowired
	private ProdFavoriteServiceImpl prodFavoriteServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody ProdFavoriteQuery  prodFavoriteQuery){
		List<ProdFavorite> tz_prod_favorite = prodFavoriteServiceImpl.selectListByCondition(prodFavoriteQuery);
		return getSuccessResultVo(tz_prod_favorite);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody ProdFavoriteQuery prodFavoriteQuery) {
		Long l = prodFavoriteServiceImpl.selectCount(prodFavoriteQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody ProdFavoriteQuery prodFavoriteQuery) {
		PaginationResultVo<ProdFavorite> paginationResultVo = prodFavoriteServiceImpl.selectList(prodFavoriteQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody ProdFavorite prodFavoriteQuery) {
		Integer insert = prodFavoriteServiceImpl.insert(prodFavoriteQuery);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增失败");
		}
	}

	/**
	 * 批量新增
	 */
	@PostMapping("/insertBatch")
	public ResultVo<?> insertBatch(@RequestBody List<ProdFavorite> prodFavoriteList) {
		Integer insert = prodFavoriteServiceImpl.insertBatch(prodFavoriteList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增失败");
		}
	}

	/**
	 * 批量新增或修改
	 */
	@PostMapping("/insertOrUpdateBatch")
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<ProdFavorite> prodFavoriteList) {
		Integer insert = prodFavoriteServiceImpl.insertOrUpdateBatch(prodFavoriteList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据FavoriteId查询
	 */
	@PostMapping("/selectByFavoriteId")
	public ResultVo<?> selectByFavoriteId(Long favoriteId) {
		ProdFavorite  prodFavoriteQuery = prodFavoriteServiceImpl.selectByFavoriteId(favoriteId);
		return getSuccessResultVo(prodFavoriteQuery);
	}

	/**
	 * 根据FavoriteId更新
	 */
	@PostMapping("/updateByFavoriteId")
	public ResultVo<?> updateByFavoriteId(ProdFavorite prodFavorite, Long favoriteId) {
		Integer update = prodFavoriteServiceImpl.updateByFavoriteId(prodFavorite, favoriteId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据FavoriteId删除
	 */
	@PostMapping("/deleteByFavoriteId")
	public ResultVo<?> deleteByFavoriteId(Long favoriteId) {
		Integer delete = prodFavoriteServiceImpl.deleteByFavoriteId(favoriteId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}