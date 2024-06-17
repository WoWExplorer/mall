package com.mall.service.impl;

import com.mall.entity.po.Transport;
import com.mall.mapper.TransportMapper;
import com.mall.service.TransportService;
import com.mall.entity.query.TransportQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: TransportServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("transportServiceImpl")
public class TransportServiceImpl implements TransportService {
	@Autowired
	private TransportMapper<Transport, TransportQuery> transportMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<Transport> selectListByCondition(TransportQuery transportQuery) {
		return transportMapper.selectList(transportQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(TransportQuery transportQuery) {
		return transportMapper.selectCount(transportQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<Transport> selectList(TransportQuery transportQuery) {
		int count = Math.toIntExact(this.selectCount(transportQuery));
		int pageSize = transportQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : transportQuery.getPageSize();
		SimplePage simplePage = new SimplePage(transportQuery.getPageNo(), count, pageSize);
		transportQuery.setSimplePage(simplePage);
		List<Transport> transport = this.selectListByCondition(transportQuery);
		return new PaginationResultVo<Transport>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), transport);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(Transport transport) {
		return transportMapper.insert(transport);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<Transport> transportList) {
		return transportMapper.insertBatch(transportList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<Transport> transportList) {
		return transportMapper.insertBatch(transportList);
	}

	/**
	 * 根据TransportId查询
	 */
	@Override
	public Transport selectByTransportId(Long transportId) {
		return transportMapper.selectByTransportId(transportId);
	}

	/**
	 * 根据TransportId更新
	 */
	@Override
	public Integer updateByTransportId(Transport transport, Long transportId) {
		return transportMapper.updateByTransportId(transport, transportId);
	}

	/**
	 * 根据TransportId删除
	 */
	@Override
	public Integer deleteByTransportId(Long transportId) {
		return transportMapper.deleteByTransportId(transportId);
	}
}