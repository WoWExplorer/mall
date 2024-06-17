package com.mall.service;

import com.mall.entity.po.Brand;
import com.mall.entity.query.BrandQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: 品牌表Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface BrandService {

	/**
	 * 根据条件查询列表
	 */
	List<Brand> selectListByCondition(BrandQuery brandQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(BrandQuery brandQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<Brand> selectList(BrandQuery brandQuery);

	/**
	 * 新增
	 */
	Integer insert(Brand brand);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<Brand> brand);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<Brand> brandList);

	/**
	 * 根据BrandId查询
	 */
	Brand selectByBrandId(Long brandId);

	/**
	 * 根据BrandId更新
	 */
	Integer updateByBrandId(Brand BrandQuery, Long brandId);

	/**
	 * 根据BrandId删除
	 */
	Integer deleteByBrandId(Long brandId);


}