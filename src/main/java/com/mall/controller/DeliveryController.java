package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.DeliveryServiceImpl;
import com.mall.entity.po.Delivery;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.DeliveryQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: 物流公司DeliveryController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/delivery")
public class DeliveryController extends BaseController {
	@Autowired
	private DeliveryServiceImpl deliveryServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody DeliveryQuery  deliveryQuery){
		List<Delivery> tz_delivery = deliveryServiceImpl.selectListByCondition(deliveryQuery);
		return getSuccessResultVo(tz_delivery);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody DeliveryQuery deliveryQuery) {
		Long l = deliveryServiceImpl.selectCount(deliveryQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody DeliveryQuery deliveryQuery) {
		PaginationResultVo<Delivery> paginationResultVo = deliveryServiceImpl.selectList(deliveryQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody Delivery deliveryQuery) {
		Integer insert = deliveryServiceImpl.insert(deliveryQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<Delivery> deliveryList) {
		Integer insert = deliveryServiceImpl.insertBatch(deliveryList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<Delivery> deliveryList) {
		Integer insert = deliveryServiceImpl.insertOrUpdateBatch(deliveryList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据DvyId查询
	 */
	@PostMapping("/selectByDvyId")
	public ResultVo<?> selectByDvyId(Long dvyId) {
		Delivery  deliveryQuery = deliveryServiceImpl.selectByDvyId(dvyId);
		return getSuccessResultVo(deliveryQuery);
	}

	/**
	 * 根据DvyId更新
	 */
	@PostMapping("/updateByDvyId")
	public ResultVo<?> updateByDvyId(Delivery delivery, Long dvyId) {
		Integer update = deliveryServiceImpl.updateByDvyId(delivery, dvyId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据DvyId删除
	 */
	@PostMapping("/deleteByDvyId")
	public ResultVo<?> deleteByDvyId(Long dvyId) {
		Integer delete = deliveryServiceImpl.deleteByDvyId(dvyId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}