package com.mall.service.impl;

import com.mall.entity.po.SysRole;
import com.mall.mapper.SysRoleMapper;
import com.mall.service.SysRoleService;
import com.mall.entity.query.SysRoleQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: 角色SysRoleServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("sysRoleServiceImpl")
public class SysRoleServiceImpl implements SysRoleService {
	@Autowired
	private SysRoleMapper<SysRole, SysRoleQuery> sysRoleMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<SysRole> selectListByCondition(SysRoleQuery sysRoleQuery) {
		return sysRoleMapper.selectList(sysRoleQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(SysRoleQuery sysRoleQuery) {
		return sysRoleMapper.selectCount(sysRoleQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<SysRole> selectList(SysRoleQuery sysRoleQuery) {
		int count = Math.toIntExact(this.selectCount(sysRoleQuery));
		int pageSize = sysRoleQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : sysRoleQuery.getPageSize();
		SimplePage simplePage = new SimplePage(sysRoleQuery.getPageNo(), count, pageSize);
		sysRoleQuery.setSimplePage(simplePage);
		List<SysRole> sysRole = this.selectListByCondition(sysRoleQuery);
		return new PaginationResultVo<SysRole>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), sysRole);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(SysRole sysRole) {
		return sysRoleMapper.insert(sysRole);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<SysRole> sysRoleList) {
		return sysRoleMapper.insertBatch(sysRoleList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<SysRole> sysRoleList) {
		return sysRoleMapper.insertBatch(sysRoleList);
	}

	/**
	 * 根据RoleId查询
	 */
	@Override
	public SysRole selectByRoleId(Long roleId) {
		return sysRoleMapper.selectByRoleId(roleId);
	}

	/**
	 * 根据RoleId更新
	 */
	@Override
	public Integer updateByRoleId(SysRole sysRole, Long roleId) {
		return sysRoleMapper.updateByRoleId(sysRole, roleId);
	}

	/**
	 * 根据RoleId删除
	 */
	@Override
	public Integer deleteByRoleId(Long roleId) {
		return sysRoleMapper.deleteByRoleId(roleId);
	}
}