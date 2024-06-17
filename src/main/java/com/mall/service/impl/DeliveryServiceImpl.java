package com.mall.service.impl;

import com.mall.entity.po.Delivery;
import com.mall.mapper.DeliveryMapper;
import com.mall.service.DeliveryService;
import com.mall.entity.query.DeliveryQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: 物流公司DeliveryServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("deliveryServiceImpl")
public class DeliveryServiceImpl implements DeliveryService {
	@Autowired
	private DeliveryMapper<Delivery, DeliveryQuery> deliveryMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<Delivery> selectListByCondition(DeliveryQuery deliveryQuery) {
		return deliveryMapper.selectList(deliveryQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(DeliveryQuery deliveryQuery) {
		return deliveryMapper.selectCount(deliveryQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<Delivery> selectList(DeliveryQuery deliveryQuery) {
		int count = Math.toIntExact(this.selectCount(deliveryQuery));
		int pageSize = deliveryQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : deliveryQuery.getPageSize();
		SimplePage simplePage = new SimplePage(deliveryQuery.getPageNo(), count, pageSize);
		deliveryQuery.setSimplePage(simplePage);
		List<Delivery> delivery = this.selectListByCondition(deliveryQuery);
		return new PaginationResultVo<Delivery>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), delivery);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(Delivery delivery) {
		return deliveryMapper.insert(delivery);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<Delivery> deliveryList) {
		return deliveryMapper.insertBatch(deliveryList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<Delivery> deliveryList) {
		return deliveryMapper.insertBatch(deliveryList);
	}

	/**
	 * 根据DvyId查询
	 */
	@Override
	public Delivery selectByDvyId(Long dvyId) {
		return deliveryMapper.selectByDvyId(dvyId);
	}

	/**
	 * 根据DvyId更新
	 */
	@Override
	public Integer updateByDvyId(Delivery delivery, Long dvyId) {
		return deliveryMapper.updateByDvyId(delivery, dvyId);
	}

	/**
	 * 根据DvyId删除
	 */
	@Override
	public Integer deleteByDvyId(Long dvyId) {
		return deliveryMapper.deleteByDvyId(dvyId);
	}
}