package com.mall.service;

import com.mall.entity.po.HotSearch;
import com.mall.entity.query.HotSearchQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: 热搜Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface HotSearchService {

	/**
	 * 根据条件查询列表
	 */
	List<HotSearch> selectListByCondition(HotSearchQuery hotSearchQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(HotSearchQuery hotSearchQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<HotSearch> selectList(HotSearchQuery hotSearchQuery);

	/**
	 * 新增
	 */
	Integer insert(HotSearch hotSearch);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<HotSearch> hotSearch);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<HotSearch> hotSearchList);

	/**
	 * 根据HotSearchId查询
	 */
	HotSearch selectByHotSearchId(Long hotSearchId);

	/**
	 * 根据HotSearchId更新
	 */
	Integer updateByHotSearchId(HotSearch HotSearchQuery, Long hotSearchId);

	/**
	 * 根据HotSearchId删除
	 */
	Integer deleteByHotSearchId(Long hotSearchId);


}