package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: 系统用户Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface SysUserMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据UserId查询
	 */
	 T selectByUserId(@Param("userId") Long userId);

	/**
	 * 根据UserId更新
	 */
	 Integer updateByUserId(@Param("bean") T t, @Param("userId") Long userId);

	/**
	 * 根据UserId删除
	 */
	 Integer deleteByUserId(@Param("userId") Long userId);

	/**
	 * 根据Username查询
	 */
	 T selectByUsername(@Param("username") String username);

	/**
	 * 根据Username更新
	 */
	 Integer updateByUsername(@Param("bean") T t, @Param("username") String username);

	/**
	 * 根据Username删除
	 */
	 Integer deleteByUsername(@Param("username") String username);

}