package com.mall.entity.query;

import java.math.BigDecimal;
import java.util.Date;


/**
 *  @Description: 订单表查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class OrderQuery extends BaseQuery {

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
	private String prodNameFuzzy;

	/**
	 * 订购用户ID
	 */
	private String userId;
	private String userIdFuzzy;

	/**
	 * 订购流水号
	 */
	private String orderNumber;
	private String orderNumberFuzzy;

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
	private String remarksFuzzy;

	/**
	 * 订单状态 1:待付款 2:待发货 3:待收货 4:待评价 5:成功 6:失败
	 */
	private Integer status;

	/**
	 * 配送类型
	 */
	private String dvyType;
	private String dvyTypeFuzzy;

	/**
	 * 配送方式ID
	 */
	private Long dvyId;

	/**
	 * 物流单号
	 */
	private String dvyFlowId;
	private String dvyFlowIdFuzzy;

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
	private Date createTime;
	private String createTimeStart;
	private String createTimeEnd;

	/**
	 * 订单更新时间
	 */
	private Date updateTime;
	private String updateTimeStart;
	private String updateTimeEnd;

	/**
	 * 付款时间
	 */
	private Date payTime;
	private String payTimeStart;
	private String payTimeEnd;

	/**
	 * 发货时间
	 */
	private Date dvyTime;
	private String dvyTimeStart;
	private String dvyTimeEnd;

	/**
	 * 完成时间
	 */
	private Date finallyTime;
	private String finallyTimeStart;
	private String finallyTimeEnd;

	/**
	 * 取消时间
	 */
	private Date cancelTime;
	private String cancelTimeStart;
	private String cancelTimeEnd;

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
	public String getProdNameFuzzy() {
		return prodNameFuzzy;
	}
	public void setProdNameFuzzy(String prodNameFuzzy) {
		this.prodNameFuzzy = prodNameFuzzy;
	}
	public String getUserIdFuzzy() {
		return userIdFuzzy;
	}
	public void setUserIdFuzzy(String userIdFuzzy) {
		this.userIdFuzzy = userIdFuzzy;
	}
	public String getOrderNumberFuzzy() {
		return orderNumberFuzzy;
	}
	public void setOrderNumberFuzzy(String orderNumberFuzzy) {
		this.orderNumberFuzzy = orderNumberFuzzy;
	}
	public String getRemarksFuzzy() {
		return remarksFuzzy;
	}
	public void setRemarksFuzzy(String remarksFuzzy) {
		this.remarksFuzzy = remarksFuzzy;
	}
	public String getDvyTypeFuzzy() {
		return dvyTypeFuzzy;
	}
	public void setDvyTypeFuzzy(String dvyTypeFuzzy) {
		this.dvyTypeFuzzy = dvyTypeFuzzy;
	}
	public String getDvyFlowIdFuzzy() {
		return dvyFlowIdFuzzy;
	}
	public void setDvyFlowIdFuzzy(String dvyFlowIdFuzzy) {
		this.dvyFlowIdFuzzy = dvyFlowIdFuzzy;
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
	public String getUpdateTimeStart() {
		return updateTimeStart;
	}
	public void setUpdateTimeStart(String updateTimeStart) {
		this.updateTimeStart = updateTimeStart;
	}
	public String getUpdateTimeEnd() {
		return updateTimeEnd;
	}
	public void setUpdateTimeEnd(String updateTimeEnd) {
		this.updateTimeEnd = updateTimeEnd;
	}
	public String getPayTimeStart() {
		return payTimeStart;
	}
	public void setPayTimeStart(String payTimeStart) {
		this.payTimeStart = payTimeStart;
	}
	public String getPayTimeEnd() {
		return payTimeEnd;
	}
	public void setPayTimeEnd(String payTimeEnd) {
		this.payTimeEnd = payTimeEnd;
	}
	public String getDvyTimeStart() {
		return dvyTimeStart;
	}
	public void setDvyTimeStart(String dvyTimeStart) {
		this.dvyTimeStart = dvyTimeStart;
	}
	public String getDvyTimeEnd() {
		return dvyTimeEnd;
	}
	public void setDvyTimeEnd(String dvyTimeEnd) {
		this.dvyTimeEnd = dvyTimeEnd;
	}
	public String getFinallyTimeStart() {
		return finallyTimeStart;
	}
	public void setFinallyTimeStart(String finallyTimeStart) {
		this.finallyTimeStart = finallyTimeStart;
	}
	public String getFinallyTimeEnd() {
		return finallyTimeEnd;
	}
	public void setFinallyTimeEnd(String finallyTimeEnd) {
		this.finallyTimeEnd = finallyTimeEnd;
	}
	public String getCancelTimeStart() {
		return cancelTimeStart;
	}
	public void setCancelTimeStart(String cancelTimeStart) {
		this.cancelTimeStart = cancelTimeStart;
	}
	public String getCancelTimeEnd() {
		return cancelTimeEnd;
	}
	public void setCancelTimeEnd(String cancelTimeEnd) {
		this.cancelTimeEnd = cancelTimeEnd;
	}
}