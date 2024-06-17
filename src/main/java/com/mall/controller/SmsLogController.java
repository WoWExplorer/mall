package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.SmsLogServiceImpl;
import com.mall.entity.po.SmsLog;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.SmsLogQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: 短信记录表SmsLogController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/smsLog")
public class SmsLogController extends BaseController {
	@Autowired
	private SmsLogServiceImpl smsLogServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody SmsLogQuery  smsLogQuery){
		List<SmsLog> tz_sms_log = smsLogServiceImpl.selectListByCondition(smsLogQuery);
		return getSuccessResultVo(tz_sms_log);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody SmsLogQuery smsLogQuery) {
		Long l = smsLogServiceImpl.selectCount(smsLogQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody SmsLogQuery smsLogQuery) {
		PaginationResultVo<SmsLog> paginationResultVo = smsLogServiceImpl.selectList(smsLogQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody SmsLog smsLogQuery) {
		Integer insert = smsLogServiceImpl.insert(smsLogQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<SmsLog> smsLogList) {
		Integer insert = smsLogServiceImpl.insertBatch(smsLogList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<SmsLog> smsLogList) {
		Integer insert = smsLogServiceImpl.insertOrUpdateBatch(smsLogList);
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
		SmsLog  smsLogQuery = smsLogServiceImpl.selectById(id);
		return getSuccessResultVo(smsLogQuery);
	}

	/**
	 * 根据Id更新
	 */
	@PostMapping("/updateById")
	public ResultVo<?> updateById(SmsLog smsLog, Long id) {
		Integer update = smsLogServiceImpl.updateById(smsLog, id);
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
		Integer delete = smsLogServiceImpl.deleteById(id);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}