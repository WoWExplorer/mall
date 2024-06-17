package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: 角色Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface SysRoleMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据RoleId查询
	 */
	 T selectByRoleId(@Param("roleId") Long roleId);

	/**
	 * 根据RoleId更新
	 */
	 Integer updateByRoleId(@Param("bean") T t, @Param("roleId") Long roleId);

	/**
	 * 根据RoleId删除
	 */
	 Integer deleteByRoleId(@Param("roleId") Long roleId);

}