package com.mall.service;

import com.mall.entity.po.CategoryProp;
import com.mall.entity.query.CategoryPropQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface CategoryPropService {

	/**
	 * 根据条件查询列表
	 */
	List<CategoryProp> selectListByCondition(CategoryPropQuery categoryPropQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(CategoryPropQuery categoryPropQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<CategoryProp> selectList(CategoryPropQuery categoryPropQuery);

	/**
	 * 新增
	 */
	Integer insert(CategoryProp categoryProp);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<CategoryProp> categoryProp);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<CategoryProp> categoryPropList);

	/**
	 * 根据Id查询
	 */
	CategoryProp selectById(Long id);

	/**
	 * 根据Id更新
	 */
	Integer updateById(CategoryProp CategoryPropQuery, Long id);

	/**
	 * 根据Id删除
	 */
	Integer deleteById(Long id);


}