package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.ProdTagReferenceServiceImpl;
import com.mall.entity.po.ProdTagReference;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.ProdTagReferenceQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: ProdTagReferenceController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/prodTagReference")
public class ProdTagReferenceController extends BaseController {
	@Autowired
	private ProdTagReferenceServiceImpl prodTagReferenceServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody ProdTagReferenceQuery  prodTagReferenceQuery){
		List<ProdTagReference> tz_prod_tag_reference = prodTagReferenceServiceImpl.selectListByCondition(prodTagReferenceQuery);
		return getSuccessResultVo(tz_prod_tag_reference);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody ProdTagReferenceQuery prodTagReferenceQuery) {
		Long l = prodTagReferenceServiceImpl.selectCount(prodTagReferenceQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody ProdTagReferenceQuery prodTagReferenceQuery) {
		PaginationResultVo<ProdTagReference> paginationResultVo = prodTagReferenceServiceImpl.selectList(prodTagReferenceQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody ProdTagReference prodTagReferenceQuery) {
		Integer insert = prodTagReferenceServiceImpl.insert(prodTagReferenceQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<ProdTagReference> prodTagReferenceList) {
		Integer insert = prodTagReferenceServiceImpl.insertBatch(prodTagReferenceList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<ProdTagReference> prodTagReferenceList) {
		Integer insert = prodTagReferenceServiceImpl.insertOrUpdateBatch(prodTagReferenceList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据ReferenceId查询
	 */
	@PostMapping("/selectByReferenceId")
	public ResultVo<?> selectByReferenceId(Long referenceId) {
		ProdTagReference  prodTagReferenceQuery = prodTagReferenceServiceImpl.selectByReferenceId(referenceId);
		return getSuccessResultVo(prodTagReferenceQuery);
	}

	/**
	 * 根据ReferenceId更新
	 */
	@PostMapping("/updateByReferenceId")
	public ResultVo<?> updateByReferenceId(ProdTagReference prodTagReference, Long referenceId) {
		Integer update = prodTagReferenceServiceImpl.updateByReferenceId(prodTagReference, referenceId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据ReferenceId删除
	 */
	@PostMapping("/deleteByReferenceId")
	public ResultVo<?> deleteByReferenceId(Long referenceId) {
		Integer delete = prodTagReferenceServiceImpl.deleteByReferenceId(referenceId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}