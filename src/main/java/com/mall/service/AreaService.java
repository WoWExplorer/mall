package com.mall.service;

import com.mall.entity.po.Area;
import com.mall.entity.query.AreaQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface AreaService {

	/**
	 * 根据条件查询列表
	 */
	List<Area> selectListByCondition(AreaQuery areaQuery);

	List<Area> getAllRegions();

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(AreaQuery areaQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<Area> selectList(AreaQuery areaQuery);

	/**
	 * 新增
	 */
	Integer insert(Area area);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<Area> area);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<Area> areaList);

	/**
	 * 根据AreaId查询
	 */
	Area selectByAreaId(Long areaId);

	/**
	 * 根据AreaId更新
	 */
	Integer updateByAreaId(Area AreaQuery, Long areaId);

	/**
	 * 根据AreaId删除
	 */
	Integer deleteByAreaId(Long areaId);


}