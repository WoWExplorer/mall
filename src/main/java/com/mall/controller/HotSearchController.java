package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.HotSearchServiceImpl;
import com.mall.entity.po.HotSearch;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.HotSearchQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: 热搜HotSearchController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/hotSearch")
public class HotSearchController extends BaseController {
	@Autowired
	private HotSearchServiceImpl hotSearchServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody HotSearchQuery  hotSearchQuery){
		List<HotSearch> tz_hot_search = hotSearchServiceImpl.selectListByCondition(hotSearchQuery);
		return getSuccessResultVo(tz_hot_search);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody HotSearchQuery hotSearchQuery) {
		Long l = hotSearchServiceImpl.selectCount(hotSearchQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody HotSearchQuery hotSearchQuery) {
		PaginationResultVo<HotSearch> paginationResultVo = hotSearchServiceImpl.selectList(hotSearchQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody HotSearch hotSearchQuery) {
		Integer insert = hotSearchServiceImpl.insert(hotSearchQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<HotSearch> hotSearchList) {
		Integer insert = hotSearchServiceImpl.insertBatch(hotSearchList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<HotSearch> hotSearchList) {
		Integer insert = hotSearchServiceImpl.insertOrUpdateBatch(hotSearchList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据HotSearchId查询
	 */
	@PostMapping("/selectByHotSearchId")
	public ResultVo<?> selectByHotSearchId(Long hotSearchId) {
		HotSearch  hotSearchQuery = hotSearchServiceImpl.selectByHotSearchId(hotSearchId);
		return getSuccessResultVo(hotSearchQuery);
	}

	/**
	 * 根据HotSearchId更新
	 */
	@PostMapping("/updateByHotSearchId")
	public ResultVo<?> updateByHotSearchId(HotSearch hotSearch, Long hotSearchId) {
		Integer update = hotSearchServiceImpl.updateByHotSearchId(hotSearch, hotSearchId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据HotSearchId删除
	 */
	@PostMapping("/deleteByHotSearchId")
	public ResultVo<?> deleteByHotSearchId(Long hotSearchId) {
		Integer delete = hotSearchServiceImpl.deleteByHotSearchId(hotSearchId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}