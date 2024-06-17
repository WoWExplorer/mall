package com.mall.service.impl;

import com.mall.entity.po.UserAddrOrder;
import com.mall.mapper.UserAddrOrderMapper;
import com.mall.service.UserAddrOrderService;
import com.mall.entity.query.UserAddrOrderQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: 用户订单配送地址UserAddrOrderServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("userAddrOrderServiceImpl")
public class UserAddrOrderServiceImpl implements UserAddrOrderService {
	@Autowired
	private UserAddrOrderMapper<UserAddrOrder, UserAddrOrderQuery> userAddrOrderMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<UserAddrOrder> selectListByCondition(UserAddrOrderQuery userAddrOrderQuery) {
		return userAddrOrderMapper.selectList(userAddrOrderQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(UserAddrOrderQuery userAddrOrderQuery) {
		return userAddrOrderMapper.selectCount(userAddrOrderQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<UserAddrOrder> selectList(UserAddrOrderQuery userAddrOrderQuery) {
		int count = Math.toIntExact(this.selectCount(userAddrOrderQuery));
		int pageSize = userAddrOrderQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : userAddrOrderQuery.getPageSize();
		SimplePage simplePage = new SimplePage(userAddrOrderQuery.getPageNo(), count, pageSize);
		userAddrOrderQuery.setSimplePage(simplePage);
		List<UserAddrOrder> userAddrOrder = this.selectListByCondition(userAddrOrderQuery);
		return new PaginationResultVo<UserAddrOrder>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), userAddrOrder);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(UserAddrOrder userAddrOrder) {
		return userAddrOrderMapper.insert(userAddrOrder);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<UserAddrOrder> userAddrOrderList) {
		return userAddrOrderMapper.insertBatch(userAddrOrderList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<UserAddrOrder> userAddrOrderList) {
		return userAddrOrderMapper.insertBatch(userAddrOrderList);
	}

	/**
	 * 根据AddrOrderId查询
	 */
	@Override
	public UserAddrOrder selectByAddrOrderId(Long addrOrderId) {
		return userAddrOrderMapper.selectByAddrOrderId(addrOrderId);
	}

	/**
	 * 根据AddrOrderId更新
	 */
	@Override
	public Integer updateByAddrOrderId(UserAddrOrder userAddrOrder, Long addrOrderId) {
		return userAddrOrderMapper.updateByAddrOrderId(userAddrOrder, addrOrderId);
	}

	/**
	 * 根据AddrOrderId删除
	 */
	@Override
	public Integer deleteByAddrOrderId(Long addrOrderId) {
		return userAddrOrderMapper.deleteByAddrOrderId(addrOrderId);
	}
}