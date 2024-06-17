package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: 菜单管理Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface SysMenuMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据MenuId查询
	 */
	 T selectByMenuId(@Param("menuId") Long menuId);

	/**
	 * 根据MenuId更新
	 */
	 Integer updateByMenuId(@Param("bean") T t, @Param("menuId") Long menuId);

	/**
	 * 根据MenuId删除
	 */
	 Integer deleteByMenuId(@Param("menuId") Long menuId);

}