package com.mall.entity.query;

import java.math.BigDecimal;
import java.util.Date;


/**
 *  @Description: 订单项查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class OrderItemQuery extends BaseQuery {

	/**
	 * 订单项ID
	 */
	private Long orderItemId;

	/**
	 * 店铺id
	 */
	private Long shopId;

	/**
	 * 订单order_number
	 */
	private String orderNumber;
	private String orderNumberFuzzy;

	/**
	 * 产品ID
	 */
	private Long prodId;

	/**
	 * 产品SkuID
	 */
	private Long skuId;

	/**
	 * 购物车产品个数
	 */
	private Integer prodCount;

	/**
	 * 产品名称
	 */
	private String prodName;
	private String prodNameFuzzy;

	/**
	 * sku名称
	 */
	private String skuName;
	private String skuNameFuzzy;

	/**
	 * 产品主图片路径
	 */
	private String pic;
	private String picFuzzy;

	/**
	 * 产品价格
	 */
	private BigDecimal price;

	/**
	 * 用户Id
	 */
	private String userId;
	private String userIdFuzzy;

	/**
	 * 商品总金额
	 */
	private BigDecimal productTotalAmount;

	/**
	 * 购物时间
	 */
	private Date recTime;
	private String recTimeStart;
	private String recTimeEnd;

	/**
	 * 评论状态： 0 未评价  1 已评价
	 */
	private Integer commSts;

	/**
	 * 推广员使用的推销卡号
	 */
	private String distributionCardNo;
	private String distributionCardNoFuzzy;

	/**
	 * 加入购物车时间
	 */
	private Date basketDate;
	private String basketDateStart;
	private String basketDateEnd;

	public Long getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(Long orderItemId) {
		this.orderItemId = orderItemId;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
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
	public Integer getProdCount() {
		return prodCount;
	}
	public void setProdCount(Integer prodCount) {
		this.prodCount = prodCount;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getSkuName() {
		return skuName;
	}
	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public BigDecimal getProductTotalAmount() {
		return productTotalAmount;
	}
	public void setProductTotalAmount(BigDecimal productTotalAmount) {
		this.productTotalAmount = productTotalAmount;
	}
	public Date getRecTime() {
		return recTime;
	}
	public void setRecTime(Date recTime) {
		this.recTime = recTime;
	}
	public Integer getCommSts() {
		return commSts;
	}
	public void setCommSts(Integer commSts) {
		this.commSts = commSts;
	}
	public String getDistributionCardNo() {
		return distributionCardNo;
	}
	public void setDistributionCardNo(String distributionCardNo) {
		this.distributionCardNo = distributionCardNo;
	}
	public Date getBasketDate() {
		return basketDate;
	}
	public void setBasketDate(Date basketDate) {
		this.basketDate = basketDate;
	}
	public String getOrderNumberFuzzy() {
		return orderNumberFuzzy;
	}
	public void setOrderNumberFuzzy(String orderNumberFuzzy) {
		this.orderNumberFuzzy = orderNumberFuzzy;
	}
	public String getProdNameFuzzy() {
		return prodNameFuzzy;
	}
	public void setProdNameFuzzy(String prodNameFuzzy) {
		this.prodNameFuzzy = prodNameFuzzy;
	}
	public String getSkuNameFuzzy() {
		return skuNameFuzzy;
	}
	public void setSkuNameFuzzy(String skuNameFuzzy) {
		this.skuNameFuzzy = skuNameFuzzy;
	}
	public String getPicFuzzy() {
		return picFuzzy;
	}
	public void setPicFuzzy(String picFuzzy) {
		this.picFuzzy = picFuzzy;
	}
	public String getUserIdFuzzy() {
		return userIdFuzzy;
	}
	public void setUserIdFuzzy(String userIdFuzzy) {
		this.userIdFuzzy = userIdFuzzy;
	}
	public String getRecTimeStart() {
		return recTimeStart;
	}
	public void setRecTimeStart(String recTimeStart) {
		this.recTimeStart = recTimeStart;
	}
	public String getRecTimeEnd() {
		return recTimeEnd;
	}
	public void setRecTimeEnd(String recTimeEnd) {
		this.recTimeEnd = recTimeEnd;
	}
	public String getDistributionCardNoFuzzy() {
		return distributionCardNoFuzzy;
	}
	public void setDistributionCardNoFuzzy(String distributionCardNoFuzzy) {
		this.distributionCardNoFuzzy = distributionCardNoFuzzy;
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
}