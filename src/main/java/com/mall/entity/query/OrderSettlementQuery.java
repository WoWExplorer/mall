package com.mall.entity.query;

import java.math.BigDecimal;
import java.util.Date;


/**
 *  @Description: 查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class OrderSettlementQuery extends BaseQuery {

	/**
	 * 支付结算单据ID
	 */
	private Long settlementId;

	/**
	 * 支付单号
	 */
	private String payNo;
	private String payNoFuzzy;

	/**
	 * 外部订单流水号
	 */
	private String bizPayNo;
	private String bizPayNoFuzzy;

	/**
	 * order表中的订单号
	 */
	private String orderNumber;
	private String orderNumberFuzzy;

	/**
	 * 支付方式 1 微信支付 2 支付宝
	 */
	private Integer payType;

	/**
	 * 支付方式名称
	 */
	private String payTypeName;
	private String payTypeNameFuzzy;

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
	private String userIdFuzzy;

	/**
	 * 创建时间
	 */
	private Date createTime;
	private String createTimeStart;
	private String createTimeEnd;

	/**
	 * 清算时间
	 */
	private Date clearingTime;
	private String clearingTimeStart;
	private String clearingTimeEnd;

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
	public String getPayNoFuzzy() {
		return payNoFuzzy;
	}
	public void setPayNoFuzzy(String payNoFuzzy) {
		this.payNoFuzzy = payNoFuzzy;
	}
	public String getBizPayNoFuzzy() {
		return bizPayNoFuzzy;
	}
	public void setBizPayNoFuzzy(String bizPayNoFuzzy) {
		this.bizPayNoFuzzy = bizPayNoFuzzy;
	}
	public String getOrderNumberFuzzy() {
		return orderNumberFuzzy;
	}
	public void setOrderNumberFuzzy(String orderNumberFuzzy) {
		this.orderNumberFuzzy = orderNumberFuzzy;
	}
	public String getPayTypeNameFuzzy() {
		return payTypeNameFuzzy;
	}
	public void setPayTypeNameFuzzy(String payTypeNameFuzzy) {
		this.payTypeNameFuzzy = payTypeNameFuzzy;
	}
	public String getUserIdFuzzy() {
		return userIdFuzzy;
	}
	public void setUserIdFuzzy(String userIdFuzzy) {
		this.userIdFuzzy = userIdFuzzy;
	}
	public String getCreateTimeStart() {
		return createTimeStart;
	}
	public void setCreateTimeStart(String createTimeStart) {
		this.createTimeStart = createTimeStart;
	}
	public String getCreateTimeEnd() {
		return createTimeEnd;
	}
	public void setCreateTimeEnd(String createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
	}
	public String getClearingTimeStart() {
		return clearingTimeStart;
	}
	public void setClearingTimeStart(String clearingTimeStart) {
		this.clearingTimeStart = clearingTimeStart;
	}
	public String getClearingTimeEnd() {
		return clearingTimeEnd;
	}
	public void setClearingTimeEnd(String clearingTimeEnd) {
		this.clearingTimeEnd = clearingTimeEnd;
	}
}