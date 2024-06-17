package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.BasketServiceImpl;
import com.mall.entity.po.Basket;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.BasketQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: 购物车BasketController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/basket")
public class BasketController extends BaseController {
	@Autowired
	private BasketServiceImpl basketServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody BasketQuery  basketQuery){
		List<Basket> tz_basket = basketServiceImpl.selectListByCondition(basketQuery);
		return getSuccessResultVo(tz_basket);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody BasketQuery basketQuery) {
		Long l = basketServiceImpl.selectCount(basketQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody BasketQuery basketQuery) {
		PaginationResultVo<Basket> paginationResultVo = basketServiceImpl.selectList(basketQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody Basket basketQuery) {
		Integer insert = basketServiceImpl.insert(basketQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<Basket> basketList) {
		Integer insert = basketServiceImpl.insertBatch(basketList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<Basket> basketList) {
		Integer insert = basketServiceImpl.insertOrUpdateBatch(basketList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据BasketId查询
	 */
	@PostMapping("/selectByBasketId")
	public ResultVo<?> selectByBasketId(Long basketId) {
		Basket  basketQuery = basketServiceImpl.selectByBasketId(basketId);
		return getSuccessResultVo(basketQuery);
	}

	/**
	 * 根据BasketId更新
	 */
	@PostMapping("/updateByBasketId")
	public ResultVo<?> updateByBasketId(Basket basket, Long basketId) {
		Integer update = basketServiceImpl.updateByBasketId(basket, basketId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据BasketId删除
	 */
	@PostMapping("/deleteByBasketId")
	public ResultVo<?> deleteByBasketId(Long basketId) {
		Integer delete = basketServiceImpl.deleteByBasketId(basketId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}

	/**
	 * 根据SkuIdAndUserIdAndShopId查询
	 */
	@PostMapping("/selectBySkuIdAndUserIdAndShopId")
	public ResultVo<?> selectBySkuIdAndUserIdAndShopId(Long skuId, String userId, Long shopId) {
		Basket  basketQuery = basketServiceImpl.selectBySkuIdAndUserIdAndShopId(skuId, userId, shopId);
		return getSuccessResultVo(basketQuery);
	}

	/**
	 * 根据SkuIdAndUserIdAndShopId更新
	 */
	@PostMapping("/updateBySkuIdAndUserIdAndShopId")
	public ResultVo<?> updateBySkuIdAndUserIdAndShopId(Basket basket, Long skuId, String userId, Long shopId) {
		Integer update = basketServiceImpl.updateBySkuIdAndUserIdAndShopId(basket, skuId, userId, shopId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据SkuIdAndUserIdAndShopId删除
	 */
	@PostMapping("/deleteBySkuIdAndUserIdAndShopId")
	public ResultVo<?> deleteBySkuIdAndUserIdAndShopId(Long skuId, String userId, Long shopId) {
		Integer delete = basketServiceImpl.deleteBySkuIdAndUserIdAndShopId(skuId, userId, shopId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}