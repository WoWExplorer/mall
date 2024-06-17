package com.mall.service;

import com.mall.entity.po.CategoryBrand;
import com.mall.entity.query.CategoryBrandQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface CategoryBrandService {

	/**
	 * 根据条件查询列表
	 */
	List<CategoryBrand> selectListByCondition(CategoryBrandQuery categoryBrandQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(CategoryBrandQuery categoryBrandQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<CategoryBrand> selectList(CategoryBrandQuery categoryBrandQuery);

	/**
	 * 新增
	 */
	Integer insert(CategoryBrand categoryBrand);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<CategoryBrand> categoryBrand);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<CategoryBrand> categoryBrandList);

	/**
	 * 根据Id查询
	 */
	CategoryBrand selectById(Long id);

	/**
	 * 根据Id更新
	 */
	Integer updateById(CategoryBrand CategoryBrandQuery, Long id);

	/**
	 * 根据Id删除
	 */
	Integer deleteById(Long id);


}