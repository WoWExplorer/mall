package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.OrderItemServiceImpl;
import com.mall.entity.po.OrderItem;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.OrderItemQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: 订单项OrderItemController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/orderItem")
public class OrderItemController extends BaseController {
	@Autowired
	private OrderItemServiceImpl orderItemServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody OrderItemQuery  orderItemQuery){
		List<OrderItem> tz_order_item = orderItemServiceImpl.selectListByCondition(orderItemQuery);
		return getSuccessResultVo(tz_order_item);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody OrderItemQuery orderItemQuery) {
		Long l = orderItemServiceImpl.selectCount(orderItemQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody OrderItemQuery orderItemQuery) {
		PaginationResultVo<OrderItem> paginationResultVo = orderItemServiceImpl.selectList(orderItemQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody OrderItem orderItemQuery) {
		Integer insert = orderItemServiceImpl.insert(orderItemQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<OrderItem> orderItemList) {
		Integer insert = orderItemServiceImpl.insertBatch(orderItemList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<OrderItem> orderItemList) {
		Integer insert = orderItemServiceImpl.insertOrUpdateBatch(orderItemList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据OrderItemId查询
	 */
	@PostMapping("/selectByOrderItemId")
	public ResultVo<?> selectByOrderItemId(Long orderItemId) {
		OrderItem  orderItemQuery = orderItemServiceImpl.selectByOrderItemId(orderItemId);
		return getSuccessResultVo(orderItemQuery);
	}

	/**
	 * 根据OrderItemId更新
	 */
	@PostMapping("/updateByOrderItemId")
	public ResultVo<?> updateByOrderItemId(OrderItem orderItem, Long orderItemId) {
		Integer update = orderItemServiceImpl.updateByOrderItemId(orderItem, orderItemId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据OrderItemId删除
	 */
	@PostMapping("/deleteByOrderItemId")
	public ResultVo<?> deleteByOrderItemId(Long orderItemId) {
		Integer delete = orderItemServiceImpl.deleteByOrderItemId(orderItemId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}