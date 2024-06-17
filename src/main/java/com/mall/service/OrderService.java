package com.mall.service;

import com.mall.entity.po.Order;
import com.mall.entity.query.OrderQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: 订单表Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface OrderService {

	/**
	 * 根据条件查询列表
	 */
	List<Order> selectListByCondition(OrderQuery orderQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(OrderQuery orderQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<Order> selectList(OrderQuery orderQuery);

	/**
	 * 新增
	 */
	Integer insert(Order order);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<Order> order);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<Order> orderList);

	/**
	 * 根据OrderId查询
	 */
	Order selectByOrderId(Long orderId);

	/**
	 * 根据OrderId更新
	 */
	Integer updateByOrderId(Order OrderQuery, Long orderId);

	/**
	 * 根据OrderId删除
	 */
	Integer deleteByOrderId(Long orderId);

	/**
	 * 根据OrderNumber查询
	 */
	Order selectByOrderNumber(String orderNumber);

	/**
	 * 根据OrderNumber更新
	 */
	Integer updateByOrderNumber(Order OrderQuery, String orderNumber);

	/**
	 * 根据OrderNumber删除
	 */
	Integer deleteByOrderNumber(String orderNumber);

	/**
	 * 根据UserIdAndOrderNumber查询
	 */
	Order selectByUserIdAndOrderNumber(String userId, String orderNumber);

	/**
	 * 根据UserIdAndOrderNumber更新
	 */
	Integer updateByUserIdAndOrderNumber(Order OrderQuery, String userId, String orderNumber);

	/**
	 * 根据UserIdAndOrderNumber删除
	 */
	Integer deleteByUserIdAndOrderNumber(String userId, String orderNumber);


}