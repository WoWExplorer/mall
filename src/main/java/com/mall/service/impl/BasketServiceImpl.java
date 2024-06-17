package com.mall.service.impl;

import com.mall.entity.po.Basket;
import com.mall.mapper.BasketMapper;
import com.mall.service.BasketService;
import com.mall.entity.query.BasketQuery;
import com.mall.entity.vo.PaginationResultVo;
import com.mall.enums.PageSize;
import com.mall.entity.query.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @Description: 购物车BasketServiceImpl
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
@Service("basketServiceImpl")
public class BasketServiceImpl implements BasketService {
	@Autowired
	private BasketMapper<Basket, BasketQuery> basketMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<Basket> selectListByCondition(BasketQuery basketQuery) {
		return basketMapper.selectList(basketQuery);
	}
	/**
	 * 根据条件查询数量
	 */
	@Override
	public Long selectCount(BasketQuery basketQuery) {
		return basketMapper.selectCount(basketQuery);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PaginationResultVo<Basket> selectList(BasketQuery basketQuery) {
		int count = Math.toIntExact(this.selectCount(basketQuery));
		int pageSize = basketQuery.getPageSize() == null ? PageSize.PAGE_SIZE20.getSize() : basketQuery.getPageSize();
		SimplePage simplePage = new SimplePage(basketQuery.getPageNo(), count, pageSize);
		basketQuery.setSimplePage(simplePage);
		List<Basket> basket = this.selectListByCondition(basketQuery);
		return new PaginationResultVo<Basket>(count, simplePage.getPageSize(), simplePage.getPageNo(), simplePage.getPageTotal(), basket);
	}
	/**
	 * 新增
	 */
	@Override
	public Integer insert(Basket basket) {
		return basketMapper.insert(basket);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer insertBatch(List<Basket> basketList) {
		return basketMapper.insertBatch(basketList);
	}

	/**
	 * 批量新增或修改
	 */
	@Override
	public Integer insertOrUpdateBatch(List<Basket> basketList) {
		return basketMapper.insertBatch(basketList);
	}

	/**
	 * 根据BasketId查询
	 */
	@Override
	public Basket selectByBasketId(Long basketId) {
		return basketMapper.selectByBasketId(basketId);
	}

	/**
	 * 根据BasketId更新
	 */
	@Override
	public Integer updateByBasketId(Basket basket, Long basketId) {
		return basketMapper.updateByBasketId(basket, basketId);
	}

	/**
	 * 根据BasketId删除
	 */
	@Override
	public Integer deleteByBasketId(Long basketId) {
		return basketMapper.deleteByBasketId(basketId);
	}

	/**
	 * 根据SkuIdAndUserIdAndShopId查询
	 */
	@Override
	public Basket selectBySkuIdAndUserIdAndShopId(Long skuId, String userId, Long shopId) {
		return basketMapper.selectBySkuIdAndUserIdAndShopId(skuId, userId, shopId);
	}

	/**
	 * 根据SkuIdAndUserIdAndShopId更新
	 */
	@Override
	public Integer updateBySkuIdAndUserIdAndShopId(Basket basket, Long skuId, String userId, Long shopId) {
		return basketMapper.updateBySkuIdAndUserIdAndShopId(basket, skuId, userId, shopId);
	}

	/**
	 * 根据SkuIdAndUserIdAndShopId删除
	 */
	@Override
	public Integer deleteBySkuIdAndUserIdAndShopId(Long skuId, String userId, Long shopId) {
		return basketMapper.deleteBySkuIdAndUserIdAndShopId(skuId, userId, shopId);
	}
}