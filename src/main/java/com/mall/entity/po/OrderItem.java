package com.mall.entity.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.mall.enums.DataTimePatternEnum;
import com.mall.utils.DateUtils;


/**
 *  @Description: 订单项
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class OrderItem implements Serializable {

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

	/**
	 * sku名称
	 */
	private String skuName;

	/**
	 * 产品主图片路径
	 */
	private String pic;

	/**
	 * 产品价格
	 */
	private BigDecimal price;

	/**
	 * 用户Id
	 */
	private String userId;

	/**
	 * 商品总金额
	 */
	private BigDecimal productTotalAmount;

	/**
	 * 购物时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date recTime;

	/**
	 * 评论状态： 0 未评价  1 已评价
	 */
	private Integer commSts;

	/**
	 * 推广员使用的推销卡号
	 */
	private String distributionCardNo;

	/**
	 * 加入购物车时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date basketDate;

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
	@Override
	public String toString() {
		return "订单项: {"
				+ " \"订单项ID\": \"" + (orderItemId == null ? "空" : orderItemId) + "\", "
				+ " \"店铺id\": \"" + (shopId == null ? "空" : shopId) + "\", "
				+ " \"订单order_number\": \"" + (orderNumber == null ? "空" : orderNumber) + "\", "
				+ " \"产品ID\": \"" + (prodId == null ? "空" : prodId) + "\", "
				+ " \"产品SkuID\": \"" + (skuId == null ? "空" : skuId) + "\", "
				+ " \"购物车产品个数\": \"" + (prodCount == null ? "空" : prodCount) + "\", "
				+ " \"产品名称\": \"" + (prodName == null ? "空" : prodName) + "\", "
				+ " \"Sku名称\": \"" + (skuName == null ? "空" : skuName) + "\", "
				+ " \"产品主图片路径\": \"" + (pic == null ? "空" : pic) + "\", "
				+ " \"产品价格\": \"" + (price == null ? "空" : price) + "\", "
				+ " \"用户Id\": \"" + (userId == null ? "空" : userId) + "\", "
				+ " \"商品总金额\": \"" + (productTotalAmount == null ? "空" : productTotalAmount) + "\", "
				+ " \"购物时间\": \"" + (recTime == null ? "空" : DateUtils.format(recTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"评论状态： 0 未评价  1 已评价\": \"" + (commSts == null ? "空" : commSts) + "\", "
				+ " \"推广员使用的推销卡号\": \"" + (distributionCardNo == null ? "空" : distributionCardNo) + "\", "
				+ " \"加入购物车时间\": \"" + (basketDate == null ? "空" : DateUtils.format(basketDate, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\" "
				+ "}";

	}
}