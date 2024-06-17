package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.AttachFileServiceImpl;
import com.mall.entity.po.AttachFile;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.AttachFileQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: AttachFileController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/attachFile")
public class AttachFileController extends BaseController {
	@Autowired
	private AttachFileServiceImpl attachFileServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody AttachFileQuery  attachFileQuery){
		List<AttachFile> tz_attach_file = attachFileServiceImpl.selectListByCondition(attachFileQuery);
		return getSuccessResultVo(tz_attach_file);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody AttachFileQuery attachFileQuery) {
		Long l = attachFileServiceImpl.selectCount(attachFileQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody AttachFileQuery attachFileQuery) {
		PaginationResultVo<AttachFile> paginationResultVo = attachFileServiceImpl.selectList(attachFileQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody AttachFile attachFileQuery) {
		Integer insert = attachFileServiceImpl.insert(attachFileQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<AttachFile> attachFileList) {
		Integer insert = attachFileServiceImpl.insertBatch(attachFileList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<AttachFile> attachFileList) {
		Integer insert = attachFileServiceImpl.insertOrUpdateBatch(attachFileList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据FileId查询
	 */
	@PostMapping("/selectByFileId")
	public ResultVo<?> selectByFileId(Long fileId) {
		AttachFile  attachFileQuery = attachFileServiceImpl.selectByFileId(fileId);
		return getSuccessResultVo(attachFileQuery);
	}

	/**
	 * 根据FileId更新
	 */
	@PostMapping("/updateByFileId")
	public ResultVo<?> updateByFileId(AttachFile attachFile, Long fileId) {
		Integer update = attachFileServiceImpl.updateByFileId(attachFile, fileId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据FileId删除
	 */
	@PostMapping("/deleteByFileId")
	public ResultVo<?> deleteByFileId(Long fileId) {
		Integer delete = attachFileServiceImpl.deleteByFileId(fileId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}