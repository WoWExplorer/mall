package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.TranscityFreeServiceImpl;
import com.mall.entity.po.TranscityFree;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.TranscityFreeQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: TranscityFreeController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/transcityFree")
public class TranscityFreeController extends BaseController {
	@Autowired
	private TranscityFreeServiceImpl transcityFreeServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody TranscityFreeQuery  transcityFreeQuery){
		List<TranscityFree> tz_transcity_free = transcityFreeServiceImpl.selectListByCondition(transcityFreeQuery);
		return getSuccessResultVo(tz_transcity_free);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody TranscityFreeQuery transcityFreeQuery) {
		Long l = transcityFreeServiceImpl.selectCount(transcityFreeQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody TranscityFreeQuery transcityFreeQuery) {
		PaginationResultVo<TranscityFree> paginationResultVo = transcityFreeServiceImpl.selectList(transcityFreeQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody TranscityFree transcityFreeQuery) {
		Integer insert = transcityFreeServiceImpl.insert(transcityFreeQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<TranscityFree> transcityFreeList) {
		Integer insert = transcityFreeServiceImpl.insertBatch(transcityFreeList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<TranscityFree> transcityFreeList) {
		Integer insert = transcityFreeServiceImpl.insertOrUpdateBatch(transcityFreeList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据TranscityFreeId查询
	 */
	@PostMapping("/selectByTranscityFreeId")
	public ResultVo<?> selectByTranscityFreeId(Long transcityFreeId) {
		TranscityFree  transcityFreeQuery = transcityFreeServiceImpl.selectByTranscityFreeId(transcityFreeId);
		return getSuccessResultVo(transcityFreeQuery);
	}

	/**
	 * 根据TranscityFreeId更新
	 */
	@PostMapping("/updateByTranscityFreeId")
	public ResultVo<?> updateByTranscityFreeId(TranscityFree transcityFree, Long transcityFreeId) {
		Integer update = transcityFreeServiceImpl.updateByTranscityFreeId(transcityFree, transcityFreeId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据TranscityFreeId删除
	 */
	@PostMapping("/deleteByTranscityFreeId")
	public ResultVo<?> deleteByTranscityFreeId(Long transcityFreeId) {
		Integer delete = transcityFreeServiceImpl.deleteByTranscityFreeId(transcityFreeId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}