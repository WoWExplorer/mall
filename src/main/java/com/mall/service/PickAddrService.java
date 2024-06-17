package com.mall.service;

import com.mall.entity.po.PickAddr;
import com.mall.entity.query.PickAddrQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: 用户配送地址Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface PickAddrService {

	/**
	 * 根据条件查询列表
	 */
	List<PickAddr> selectListByCondition(PickAddrQuery pickAddrQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(PickAddrQuery pickAddrQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<PickAddr> selectList(PickAddrQuery pickAddrQuery);

	/**
	 * 新增
	 */
	Integer insert(PickAddr pickAddr);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<PickAddr> pickAddr);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<PickAddr> pickAddrList);

	/**
	 * 根据AddrId查询
	 */
	PickAddr selectByAddrId(Long addrId);

	/**
	 * 根据AddrId更新
	 */
	Integer updateByAddrId(PickAddr PickAddrQuery, Long addrId);

	/**
	 * 根据AddrId删除
	 */
	Integer deleteByAddrId(Long addrId);


}