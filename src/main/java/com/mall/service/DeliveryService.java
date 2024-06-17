package com.mall.service;

import com.mall.entity.po.Delivery;
import com.mall.entity.query.DeliveryQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: 物流公司Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface DeliveryService {

	/**
	 * 根据条件查询列表
	 */
	List<Delivery> selectListByCondition(DeliveryQuery deliveryQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(DeliveryQuery deliveryQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<Delivery> selectList(DeliveryQuery deliveryQuery);

	/**
	 * 新增
	 */
	Integer insert(Delivery delivery);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<Delivery> delivery);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<Delivery> deliveryList);

	/**
	 * 根据DvyId查询
	 */
	Delivery selectByDvyId(Long dvyId);

	/**
	 * 根据DvyId更新
	 */
	Integer updateByDvyId(Delivery DeliveryQuery, Long dvyId);

	/**
	 * 根据DvyId删除
	 */
	Integer deleteByDvyId(Long dvyId);


}