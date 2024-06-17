package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.ProdPropValueServiceImpl;
import com.mall.entity.po.ProdPropValue;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.ProdPropValueQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: ProdPropValueController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/prodPropValue")
public class ProdPropValueController extends BaseController {
	@Autowired
	private ProdPropValueServiceImpl prodPropValueServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody ProdPropValueQuery  prodPropValueQuery){
		List<ProdPropValue> tz_prod_prop_value = prodPropValueServiceImpl.selectListByCondition(prodPropValueQuery);
		return getSuccessResultVo(tz_prod_prop_value);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody ProdPropValueQuery prodPropValueQuery) {
		Long l = prodPropValueServiceImpl.selectCount(prodPropValueQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody ProdPropValueQuery prodPropValueQuery) {
		PaginationResultVo<ProdPropValue> paginationResultVo = prodPropValueServiceImpl.selectList(prodPropValueQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody ProdPropValue prodPropValueQuery) {
		Integer insert = prodPropValueServiceImpl.insert(prodPropValueQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<ProdPropValue> prodPropValueList) {
		Integer insert = prodPropValueServiceImpl.insertBatch(prodPropValueList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<ProdPropValue> prodPropValueList) {
		Integer insert = prodPropValueServiceImpl.insertOrUpdateBatch(prodPropValueList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据ValueId查询
	 */
	@PostMapping("/selectByValueId")
	public ResultVo<?> selectByValueId(Long valueId) {
		ProdPropValue  prodPropValueQuery = prodPropValueServiceImpl.selectByValueId(valueId);
		return getSuccessResultVo(prodPropValueQuery);
	}

	/**
	 * 根据ValueId更新
	 */
	@PostMapping("/updateByValueId")
	public ResultVo<?> updateByValueId(ProdPropValue prodPropValue, Long valueId) {
		Integer update = prodPropValueServiceImpl.updateByValueId(prodPropValue, valueId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据ValueId删除
	 */
	@PostMapping("/deleteByValueId")
	public ResultVo<?> deleteByValueId(Long valueId) {
		Integer delete = prodPropValueServiceImpl.deleteByValueId(valueId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}