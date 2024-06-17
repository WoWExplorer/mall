package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface ProdTagReferenceMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据ReferenceId查询
	 */
	 T selectByReferenceId(@Param("referenceId") Long referenceId);

	/**
	 * 根据ReferenceId更新
	 */
	 Integer updateByReferenceId(@Param("bean") T t, @Param("referenceId") Long referenceId);

	/**
	 * 根据ReferenceId删除
	 */
	 Integer deleteByReferenceId(@Param("referenceId") Long referenceId);

}