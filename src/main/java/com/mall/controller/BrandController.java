package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.BrandServiceImpl;
import com.mall.entity.po.Brand;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.BrandQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: 品牌表BrandController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/brand")
public class BrandController extends BaseController {
	@Autowired
	private BrandServiceImpl brandServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody BrandQuery  brandQuery){
		List<Brand> tz_brand = brandServiceImpl.selectListByCondition(brandQuery);
		return getSuccessResultVo(tz_brand);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody BrandQuery brandQuery) {
		Long l = brandServiceImpl.selectCount(brandQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody BrandQuery brandQuery) {
		PaginationResultVo<Brand> paginationResultVo = brandServiceImpl.selectList(brandQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody Brand brandQuery) {
		Integer insert = brandServiceImpl.insert(brandQuery);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增失败");
		}
	}

	/**
	 * 批量新增
	 */
	@PostMapping("/insertBatch")
	public ResultVo<?> insertBatch(@RequestBody List<Brand> brandList) {
		Integer insert = brandServiceImpl.insertBatch(brandList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增失败");
		}
	}

	/**
	 * 批量新增或修改
	 */
	@PostMapping("/insertOrUpdateBatch")
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<Brand> brandList) {
		Integer insert = brandServiceImpl.insertOrUpdateBatch(brandList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据BrandId查询
	 */
	@PostMapping("/selectByBrandId")
	public ResultVo<?> selectByBrandId(Long brandId) {
		Brand  brandQuery = brandServiceImpl.selectByBrandId(brandId);
		return getSuccessResultVo(brandQuery);
	}

	/**
	 * 根据BrandId更新
	 */
	@PostMapping("/updateByBrandId")
	public ResultVo<?> updateByBrandId(Brand brand, Long brandId) {
		Integer update = brandServiceImpl.updateByBrandId(brand, brandId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据BrandId删除
	 */
	@PostMapping("/deleteByBrandId")
	public ResultVo<?> deleteByBrandId(Long brandId) {
		Integer delete = brandServiceImpl.deleteByBrandId(brandId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}