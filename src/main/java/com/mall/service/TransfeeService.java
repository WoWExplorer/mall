package com.mall.service;

import com.mall.entity.po.Transfee;
import com.mall.entity.query.TransfeeQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface TransfeeService {

	/**
	 * 根据条件查询列表
	 */
	List<Transfee> selectListByCondition(TransfeeQuery transfeeQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(TransfeeQuery transfeeQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<Transfee> selectList(TransfeeQuery transfeeQuery);

	/**
	 * 新增
	 */
	Integer insert(Transfee transfee);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<Transfee> transfee);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<Transfee> transfeeList);

	/**
	 * 根据TransfeeId查询
	 */
	Transfee selectByTransfeeId(Long transfeeId);

	/**
	 * 根据TransfeeId更新
	 */
	Integer updateByTransfeeId(Transfee TransfeeQuery, Long transfeeId);

	/**
	 * 根据TransfeeId删除
	 */
	Integer deleteByTransfeeId(Long transfeeId);


}