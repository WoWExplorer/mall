package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface AttachFileMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据FileId查询
	 */
	 T selectByFileId(@Param("fileId") Long fileId);

	/**
	 * 根据FileId更新
	 */
	 Integer updateByFileId(@Param("bean") T t, @Param("fileId") Long fileId);

	/**
	 * 根据FileId删除
	 */
	 Integer deleteByFileId(@Param("fileId") Long fileId);

}