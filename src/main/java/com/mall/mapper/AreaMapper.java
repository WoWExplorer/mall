package com.mall.mapper;

import com.mall.entity.po.Area;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *  @Description: Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface AreaMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据AreaId查询
	 */
	 T selectByAreaId(@Param("areaId") Long areaId);

	/**
	 * 根据AreaId更新
	 */
	 Integer updateByAreaId(@Param("bean") T t, @Param("areaId") Long areaId);

	/**
	 * 根据AreaId删除
	 */
	 Integer deleteByAreaId(@Param("areaId") Long areaId);

	 List<Area> getAllRegions();

}