package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.SysUserRoleServiceImpl;
import com.mall.entity.po.SysUserRole;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.SysUserRoleQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: 用户与角色对应关系SysUserRoleController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/sysUserRole")
public class SysUserRoleController extends BaseController {
	@Autowired
	private SysUserRoleServiceImpl sysUserRoleServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody SysUserRoleQuery  sysUserRoleQuery){
		List<SysUserRole> tz_sys_user_role = sysUserRoleServiceImpl.selectListByCondition(sysUserRoleQuery);
		return getSuccessResultVo(tz_sys_user_role);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody SysUserRoleQuery sysUserRoleQuery) {
		Long l = sysUserRoleServiceImpl.selectCount(sysUserRoleQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody SysUserRoleQuery sysUserRoleQuery) {
		PaginationResultVo<SysUserRole> paginationResultVo = sysUserRoleServiceImpl.selectList(sysUserRoleQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody SysUserRole sysUserRoleQuery) {
		Integer insert = sysUserRoleServiceImpl.insert(sysUserRoleQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<SysUserRole> sysUserRoleList) {
		Integer insert = sysUserRoleServiceImpl.insertBatch(sysUserRoleList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<SysUserRole> sysUserRoleList) {
		Integer insert = sysUserRoleServiceImpl.insertOrUpdateBatch(sysUserRoleList);
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
		SysUserRole  sysUserRoleQuery = sysUserRoleServiceImpl.selectById(id);
		return getSuccessResultVo(sysUserRoleQuery);
	}

	/**
	 * 根据Id更新
	 */
	@PostMapping("/updateById")
	public ResultVo<?> updateById(SysUserRole sysUserRole, Long id) {
		Integer update = sysUserRoleServiceImpl.updateById(sysUserRole, id);
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
		Integer delete = sysUserRoleServiceImpl.deleteById(id);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}