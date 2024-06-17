package com.mall.service.impl;

import com.mall.entity.po.CategoryProp;
import com.mall.mapper.CategoryPropMapper;
import com.mall.service.CategoryPropService;
import com.mall.entity.query.CategoryPropQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: CategoryPropServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("categoryPropServiceImpl")
public class CategoryPropServiceImpl implements CategoryPropService {
	@Autowired
	private CategoryPropMapper<CategoryProp, CategoryPropQuery> categoryPropMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<CategoryProp> selectListByCondition(CategoryPropQuery categoryPropQuery) {
		return categoryPropMapper.selectList(categoryPropQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(CategoryPropQuery categoryPropQuery) {
		return categoryPropMapper.selectCount(categoryPropQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<CategoryProp> selectList(CategoryPropQuery categoryPropQuery) {
		int count = Math.toIntExact(this.selectCount(categoryPropQuery));
		int pageSize = categoryPropQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : categoryPropQuery.getPageSize();
		SimplePage simplePage = new SimplePage(categoryPropQuery.getPageNo(), count, pageSize);
		categoryPropQuery.setSimplePage(simplePage);
		List<CategoryProp> categoryProp = this.selectListByCondition(categoryPropQuery);
		return new PaginationResultVo<CategoryProp>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), categoryProp);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(CategoryProp categoryProp) {
		return categoryPropMapper.insert(categoryProp);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<CategoryProp> categoryPropList) {
		return categoryPropMapper.insertBatch(categoryPropList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<CategoryProp> categoryPropList) {
		return categoryPropMapper.insertBatch(categoryPropList);
	}

	/**
	 * 根据Id查询
	 */
	@Override
	public CategoryProp selectById(Long id) {
		return categoryPropMapper.selectById(id);
	}

	/**
	 * 根据Id更新
	 */
	@Override
	public Integer updateById(CategoryProp categoryProp, Long id) {
		return categoryPropMapper.updateById(categoryProp, id);
	}

	/**
	 * 根据Id删除
	 */
	@Override
	public Integer deleteById(Long id) {
		return categoryPropMapper.deleteById(id);
	}
}