package com.mall.service.impl;

import com.mall.entity.po.SysMenu;
import com.mall.mapper.SysMenuMapper;
import com.mall.service.SysMenuService;
import com.mall.entity.query.SysMenuQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: 菜单管理SysMenuServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("sysMenuServiceImpl")
public class SysMenuServiceImpl implements SysMenuService {
	@Autowired
	private SysMenuMapper<SysMenu, SysMenuQuery> sysMenuMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<SysMenu> selectListByCondition(SysMenuQuery sysMenuQuery) {
		return sysMenuMapper.selectList(sysMenuQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(SysMenuQuery sysMenuQuery) {
		return sysMenuMapper.selectCount(sysMenuQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<SysMenu> selectList(SysMenuQuery sysMenuQuery) {
		int count = Math.toIntExact(this.selectCount(sysMenuQuery));
		int pageSize = sysMenuQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : sysMenuQuery.getPageSize();
		SimplePage simplePage = new SimplePage(sysMenuQuery.getPageNo(), count, pageSize);
		sysMenuQuery.setSimplePage(simplePage);
		List<SysMenu> sysMenu = this.selectListByCondition(sysMenuQuery);
		return new PaginationResultVo<SysMenu>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), sysMenu);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(SysMenu sysMenu) {
		return sysMenuMapper.insert(sysMenu);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<SysMenu> sysMenuList) {
		return sysMenuMapper.insertBatch(sysMenuList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<SysMenu> sysMenuList) {
		return sysMenuMapper.insertBatch(sysMenuList);
	}

	/**
	 * 根据MenuId查询
	 */
	@Override
	public SysMenu selectByMenuId(Long menuId) {
		return sysMenuMapper.selectByMenuId(menuId);
	}

	/**
	 * 根据MenuId更新
	 */
	@Override
	public Integer updateByMenuId(SysMenu sysMenu, Long menuId) {
		return sysMenuMapper.updateByMenuId(sysMenu, menuId);
	}

	/**
	 * 根据MenuId删除
	 */
	@Override
	public Integer deleteByMenuId(Long menuId) {
		return sysMenuMapper.deleteByMenuId(menuId);
	}
}