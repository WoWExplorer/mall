package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface TranscityMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据TranscityId查询
	 */
	 T selectByTranscityId(@Param("transcityId") Long transcityId);

	/**
	 * 根据TranscityId更新
	 */
	 Integer updateByTranscityId(@Param("bean") T t, @Param("transcityId") Long transcityId);

	/**
	 * 根据TranscityId删除
	 */
	 Integer deleteByTranscityId(@Param("transcityId") Long transcityId);

}