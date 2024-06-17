package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.SysMenuServiceImpl;
import com.mall.entity.po.SysMenu;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.SysMenuQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: 菜单管理SysMenuController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/sysMenu")
public class SysMenuController extends BaseController {
	@Autowired
	private SysMenuServiceImpl sysMenuServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody SysMenuQuery  sysMenuQuery){
		List<SysMenu> tz_sys_menu = sysMenuServiceImpl.selectListByCondition(sysMenuQuery);
		return getSuccessResultVo(tz_sys_menu);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody SysMenuQuery sysMenuQuery) {
		Long l = sysMenuServiceImpl.selectCount(sysMenuQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody SysMenuQuery sysMenuQuery) {
		PaginationResultVo<SysMenu> paginationResultVo = sysMenuServiceImpl.selectList(sysMenuQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody SysMenu sysMenuQuery) {
		Integer insert = sysMenuServiceImpl.insert(sysMenuQuery);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增失败");
		}
	}

	/**
	 * 批量新增
	 */
	@PostMapping("/insertBatch")
	public ResultVo<?> insertBatch(@RequestBody List<SysMenu> sysMenuList) {
		Integer insert = sysMenuServiceImpl.insertBatch(sysMenuList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增失败");
		}
	}

	/**
	 * 批量新增或修改
	 */
	@PostMapping("/insertOrUpdateBatch")
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<SysMenu> sysMenuList) {
		Integer insert = sysMenuServiceImpl.insertOrUpdateBatch(sysMenuList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据MenuId查询
	 */
	@PostMapping("/selectByMenuId")
	public ResultVo<?> selectByMenuId(Long menuId) {
		SysMenu  sysMenuQuery = sysMenuServiceImpl.selectByMenuId(menuId);
		return getSuccessResultVo(sysMenuQuery);
	}

	/**
	 * 根据MenuId更新
	 */
	@PostMapping("/updateByMenuId")
	public ResultVo<?> updateByMenuId(SysMenu sysMenu, Long menuId) {
		Integer update = sysMenuServiceImpl.updateByMenuId(sysMenu, menuId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据MenuId删除
	 */
	@PostMapping("/deleteByMenuId")
	public ResultVo<?> deleteByMenuId(Long menuId) {
		Integer delete = sysMenuServiceImpl.deleteByMenuId(menuId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}