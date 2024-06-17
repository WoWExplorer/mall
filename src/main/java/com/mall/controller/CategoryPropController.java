package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.CategoryPropServiceImpl;
import com.mall.entity.po.CategoryProp;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.CategoryPropQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: CategoryPropController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/categoryProp")
public class CategoryPropController extends BaseController {
	@Autowired
	private CategoryPropServiceImpl categoryPropServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody CategoryPropQuery  categoryPropQuery){
		List<CategoryProp> tz_category_prop = categoryPropServiceImpl.selectListByCondition(categoryPropQuery);
		return getSuccessResultVo(tz_category_prop);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody CategoryPropQuery categoryPropQuery) {
		Long l = categoryPropServiceImpl.selectCount(categoryPropQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody CategoryPropQuery categoryPropQuery) {
		PaginationResultVo<CategoryProp> paginationResultVo = categoryPropServiceImpl.selectList(categoryPropQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody CategoryProp categoryPropQuery) {
		Integer insert = categoryPropServiceImpl.insert(categoryPropQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<CategoryProp> categoryPropList) {
		Integer insert = categoryPropServiceImpl.insertBatch(categoryPropList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<CategoryProp> categoryPropList) {
		Integer insert = categoryPropServiceImpl.insertOrUpdateBatch(categoryPropList);
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
		CategoryProp  categoryPropQuery = categoryPropServiceImpl.selectById(id);
		return getSuccessResultVo(categoryPropQuery);
	}

	/**
	 * 根据Id更新
	 */
	@PostMapping("/updateById")
	public ResultVo<?> updateById(CategoryProp categoryProp, Long id) {
		Integer update = categoryPropServiceImpl.updateById(categoryProp, id);
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
		Integer delete = categoryPropServiceImpl.deleteById(id);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}