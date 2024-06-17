package com.mall.service.impl;

import com.mall.entity.po.Brand;
import com.mall.mapper.BrandMapper;
import com.mall.service.BrandService;
import com.mall.entity.query.BrandQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: 品牌表BrandServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("brandServiceImpl")
public class BrandServiceImpl implements BrandService {
	@Autowired
	private BrandMapper<Brand, BrandQuery> brandMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<Brand> selectListByCondition(BrandQuery brandQuery) {
		return brandMapper.selectList(brandQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(BrandQuery brandQuery) {
		return brandMapper.selectCount(brandQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<Brand> selectList(BrandQuery brandQuery) {
		int count = Math.toIntExact(this.selectCount(brandQuery));
		int pageSize = brandQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : brandQuery.getPageSize();
		SimplePage simplePage = new SimplePage(brandQuery.getPageNo(), count, pageSize);
		brandQuery.setSimplePage(simplePage);
		List<Brand> brand = this.selectListByCondition(brandQuery);
		return new PaginationResultVo<Brand>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), brand);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(Brand brand) {
		return brandMapper.insert(brand);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<Brand> brandList) {
		return brandMapper.insertBatch(brandList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<Brand> brandList) {
		return brandMapper.insertBatch(brandList);
	}

	/**
	 * 根据BrandId查询
	 */
	@Override
	public Brand selectByBrandId(Long brandId) {
		return brandMapper.selectByBrandId(brandId);
	}

	/**
	 * 根据BrandId更新
	 */
	@Override
	public Integer updateByBrandId(Brand brand, Long brandId) {
		return brandMapper.updateByBrandId(brand, brandId);
	}

	/**
	 * 根据BrandId删除
	 */
	@Override
	public Integer deleteByBrandId(Long brandId) {
		return brandMapper.deleteByBrandId(brandId);
	}
}