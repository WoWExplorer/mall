package com.mall.service;

import com.mall.entity.po.SysRole;
import com.mall.entity.query.SysRoleQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: 角色Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface SysRoleService {

	/**
	 * 根据条件查询列表
	 */
	List<SysRole> selectListByCondition(SysRoleQuery sysRoleQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(SysRoleQuery sysRoleQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<SysRole> selectList(SysRoleQuery sysRoleQuery);

	/**
	 * 新增
	 */
	Integer insert(SysRole sysRole);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<SysRole> sysRole);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<SysRole> sysRoleList);

	/**
	 * 根据RoleId查询
	 */
	SysRole selectByRoleId(Long roleId);

	/**
	 * 根据RoleId更新
	 */
	Integer updateByRoleId(SysRole SysRoleQuery, Long roleId);

	/**
	 * 根据RoleId删除
	 */
	Integer deleteByRoleId(Long roleId);


}