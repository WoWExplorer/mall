package com.mall.mapper;

import org.apache.ibatis.annotations.Param;

/**
 *  @Description: Mapper
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface NoticeMapper<T, P> extends BaseMapper<T, P>  {

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

}