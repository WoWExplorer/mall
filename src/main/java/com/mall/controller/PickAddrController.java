package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.PickAddrServiceImpl;
import com.mall.entity.po.PickAddr;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.PickAddrQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: 用户配送地址PickAddrController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/pickAddr")
public class PickAddrController extends BaseController {
	@Autowired
	private PickAddrServiceImpl pickAddrServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody PickAddrQuery  pickAddrQuery){
		List<PickAddr> tz_pick_addr = pickAddrServiceImpl.selectListByCondition(pickAddrQuery);
		return getSuccessResultVo(tz_pick_addr);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody PickAddrQuery pickAddrQuery) {
		Long l = pickAddrServiceImpl.selectCount(pickAddrQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody PickAddrQuery pickAddrQuery) {
		PaginationResultVo<PickAddr> paginationResultVo = pickAddrServiceImpl.selectList(pickAddrQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody PickAddr pickAddrQuery) {
		Integer insert = pickAddrServiceImpl.insert(pickAddrQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<PickAddr> pickAddrList) {
		Integer insert = pickAddrServiceImpl.insertBatch(pickAddrList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<PickAddr> pickAddrList) {
		Integer insert = pickAddrServiceImpl.insertOrUpdateBatch(pickAddrList);
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
		PickAddr  pickAddrQuery = pickAddrServiceImpl.selectByAddrId(addrId);
		return getSuccessResultVo(pickAddrQuery);
	}

	/**
	 * 根据AddrId更新
	 */
	@PostMapping("/updateByAddrId")
	public ResultVo<?> updateByAddrId(PickAddr pickAddr, Long addrId) {
		Integer update = pickAddrServiceImpl.updateByAddrId(pickAddr, addrId);
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
		Integer delete = pickAddrServiceImpl.deleteByAddrId(addrId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}