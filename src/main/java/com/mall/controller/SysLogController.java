package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.SysLogServiceImpl;
import com.mall.entity.po.SysLog;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.SysLogQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: 系统日志SysLogController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/sysLog")
public class SysLogController extends BaseController {
	@Autowired
	private SysLogServiceImpl sysLogServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody SysLogQuery  sysLogQuery){
		List<SysLog> tz_sys_log = sysLogServiceImpl.selectListByCondition(sysLogQuery);
		return getSuccessResultVo(tz_sys_log);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody SysLogQuery sysLogQuery) {
		Long l = sysLogServiceImpl.selectCount(sysLogQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody SysLogQuery sysLogQuery) {
		PaginationResultVo<SysLog> paginationResultVo = sysLogServiceImpl.selectList(sysLogQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody SysLog sysLogQuery) {
		Integer insert = sysLogServiceImpl.insert(sysLogQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<SysLog> sysLogList) {
		Integer insert = sysLogServiceImpl.insertBatch(sysLogList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<SysLog> sysLogList) {
		Integer insert = sysLogServiceImpl.insertOrUpdateBatch(sysLogList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据Id查询
	 */
	@PostMapping("/selectById")
	public ResultVo<?> selectById(Long id) {
		SysLog  sysLogQuery = sysLogServiceImpl.selectById(id);
		return getSuccessResultVo(sysLogQuery);
	}

	/**
	 * 根据Id更新
	 */
	@PostMapping("/updateById")
	public ResultVo<?> updateById(SysLog sysLog, Long id) {
		Integer update = sysLogServiceImpl.updateById(sysLog, id);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据Id删除
	 */
	@PostMapping("/deleteById")
	public ResultVo<?> deleteById(Long id) {
		Integer delete = sysLogServiceImpl.deleteById(id);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}