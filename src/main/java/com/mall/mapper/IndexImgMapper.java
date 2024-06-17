package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: 主页轮播图Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface IndexImgMapper<T, P> extends BaseMapper<T, P>  {

	/**
	 * 根据ImgId查询
	 */
	 T selectByImgId(@Param("imgId") Long imgId);

	/**
	 * 根据ImgId更新
	 */
	 Integer updateByImgId(@Param("bean") T t, @Param("imgId") Long imgId);

	/**
	 * 根据ImgId删除
	 */
	 Integer deleteByImgId(@Param("imgId") Long imgId);

}