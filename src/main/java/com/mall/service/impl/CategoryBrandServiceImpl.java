package com.mall.service.impl;

import com.mall.entity.po.CategoryBrand;
import com.mall.mapper.CategoryBrandMapper;
import com.mall.service.CategoryBrandService;
import com.mall.entity.query.CategoryBrandQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: CategoryBrandServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("categoryBrandServiceImpl")
public class CategoryBrandServiceImpl implements CategoryBrandService {
	@Autowired
	private CategoryBrandMapper<CategoryBrand, CategoryBrandQuery> categoryBrandMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<CategoryBrand> selectListByCondition(CategoryBrandQuery categoryBrandQuery) {
		return categoryBrandMapper.selectList(categoryBrandQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(CategoryBrandQuery categoryBrandQuery) {
		return categoryBrandMapper.selectCount(categoryBrandQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<CategoryBrand> selectList(CategoryBrandQuery categoryBrandQuery) {
		int count = Math.toIntExact(this.selectCount(categoryBrandQuery));
		int pageSize = categoryBrandQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : categoryBrandQuery.getPageSize();
		SimplePage simplePage = new SimplePage(categoryBrandQuery.getPageNo(), count, pageSize);
		categoryBrandQuery.setSimplePage(simplePage);
		List<CategoryBrand> categoryBrand = this.selectListByCondition(categoryBrandQuery);
		return new PaginationResultVo<CategoryBrand>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), categoryBrand);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(CategoryBrand categoryBrand) {
		return categoryBrandMapper.insert(categoryBrand);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<CategoryBrand> categoryBrandList) {
		return categoryBrandMapper.insertBatch(categoryBrandList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<CategoryBrand> categoryBrandList) {
		return categoryBrandMapper.insertBatch(categoryBrandList);
	}

	/**
	 * 根据Id查询
	 */
	@Override
	public CategoryBrand selectById(Long id) {
		return categoryBrandMapper.selectById(id);
	}

	/**
	 * 根据Id更新
	 */
	@Override
	public Integer updateById(CategoryBrand categoryBrand, Long id) {
		return categoryBrandMapper.updateById(categoryBrand, id);
	}

	/**
	 * 根据Id删除
	 */
	@Override
	public Integer deleteById(Long id) {
		return categoryBrandMapper.deleteById(id);
	}
}