package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.SkuServiceImpl;
import com.mall.entity.po.Sku;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.SkuQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: 单品SKU表SkuController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/sku")
public class SkuController extends BaseController {
	@Autowired
	private SkuServiceImpl skuServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody SkuQuery  skuQuery){
		List<Sku> tz_sku = skuServiceImpl.selectListByCondition(skuQuery);
		return getSuccessResultVo(tz_sku);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody SkuQuery skuQuery) {
		Long l = skuServiceImpl.selectCount(skuQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody SkuQuery skuQuery) {
		PaginationResultVo<Sku> paginationResultVo = skuServiceImpl.selectList(skuQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody Sku skuQuery) {
		Integer insert = skuServiceImpl.insert(skuQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<Sku> skuList) {
		Integer insert = skuServiceImpl.insertBatch(skuList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<Sku> skuList) {
		Integer insert = skuServiceImpl.insertOrUpdateBatch(skuList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据SkuId查询
	 */
	@PostMapping("/selectBySkuId")
	public ResultVo<?> selectBySkuId(Long skuId) {
		Sku  skuQuery = skuServiceImpl.selectBySkuId(skuId);
		return getSuccessResultVo(skuQuery);
	}

	/**
	 * 根据SkuId更新
	 */
	@PostMapping("/updateBySkuId")
	public ResultVo<?> updateBySkuId(Sku sku, Long skuId) {
		Integer update = skuServiceImpl.updateBySkuId(sku, skuId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据SkuId删除
	 */
	@PostMapping("/deleteBySkuId")
	public ResultVo<?> deleteBySkuId(Long skuId) {
		Integer delete = skuServiceImpl.deleteBySkuId(skuId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}