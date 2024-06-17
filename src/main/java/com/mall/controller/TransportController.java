package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.TransportServiceImpl;
import com.mall.entity.po.Transport;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.TransportQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: TransportController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/transport")
public class TransportController extends BaseController {
	@Autowired
	private TransportServiceImpl transportServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody TransportQuery  transportQuery){
		List<Transport> tz_transport = transportServiceImpl.selectListByCondition(transportQuery);
		return getSuccessResultVo(tz_transport);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody TransportQuery transportQuery) {
		Long l = transportServiceImpl.selectCount(transportQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody TransportQuery transportQuery) {
		PaginationResultVo<Transport> paginationResultVo = transportServiceImpl.selectList(transportQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody Transport transportQuery) {
		Integer insert = transportServiceImpl.insert(transportQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<Transport> transportList) {
		Integer insert = transportServiceImpl.insertBatch(transportList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<Transport> transportList) {
		Integer insert = transportServiceImpl.insertOrUpdateBatch(transportList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据TransportId查询
	 */
	@PostMapping("/selectByTransportId")
	public ResultVo<?> selectByTransportId(Long transportId) {
		Transport  transportQuery = transportServiceImpl.selectByTransportId(transportId);
		return getSuccessResultVo(transportQuery);
	}

	/**
	 * 根据TransportId更新
	 */
	@PostMapping("/updateByTransportId")
	public ResultVo<?> updateByTransportId(Transport transport, Long transportId) {
		Integer update = transportServiceImpl.updateByTransportId(transport, transportId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据TransportId删除
	 */
	@PostMapping("/deleteByTransportId")
	public ResultVo<?> deleteByTransportId(Long transportId) {
		Integer delete = transportServiceImpl.deleteByTransportId(transportId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}