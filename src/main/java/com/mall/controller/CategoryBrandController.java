package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.CategoryBrandServiceImpl;
import com.mall.entity.po.CategoryBrand;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.CategoryBrandQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: CategoryBrandController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/categoryBrand")
public class CategoryBrandController extends BaseController {
	@Autowired
	private CategoryBrandServiceImpl categoryBrandServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody CategoryBrandQuery  categoryBrandQuery){
		List<CategoryBrand> tz_category_brand = categoryBrandServiceImpl.selectListByCondition(categoryBrandQuery);
		return getSuccessResultVo(tz_category_brand);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody CategoryBrandQuery categoryBrandQuery) {
		Long l = categoryBrandServiceImpl.selectCount(categoryBrandQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody CategoryBrandQuery categoryBrandQuery) {
		PaginationResultVo<CategoryBrand> paginationResultVo = categoryBrandServiceImpl.selectList(categoryBrandQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody CategoryBrand categoryBrandQuery) {
		Integer insert = categoryBrandServiceImpl.insert(categoryBrandQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<CategoryBrand> categoryBrandList) {
		Integer insert = categoryBrandServiceImpl.insertBatch(categoryBrandList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<CategoryBrand> categoryBrandList) {
		Integer insert = categoryBrandServiceImpl.insertOrUpdateBatch(categoryBrandList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据Id查询
	 */
	@PostMapping("/selectById")
	public ResultVo<?> selectById(Long id) {
		CategoryBrand  categoryBrandQuery = categoryBrandServiceImpl.selectById(id);
		return getSuccessResultVo(categoryBrandQuery);
	}

	/**
	 * 根据Id更新
	 */
	@PostMapping("/updateById")
	public ResultVo<?> updateById(CategoryBrand categoryBrand, Long id) {
		Integer update = categoryBrandServiceImpl.updateById(categoryBrand, id);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据Id删除
	 */
	@PostMapping("/deleteById")
	public ResultVo<?> deleteById(Long id) {
		Integer delete = categoryBrandServiceImpl.deleteById(id);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}