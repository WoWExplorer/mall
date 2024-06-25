package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.OrderServiceImpl;
import com.mall.entity.po.Order;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.OrderQuery;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: 订单表OrderController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/order")
public class OrderController extends BaseController {
	@Autowired
	private OrderServiceImpl orderServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody OrderQuery  orderQuery){
		List<Order> tz_order = orderServiceImpl.selectListByCondition(orderQuery);
		return getSuccessResultVo(tz_order);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody OrderQuery orderQuery) {
		Long l = orderServiceImpl.selectCount(orderQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody OrderQuery orderQuery) {
		PaginationResultVo<Order> paginationResultVo = orderServiceImpl.selectList(orderQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody Order orderQuery) {
		Integer insert = orderServiceImpl.insert(orderQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<Order> orderList) {
		Integer insert = orderServiceImpl.insertBatch(orderList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<Order> orderList) {
		Integer insert = orderServiceImpl.insertOrUpdateBatch(orderList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据OrderId查询
	 */
	@PostMapping("/selectByOrderId")
	public ResultVo<?> selectByOrderId(Long orderId) {
		Order  orderQuery = orderServiceImpl.selectByOrderId(orderId);
		return getSuccessResultVo(orderQuery);
	}

	/**
	 * 根据OrderId更新
	 */
	@PostMapping("/updateByOrderId")
	public ResultVo<?> updateByOrderId(Order order, Long orderId) {
		Integer update = orderServiceImpl.updateByOrderId(order, orderId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据OrderId删除
	 */
	@PostMapping("/deleteByOrderId")
	public ResultVo<?> deleteByOrderId(Long orderId) {
		Integer delete = orderServiceImpl.deleteByOrderId(orderId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}

	/**
	 * 根据OrderNumber查询
	 */
	@PostMapping("/selectByOrderNumber")
	public ResultVo<?> selectByOrderNumber(String orderNumber) {
		Order  orderQuery = orderServiceImpl.selectByOrderNumber(orderNumber);
		return getSuccessResultVo(orderQuery);
	}

	/**
	 * 根据OrderNumber更新
	 */
	@PostMapping("/updateByOrderNumber")
	public ResultVo<?> updateByOrderNumber(Order order, String orderNumber) {
		Integer update = orderServiceImpl.updateByOrderNumber(order, orderNumber);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据OrderNumber删除
	 */
	@PostMapping("/deleteByOrderNumber")
	public ResultVo<?> deleteByOrderNumber(String orderNumber) {
		Integer delete = orderServiceImpl.deleteByOrderNumber(orderNumber);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}

	/**
	 * 根据UserIdAndOrderNumber查询
	 */
	@PostMapping("/selectByUserIdAndOrderNumber")
	public ResultVo<?> selectByUserIdAndOrderNumber(String userId, String orderNumber) {
		Order  orderQuery = orderServiceImpl.selectByUserIdAndOrderNumber(userId, orderNumber);
		return getSuccessResultVo(orderQuery);
	}

	/**
	 * 根据UserIdAndOrderNumber更新
	 */
	@PostMapping("/updateByUserIdAndOrderNumber")
	public ResultVo<?> updateByUserIdAndOrderNumber(Order order, String userId, String orderNumber) {
		Integer update = orderServiceImpl.updateByUserIdAndOrderNumber(order, userId, orderNumber);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据UserIdAndOrderNumber删除
	 */
	@PostMapping("/deleteByUserIdAndOrderNumber")
	public ResultVo<?> deleteByUserIdAndOrderNumber(String userId, String orderNumber) {
		Integer delete = orderServiceImpl.deleteByUserIdAndOrderNumber(userId, orderNumber);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}