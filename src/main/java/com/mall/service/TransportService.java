package com.mall.service;

import com.mall.entity.po.Transport;
import com.mall.entity.query.TransportQuery;
import com.mall.entity.vo.PaginationResultVo;

import java.util.List;

/**
 *  @Description: Service
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public interface TransportService {

	/**
	 * 根据条件查询列表
	 */
	List<Transport> selectListByCondition(TransportQuery transportQuery);

	/**
	 * 根据条件查询数量
	 */
	Long selectCount(TransportQuery transportQuery);

	/**
	 * 分页查询
	 */
	PaginationResultVo<Transport> selectList(TransportQuery transportQuery);

	/**
	 * 新增
	 */
	Integer insert(Transport transport);

	/**
	 * 批量新增
	 */
	Integer insertBatch(List<Transport> transport);

	/**
	 * 批量新增或修改
	 */
	Integer insertOrUpdateBatch(List<Transport> transportList);

	/**
	 * 根据TransportId查询
	 */
	Transport selectByTransportId(Long transportId);

	/**
	 * 根据TransportId更新
	 */
	Integer updateByTransportId(Transport TransportQuery, Long transportId);

	/**
	 * 根据TransportId删除
	 */
	Integer deleteByTransportId(Long transportId);


}