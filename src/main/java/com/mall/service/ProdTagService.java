package com.mall.service;

import com.mall.entity.po.ProdTag;
import com.mall.entity.query.ProdTagQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: 商品分组表Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface ProdTagService {

	/**
	 * 根据条件查询列表
	 */
	List<ProdTag> selectListByCondition(ProdTagQuery prodTagQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(ProdTagQuery prodTagQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<ProdTag> selectList(ProdTagQuery prodTagQuery);

	/**
	 * 新增
	 */
	Integer insert(ProdTag prodTag);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<ProdTag> prodTag);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<ProdTag> prodTagList);

	/**
	 * 根据Id查询
	 */
	ProdTag selectById(Long id);

	/**
	 * 根据Id更新
	 */
	Integer updateById(ProdTag ProdTagQuery, Long id);

	/**
	 * 根据Id删除
	 */
	Integer deleteById(Long id);


}