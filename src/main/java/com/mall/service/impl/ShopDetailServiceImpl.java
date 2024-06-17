package com.mall.service.impl;

import com.mall.entity.po.ShopDetail;
import com.mall.mapper.ShopDetailMapper;
import com.mall.service.ShopDetailService;
import com.mall.entity.query.ShopDetailQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: ShopDetailServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("shopDetailServiceImpl")
public class ShopDetailServiceImpl implements ShopDetailService {
	@Autowired
	private ShopDetailMapper<ShopDetail, ShopDetailQuery> shopDetailMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<ShopDetail> selectListByCondition(ShopDetailQuery shopDetailQuery) {
		return shopDetailMapper.selectList(shopDetailQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(ShopDetailQuery shopDetailQuery) {
		return shopDetailMapper.selectCount(shopDetailQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<ShopDetail> selectList(ShopDetailQuery shopDetailQuery) {
		int count = Math.toIntExact(this.selectCount(shopDetailQuery));
		int pageSize = shopDetailQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : shopDetailQuery.getPageSize();
		SimplePage simplePage = new SimplePage(shopDetailQuery.getPageNo(), count, pageSize);
		shopDetailQuery.setSimplePage(simplePage);
		List<ShopDetail> shopDetail = this.selectListByCondition(shopDetailQuery);
		return new PaginationResultVo<ShopDetail>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), shopDetail);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(ShopDetail shopDetail) {
		return shopDetailMapper.insert(shopDetail);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<ShopDetail> shopDetailList) {
		return shopDetailMapper.insertBatch(shopDetailList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<ShopDetail> shopDetailList) {
		return shopDetailMapper.insertBatch(shopDetailList);
	}

	/**
	 * 根据ShopId查询
	 */
	@Override
	public ShopDetail selectByShopId(Long shopId) {
		return shopDetailMapper.selectByShopId(shopId);
	}

	/**
	 * 根据ShopId更新
	 */
	@Override
	public Integer updateByShopId(ShopDetail shopDetail, Long shopId) {
		return shopDetailMapper.updateByShopId(shopDetail, shopId);
	}

	/**
	 * 根据ShopId删除
	 */
	@Override
	public Integer deleteByShopId(Long shopId) {
		return shopDetailMapper.deleteByShopId(shopId);
	}

	/**
	 * 根据Mobile查询
	 */
	@Override
	public ShopDetail selectByMobile(String mobile) {
		return shopDetailMapper.selectByMobile(mobile);
	}

	/**
	 * 根据Mobile更新
	 */
	@Override
	public Integer updateByMobile(ShopDetail shopDetail, String mobile) {
		return shopDetailMapper.updateByMobile(shopDetail, mobile);
	}

	/**
	 * 根据Mobile删除
	 */
	@Override
	public Integer deleteByMobile(String mobile) {
		return shopDetailMapper.deleteByMobile(mobile);
	}

	/**
	 * 根据UserId查询
	 */
	@Override
	public ShopDetail selectByUserId(String userId) {
		return shopDetailMapper.selectByUserId(userId);
	}

	/**
	 * 根据UserId更新
	 */
	@Override
	public Integer updateByUserId(ShopDetail shopDetail, String userId) {
		return shopDetailMapper.updateByUserId(shopDetail, userId);
	}

	/**
	 * 根据UserId删除
	 */
	@Override
	public Integer deleteByUserId(String userId) {
		return shopDetailMapper.deleteByUserId(userId);
	}
}