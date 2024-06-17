package com.mall.service.impl;

import com.mall.entity.po.PickAddr;
import com.mall.mapper.PickAddrMapper;
import com.mall.service.PickAddrService;
import com.mall.entity.query.PickAddrQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: 用户配送地址PickAddrServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("pickAddrServiceImpl")
public class PickAddrServiceImpl implements PickAddrService {
	@Autowired
	private PickAddrMapper<PickAddr, PickAddrQuery> pickAddrMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<PickAddr> selectListByCondition(PickAddrQuery pickAddrQuery) {
		return pickAddrMapper.selectList(pickAddrQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(PickAddrQuery pickAddrQuery) {
		return pickAddrMapper.selectCount(pickAddrQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<PickAddr> selectList(PickAddrQuery pickAddrQuery) {
		int count = Math.toIntExact(this.selectCount(pickAddrQuery));
		int pageSize = pickAddrQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : pickAddrQuery.getPageSize();
		SimplePage simplePage = new SimplePage(pickAddrQuery.getPageNo(), count, pageSize);
		pickAddrQuery.setSimplePage(simplePage);
		List<PickAddr> pickAddr = this.selectListByCondition(pickAddrQuery);
		return new PaginationResultVo<PickAddr>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), pickAddr);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(PickAddr pickAddr) {
		return pickAddrMapper.insert(pickAddr);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<PickAddr> pickAddrList) {
		return pickAddrMapper.insertBatch(pickAddrList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<PickAddr> pickAddrList) {
		return pickAddrMapper.insertBatch(pickAddrList);
	}

	/**
	 * 根据AddrId查询
	 */
	@Override
	public PickAddr selectByAddrId(Long addrId) {
		return pickAddrMapper.selectByAddrId(addrId);
	}

	/**
	 * 根据AddrId更新
	 */
	@Override
	public Integer updateByAddrId(PickAddr pickAddr, Long addrId) {
		return pickAddrMapper.updateByAddrId(pickAddr, addrId);
	}

	/**
	 * 根据AddrId删除
	 */
	@Override
	public Integer deleteByAddrId(Long addrId) {
		return pickAddrMapper.deleteByAddrId(addrId);
	}
}