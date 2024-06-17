package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.TransfeeServiceImpl;
import com.mall.entity.po.Transfee;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.TransfeeQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: TransfeeController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/transfee")
public class TransfeeController extends BaseController {
	@Autowired
	private TransfeeServiceImpl transfeeServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody TransfeeQuery  transfeeQuery){
		List<Transfee> tz_transfee = transfeeServiceImpl.selectListByCondition(transfeeQuery);
		return getSuccessResultVo(tz_transfee);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody TransfeeQuery transfeeQuery) {
		Long l = transfeeServiceImpl.selectCount(transfeeQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody TransfeeQuery transfeeQuery) {
		PaginationResultVo<Transfee> paginationResultVo = transfeeServiceImpl.selectList(transfeeQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody Transfee transfeeQuery) {
		Integer insert = transfeeServiceImpl.insert(transfeeQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<Transfee> transfeeList) {
		Integer insert = transfeeServiceImpl.insertBatch(transfeeList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<Transfee> transfeeList) {
		Integer insert = transfeeServiceImpl.insertOrUpdateBatch(transfeeList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据TransfeeId查询
	 */
	@PostMapping("/selectByTransfeeId")
	public ResultVo<?> selectByTransfeeId(Long transfeeId) {
		Transfee  transfeeQuery = transfeeServiceImpl.selectByTransfeeId(transfeeId);
		return getSuccessResultVo(transfeeQuery);
	}

	/**
	 * 根据TransfeeId更新
	 */
	@PostMapping("/updateByTransfeeId")
	public ResultVo<?> updateByTransfeeId(Transfee transfee, Long transfeeId) {
		Integer update = transfeeServiceImpl.updateByTransfeeId(transfee, transfeeId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据TransfeeId删除
	 */
	@PostMapping("/deleteByTransfeeId")
	public ResultVo<?> deleteByTransfeeId(Long transfeeId) {
		Integer delete = transfeeServiceImpl.deleteByTransfeeId(transfeeId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}