package com.mall.service;

import com.mall.entity.po.SysUser;
import com.mall.entity.query.SysUserQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: 系统用户Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface SysUserService {

	/**
	 * 根据条件查询列表
	 */
	List<SysUser> selectListByCondition(SysUserQuery sysUserQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(SysUserQuery sysUserQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<SysUser> selectList(SysUserQuery sysUserQuery);

	/**
	 * 新增
	 */
	Integer insert(SysUser sysUser);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<SysUser> sysUser);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<SysUser> sysUserList);

	/**
	 * 根据UserId查询
	 */
	SysUser selectByUserId(Long userId);

	/**
	 * 根据UserId更新
	 */
	Integer updateByUserId(SysUser SysUserQuery, Long userId);

	/**
	 * 根据UserId删除
	 */
	Integer deleteByUserId(Long userId);

	/**
	 * 根据Username查询
	 */
	SysUser selectByUsername(String username);

	/**
	 * 根据Username更新
	 */
	Integer updateByUsername(SysUser SysUserQuery, String username);

	/**
	 * 根据Username删除
	 */
	Integer deleteByUsername(String username);


}