package com.mall.service;

import com.mall.entity.po.SysLog;
import com.mall.entity.query.SysLogQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: 系统日志Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface SysLogService {

	/**
	 * 根据条件查询列表
	 */
	List<SysLog> selectListByCondition(SysLogQuery sysLogQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(SysLogQuery sysLogQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<SysLog> selectList(SysLogQuery sysLogQuery);

	/**
	 * 新增
	 */
	Integer insert(SysLog sysLog);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<SysLog> sysLog);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<SysLog> sysLogList);

	/**
	 * 根据Id查询
	 */
	SysLog selectById(Long id);

	/**
	 * 根据Id更新
	 */
	Integer updateById(SysLog SysLogQuery, Long id);

	/**
	 * 根据Id删除
	 */
	Integer deleteById(Long id);


}