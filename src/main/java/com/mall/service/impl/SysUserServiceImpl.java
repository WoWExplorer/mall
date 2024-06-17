package com.mall.service.impl;

import com.mall.entity.po.SysUser;
import com.mall.mapper.SysUserMapper;
import com.mall.service.SysUserService;
import com.mall.entity.query.SysUserQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: 系统用户SysUserServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("sysUserServiceImpl")
public class SysUserServiceImpl implements SysUserService {
	@Autowired
	private SysUserMapper<SysUser, SysUserQuery> sysUserMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<SysUser> selectListByCondition(SysUserQuery sysUserQuery) {
		return sysUserMapper.selectList(sysUserQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(SysUserQuery sysUserQuery) {
		return sysUserMapper.selectCount(sysUserQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<SysUser> selectList(SysUserQuery sysUserQuery) {
		int count = Math.toIntExact(this.selectCount(sysUserQuery));
		int pageSize = sysUserQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : sysUserQuery.getPageSize();
		SimplePage simplePage = new SimplePage(sysUserQuery.getPageNo(), count, pageSize);
		sysUserQuery.setSimplePage(simplePage);
		List<SysUser> sysUser = this.selectListByCondition(sysUserQuery);
		return new PaginationResultVo<SysUser>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), sysUser);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(SysUser sysUser) {
		return sysUserMapper.insert(sysUser);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<SysUser> sysUserList) {
		return sysUserMapper.insertBatch(sysUserList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<SysUser> sysUserList) {
		return sysUserMapper.insertBatch(sysUserList);
	}

	/**
	 * 根据UserId查询
	 */
	@Override
	public SysUser selectByUserId(Long userId) {
		return sysUserMapper.selectByUserId(userId);
	}

	/**
	 * 根据UserId更新
	 */
	@Override
	public Integer updateByUserId(SysUser sysUser, Long userId) {
		return sysUserMapper.updateByUserId(sysUser, userId);
	}

	/**
	 * 根据UserId删除
	 */
	@Override
	public Integer deleteByUserId(Long userId) {
		return sysUserMapper.deleteByUserId(userId);
	}

	/**
	 * 根据Username查询
	 */
	@Override
	public SysUser selectByUsername(String username) {
		return sysUserMapper.selectByUsername(username);
	}

	/**
	 * 根据Username更新
	 */
	@Override
	public Integer updateByUsername(SysUser sysUser, String username) {
		return sysUserMapper.updateByUsername(sysUser, username);
	}

	/**
	 * 根据Username删除
	 */
	@Override
	public Integer deleteByUsername(String username) {
		return sysUserMapper.deleteByUsername(username);
	}
}