package com.mall.service;

import com.mall.entity.po.TransfeeFree;
import com.mall.entity.query.TransfeeFreeQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface TransfeeFreeService {

	/**
	 * 根据条件查询列表
	 */
	List<TransfeeFree> selectListByCondition(TransfeeFreeQuery transfeeFreeQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(TransfeeFreeQuery transfeeFreeQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<TransfeeFree> selectList(TransfeeFreeQuery transfeeFreeQuery);

	/**
	 * 新增
	 */
	Integer insert(TransfeeFree transfeeFree);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<TransfeeFree> transfeeFree);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<TransfeeFree> transfeeFreeList);

	/**
	 * 根据TransfeeFreeId查询
	 */
	TransfeeFree selectByTransfeeFreeId(Long transfeeFreeId);

	/**
	 * 根据TransfeeFreeId更新
	 */
	Integer updateByTransfeeFreeId(TransfeeFree TransfeeFreeQuery, Long transfeeFreeId);

	/**
	 * 根据TransfeeFreeId删除
	 */
	Integer deleteByTransfeeFreeId(Long transfeeFreeId);


}