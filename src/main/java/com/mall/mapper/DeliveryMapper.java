package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: 物流公司Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface DeliveryMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据DvyId查询
	 */
	 T selectByDvyId(@Param("dvyId") Long dvyId);

	/**
	 * 根据DvyId更新
	 */
	 Integer updateByDvyId(@Param("bean") T t, @Param("dvyId") Long dvyId);

	/**
	 * 根据DvyId删除
	 */
	 Integer deleteByDvyId(@Param("dvyId") Long dvyId);

}