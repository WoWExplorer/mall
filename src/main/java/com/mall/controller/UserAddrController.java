package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.UserAddrServiceImpl;
import com.mall.entity.po.UserAddr;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.UserAddrQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: 用户配送地址UserAddrController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/userAddr")
public class UserAddrController extends BaseController {
	@Autowired
	private UserAddrServiceImpl userAddrServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody UserAddrQuery  userAddrQuery){
		List<UserAddr> tz_user_addr = userAddrServiceImpl.selectListByCondition(userAddrQuery);
		return getSuccessResultVo(tz_user_addr);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody UserAddrQuery userAddrQuery) {
		Long l = userAddrServiceImpl.selectCount(userAddrQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody UserAddrQuery userAddrQuery) {
		PaginationResultVo<UserAddr> paginationResultVo = userAddrServiceImpl.selectList(userAddrQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody UserAddr userAddrQuery) {
		Integer insert = userAddrServiceImpl.insert(userAddrQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<UserAddr> userAddrList) {
		Integer insert = userAddrServiceImpl.insertBatch(userAddrList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<UserAddr> userAddrList) {
		Integer insert = userAddrServiceImpl.insertOrUpdateBatch(userAddrList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据AddrId查询
	 */
	@PostMapping("/selectByAddrId")
	public ResultVo<?> selectByAddrId(Long addrId) {
		UserAddr  userAddrQuery = userAddrServiceImpl.selectByAddrId(addrId);
		return getSuccessResultVo(userAddrQuery);
	}

	/**
	 * 根据AddrId更新
	 */
	@PostMapping("/updateByAddrId")
	public ResultVo<?> updateByAddrId(UserAddr userAddr, Long addrId) {
		Integer update = userAddrServiceImpl.updateByAddrId(userAddr, addrId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据AddrId删除
	 */
	@PostMapping("/deleteByAddrId")
	public ResultVo<?> deleteByAddrId(Long addrId) {
		Integer delete = userAddrServiceImpl.deleteByAddrId(addrId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}