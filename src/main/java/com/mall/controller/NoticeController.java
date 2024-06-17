package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.NoticeServiceImpl;
import com.mall.entity.po.Notice;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.NoticeQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: NoticeController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/notice")
public class NoticeController extends BaseController {
	@Autowired
	private NoticeServiceImpl noticeServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody NoticeQuery  noticeQuery){
		List<Notice> tz_notice = noticeServiceImpl.selectListByCondition(noticeQuery);
		return getSuccessResultVo(tz_notice);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody NoticeQuery noticeQuery) {
		Long l = noticeServiceImpl.selectCount(noticeQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody NoticeQuery noticeQuery) {
		PaginationResultVo<Notice> paginationResultVo = noticeServiceImpl.selectList(noticeQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody Notice noticeQuery) {
		Integer insert = noticeServiceImpl.insert(noticeQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<Notice> noticeList) {
		Integer insert = noticeServiceImpl.insertBatch(noticeList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<Notice> noticeList) {
		Integer insert = noticeServiceImpl.insertOrUpdateBatch(noticeList);
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
		Notice  noticeQuery = noticeServiceImpl.selectById(id);
		return getSuccessResultVo(noticeQuery);
	}

	/**
	 * 根据Id更新
	 */
	@PostMapping("/updateById")
	public ResultVo<?> updateById(Notice notice, Long id) {
		Integer update = noticeServiceImpl.updateById(notice, id);
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
		Integer delete = noticeServiceImpl.deleteById(id);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}