package com.mall.service.impl;

import com.mall.entity.po.OrderItem;
import com.mall.mapper.OrderItemMapper;
import com.mall.service.OrderItemService;
import com.mall.entity.query.OrderItemQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: 订单项OrderItemServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("orderItemServiceImpl")
public class OrderItemServiceImpl implements OrderItemService {
	@Autowired
	private OrderItemMapper<OrderItem, OrderItemQuery> orderItemMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<OrderItem> selectListByCondition(OrderItemQuery orderItemQuery) {
		return orderItemMapper.selectList(orderItemQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(OrderItemQuery orderItemQuery) {
		return orderItemMapper.selectCount(orderItemQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<OrderItem> selectList(OrderItemQuery orderItemQuery) {
		int count = Math.toIntExact(this.selectCount(orderItemQuery));
		int pageSize = orderItemQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : orderItemQuery.getPageSize();
		SimplePage simplePage = new SimplePage(orderItemQuery.getPageNo(), count, pageSize);
		orderItemQuery.setSimplePage(simplePage);
		List<OrderItem> orderItem = this.selectListByCondition(orderItemQuery);
		return new PaginationResultVo<OrderItem>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), orderItem);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(OrderItem orderItem) {
		return orderItemMapper.insert(orderItem);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<OrderItem> orderItemList) {
		return orderItemMapper.insertBatch(orderItemList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<OrderItem> orderItemList) {
		return orderItemMapper.insertBatch(orderItemList);
	}

	/**
	 * 根据OrderItemId查询
	 */
	@Override
	public OrderItem selectByOrderItemId(Long orderItemId) {
		return orderItemMapper.selectByOrderItemId(orderItemId);
	}

	/**
	 * 根据OrderItemId更新
	 */
	@Override
	public Integer updateByOrderItemId(OrderItem orderItem, Long orderItemId) {
		return orderItemMapper.updateByOrderItemId(orderItem, orderItemId);
	}

	/**
	 * 根据OrderItemId删除
	 */
	@Override
	public Integer deleteByOrderItemId(Long orderItemId) {
		return orderItemMapper.deleteByOrderItemId(orderItemId);
	}
}