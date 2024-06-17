package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.SysRoleMenuServiceImpl;
import com.mall.entity.po.SysRoleMenu;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.SysRoleMenuQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: 角色与菜单对应关系SysRoleMenuController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/sysRoleMenu")
public class SysRoleMenuController extends BaseController {
	@Autowired
	private SysRoleMenuServiceImpl sysRoleMenuServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody SysRoleMenuQuery  sysRoleMenuQuery){
		List<SysRoleMenu> tz_sys_role_menu = sysRoleMenuServiceImpl.selectListByCondition(sysRoleMenuQuery);
		return getSuccessResultVo(tz_sys_role_menu);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody SysRoleMenuQuery sysRoleMenuQuery) {
		Long l = sysRoleMenuServiceImpl.selectCount(sysRoleMenuQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody SysRoleMenuQuery sysRoleMenuQuery) {
		PaginationResultVo<SysRoleMenu> paginationResultVo = sysRoleMenuServiceImpl.selectList(sysRoleMenuQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody SysRoleMenu sysRoleMenuQuery) {
		Integer insert = sysRoleMenuServiceImpl.insert(sysRoleMenuQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<SysRoleMenu> sysRoleMenuList) {
		Integer insert = sysRoleMenuServiceImpl.insertBatch(sysRoleMenuList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<SysRoleMenu> sysRoleMenuList) {
		Integer insert = sysRoleMenuServiceImpl.insertOrUpdateBatch(sysRoleMenuList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据Id查询
	 */
	@PostMapping("/selectById")
	public ResultVo<?> selectById(Long id) {
		SysRoleMenu  sysRoleMenuQuery = sysRoleMenuServiceImpl.selectById(id);
		return getSuccessResultVo(sysRoleMenuQuery);
	}

	/**
	 * 根据Id更新
	 */
	@PostMapping("/updateById")
	public ResultVo<?> updateById(SysRoleMenu sysRoleMenu, Long id) {
		Integer update = sysRoleMenuServiceImpl.updateById(sysRoleMenu, id);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据Id删除
	 */
	@PostMapping("/deleteById")
	public ResultVo<?> deleteById(Long id) {
		Integer delete = sysRoleMenuServiceImpl.deleteById(id);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}