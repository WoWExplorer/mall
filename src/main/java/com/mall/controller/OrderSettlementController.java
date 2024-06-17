package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.OrderSettlementServiceImpl;
import com.mall.entity.po.OrderSettlement;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.OrderSettlementQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: OrderSettlementController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/orderSettlement")
public class OrderSettlementController extends BaseController {
	@Autowired
	private OrderSettlementServiceImpl orderSettlementServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody OrderSettlementQuery  orderSettlementQuery){
		List<OrderSettlement> tz_order_settlement = orderSettlementServiceImpl.selectListByCondition(orderSettlementQuery);
		return getSuccessResultVo(tz_order_settlement);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody OrderSettlementQuery orderSettlementQuery) {
		Long l = orderSettlementServiceImpl.selectCount(orderSettlementQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody OrderSettlementQuery orderSettlementQuery) {
		PaginationResultVo<OrderSettlement> paginationResultVo = orderSettlementServiceImpl.selectList(orderSettlementQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody OrderSettlement orderSettlementQuery) {
		Integer insert = orderSettlementServiceImpl.insert(orderSettlementQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<OrderSettlement> orderSettlementList) {
		Integer insert = orderSettlementServiceImpl.insertBatch(orderSettlementList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<OrderSettlement> orderSettlementList) {
		Integer insert = orderSettlementServiceImpl.insertOrUpdateBatch(orderSettlementList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据SettlementId查询
	 */
	@PostMapping("/selectBySettlementId")
	public ResultVo<?> selectBySettlementId(Long settlementId) {
		OrderSettlement  orderSettlementQuery = orderSettlementServiceImpl.selectBySettlementId(settlementId);
		return getSuccessResultVo(orderSettlementQuery);
	}

	/**
	 * 根据SettlementId更新
	 */
	@PostMapping("/updateBySettlementId")
	public ResultVo<?> updateBySettlementId(OrderSettlement orderSettlement, Long settlementId) {
		Integer update = orderSettlementServiceImpl.updateBySettlementId(orderSettlement, settlementId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据SettlementId删除
	 */
	@PostMapping("/deleteBySettlementId")
	public ResultVo<?> deleteBySettlementId(Long settlementId) {
		Integer delete = orderSettlementServiceImpl.deleteBySettlementId(settlementId);
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
		OrderSettlement  orderSettlementQuery = orderSettlementServiceImpl.selectByOrderNumber(orderNumber);
		return getSuccessResultVo(orderSettlementQuery);
	}

	/**
	 * 根据OrderNumber更新
	 */
	@PostMapping("/updateByOrderNumber")
	public ResultVo<?> updateByOrderNumber(OrderSettlement orderSettlement, String orderNumber) {
		Integer update = orderSettlementServiceImpl.updateByOrderNumber(orderSettlement, orderNumber);
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
		Integer delete = orderSettlementServiceImpl.deleteByOrderNumber(orderNumber);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}