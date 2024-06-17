package com.mall.service;

import com.mall.entity.po.ProdComm;
import com.mall.entity.query.ProdCommQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: 商品评论Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface ProdCommService {

	/**
	 * 根据条件查询列表
	 */
	List<ProdComm> selectListByCondition(ProdCommQuery prodCommQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(ProdCommQuery prodCommQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<ProdComm> selectList(ProdCommQuery prodCommQuery);

	/**
	 * 新增
	 */
	Integer insert(ProdComm prodComm);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<ProdComm> prodComm);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<ProdComm> prodCommList);

	/**
	 * 根据ProdCommId查询
	 */
	ProdComm selectByProdCommId(Long prodCommId);

	/**
	 * 根据ProdCommId更新
	 */
	Integer updateByProdCommId(ProdComm ProdCommQuery, Long prodCommId);

	/**
	 * 根据ProdCommId删除
	 */
	Integer deleteByProdCommId(Long prodCommId);


}