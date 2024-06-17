package com.mall.service;

import com.mall.entity.po.SysMenu;
import com.mall.entity.query.SysMenuQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: 菜单管理Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface SysMenuService {

	/**
	 * 根据条件查询列表
	 */
	List<SysMenu> selectListByCondition(SysMenuQuery sysMenuQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(SysMenuQuery sysMenuQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<SysMenu> selectList(SysMenuQuery sysMenuQuery);

	/**
	 * 新增
	 */
	Integer insert(SysMenu sysMenu);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<SysMenu> sysMenu);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<SysMenu> sysMenuList);

	/**
	 * 根据MenuId查询
	 */
	SysMenu selectByMenuId(Long menuId);

	/**
	 * 根据MenuId更新
	 */
	Integer updateByMenuId(SysMenu SysMenuQuery, Long menuId);

	/**
	 * 根据MenuId删除
	 */
	Integer deleteByMenuId(Long menuId);


}