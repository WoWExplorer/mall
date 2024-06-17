package com.mall.service;

import com.mall.entity.po.OrderRefund;
import com.mall.entity.query.OrderRefundQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface OrderRefundService {

	/**
	 * 根据条件查询列表
	 */
	List<OrderRefund> selectListByCondition(OrderRefundQuery orderRefundQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(OrderRefundQuery orderRefundQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<OrderRefund> selectList(OrderRefundQuery orderRefundQuery);

	/**
	 * 新增
	 */
	Integer insert(OrderRefund orderRefund);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<OrderRefund> orderRefund);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<OrderRefund> orderRefundList);

	/**
	 * 根据RefundId查询
	 */
	OrderRefund selectByRefundId(Long refundId);

	/**
	 * 根据RefundId更新
	 */
	Integer updateByRefundId(OrderRefund OrderRefundQuery, Long refundId);

	/**
	 * 根据RefundId删除
	 */
	Integer deleteByRefundId(Long refundId);

	/**
	 * 根据RefundSn查询
	 */
	OrderRefund selectByRefundSn(String refundSn);

	/**
	 * 根据RefundSn更新
	 */
	Integer updateByRefundSn(OrderRefund OrderRefundQuery, String refundSn);

	/**
	 * 根据RefundSn删除
	 */
	Integer deleteByRefundSn(String refundSn);


}