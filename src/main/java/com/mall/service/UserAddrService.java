package com.mall.service;

import com.mall.entity.po.UserAddr;
import com.mall.entity.query.UserAddrQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: 用户配送地址Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface UserAddrService {

	/**
	 * 根据条件查询列表
	 */
	List<UserAddr> selectListByCondition(UserAddrQuery userAddrQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(UserAddrQuery userAddrQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<UserAddr> selectList(UserAddrQuery userAddrQuery);

	/**
	 * 新增
	 */
	Integer insert(UserAddr userAddr);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<UserAddr> userAddr);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<UserAddr> userAddrList);

	/**
	 * 根据AddrId查询
	 */
	UserAddr selectByAddrId(Long addrId);

	/**
	 * 根据AddrId更新
	 */
	Integer updateByAddrId(UserAddr UserAddrQuery, Long addrId);

	/**
	 * 根据AddrId删除
	 */
	Integer deleteByAddrId(Long addrId);


}