package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.SysRoleServiceImpl;
import com.mall.entity.po.SysRole;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.SysRoleQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: 角色SysRoleController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/sysRole")
public class SysRoleController extends BaseController {
	@Autowired
	private SysRoleServiceImpl sysRoleServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody SysRoleQuery  sysRoleQuery){
		List<SysRole> tz_sys_role = sysRoleServiceImpl.selectListByCondition(sysRoleQuery);
		return getSuccessResultVo(tz_sys_role);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody SysRoleQuery sysRoleQuery) {
		Long l = sysRoleServiceImpl.selectCount(sysRoleQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody SysRoleQuery sysRoleQuery) {
		PaginationResultVo<SysRole> paginationResultVo = sysRoleServiceImpl.selectList(sysRoleQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody SysRole sysRoleQuery) {
		Integer insert = sysRoleServiceImpl.insert(sysRoleQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<SysRole> sysRoleList) {
		Integer insert = sysRoleServiceImpl.insertBatch(sysRoleList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<SysRole> sysRoleList) {
		Integer insert = sysRoleServiceImpl.insertOrUpdateBatch(sysRoleList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据RoleId查询
	 */
	@PostMapping("/selectByRoleId")
	public ResultVo<?> selectByRoleId(Long roleId) {
		SysRole  sysRoleQuery = sysRoleServiceImpl.selectByRoleId(roleId);
		return getSuccessResultVo(sysRoleQuery);
	}

	/**
	 * 根据RoleId更新
	 */
	@PostMapping("/updateByRoleId")
	public ResultVo<?> updateByRoleId(SysRole sysRole, Long roleId) {
		Integer update = sysRoleServiceImpl.updateByRoleId(sysRole, roleId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据RoleId删除
	 */
	@PostMapping("/deleteByRoleId")
	public ResultVo<?> deleteByRoleId(Long roleId) {
		Integer delete = sysRoleServiceImpl.deleteByRoleId(roleId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}