package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: 系统配置信息表Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface SysConfigMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据Id查询
	 */
	 T selectById(@Param("id") Long id);

	/**
	 * 根据Id更新
	 */
	 Integer updateById(@Param("bean") T t, @Param("id") Long id);

	/**
	 * 根据Id删除
	 */
	 Integer deleteById(@Param("id") Long id);

	/**
	 * 根据ParamKey查询
	 */
	 T selectByParamKey(@Param("paramKey") String paramKey);

	/**
	 * 根据ParamKey更新
	 */
	 Integer updateByParamKey(@Param("bean") T t, @Param("paramKey") String paramKey);

	/**
	 * 根据ParamKey删除
	 */
	 Integer deleteByParamKey(@Param("paramKey") String paramKey);

}