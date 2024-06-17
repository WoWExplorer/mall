package com.mall.service;

import com.mall.entity.po.OrderItem;
import com.mall.entity.query.OrderItemQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: 订单项Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface OrderItemService {

	/**
	 * 根据条件查询列表
	 */
	List<OrderItem> selectListByCondition(OrderItemQuery orderItemQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(OrderItemQuery orderItemQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<OrderItem> selectList(OrderItemQuery orderItemQuery);

	/**
	 * 新增
	 */
	Integer insert(OrderItem orderItem);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<OrderItem> orderItem);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<OrderItem> orderItemList);

	/**
	 * 根据OrderItemId查询
	 */
	OrderItem selectByOrderItemId(Long orderItemId);

	/**
	 * 根据OrderItemId更新
	 */
	Integer updateByOrderItemId(OrderItem OrderItemQuery, Long orderItemId);

	/**
	 * 根据OrderItemId删除
	 */
	Integer deleteByOrderItemId(Long orderItemId);


}