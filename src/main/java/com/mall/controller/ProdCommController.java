package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.ProdCommServiceImpl;
import com.mall.entity.po.ProdComm;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.ProdCommQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: 商品评论ProdCommController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/prodComm")
public class ProdCommController extends BaseController {
	@Autowired
	private ProdCommServiceImpl prodCommServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody ProdCommQuery  prodCommQuery){
		List<ProdComm> tz_prod_comm = prodCommServiceImpl.selectListByCondition(prodCommQuery);
		return getSuccessResultVo(tz_prod_comm);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody ProdCommQuery prodCommQuery) {
		Long l = prodCommServiceImpl.selectCount(prodCommQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody ProdCommQuery prodCommQuery) {
		PaginationResultVo<ProdComm> paginationResultVo = prodCommServiceImpl.selectList(prodCommQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody ProdComm prodCommQuery) {
		Integer insert = prodCommServiceImpl.insert(prodCommQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<ProdComm> prodCommList) {
		Integer insert = prodCommServiceImpl.insertBatch(prodCommList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<ProdComm> prodCommList) {
		Integer insert = prodCommServiceImpl.insertOrUpdateBatch(prodCommList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据ProdCommId查询
	 */
	@PostMapping("/selectByProdCommId")
	public ResultVo<?> selectByProdCommId(Long prodCommId) {
		ProdComm  prodCommQuery = prodCommServiceImpl.selectByProdCommId(prodCommId);
		return getSuccessResultVo(prodCommQuery);
	}

	/**
	 * 根据ProdCommId更新
	 */
	@PostMapping("/updateByProdCommId")
	public ResultVo<?> updateByProdCommId(ProdComm prodComm, Long prodCommId) {
		Integer update = prodCommServiceImpl.updateByProdCommId(prodComm, prodCommId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据ProdCommId删除
	 */
	@PostMapping("/deleteByProdCommId")
	public ResultVo<?> deleteByProdCommId(Long prodCommId) {
		Integer delete = prodCommServiceImpl.deleteByProdCommId(prodCommId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}