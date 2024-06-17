package com.mall.service;

import com.mall.entity.po.Transcity;
import com.mall.entity.query.TranscityQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface TranscityService {

	/**
	 * 根据条件查询列表
	 */
	List<Transcity> selectListByCondition(TranscityQuery transcityQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(TranscityQuery transcityQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<Transcity> selectList(TranscityQuery transcityQuery);

	/**
	 * 新增
	 */
	Integer insert(Transcity transcity);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<Transcity> transcity);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<Transcity> transcityList);

	/**
	 * 根据TranscityId查询
	 */
	Transcity selectByTranscityId(Long transcityId);

	/**
	 * 根据TranscityId更新
	 */
	Integer updateByTranscityId(Transcity TranscityQuery, Long transcityId);

	/**
	 * 根据TranscityId删除
	 */
	Integer deleteByTranscityId(Long transcityId);


}