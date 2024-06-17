package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.ProdServiceImpl;
import com.mall.entity.po.Prod;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.ProdQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: 商品ProdController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/prod")
public class ProdController extends BaseController {
	@Autowired
	private ProdServiceImpl prodServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody ProdQuery  prodQuery){
		List<Prod> tz_prod = prodServiceImpl.selectListByCondition(prodQuery);
		return getSuccessResultVo(tz_prod);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody ProdQuery prodQuery) {
		Long l = prodServiceImpl.selectCount(prodQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody ProdQuery prodQuery) {
		PaginationResultVo<Prod> paginationResultVo = prodServiceImpl.selectList(prodQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody Prod prodQuery) {
		Integer insert = prodServiceImpl.insert(prodQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<Prod> prodList) {
		Integer insert = prodServiceImpl.insertBatch(prodList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<Prod> prodList) {
		Integer insert = prodServiceImpl.insertOrUpdateBatch(prodList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据ProdId查询
	 */
	@PostMapping("/selectByProdId")
	public ResultVo<?> selectByProdId(Long prodId) {
		Prod  prodQuery = prodServiceImpl.selectByProdId(prodId);
		return getSuccessResultVo(prodQuery);
	}

	/**
	 * 根据ProdId更新
	 */
	@PostMapping("/updateByProdId")
	public ResultVo<?> updateByProdId(Prod prod, Long prodId) {
		Integer update = prodServiceImpl.updateByProdId(prod, prodId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据ProdId删除
	 */
	@PostMapping("/deleteByProdId")
	public ResultVo<?> deleteByProdId(Long prodId) {
		Integer delete = prodServiceImpl.deleteByProdId(prodId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}