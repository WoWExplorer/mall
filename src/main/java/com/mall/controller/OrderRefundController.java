package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.OrderRefundServiceImpl;
import com.mall.entity.po.OrderRefund;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.OrderRefundQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: OrderRefundController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/orderRefund")
public class OrderRefundController extends BaseController {
	@Autowired
	private OrderRefundServiceImpl orderRefundServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody OrderRefundQuery  orderRefundQuery){
		List<OrderRefund> tz_order_refund = orderRefundServiceImpl.selectListByCondition(orderRefundQuery);
		return getSuccessResultVo(tz_order_refund);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody OrderRefundQuery orderRefundQuery) {
		Long l = orderRefundServiceImpl.selectCount(orderRefundQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody OrderRefundQuery orderRefundQuery) {
		PaginationResultVo<OrderRefund> paginationResultVo = orderRefundServiceImpl.selectList(orderRefundQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody OrderRefund orderRefundQuery) {
		Integer insert = orderRefundServiceImpl.insert(orderRefundQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<OrderRefund> orderRefundList) {
		Integer insert = orderRefundServiceImpl.insertBatch(orderRefundList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<OrderRefund> orderRefundList) {
		Integer insert = orderRefundServiceImpl.insertOrUpdateBatch(orderRefundList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据RefundId查询
	 */
	@PostMapping("/selectByRefundId")
	public ResultVo<?> selectByRefundId(Long refundId) {
		OrderRefund  orderRefundQuery = orderRefundServiceImpl.selectByRefundId(refundId);
		return getSuccessResultVo(orderRefundQuery);
	}

	/**
	 * 根据RefundId更新
	 */
	@PostMapping("/updateByRefundId")
	public ResultVo<?> updateByRefundId(OrderRefund orderRefund, Long refundId) {
		Integer update = orderRefundServiceImpl.updateByRefundId(orderRefund, refundId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据RefundId删除
	 */
	@PostMapping("/deleteByRefundId")
	public ResultVo<?> deleteByRefundId(Long refundId) {
		Integer delete = orderRefundServiceImpl.deleteByRefundId(refundId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}

	/**
	 * 根据RefundSn查询
	 */
	@PostMapping("/selectByRefundSn")
	public ResultVo<?> selectByRefundSn(String refundSn) {
		OrderRefund  orderRefundQuery = orderRefundServiceImpl.selectByRefundSn(refundSn);
		return getSuccessResultVo(orderRefundQuery);
	}

	/**
	 * 根据RefundSn更新
	 */
	@PostMapping("/updateByRefundSn")
	public ResultVo<?> updateByRefundSn(OrderRefund orderRefund, String refundSn) {
		Integer update = orderRefundServiceImpl.updateByRefundSn(orderRefund, refundSn);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据RefundSn删除
	 */
	@PostMapping("/deleteByRefundSn")
	public ResultVo<?> deleteByRefundSn(String refundSn) {
		Integer delete = orderRefundServiceImpl.deleteByRefundSn(refundSn);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}