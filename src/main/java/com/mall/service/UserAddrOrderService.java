package com.mall.service;

import com.mall.entity.po.UserAddrOrder;
import com.mall.entity.query.UserAddrOrderQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: 用户订单配送地址Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface UserAddrOrderService {

	/**
	 * 根据条件查询列表
	 */
	List<UserAddrOrder> selectListByCondition(UserAddrOrderQuery userAddrOrderQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(UserAddrOrderQuery userAddrOrderQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<UserAddrOrder> selectList(UserAddrOrderQuery userAddrOrderQuery);

	/**
	 * 新增
	 */
	Integer insert(UserAddrOrder userAddrOrder);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<UserAddrOrder> userAddrOrder);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<UserAddrOrder> userAddrOrderList);

	/**
	 * 根据AddrOrderId查询
	 */
	UserAddrOrder selectByAddrOrderId(Long addrOrderId);

	/**
	 * 根据AddrOrderId更新
	 */
	Integer updateByAddrOrderId(UserAddrOrder UserAddrOrderQuery, Long addrOrderId);

	/**
	 * 根据AddrOrderId删除
	 */
	Integer deleteByAddrOrderId(Long addrOrderId);


}