package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface TranscityFreeMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据TranscityFreeId查询
	 */
	 T selectByTranscityFreeId(@Param("transcityFreeId") Long transcityFreeId);

	/**
	 * 根据TranscityFreeId更新
	 */
	 Integer updateByTranscityFreeId(@Param("bean") T t, @Param("transcityFreeId") Long transcityFreeId);

	/**
	 * 根据TranscityFreeId删除
	 */
	 Integer deleteByTranscityFreeId(@Param("transcityFreeId") Long transcityFreeId);

}