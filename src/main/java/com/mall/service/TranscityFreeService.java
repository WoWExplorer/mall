package com.mall.service;

import com.mall.entity.po.TranscityFree;
import com.mall.entity.query.TranscityFreeQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface TranscityFreeService {

	/**
	 * 根据条件查询列表
	 */
	List<TranscityFree> selectListByCondition(TranscityFreeQuery transcityFreeQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(TranscityFreeQuery transcityFreeQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<TranscityFree> selectList(TranscityFreeQuery transcityFreeQuery);

	/**
	 * 新增
	 */
	Integer insert(TranscityFree transcityFree);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<TranscityFree> transcityFree);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<TranscityFree> transcityFreeList);

	/**
	 * 根据TranscityFreeId查询
	 */
	TranscityFree selectByTranscityFreeId(Long transcityFreeId);

	/**
	 * 根据TranscityFreeId更新
	 */
	Integer updateByTranscityFreeId(TranscityFree TranscityFreeQuery, Long transcityFreeId);

	/**
	 * 根据TranscityFreeId删除
	 */
	Integer deleteByTranscityFreeId(Long transcityFreeId);


}