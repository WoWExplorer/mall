package com.mall.service.impl;

import com.mall.entity.po.SysUserRole;
import com.mall.mapper.SysUserRoleMapper;
import com.mall.service.SysUserRoleService;
import com.mall.entity.query.SysUserRoleQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: 用户与角色对应关系SysUserRoleServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("sysUserRoleServiceImpl")
public class SysUserRoleServiceImpl implements SysUserRoleService {
	@Autowired
	private SysUserRoleMapper<SysUserRole, SysUserRoleQuery> sysUserRoleMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<SysUserRole> selectListByCondition(SysUserRoleQuery sysUserRoleQuery) {
		return sysUserRoleMapper.selectList(sysUserRoleQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(SysUserRoleQuery sysUserRoleQuery) {
		return sysUserRoleMapper.selectCount(sysUserRoleQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<SysUserRole> selectList(SysUserRoleQuery sysUserRoleQuery) {
		int count = Math.toIntExact(this.selectCount(sysUserRoleQuery));
		int pageSize = sysUserRoleQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : sysUserRoleQuery.getPageSize();
		SimplePage simplePage = new SimplePage(sysUserRoleQuery.getPageNo(), count, pageSize);
		sysUserRoleQuery.setSimplePage(simplePage);
		List<SysUserRole> sysUserRole = this.selectListByCondition(sysUserRoleQuery);
		return new PaginationResultVo<SysUserRole>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), sysUserRole);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(SysUserRole sysUserRole) {
		return sysUserRoleMapper.insert(sysUserRole);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<SysUserRole> sysUserRoleList) {
		return sysUserRoleMapper.insertBatch(sysUserRoleList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<SysUserRole> sysUserRoleList) {
		return sysUserRoleMapper.insertBatch(sysUserRoleList);
	}

	/**
	 * 根据Id查询
	 */
	@Override
	public SysUserRole selectById(Long id) {
		return sysUserRoleMapper.selectById(id);
	}

	/**
	 * 根据Id更新
	 */
	@Override
	public Integer updateById(SysUserRole sysUserRole, Long id) {
		return sysUserRoleMapper.updateById(sysUserRole, id);
	}

	/**
	 * 根据Id删除
	 */
	@Override
	public Integer deleteById(Long id) {
		return sysUserRoleMapper.deleteById(id);
	}
}