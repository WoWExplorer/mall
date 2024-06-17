package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.MessageServiceImpl;
import com.mall.entity.po.Message;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.MessageQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: MessageController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/message")
public class MessageController extends BaseController {
	@Autowired
	private MessageServiceImpl messageServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody MessageQuery  messageQuery){
		List<Message> tz_message = messageServiceImpl.selectListByCondition(messageQuery);
		return getSuccessResultVo(tz_message);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody MessageQuery messageQuery) {
		Long l = messageServiceImpl.selectCount(messageQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody MessageQuery messageQuery) {
		PaginationResultVo<Message> paginationResultVo = messageServiceImpl.selectList(messageQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody Message messageQuery) {
		Integer insert = messageServiceImpl.insert(messageQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<Message> messageList) {
		Integer insert = messageServiceImpl.insertBatch(messageList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<Message> messageList) {
		Integer insert = messageServiceImpl.insertOrUpdateBatch(messageList);
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
		Message  messageQuery = messageServiceImpl.selectById(id);
		return getSuccessResultVo(messageQuery);
	}

	/**
	 * 根据Id更新
	 */
	@PostMapping("/updateById")
	public ResultVo<?> updateById(Message message, Long id) {
		Integer update = messageServiceImpl.updateById(message, id);
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
		Integer delete = messageServiceImpl.deleteById(id);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}