package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.TransfeeFreeServiceImpl;
import com.mall.entity.po.TransfeeFree;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.TransfeeFreeQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: TransfeeFreeController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/transfeeFree")
public class TransfeeFreeController extends BaseController {
	@Autowired
	private TransfeeFreeServiceImpl transfeeFreeServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody TransfeeFreeQuery  transfeeFreeQuery){
		List<TransfeeFree> tz_transfee_free = transfeeFreeServiceImpl.selectListByCondition(transfeeFreeQuery);
		return getSuccessResultVo(tz_transfee_free);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody TransfeeFreeQuery transfeeFreeQuery) {
		Long l = transfeeFreeServiceImpl.selectCount(transfeeFreeQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody TransfeeFreeQuery transfeeFreeQuery) {
		PaginationResultVo<TransfeeFree> paginationResultVo = transfeeFreeServiceImpl.selectList(transfeeFreeQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody TransfeeFree transfeeFreeQuery) {
		Integer insert = transfeeFreeServiceImpl.insert(transfeeFreeQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<TransfeeFree> transfeeFreeList) {
		Integer insert = transfeeFreeServiceImpl.insertBatch(transfeeFreeList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<TransfeeFree> transfeeFreeList) {
		Integer insert = transfeeFreeServiceImpl.insertOrUpdateBatch(transfeeFreeList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据TransfeeFreeId查询
	 */
	@PostMapping("/selectByTransfeeFreeId")
	public ResultVo<?> selectByTransfeeFreeId(Long transfeeFreeId) {
		TransfeeFree  transfeeFreeQuery = transfeeFreeServiceImpl.selectByTransfeeFreeId(transfeeFreeId);
		return getSuccessResultVo(transfeeFreeQuery);
	}

	/**
	 * 根据TransfeeFreeId更新
	 */
	@PostMapping("/updateByTransfeeFreeId")
	public ResultVo<?> updateByTransfeeFreeId(TransfeeFree transfeeFree, Long transfeeFreeId) {
		Integer update = transfeeFreeServiceImpl.updateByTransfeeFreeId(transfeeFree, transfeeFreeId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据TransfeeFreeId删除
	 */
	@PostMapping("/deleteByTransfeeFreeId")
	public ResultVo<?> deleteByTransfeeFreeId(Long transfeeFreeId) {
		Integer delete = transfeeFreeServiceImpl.deleteByTransfeeFreeId(transfeeFreeId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}