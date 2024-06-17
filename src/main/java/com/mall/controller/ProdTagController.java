package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.ProdTagServiceImpl;
import com.mall.entity.po.ProdTag;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.ProdTagQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: 商品分组表ProdTagController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/prodTag")
public class ProdTagController extends BaseController {
	@Autowired
	private ProdTagServiceImpl prodTagServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody ProdTagQuery  prodTagQuery){
		List<ProdTag> tz_prod_tag = prodTagServiceImpl.selectListByCondition(prodTagQuery);
		return getSuccessResultVo(tz_prod_tag);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody ProdTagQuery prodTagQuery) {
		Long l = prodTagServiceImpl.selectCount(prodTagQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody ProdTagQuery prodTagQuery) {
		PaginationResultVo<ProdTag> paginationResultVo = prodTagServiceImpl.selectList(prodTagQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody ProdTag prodTagQuery) {
		Integer insert = prodTagServiceImpl.insert(prodTagQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<ProdTag> prodTagList) {
		Integer insert = prodTagServiceImpl.insertBatch(prodTagList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<ProdTag> prodTagList) {
		Integer insert = prodTagServiceImpl.insertOrUpdateBatch(prodTagList);
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
		ProdTag  prodTagQuery = prodTagServiceImpl.selectById(id);
		return getSuccessResultVo(prodTagQuery);
	}

	/**
	 * 根据Id更新
	 */
	@PostMapping("/updateById")
	public ResultVo<?> updateById(ProdTag prodTag, Long id) {
		Integer update = prodTagServiceImpl.updateById(prodTag, id);
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
		Integer delete = prodTagServiceImpl.deleteById(id);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}