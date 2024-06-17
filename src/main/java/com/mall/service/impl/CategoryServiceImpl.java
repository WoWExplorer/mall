package com.mall.service.impl;

import com.mall.entity.po.Category;
import com.mall.mapper.CategoryMapper;
import com.mall.service.CategoryService;
import com.mall.entity.query.CategoryQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: 产品类目CategoryServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("categoryServiceImpl")
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryMapper<Category, CategoryQuery> categoryMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<Category> selectListByCondition(CategoryQuery categoryQuery) {
		return categoryMapper.selectList(categoryQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(CategoryQuery categoryQuery) {
		return categoryMapper.selectCount(categoryQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<Category> selectList(CategoryQuery categoryQuery) {
		int count = Math.toIntExact(this.selectCount(categoryQuery));
		int pageSize = categoryQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : categoryQuery.getPageSize();
		SimplePage simplePage = new SimplePage(categoryQuery.getPageNo(), count, pageSize);
		categoryQuery.setSimplePage(simplePage);
		List<Category> category = this.selectListByCondition(categoryQuery);
		return new PaginationResultVo<Category>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), category);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(Category category) {
		return categoryMapper.insert(category);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<Category> categoryList) {
		return categoryMapper.insertBatch(categoryList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<Category> categoryList) {
		return categoryMapper.insertBatch(categoryList);
	}

	/**
	 * 根据CategoryId查询
	 */
	@Override
	public Category selectByCategoryId(Long categoryId) {
		return categoryMapper.selectByCategoryId(categoryId);
	}

	/**
	 * 根据CategoryId更新
	 */
	@Override
	public Integer updateByCategoryId(Category category, Long categoryId) {
		return categoryMapper.updateByCategoryId(category, categoryId);
	}

	/**
	 * 根据CategoryId删除
	 */
	@Override
	public Integer deleteByCategoryId(Long categoryId) {
		return categoryMapper.deleteByCategoryId(categoryId);
	}
}