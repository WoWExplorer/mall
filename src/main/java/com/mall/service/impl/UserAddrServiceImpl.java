package com.mall.service.impl;

import com.mall.entity.po.UserAddr;
import com.mall.mapper.UserAddrMapper;
import com.mall.service.UserAddrService;
import com.mall.entity.query.UserAddrQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: 用户配送地址UserAddrServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("userAddrServiceImpl")
public class UserAddrServiceImpl implements UserAddrService {
	@Autowired
	private UserAddrMapper<UserAddr, UserAddrQuery> userAddrMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<UserAddr> selectListByCondition(UserAddrQuery userAddrQuery) {
		return userAddrMapper.selectList(userAddrQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(UserAddrQuery userAddrQuery) {
		return userAddrMapper.selectCount(userAddrQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<UserAddr> selectList(UserAddrQuery userAddrQuery) {
		int count = Math.toIntExact(this.selectCount(userAddrQuery));
		int pageSize = userAddrQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : userAddrQuery.getPageSize();
		SimplePage simplePage = new SimplePage(userAddrQuery.getPageNo(), count, pageSize);
		userAddrQuery.setSimplePage(simplePage);
		List<UserAddr> userAddr = this.selectListByCondition(userAddrQuery);
		return new PaginationResultVo<UserAddr>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), userAddr);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(UserAddr userAddr) {
		return userAddrMapper.insert(userAddr);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<UserAddr> userAddrList) {
		return userAddrMapper.insertBatch(userAddrList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<UserAddr> userAddrList) {
		return userAddrMapper.insertBatch(userAddrList);
	}

	/**
	 * 根据AddrId查询
	 */
	@Override
	public UserAddr selectByAddrId(Long addrId) {
		return userAddrMapper.selectByAddrId(addrId);
	}

	/**
	 * 根据AddrId更新
	 */
	@Override
	public Integer updateByAddrId(UserAddr userAddr, Long addrId) {
		return userAddrMapper.updateByAddrId(userAddr, addrId);
	}

	/**
	 * 根据AddrId删除
	 */
	@Override
	public Integer deleteByAddrId(Long addrId) {
		return userAddrMapper.deleteByAddrId(addrId);
	}
}