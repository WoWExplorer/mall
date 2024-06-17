package com.mall.service;

import com.mall.entity.po.ProdProp;
import com.mall.entity.query.ProdPropQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface ProdPropService {

	/**
	 * 根据条件查询列表
	 */
	List<ProdProp> selectListByCondition(ProdPropQuery prodPropQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(ProdPropQuery prodPropQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<ProdProp> selectList(ProdPropQuery prodPropQuery);

	/**
	 * 新增
	 */
	Integer insert(ProdProp prodProp);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<ProdProp> prodProp);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<ProdProp> prodPropList);

	/**
	 * 根据PropId查询
	 */
	ProdProp selectByPropId(Long propId);

	/**
	 * 根据PropId更新
	 */
	Integer updateByPropId(ProdProp ProdPropQuery, Long propId);

	/**
	 * 根据PropId删除
	 */
	Integer deleteByPropId(Long propId);


}