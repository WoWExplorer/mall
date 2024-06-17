package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.ProdPropServiceImpl;
import com.mall.entity.po.ProdProp;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.ProdPropQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: ProdPropController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/prodProp")
public class ProdPropController extends BaseController {
	@Autowired
	private ProdPropServiceImpl prodPropServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody ProdPropQuery  prodPropQuery){
		List<ProdProp> tz_prod_prop = prodPropServiceImpl.selectListByCondition(prodPropQuery);
		return getSuccessResultVo(tz_prod_prop);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody ProdPropQuery prodPropQuery) {
		Long l = prodPropServiceImpl.selectCount(prodPropQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody ProdPropQuery prodPropQuery) {
		PaginationResultVo<ProdProp> paginationResultVo = prodPropServiceImpl.selectList(prodPropQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody ProdProp prodPropQuery) {
		Integer insert = prodPropServiceImpl.insert(prodPropQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<ProdProp> prodPropList) {
		Integer insert = prodPropServiceImpl.insertBatch(prodPropList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<ProdProp> prodPropList) {
		Integer insert = prodPropServiceImpl.insertOrUpdateBatch(prodPropList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据PropId查询
	 */
	@PostMapping("/selectByPropId")
	public ResultVo<?> selectByPropId(Long propId) {
		ProdProp  prodPropQuery = prodPropServiceImpl.selectByPropId(propId);
		return getSuccessResultVo(prodPropQuery);
	}

	/**
	 * 根据PropId更新
	 */
	@PostMapping("/updateByPropId")
	public ResultVo<?> updateByPropId(ProdProp prodProp, Long propId) {
		Integer update = prodPropServiceImpl.updateByPropId(prodProp, propId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据PropId删除
	 */
	@PostMapping("/deleteByPropId")
	public ResultVo<?> deleteByPropId(Long propId) {
		Integer delete = prodPropServiceImpl.deleteByPropId(propId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}