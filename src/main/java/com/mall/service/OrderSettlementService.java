package com.mall.service;

import com.mall.entity.po.OrderSettlement;
import com.mall.entity.query.OrderSettlementQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface OrderSettlementService {

	/**
	 * 根据条件查询列表
	 */
	List<OrderSettlement> selectListByCondition(OrderSettlementQuery orderSettlementQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(OrderSettlementQuery orderSettlementQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<OrderSettlement> selectList(OrderSettlementQuery orderSettlementQuery);

	/**
	 * 新增
	 */
	Integer insert(OrderSettlement orderSettlement);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<OrderSettlement> orderSettlement);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<OrderSettlement> orderSettlementList);

	/**
	 * 根据SettlementId查询
	 */
	OrderSettlement selectBySettlementId(Long settlementId);

	/**
	 * 根据SettlementId更新
	 */
	Integer updateBySettlementId(OrderSettlement OrderSettlementQuery, Long settlementId);

	/**
	 * 根据SettlementId删除
	 */
	Integer deleteBySettlementId(Long settlementId);

	/**
	 * 根据OrderNumber查询
	 */
	OrderSettlement selectByOrderNumber(String orderNumber);

	/**
	 * 根据OrderNumber更新
	 */
	Integer updateByOrderNumber(OrderSettlement OrderSettlementQuery, String orderNumber);

	/**
	 * 根据OrderNumber删除
	 */
	Integer deleteByOrderNumber(String orderNumber);


}