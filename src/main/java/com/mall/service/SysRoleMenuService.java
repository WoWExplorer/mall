package com.mall.service;

import com.mall.entity.po.SysRoleMenu;
import com.mall.entity.query.SysRoleMenuQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: 角色与菜单对应关系Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface SysRoleMenuService {

	/**
	 * 根据条件查询列表
	 */
	List<SysRoleMenu> selectListByCondition(SysRoleMenuQuery sysRoleMenuQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(SysRoleMenuQuery sysRoleMenuQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<SysRoleMenu> selectList(SysRoleMenuQuery sysRoleMenuQuery);

	/**
	 * 新增
	 */
	Integer insert(SysRoleMenu sysRoleMenu);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<SysRoleMenu> sysRoleMenu);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<SysRoleMenu> sysRoleMenuList);

	/**
	 * 根据Id查询
	 */
	SysRoleMenu selectById(Long id);

	/**
	 * 根据Id更新
	 */
	Integer updateById(SysRoleMenu SysRoleMenuQuery, Long id);

	/**
	 * 根据Id删除
	 */
	Integer deleteById(Long id);


}