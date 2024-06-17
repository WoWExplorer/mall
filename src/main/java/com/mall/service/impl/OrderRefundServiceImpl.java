package com.mall.service.impl;

import com.mall.entity.po.OrderRefund;
import com.mall.mapper.OrderRefundMapper;
import com.mall.service.OrderRefundService;
import com.mall.entity.query.OrderRefundQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: OrderRefundServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("orderRefundServiceImpl")
public class OrderRefundServiceImpl implements OrderRefundService {
	@Autowired
	private OrderRefundMapper<OrderRefund, OrderRefundQuery> orderRefundMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<OrderRefund> selectListByCondition(OrderRefundQuery orderRefundQuery) {
		return orderRefundMapper.selectList(orderRefundQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(OrderRefundQuery orderRefundQuery) {
		return orderRefundMapper.selectCount(orderRefundQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<OrderRefund> selectList(OrderRefundQuery orderRefundQuery) {
		int count = Math.toIntExact(this.selectCount(orderRefundQuery));
		int pageSize = orderRefundQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : orderRefundQuery.getPageSize();
		SimplePage simplePage = new SimplePage(orderRefundQuery.getPageNo(), count, pageSize);
		orderRefundQuery.setSimplePage(simplePage);
		List<OrderRefund> orderRefund = this.selectListByCondition(orderRefundQuery);
		return new PaginationResultVo<OrderRefund>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), orderRefund);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(OrderRefund orderRefund) {
		return orderRefundMapper.insert(orderRefund);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<OrderRefund> orderRefundList) {
		return orderRefundMapper.insertBatch(orderRefundList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<OrderRefund> orderRefundList) {
		return orderRefundMapper.insertBatch(orderRefundList);
	}

	/**
	 * 根据RefundId查询
	 */
	@Override
	public OrderRefund selectByRefundId(Long refundId) {
		return orderRefundMapper.selectByRefundId(refundId);
	}

	/**
	 * 根据RefundId更新
	 */
	@Override
	public Integer updateByRefundId(OrderRefund orderRefund, Long refundId) {
		return orderRefundMapper.updateByRefundId(orderRefund, refundId);
	}

	/**
	 * 根据RefundId删除
	 */
	@Override
	public Integer deleteByRefundId(Long refundId) {
		return orderRefundMapper.deleteByRefundId(refundId);
	}

	/**
	 * 根据RefundSn查询
	 */
	@Override
	public OrderRefund selectByRefundSn(String refundSn) {
		return orderRefundMapper.selectByRefundSn(refundSn);
	}

	/**
	 * 根据RefundSn更新
	 */
	@Override
	public Integer updateByRefundSn(OrderRefund orderRefund, String refundSn) {
		return orderRefundMapper.updateByRefundSn(orderRefund, refundSn);
	}

	/**
	 * 根据RefundSn删除
	 */
	@Override
	public Integer deleteByRefundSn(String refundSn) {
		return orderRefundMapper.deleteByRefundSn(refundSn);
	}
}