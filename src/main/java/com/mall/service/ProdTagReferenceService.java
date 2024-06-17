package com.mall.service;

import com.mall.entity.po.ProdTagReference;
import com.mall.entity.query.ProdTagReferenceQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface ProdTagReferenceService {

	/**
	 * 根据条件查询列表
	 */
	List<ProdTagReference> selectListByCondition(ProdTagReferenceQuery prodTagReferenceQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(ProdTagReferenceQuery prodTagReferenceQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<ProdTagReference> selectList(ProdTagReferenceQuery prodTagReferenceQuery);

	/**
	 * 新增
	 */
	Integer insert(ProdTagReference prodTagReference);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<ProdTagReference> prodTagReference);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<ProdTagReference> prodTagReferenceList);

	/**
	 * 根据ReferenceId查询
	 */
	ProdTagReference selectByReferenceId(Long referenceId);

	/**
	 * 根据ReferenceId更新
	 */
	Integer updateByReferenceId(ProdTagReference ProdTagReferenceQuery, Long referenceId);

	/**
	 * 根据ReferenceId删除
	 */
	Integer deleteByReferenceId(Long referenceId);


}