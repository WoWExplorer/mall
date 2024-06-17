package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: 热搜Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface HotSearchMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据HotSearchId查询
	 */
	 T selectByHotSearchId(@Param("hotSearchId") Long hotSearchId);

	/**
	 * 根据HotSearchId更新
	 */
	 Integer updateByHotSearchId(@Param("bean") T t, @Param("hotSearchId") Long hotSearchId);

	/**
	 * 根据HotSearchId删除
	 */
	 Integer deleteByHotSearchId(@Param("hotSearchId") Long hotSearchId);

}