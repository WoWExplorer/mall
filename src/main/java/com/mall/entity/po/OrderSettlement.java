package com.mall.entity.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.mall.enums.DataTimePatternEnum;
import com.mall.utils.DateUtils;


/**
 *  @Description: 
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class OrderSettlement implements Serializable {

	/**
	 * 支付结算单据ID
	 */
	private Long settlementId;

	/**
	 * 支付单号
	 */
	private String payNo;

	/**
	 * 外部订单流水号
	 */
	private String bizPayNo;

	/**
	 * order表中的订单号
	 */
	private String orderNumber;

	/**
	 * 支付方式 1 微信支付 2 支付宝
	 */
	private Integer payType;

	/**
	 * 支付方式名称
	 */
	private String payTypeName;

	/**
	 * 支付金额
	 */
	private BigDecimal payAmount;

	/**
	 * 是否清算 0:否 1:是
	 */
	private Integer isClearing;

	/**
	 * 用户ID
	 */
	private String userId;

	/**
	 * 创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/**
	 * 清算时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date clearingTime;

	/**
	 * 版本号
	 */
	private Integer version;

	/**
	 * 支付状态
	 */
	private Integer payStatus;

	public Long getSettlementId() {
		return settlementId;
	}
	public void setSettlementId(Long settlementId) {
		this.settlementId = settlementId;
	}
	public String getPayNo() {
		return payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	public String getBizPayNo() {
		return bizPayNo;
	}
	public void setBizPayNo(String bizPayNo) {
		this.bizPayNo = bizPayNo;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public Integer getPayType() {
		return payType;
	}
	public void setPayType(Integer payType) {
		this.payType = payType;
	}
	public String getPayTypeName() {
		return payTypeName;
	}
	public void setPayTypeName(String payTypeName) {
		this.payTypeName = payTypeName;
	}
	public BigDecimal getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(BigDecimal payAmount) {
		this.payAmount = payAmount;
	}
	public Integer getIsClearing() {
		return isClearing;
	}
	public void setIsClearing(Integer isClearing) {
		this.isClearing = isClearing;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getClearingTime() {
		return clearingTime;
	}
	public void setClearingTime(Date clearingTime) {
		this.clearingTime = clearingTime;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public Integer getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(Integer payStatus) {
		this.payStatus = payStatus;
	}
	@Override
	public String toString() {
		return "Tz_order_settlement: {"
				+ " \"支付结算单据ID\": \"" + (settlementId == null ? "空" : settlementId) + "\", "
				+ " \"支付单号\": \"" + (payNo == null ? "空" : payNo) + "\", "
				+ " \"外部订单流水号\": \"" + (bizPayNo == null ? "空" : bizPayNo) + "\", "
				+ " \"Order表中的订单号\": \"" + (orderNumber == null ? "空" : orderNumber) + "\", "
				+ " \"支付方式 1 微信支付 2 支付宝\": \"" + (payType == null ? "空" : payType) + "\", "
				+ " \"支付方式名称\": \"" + (payTypeName == null ? "空" : payTypeName) + "\", "
				+ " \"支付金额\": \"" + (payAmount == null ? "空" : payAmount) + "\", "
				+ " \"是否清算 0:否 1:是\": \"" + (isClearing == null ? "空" : isClearing) + "\", "
				+ " \"用户ID\": \"" + (userId == null ? "空" : userId) + "\", "
				+ " \"创建时间\": \"" + (createTime == null ? "空" : DateUtils.format(createTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"清算时间\": \"" + (clearingTime == null ? "空" : DateUtils.format(clearingTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"版本号\": \"" + (version == null ? "空" : version) + "\", "
				+ " \"支付状态\": \"" + (payStatus == null ? "空" : payStatus) + "\" "
				+ "}";

	}
}