package com.mall.service.impl;

import com.mall.entity.po.OrderSettlement;
import com.mall.mapper.OrderSettlementMapper;
import com.mall.service.OrderSettlementService;
import com.mall.entity.query.OrderSettlementQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: OrderSettlementServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("orderSettlementServiceImpl")
public class OrderSettlementServiceImpl implements OrderSettlementService {
	@Autowired
	private OrderSettlementMapper<OrderSettlement, OrderSettlementQuery> orderSettlementMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<OrderSettlement> selectListByCondition(OrderSettlementQuery orderSettlementQuery) {
		return orderSettlementMapper.selectList(orderSettlementQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(OrderSettlementQuery orderSettlementQuery) {
		return orderSettlementMapper.selectCount(orderSettlementQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<OrderSettlement> selectList(OrderSettlementQuery orderSettlementQuery) {
		int count = Math.toIntExact(this.selectCount(orderSettlementQuery));
		int pageSize = orderSettlementQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : orderSettlementQuery.getPageSize();
		SimplePage simplePage = new SimplePage(orderSettlementQuery.getPageNo(), count, pageSize);
		orderSettlementQuery.setSimplePage(simplePage);
		List<OrderSettlement> orderSettlement = this.selectListByCondition(orderSettlementQuery);
		return new PaginationResultVo<OrderSettlement>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), orderSettlement);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(OrderSettlement orderSettlement) {
		return orderSettlementMapper.insert(orderSettlement);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<OrderSettlement> orderSettlementList) {
		return orderSettlementMapper.insertBatch(orderSettlementList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<OrderSettlement> orderSettlementList) {
		return orderSettlementMapper.insertBatch(orderSettlementList);
	}

	/**
	 * 根据SettlementId查询
	 */
	@Override
	public OrderSettlement selectBySettlementId(Long settlementId) {
		return orderSettlementMapper.selectBySettlementId(settlementId);
	}

	/**
	 * 根据SettlementId更新
	 */
	@Override
	public Integer updateBySettlementId(OrderSettlement orderSettlement, Long settlementId) {
		return orderSettlementMapper.updateBySettlementId(orderSettlement, settlementId);
	}

	/**
	 * 根据SettlementId删除
	 */
	@Override
	public Integer deleteBySettlementId(Long settlementId) {
		return orderSettlementMapper.deleteBySettlementId(settlementId);
	}

	/**
	 * 根据OrderNumber查询
	 */
	@Override
	public OrderSettlement selectByOrderNumber(String orderNumber) {
		return orderSettlementMapper.selectByOrderNumber(orderNumber);
	}

	/**
	 * 根据OrderNumber更新
	 */
	@Override
	public Integer updateByOrderNumber(OrderSettlement orderSettlement, String orderNumber) {
		return orderSettlementMapper.updateByOrderNumber(orderSettlement, orderNumber);
	}

	/**
	 * 根据OrderNumber删除
	 */
	@Override
	public Integer deleteByOrderNumber(String orderNumber) {
		return orderSettlementMapper.deleteByOrderNumber(orderNumber);
	}
}