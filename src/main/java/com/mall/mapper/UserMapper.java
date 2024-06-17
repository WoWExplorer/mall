package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: 用户表Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface UserMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据UserId查询
	 */
	 T selectByUserId(@Param("userId") String userId);

	/**
	 * 根据UserId更新
	 */
	 Integer updateByUserId(@Param("bean") T t, @Param("userId") String userId);

	/**
	 * 根据UserId删除
	 */
	 Integer deleteByUserId(@Param("userId") String userId);

	/**
	 * 根据UserMail查询
	 */
	 T selectByUserMail(@Param("userMail") String userMail);

	/**
	 * 根据UserMail更新
	 */
	 Integer updateByUserMail(@Param("bean") T t, @Param("userMail") String userMail);

	/**
	 * 根据UserMail删除
	 */
	 Integer deleteByUserMail(@Param("userMail") String userMail);

	/**
	 * 根据UserMobile查询
	 */
	 T selectByUserMobile(@Param("userMobile") String userMobile);

	/**
	 * 根据UserMobile更新
	 */
	 Integer updateByUserMobile(@Param("bean") T t, @Param("userMobile") String userMobile);

	/**
	 * 根据UserMobile删除
	 */
	 Integer deleteByUserMobile(@Param("userMobile") String userMobile);

}