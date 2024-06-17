package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.UserAddrOrderServiceImpl;
import com.mall.entity.po.UserAddrOrder;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.UserAddrOrderQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: 用户订单配送地址UserAddrOrderController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/userAddrOrder")
public class UserAddrOrderController extends BaseController {
	@Autowired
	private UserAddrOrderServiceImpl userAddrOrderServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody UserAddrOrderQuery  userAddrOrderQuery){
		List<UserAddrOrder> tz_user_addr_order = userAddrOrderServiceImpl.selectListByCondition(userAddrOrderQuery);
		return getSuccessResultVo(tz_user_addr_order);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody UserAddrOrderQuery userAddrOrderQuery) {
		Long l = userAddrOrderServiceImpl.selectCount(userAddrOrderQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody UserAddrOrderQuery userAddrOrderQuery) {
		PaginationResultVo<UserAddrOrder> paginationResultVo = userAddrOrderServiceImpl.selectList(userAddrOrderQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody UserAddrOrder userAddrOrderQuery) {
		Integer insert = userAddrOrderServiceImpl.insert(userAddrOrderQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<UserAddrOrder> userAddrOrderList) {
		Integer insert = userAddrOrderServiceImpl.insertBatch(userAddrOrderList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<UserAddrOrder> userAddrOrderList) {
		Integer insert = userAddrOrderServiceImpl.insertOrUpdateBatch(userAddrOrderList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据AddrOrderId查询
	 */
	@PostMapping("/selectByAddrOrderId")
	public ResultVo<?> selectByAddrOrderId(Long addrOrderId) {
		UserAddrOrder  userAddrOrderQuery = userAddrOrderServiceImpl.selectByAddrOrderId(addrOrderId);
		return getSuccessResultVo(userAddrOrderQuery);
	}

	/**
	 * 根据AddrOrderId更新
	 */
	@PostMapping("/updateByAddrOrderId")
	public ResultVo<?> updateByAddrOrderId(UserAddrOrder userAddrOrder, Long addrOrderId) {
		Integer update = userAddrOrderServiceImpl.updateByAddrOrderId(userAddrOrder, addrOrderId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据AddrOrderId删除
	 */
	@PostMapping("/deleteByAddrOrderId")
	public ResultVo<?> deleteByAddrOrderId(Long addrOrderId) {
		Integer delete = userAddrOrderServiceImpl.deleteByAddrOrderId(addrOrderId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}