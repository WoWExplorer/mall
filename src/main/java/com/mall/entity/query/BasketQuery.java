package com.mall.entity.query;


import java.util.Date;


/**
 *  @Description: 购物车查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class BasketQuery extends BaseQuery {

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
	private String userIdFuzzy;

	/**
	 * 购物车产品个数
	 */
	private Integer basketCount;

	/**
	 * 购物时间
	 */
	private Date basketDate;
	private String basketDateStart;
	private String basketDateEnd;

	/**
	 * 满减活动ID
	 */
	private Long discountId;

	/**
	 * 分销推广人卡号
	 */
	private String distributionCardNo;
	private String distributionCardNoFuzzy;

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
	public String getUserIdFuzzy() {
		return userIdFuzzy;
	}
	public void setUserIdFuzzy(String userIdFuzzy) {
		this.userIdFuzzy = userIdFuzzy;
	}
	public String getBasketDateStart() {
		return basketDateStart;
	}
	public void setBasketDateStart(String basketDateStart) {
		this.basketDateStart = basketDateStart;
	}
	public String getBasketDateEnd() {
		return basketDateEnd;
	}
	public void setBasketDateEnd(String basketDateEnd) {
		this.basketDateEnd = basketDateEnd;
	}
	public String getDistributionCardNoFuzzy() {
		return distributionCardNoFuzzy;
	}
	public void setDistributionCardNoFuzzy(String distributionCardNoFuzzy) {
		this.distributionCardNoFuzzy = distributionCardNoFuzzy;
	}
}