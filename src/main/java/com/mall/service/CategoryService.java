package com.mall.service;

import com.mall.entity.po.Category;
import com.mall.entity.query.CategoryQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: 产品类目Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface CategoryService {

	/**
	 * 根据条件查询列表
	 */
	List<Category> selectListByCondition(CategoryQuery categoryQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(CategoryQuery categoryQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<Category> selectList(CategoryQuery categoryQuery);

	/**
	 * 新增
	 */
	Integer insert(Category category);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<Category> category);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<Category> categoryList);

	/**
	 * 根据CategoryId查询
	 */
	Category selectByCategoryId(Long categoryId);

	/**
	 * 根据CategoryId更新
	 */
	Integer updateByCategoryId(Category CategoryQuery, Long categoryId);

	/**
	 * 根据CategoryId删除
	 */
	Integer deleteByCategoryId(Long categoryId);


}