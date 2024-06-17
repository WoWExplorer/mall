package com.mall.service;

import com.mall.entity.po.ShopDetail;
import com.mall.entity.query.ShopDetailQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface ShopDetailService {

	/**
	 * 根据条件查询列表
	 */
	List<ShopDetail> selectListByCondition(ShopDetailQuery shopDetailQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(ShopDetailQuery shopDetailQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<ShopDetail> selectList(ShopDetailQuery shopDetailQuery);

	/**
	 * 新增
	 */
	Integer insert(ShopDetail shopDetail);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<ShopDetail> shopDetail);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<ShopDetail> shopDetailList);

	/**
	 * 根据ShopId查询
	 */
	ShopDetail selectByShopId(Long shopId);

	/**
	 * 根据ShopId更新
	 */
	Integer updateByShopId(ShopDetail ShopDetailQuery, Long shopId);

	/**
	 * 根据ShopId删除
	 */
	Integer deleteByShopId(Long shopId);

	/**
	 * 根据Mobile查询
	 */
	ShopDetail selectByMobile(String mobile);

	/**
	 * 根据Mobile更新
	 */
	Integer updateByMobile(ShopDetail ShopDetailQuery, String mobile);

	/**
	 * 根据Mobile删除
	 */
	Integer deleteByMobile(String mobile);

	/**
	 * 根据UserId查询
	 */
	ShopDetail selectByUserId(String userId);

	/**
	 * 根据UserId更新
	 */
	Integer updateByUserId(ShopDetail ShopDetailQuery, String userId);

	/**
	 * 根据UserId删除
	 */
	Integer deleteByUserId(String userId);


}