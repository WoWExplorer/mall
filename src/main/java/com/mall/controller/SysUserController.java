package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.SysUserServiceImpl;
import com.mall.entity.po.SysUser;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.SysUserQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: 系统用户SysUserController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController extends BaseController {
	@Autowired
	private SysUserServiceImpl sysUserServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody SysUserQuery  sysUserQuery){
		List<SysUser> tz_sys_user = sysUserServiceImpl.selectListByCondition(sysUserQuery);
		return getSuccessResultVo(tz_sys_user);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody SysUserQuery sysUserQuery) {
		Long l = sysUserServiceImpl.selectCount(sysUserQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody SysUserQuery sysUserQuery) {
		PaginationResultVo<SysUser> paginationResultVo = sysUserServiceImpl.selectList(sysUserQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody SysUser sysUserQuery) {
		Integer insert = sysUserServiceImpl.insert(sysUserQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<SysUser> sysUserList) {
		Integer insert = sysUserServiceImpl.insertBatch(sysUserList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<SysUser> sysUserList) {
		Integer insert = sysUserServiceImpl.insertOrUpdateBatch(sysUserList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据UserId查询
	 */
	@PostMapping("/selectByUserId")
	public ResultVo<?> selectByUserId(Long userId) {
		SysUser  sysUserQuery = sysUserServiceImpl.selectByUserId(userId);
		return getSuccessResultVo(sysUserQuery);
	}

	/**
	 * 根据UserId更新
	 */
	@PostMapping("/updateByUserId")
	public ResultVo<?> updateByUserId(SysUser sysUser, Long userId) {
		Integer update = sysUserServiceImpl.updateByUserId(sysUser, userId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据UserId删除
	 */
	@PostMapping("/deleteByUserId")
	public ResultVo<?> deleteByUserId(Long userId) {
		Integer delete = sysUserServiceImpl.deleteByUserId(userId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}

	/**
	 * 根据Username查询
	 */
	@PostMapping("/selectByUsername")
	public ResultVo<?> selectByUsername(String username) {
		SysUser  sysUserQuery = sysUserServiceImpl.selectByUsername(username);
		return getSuccessResultVo(sysUserQuery);
	}

	/**
	 * 根据Username更新
	 */
	@PostMapping("/updateByUsername")
	public ResultVo<?> updateByUsername(SysUser sysUser, String username) {
		Integer update = sysUserServiceImpl.updateByUsername(sysUser, username);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据Username删除
	 */
	@PostMapping("/deleteByUsername")
	public ResultVo<?> deleteByUsername(String username) {
		Integer delete = sysUserServiceImpl.deleteByUsername(username);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}