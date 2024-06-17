package com.mall.service;

import com.mall.entity.po.SmsLog;
import com.mall.entity.query.SmsLogQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: 短信记录表Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface SmsLogService {

	/**
	 * 根据条件查询列表
	 */
	List<SmsLog> selectListByCondition(SmsLogQuery smsLogQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(SmsLogQuery smsLogQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<SmsLog> selectList(SmsLogQuery smsLogQuery);

	/**
	 * 新增
	 */
	Integer insert(SmsLog smsLog);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<SmsLog> smsLog);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<SmsLog> smsLogList);

	/**
	 * 根据Id查询
	 */
	SmsLog selectById(Long id);

	/**
	 * 根据Id更新
	 */
	Integer updateById(SmsLog SmsLogQuery, Long id);

	/**
	 * 根据Id删除
	 */
	Integer deleteById(Long id);


}