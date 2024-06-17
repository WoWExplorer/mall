package com.mall.service;

import com.mall.entity.po.Prod;
import com.mall.entity.query.ProdQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: 商品Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface ProdService {

	/**
	 * 根据条件查询列表
	 */
	List<Prod> selectListByCondition(ProdQuery prodQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(ProdQuery prodQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<Prod> selectList(ProdQuery prodQuery);

	/**
	 * 新增
	 */
	Integer insert(Prod prod);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<Prod> prod);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<Prod> prodList);

	/**
	 * 根据ProdId查询
	 */
	Prod selectByProdId(Long prodId);

	/**
	 * 根据ProdId更新
	 */
	Integer updateByProdId(Prod ProdQuery, Long prodId);

	/**
	 * 根据ProdId删除
	 */
	Integer deleteByProdId(Long prodId);


}