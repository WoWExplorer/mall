package com.mall.entity.po;

import java.io.Serializable;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.mall.enums.DataTimePatternEnum;
import com.mall.utils.DateUtils;


/**
 *  @Description: 购物车
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class Basket implements Serializable {

	/**
	 * 主键
	 */
	private Long basketId;

	/**
	 * 店铺ID
	 */
	private Long shopId;

	/**
	 * 产品ID
	 */
	private Long prodId;

	/**
	 * SkuID
	 */
	private Long skuId;

	/**
	 * 用户ID
	 */
	private String userId;

	/**
	 * 购物车产品个数
	 */
	private Integer basketCount;

	/**
	 * 购物时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date basketDate;

	/**
	 * 满减活动ID
	 */
	private Long discountId;

	/**
	 * 分销推广人卡号
	 */
	private String distributionCardNo;

	public Long getBasketId() {
		return basketId;
	}
	public void setBasketId(Long basketId) {
		this.basketId = basketId;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public Long getProdId() {
		return prodId;
	}
	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}
	public Long getSkuId() {
		return skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Integer getBasketCount() {
		return basketCount;
	}
	public void setBasketCount(Integer basketCount) {
		this.basketCount = basketCount;
	}
	public Date getBasketDate() {
		return basketDate;
	}
	public void setBasketDate(Date basketDate) {
		this.basketDate = basketDate;
	}
	public Long getDiscountId() {
		return discountId;
	}
	public void setDiscountId(Long discountId) {
		this.discountId = discountId;
	}
	public String getDistributionCardNo() {
		return distributionCardNo;
	}
	public void setDistributionCardNo(String distributionCardNo) {
		this.distributionCardNo = distributionCardNo;
	}
	@Override
	public String toString() {
		return "购物车: {"
				+ " \"主键\": \"" + (basketId == null ? "空" : basketId) + "\", "
				+ " \"店铺ID\": \"" + (shopId == null ? "空" : shopId) + "\", "
				+ " \"产品ID\": \"" + (prodId == null ? "空" : prodId) + "\", "
				+ " \"SkuID\": \"" + (skuId == null ? "空" : skuId) + "\", "
				+ " \"用户ID\": \"" + (userId == null ? "空" : userId) + "\", "
				+ " \"购物车产品个数\": \"" + (basketCount == null ? "空" : basketCount) + "\", "
				+ " \"购物时间\": \"" + (basketDate == null ? "空" : DateUtils.format(basketDate, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"满减活动ID\": \"" + (discountId == null ? "空" : discountId) + "\", "
				+ " \"分销推广人卡号\": \"" + (distributionCardNo == null ? "空" : distributionCardNo) + "\" "
				+ "}";

	}
}