package com.mall.service.impl;

import com.mall.entity.po.SysRoleMenu;
import com.mall.mapper.SysRoleMenuMapper;
import com.mall.service.SysRoleMenuService;
import com.mall.entity.query.SysRoleMenuQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: 角色与菜单对应关系SysRoleMenuServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("sysRoleMenuServiceImpl")
public class SysRoleMenuServiceImpl implements SysRoleMenuService {
	@Autowired
	private SysRoleMenuMapper<SysRoleMenu, SysRoleMenuQuery> sysRoleMenuMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<SysRoleMenu> selectListByCondition(SysRoleMenuQuery sysRoleMenuQuery) {
		return sysRoleMenuMapper.selectList(sysRoleMenuQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(SysRoleMenuQuery sysRoleMenuQuery) {
		return sysRoleMenuMapper.selectCount(sysRoleMenuQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<SysRoleMenu> selectList(SysRoleMenuQuery sysRoleMenuQuery) {
		int count = Math.toIntExact(this.selectCount(sysRoleMenuQuery));
		int pageSize = sysRoleMenuQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : sysRoleMenuQuery.getPageSize();
		SimplePage simplePage = new SimplePage(sysRoleMenuQuery.getPageNo(), count, pageSize);
		sysRoleMenuQuery.setSimplePage(simplePage);
		List<SysRoleMenu> sysRoleMenu = this.selectListByCondition(sysRoleMenuQuery);
		return new PaginationResultVo<SysRoleMenu>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), sysRoleMenu);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(SysRoleMenu sysRoleMenu) {
		return sysRoleMenuMapper.insert(sysRoleMenu);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<SysRoleMenu> sysRoleMenuList) {
		return sysRoleMenuMapper.insertBatch(sysRoleMenuList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<SysRoleMenu> sysRoleMenuList) {
		return sysRoleMenuMapper.insertBatch(sysRoleMenuList);
	}

	/**
	 * 根据Id查询
	 */
	@Override
	public SysRoleMenu selectById(Long id) {
		return sysRoleMenuMapper.selectById(id);
	}

	/**
	 * 根据Id更新
	 */
	@Override
	public Integer updateById(SysRoleMenu sysRoleMenu, Long id) {
		return sysRoleMenuMapper.updateById(sysRoleMenu, id);
	}

	/**
	 * 根据Id删除
	 */
	@Override
	public Integer deleteById(Long id) {
		return sysRoleMenuMapper.deleteById(id);
	}
}