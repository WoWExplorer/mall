package com.mall.controller;

import com.mall.entity.vo.PaginationResultVo;
import com.mall.service.impl.ShopDetailServiceImpl;
import com.mall.entity.po.ShopDetail;
import com.mall.entity.vo.ResultVo;
import com.mall.entity.query.ShopDetailQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  @Description: ShopDetailController
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@RestController
@RequestMapping("/shopDetail")
public class ShopDetailController extends BaseController {
	@Autowired
	private ShopDetailServiceImpl shopDetailServiceImpl;

	/**
	 * 根据条件查询列表
	 */
	@PostMapping("/selectListByCondition")
	public ResultVo<?> selectListByCondition(@RequestBody ShopDetailQuery  shopDetailQuery){
		List<ShopDetail> tz_shop_detail = shopDetailServiceImpl.selectListByCondition(shopDetailQuery);
		return getSuccessResultVo(tz_shop_detail);
	}

	/**
	 * 根据条件查询数量
	 */
	@PostMapping("/selectCount")
	public ResultVo<?> selectCount(@RequestBody ShopDetailQuery shopDetailQuery) {
		Long l = shopDetailServiceImpl.selectCount(shopDetailQuery);
		return getSuccessResultVo(l);
	}

	/**
	 * 分页查询
	 */
	@PostMapping("/selectList")
	public ResultVo<?> selectList(@RequestBody ShopDetailQuery shopDetailQuery) {
		PaginationResultVo<ShopDetail> paginationResultVo = shopDetailServiceImpl.selectList(shopDetailQuery);
		return getSuccessResultVo(paginationResultVo);
	}
	/**
	 * 新增
	 */
	@PostMapping("/insert")
	public ResultVo<?> insert(@RequestBody ShopDetail shopDetailQuery) {
		Integer insert = shopDetailServiceImpl.insert(shopDetailQuery);
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
	public ResultVo<?> insertBatch(@RequestBody List<ShopDetail> shopDetailList) {
		Integer insert = shopDetailServiceImpl.insertBatch(shopDetailList);
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
	public ResultVo<?> insertOrUpdateBatch(@RequestBody List<ShopDetail> shopDetailList) {
		Integer insert = shopDetailServiceImpl.insertOrUpdateBatch(shopDetailList);
		if (insert > 0) {
			return getSuccessResultVo(insert);
		} else {
			return ResultVo.fail("新增或修改失败");
		}
	}

	/**
	 * 根据ShopId查询
	 */
	@PostMapping("/selectByShopId")
	public ResultVo<?> selectByShopId(Long shopId) {
		ShopDetail  shopDetailQuery = shopDetailServiceImpl.selectByShopId(shopId);
		return getSuccessResultVo(shopDetailQuery);
	}

	/**
	 * 根据ShopId更新
	 */
	@PostMapping("/updateByShopId")
	public ResultVo<?> updateByShopId(ShopDetail shopDetail, Long shopId) {
		Integer update = shopDetailServiceImpl.updateByShopId(shopDetail, shopId);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据ShopId删除
	 */
	@PostMapping("/deleteByShopId")
	public ResultVo<?> deleteByShopId(Long shopId) {
		Integer delete = shopDetailServiceImpl.deleteByShopId(shopId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}

	/**
	 * 根据Mobile查询
	 */
	@PostMapping("/selectByMobile")
	public ResultVo<?> selectByMobile(String mobile) {
		ShopDetail  shopDetailQuery = shopDetailServiceImpl.selectByMobile(mobile);
		return getSuccessResultVo(shopDetailQuery);
	}

	/**
	 * 根据Mobile更新
	 */
	@PostMapping("/updateByMobile")
	public ResultVo<?> updateByMobile(ShopDetail shopDetail, String mobile) {
		Integer update = shopDetailServiceImpl.updateByMobile(shopDetail, mobile);
		if (update > 0) {
			return getSuccessResultVo(update);
		} else {
			return ResultVo.fail("更新失败");
		}
	}

	/**
	 * 根据Mobile删除
	 */
	@PostMapping("/deleteByMobile")
	public ResultVo<?> deleteByMobile(String mobile) {
		Integer delete = shopDetailServiceImpl.deleteByMobile(mobile);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}

	/**
	 * 根据UserId查询
	 */
	@PostMapping("/selectByUserId")
	public ResultVo<?> selectByUserId(String userId) {
		ShopDetail  shopDetailQuery = shopDetailServiceImpl.selectByUserId(userId);
		return getSuccessResultVo(shopDetailQuery);
	}

	/**
	 * 根据UserId更新
	 */
	@PostMapping("/updateByUserId")
	public ResultVo<?> updateByUserId(ShopDetail shopDetail, String userId) {
		Integer update = shopDetailServiceImpl.updateByUserId(shopDetail, userId);
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
	public ResultVo<?> deleteByUserId(String userId) {
		Integer delete = shopDetailServiceImpl.deleteByUserId(userId);
		if (delete > 0) {
			return getSuccessResultVo(delete);
		} else {
			return ResultVo.fail("删除失败");
		}
	}
}