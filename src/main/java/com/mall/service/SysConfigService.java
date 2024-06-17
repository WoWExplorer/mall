package com.mall.service;

import com.mall.entity.po.SysConfig;
import com.mall.entity.query.SysConfigQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: 系统配置信息表Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface SysConfigService {

	/**
	 * 根据条件查询列表
	 */
	List<SysConfig> selectListByCondition(SysConfigQuery sysConfigQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(SysConfigQuery sysConfigQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<SysConfig> selectList(SysConfigQuery sysConfigQuery);

	/**
	 * 新增
	 */
	Integer insert(SysConfig sysConfig);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<SysConfig> sysConfig);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<SysConfig> sysConfigList);

	/**
	 * 根据Id查询
	 */
	SysConfig selectById(Long id);

	/**
	 * 根据Id更新
	 */
	Integer updateById(SysConfig SysConfigQuery, Long id);

	/**
	 * 根据Id删除
	 */
	Integer deleteById(Long id);

	/**
	 * 根据ParamKey查询
	 */
	SysConfig selectByParamKey(String paramKey);

	/**
	 * 根据ParamKey更新
	 */
	Integer updateByParamKey(SysConfig SysConfigQuery, String paramKey);

	/**
	 * 根据ParamKey删除
	 */
	Integer deleteByParamKey(String paramKey);


}