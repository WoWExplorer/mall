package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.CategoryServiceImpl;
import com.mall.entity.po.Category;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.CategoryQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: 产品类目CategoryController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/category")
public class CategoryController extends BaseController {
	@Autowired
	private CategoryServiceImpl categoryServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody CategoryQuery  categoryQuery){
		List<Category> tz_category = categoryServiceImpl.selectListByCondition(categoryQuery);
		return getSuccessResultVo(tz_category);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody CategoryQuery categoryQuery) {
		Long l = categoryServiceImpl.selectCount(categoryQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody CategoryQuery categoryQuery) {
		PaginationResultVo<Category> paginationResultVo = categoryServiceImpl.selectList(categoryQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody Category categoryQuery) {
		Integer insert = categoryServiceImpl.insert(categoryQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<Category> categoryList) {
		Integer insert = categoryServiceImpl.insertBatch(categoryList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<Category> categoryList) {
		Integer insert = categoryServiceImpl.insertOrUpdateBatch(categoryList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据CategoryId查询
	 */
	@PostMapping("/selectByCategoryId")
	public ResultVo<?> selectByCategoryId(Long categoryId) {
		Category  categoryQuery = categoryServiceImpl.selectByCategoryId(categoryId);
		return getSuccessResultVo(categoryQuery);
	}

	/**
	 * 根据CategoryId更新
	 */
	@PostMapping("/updateByCategoryId")
	public ResultVo<?> updateByCategoryId(Category category, Long categoryId) {
		Integer update = categoryServiceImpl.updateByCategoryId(category, categoryId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据CategoryId删除
	 */
	@PostMapping("/deleteByCategoryId")
	public ResultVo<?> deleteByCategoryId(Long categoryId) {
		Integer delete = categoryServiceImpl.deleteByCategoryId(categoryId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}