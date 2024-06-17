package com.mall.service;

import com.mall.entity.po.SysUserRole;
import com.mall.entity.query.SysUserRoleQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: 用户与角色对应关系Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface SysUserRoleService {

	/**
	 * 根据条件查询列表
	 */
	List<SysUserRole> selectListByCondition(SysUserRoleQuery sysUserRoleQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(SysUserRoleQuery sysUserRoleQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<SysUserRole> selectList(SysUserRoleQuery sysUserRoleQuery);

	/**
	 * 新增
	 */
	Integer insert(SysUserRole sysUserRole);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<SysUserRole> sysUserRole);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<SysUserRole> sysUserRoleList);

	/**
	 * 根据Id查询
	 */
	SysUserRole selectById(Long id);

	/**
	 * 根据Id更新
	 */
	Integer updateById(SysUserRole SysUserRoleQuery, Long id);

	/**
	 * 根据Id删除
	 */
	Integer deleteById(Long id);


}