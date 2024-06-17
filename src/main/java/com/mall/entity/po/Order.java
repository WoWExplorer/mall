package com.mall.entity.po;

import java.io.Serializable;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.mall.enums.DataTimePatternEnum;
import com.mall.utils.DateUtils;


/**
 *  @Description: 订单表
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class Order implements Serializable {

	/**
	 * 订单ID
	 */
	private Long orderId;

	/**
	 * 店铺id
	 */
	private Long shopId;

	/**
	 * 产品名称,多个产品将会以逗号隔开
	 */
	private String prodName;

	/**
	 * 订购用户ID
	 */
	private String userId;

	/**
	 * 订购流水号
	 */
	private String orderNumber;

	/**
	 * 总值
	 */
	private BigDecimal total;

	/**
	 * 实际总值
	 */
	private BigDecimal actualTotal;

	/**
	 * 支付方式 0 手动代付 1 微信支付 2 支付宝
	 */
	private Integer payType;

	/**
	 * 订单备注
	 */
	private String remarks;

	/**
	 * 订单状态 1:待付款 2:待发货 3:待收货 4:待评价 5:成功 6:失败
	 */
	@JsonIgnore
	private Integer status;

	/**
	 * 配送类型
	 */
	private String dvyType;

	/**
	 * 配送方式ID
	 */
	private Long dvyId;

	/**
	 * 物流单号
	 */
	private String dvyFlowId;

	/**
	 * 订单运费
	 */
	private BigDecimal freightAmount;

	/**
	 * 用户订单地址Id
	 */
	private Long addrOrderId;

	/**
	 * 订单商品总数
	 */
	private Integer productNums;

	/**
	 * 订购时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/**
	 * 订单更新时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

	/**
	 * 付款时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date payTime;

	/**
	 * 发货时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date dvyTime;

	/**
	 * 完成时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date finallyTime;

	/**
	 * 取消时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date cancelTime;

	/**
	 * 是否已经支付，1：已经支付过，0：，没有支付过
	 */
	private Integer isPayed;

	/**
	 * 用户订单删除状态，0：没有删除， 1：回收站， 2：永久删除
	 */
	private Integer deleteStatus;

	/**
	 * 0:默认,1:在处理,2:处理完成
	 */
	private Integer refundSts;

	/**
	 * 优惠总额
	 */
	private BigDecimal reduceAmount;

	/**
	 * 订单类型
	 */
	private Integer orderType;

	/**
	 * 订单关闭原因 1-超时未支付 2-退款关闭 4-买家取消 15-已通过货到付款交易
	 */
	private Integer closeType;

	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public BigDecimal getActualTotal() {
		return actualTotal;
	}
	public void setActualTotal(BigDecimal actualTotal) {
		this.actualTotal = actualTotal;
	}
	public Integer getPayType() {
		return payType;
	}
	public void setPayType(Integer payType) {
		this.payType = payType;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getDvyType() {
		return dvyType;
	}
	public void setDvyType(String dvyType) {
		this.dvyType = dvyType;
	}
	public Long getDvyId() {
		return dvyId;
	}
	public void setDvyId(Long dvyId) {
		this.dvyId = dvyId;
	}
	public String getDvyFlowId() {
		return dvyFlowId;
	}
	public void setDvyFlowId(String dvyFlowId) {
		this.dvyFlowId = dvyFlowId;
	}
	public BigDecimal getFreightAmount() {
		return freightAmount;
	}
	public void setFreightAmount(BigDecimal freightAmount) {
		this.freightAmount = freightAmount;
	}
	public Long getAddrOrderId() {
		return addrOrderId;
	}
	public void setAddrOrderId(Long addrOrderId) {
		this.addrOrderId = addrOrderId;
	}
	public Integer getProductNums() {
		return productNums;
	}
	public void setProductNums(Integer productNums) {
		this.productNums = productNums;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Date getPayTime() {
		return payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	public Date getDvyTime() {
		return dvyTime;
	}
	public void setDvyTime(Date dvyTime) {
		this.dvyTime = dvyTime;
	}
	public Date getFinallyTime() {
		return finallyTime;
	}
	public void setFinallyTime(Date finallyTime) {
		this.finallyTime = finallyTime;
	}
	public Date getCancelTime() {
		return cancelTime;
	}
	public void setCancelTime(Date cancelTime) {
		this.cancelTime = cancelTime;
	}
	public Integer getIsPayed() {
		return isPayed;
	}
	public void setIsPayed(Integer isPayed) {
		this.isPayed = isPayed;
	}
	public Integer getDeleteStatus() {
		return deleteStatus;
	}
	public void setDeleteStatus(Integer deleteStatus) {
		this.deleteStatus = deleteStatus;
	}
	public Integer getRefundSts() {
		return refundSts;
	}
	public void setRefundSts(Integer refundSts) {
		this.refundSts = refundSts;
	}
	public BigDecimal getReduceAmount() {
		return reduceAmount;
	}
	public void setReduceAmount(BigDecimal reduceAmount) {
		this.reduceAmount = reduceAmount;
	}
	public Integer getOrderType() {
		return orderType;
	}
	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}
	public Integer getCloseType() {
		return closeType;
	}
	public void setCloseType(Integer closeType) {
		this.closeType = closeType;
	}
	@Override
	public String toString() {
		return "订单表: {"
				+ " \"订单ID\": \"" + (orderId == null ? "空" : orderId) + "\", "
				+ " \"店铺id\": \"" + (shopId == null ? "空" : shopId) + "\", "
				+ " \"产品名称,多个产品将会以逗号隔开\": \"" + (prodName == null ? "空" : prodName) + "\", "
				+ " \"订购用户ID\": \"" + (userId == null ? "空" : userId) + "\", "
				+ " \"订购流水号\": \"" + (orderNumber == null ? "空" : orderNumber) + "\", "
				+ " \"总值\": \"" + (total == null ? "空" : total) + "\", "
				+ " \"实际总值\": \"" + (actualTotal == null ? "空" : actualTotal) + "\", "
				+ " \"支付方式 0 手动代付 1 微信支付 2 支付宝\": \"" + (payType == null ? "空" : payType) + "\", "
				+ " \"订单备注\": \"" + (remarks == null ? "空" : remarks) + "\", "
				+ " \"订单状态 1:待付款 2:待发货 3:待收货 4:待评价 5:成功 6:失败\": \"" + (status == null ? "空" : status) + "\", "
				+ " \"配送类型\": \"" + (dvyType == null ? "空" : dvyType) + "\", "
				+ " \"配送方式ID\": \"" + (dvyId == null ? "空" : dvyId) + "\", "
				+ " \"物流单号\": \"" + (dvyFlowId == null ? "空" : dvyFlowId) + "\", "
				+ " \"订单运费\": \"" + (freightAmount == null ? "空" : freightAmount) + "\", "
				+ " \"用户订单地址Id\": \"" + (addrOrderId == null ? "空" : addrOrderId) + "\", "
				+ " \"订单商品总数\": \"" + (productNums == null ? "空" : productNums) + "\", "
				+ " \"订购时间\": \"" + (createTime == null ? "空" : DateUtils.format(createTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"订单更新时间\": \"" + (updateTime == null ? "空" : DateUtils.format(updateTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"付款时间\": \"" + (payTime == null ? "空" : DateUtils.format(payTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"发货时间\": \"" + (dvyTime == null ? "空" : DateUtils.format(dvyTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"完成时间\": \"" + (finallyTime == null ? "空" : DateUtils.format(finallyTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"取消时间\": \"" + (cancelTime == null ? "空" : DateUtils.format(cancelTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"是否已经支付，1：已经支付过，0：，没有支付过\": \"" + (isPayed == null ? "空" : isPayed) + "\", "
				+ " \"用户订单删除状态，0：没有删除， 1：回收站， 2：永久删除\": \"" + (deleteStatus == null ? "空" : deleteStatus) + "\", "
				+ " \"0:默认,1:在处理,2:处理完成\": \"" + (refundSts == null ? "空" : refundSts) + "\", "
				+ " \"优惠总额\": \"" + (reduceAmount == null ? "空" : reduceAmount) + "\", "
				+ " \"订单类型\": \"" + (orderType == null ? "空" : orderType) + "\", "
				+ " \"订单关闭原因 1-超时未支付 2-退款关闭 4-买家取消 15-已通过货到付款交易\": \"" + (closeType == null ? "空" : closeType) + "\" "
				+ "}";

	}
}