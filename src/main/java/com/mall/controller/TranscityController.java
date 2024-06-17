package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.TranscityServiceImpl;
import com.mall.entity.po.Transcity;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.TranscityQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: TranscityController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/transcity")
public class TranscityController extends BaseController {
	@Autowired
	private TranscityServiceImpl transcityServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody TranscityQuery  transcityQuery){
		List<Transcity> tz_transcity = transcityServiceImpl.selectListByCondition(transcityQuery);
		return getSuccessResultVo(tz_transcity);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody TranscityQuery transcityQuery) {
		Long l = transcityServiceImpl.selectCount(transcityQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody TranscityQuery transcityQuery) {
		PaginationResultVo<Transcity> paginationResultVo = transcityServiceImpl.selectList(transcityQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody Transcity transcityQuery) {
		Integer insert = transcityServiceImpl.insert(transcityQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<Transcity> transcityList) {
		Integer insert = transcityServiceImpl.insertBatch(transcityList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<Transcity> transcityList) {
		Integer insert = transcityServiceImpl.insertOrUpdateBatch(transcityList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据TranscityId查询
	 */
	@PostMapping("/selectByTranscityId")
	public ResultVo<?> selectByTranscityId(Long transcityId) {
		Transcity  transcityQuery = transcityServiceImpl.selectByTranscityId(transcityId);
		return getSuccessResultVo(transcityQuery);
	}

	/**
	 * 根据TranscityId更新
	 */
	@PostMapping("/updateByTranscityId")
	public ResultVo<?> updateByTranscityId(Transcity transcity, Long transcityId) {
		Integer update = transcityServiceImpl.updateByTranscityId(transcity, transcityId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据TranscityId删除
	 */
	@PostMapping("/deleteByTranscityId")
	public ResultVo<?> deleteByTranscityId(Long transcityId) {
		Integer delete = transcityServiceImpl.deleteByTranscityId(transcityId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}