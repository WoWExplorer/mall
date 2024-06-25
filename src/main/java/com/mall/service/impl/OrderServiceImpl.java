package com.mall.service.impl;

import com.mall.entity.po.Order;
import com.mall.mapper.OrderMapper;
import com.mall.service.OrderService;
import com.mall.entity.query.OrderQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: 订单表OrderServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("orderServiceImpl")
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderMapper<Order, OrderQuery> orderMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<Order> selectListByCondition(OrderQuery orderQuery) {
		return orderMapper.selectList(orderQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(OrderQuery orderQuery) {
		return orderMapper.selectCount(orderQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<Order> selectList(OrderQuery orderQuery) {
		int count = Math.toIntExact(this.selectCount(orderQuery));
		int pageSize = orderQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : orderQuery.getPageSize();
		SimplePage simplePage = new SimplePage(orderQuery.getPageNo(), count, pageSize);
		orderQuery.setSimplePage(simplePage);
		List<Order> order = this.selectListByCondition(orderQuery);
		return new PaginationResultVo<Order>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), order);
	}
	/**
	 * 新增
	 */
	@Override
//	@Async
	public Integer insert(Order order) {
		return orderMapper.insert(order);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<Order> orderList) {
		return orderMapper.insertBatch(orderList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<Order> orderList) {
		return orderMapper.insertBatch(orderList);
	}

	/**
	 * 根据OrderId查询
	 */
	@Override
	public Order selectByOrderId(Long orderId) {
		return orderMapper.selectByOrderId(orderId);
	}

	/**
	 * 根据OrderId更新
	 */
	@Override
	public Integer updateByOrderId(Order order, Long orderId) {
		return orderMapper.updateByOrderId(order, orderId);
	}

	/**
	 * 根据OrderId删除
	 */
	@Override
	public Integer deleteByOrderId(Long orderId) {
		return orderMapper.deleteByOrderId(orderId);
	}

	/**
	 * 根据OrderNumber查询
	 */
	@Override
	public Order selectByOrderNumber(String orderNumber) {
		return orderMapper.selectByOrderNumber(orderNumber);
	}

	/**
	 * 根据OrderNumber更新
	 */
	@Override
	public Integer updateByOrderNumber(Order order, String orderNumber) {
		return orderMapper.updateByOrderNumber(order, orderNumber);
	}

	/**
	 * 根据OrderNumber删除
	 */
	@Override
	public Integer deleteByOrderNumber(String orderNumber) {
		return orderMapper.deleteByOrderNumber(orderNumber);
	}

	/**
	 * 根据UserIdAndOrderNumber查询
	 */
	@Override
	public Order selectByUserIdAndOrderNumber(String userId, String orderNumber) {
		return orderMapper.selectByUserIdAndOrderNumber(userId, orderNumber);
	}

	/**
	 * 根据UserIdAndOrderNumber更新
	 */
	@Override
	public Integer updateByUserIdAndOrderNumber(Order order, String userId, String orderNumber) {
		return orderMapper.updateByUserIdAndOrderNumber(order, userId, orderNumber);
	}

	/**
	 * 根据UserIdAndOrderNumber删除
	 */
	@Override
	public Integer deleteByUserIdAndOrderNumber(String userId, String orderNumber) {
		return orderMapper.deleteByUserIdAndOrderNumber(userId, orderNumber);
	}
}