package com.mall.service;

import com.mall.entity.po.ProdPropValue;
import com.mall.entity.query.ProdPropValueQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface ProdPropValueService {

	/**
	 * 根据条件查询列表
	 */
	List<ProdPropValue> selectListByCondition(ProdPropValueQuery prodPropValueQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(ProdPropValueQuery prodPropValueQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<ProdPropValue> selectList(ProdPropValueQuery prodPropValueQuery);

	/**
	 * 新增
	 */
	Integer insert(ProdPropValue prodPropValue);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<ProdPropValue> prodPropValue);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<ProdPropValue> prodPropValueList);

	/**
	 * 根据ValueId查询
	 */
	ProdPropValue selectByValueId(Long valueId);

	/**
	 * 根据ValueId更新
	 */
	Integer updateByValueId(ProdPropValue ProdPropValueQuery, Long valueId);

	/**
	 * 根据ValueId删除
	 */
	Integer deleteByValueId(Long valueId);


}