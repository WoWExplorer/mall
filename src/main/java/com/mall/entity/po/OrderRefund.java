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
public class OrderRefund implements Serializable {

	/**
	 * 记录ID
	 */
	private Long refundId;

	/**
	 * 店铺ID
	 */
	private Long shopId;

	/**
	 * 订单ID
	 */
	private Long orderId;

	/**
	 * 订单流水号
	 */
	private String orderNumber;

	/**
	 * 订单总金额
	 */
	private BigDecimal orderAmount;

	/**
	 * 订单项ID 全部退款是0
	 */
	private Long orderItemId;

	/**
	 * 退款编号
	 */
	private String refundSn;

	/**
	 * 订单支付流水号
	 */
	private String flowTradeNo;

	/**
	 * 第三方退款单号(微信退款单号)
	 */
	private String outRefundNo;

	/**
	 * 订单支付方式 1 微信支付 2 支付宝
	 */
	private Integer payType;

	/**
	 * 订单支付名称
	 */
	private String payTypeName;

	/**
	 * 买家ID
	 */
	private String userId;

	/**
	 * 退货数量
	 */
	private Integer goodsNum;

	/**
	 * 退款金额
	 */
	private BigDecimal refundAmount;

	/**
	 * 申请类型:1,仅退款,2退款退货
	 */
	private Integer applyType;

	/**
	 * 处理状态:1为待审核,2为同意,3为不同意
	 */
	private Integer refundSts;

	/**
	 * 处理退款状态: 0:退款处理中 1:退款成功 -1:退款失败
	 */
	private Integer returnMoneySts;

	/**
	 * 申请时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date applyTime;

	/**
	 * 卖家处理时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date handelTime;

	/**
	 * 退款时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date refundTime;

	/**
	 * 文件凭证json
	 */
	private String photoFiles;

	/**
	 * 申请原因
	 */
	private String buyerMsg;

	/**
	 * 卖家备注
	 */
	private String sellerMsg;

	/**
	 * 物流公司名称
	 */
	private String expressName;

	/**
	 * 物流单号
	 */
	private String expressNo;

	/**
	 * 发货时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date shipTime;

	/**
	 * 收货时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date receiveTime;

	/**
	 * 收货备注
	 */
	private String receiveMessage;

	public Long getRefundId() {
		return refundId;
	}
	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public BigDecimal getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}
	public Long getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(Long orderItemId) {
		this.orderItemId = orderItemId;
	}
	public String getRefundSn() {
		return refundSn;
	}
	public void setRefundSn(String refundSn) {
		this.refundSn = refundSn;
	}
	public String getFlowTradeNo() {
		return flowTradeNo;
	}
	public void setFlowTradeNo(String flowTradeNo) {
		this.flowTradeNo = flowTradeNo;
	}
	public String getOutRefundNo() {
		return outRefundNo;
	}
	public void setOutRefundNo(String outRefundNo) {
		this.outRefundNo = outRefundNo;
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Integer getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}
	public BigDecimal getRefundAmount() {
		return refundAmount;
	}
	public void setRefundAmount(BigDecimal refundAmount) {
		this.refundAmount = refundAmount;
	}
	public Integer getApplyType() {
		return applyType;
	}
	public void setApplyType(Integer applyType) {
		this.applyType = applyType;
	}
	public Integer getRefundSts() {
		return refundSts;
	}
	public void setRefundSts(Integer refundSts) {
		this.refundSts = refundSts;
	}
	public Integer getReturnMoneySts() {
		return returnMoneySts;
	}
	public void setReturnMoneySts(Integer returnMoneySts) {
		this.returnMoneySts = returnMoneySts;
	}
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public Date getHandelTime() {
		return handelTime;
	}
	public void setHandelTime(Date handelTime) {
		this.handelTime = handelTime;
	}
	public Date getRefundTime() {
		return refundTime;
	}
	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}
	public String getPhotoFiles() {
		return photoFiles;
	}
	public void setPhotoFiles(String photoFiles) {
		this.photoFiles = photoFiles;
	}
	public String getBuyerMsg() {
		return buyerMsg;
	}
	public void setBuyerMsg(String buyerMsg) {
		this.buyerMsg = buyerMsg;
	}
	public String getSellerMsg() {
		return sellerMsg;
	}
	public void setSellerMsg(String sellerMsg) {
		this.sellerMsg = sellerMsg;
	}
	public String getExpressName() {
		return expressName;
	}
	public void setExpressName(String expressName) {
		this.expressName = expressName;
	}
	public String getExpressNo() {
		return expressNo;
	}
	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}
	public Date getShipTime() {
		return shipTime;
	}
	public void setShipTime(Date shipTime) {
		this.shipTime = shipTime;
	}
	public Date getReceiveTime() {
		return receiveTime;
	}
	public void setReceiveTime(Date receiveTime) {
		this.receiveTime = receiveTime;
	}
	public String getReceiveMessage() {
		return receiveMessage;
	}
	public void setReceiveMessage(String receiveMessage) {
		this.receiveMessage = receiveMessage;
	}
	@Override
	public String toString() {
		return "Tz_order_refund: {"
				+ " \"记录ID\": \"" + (refundId == null ? "空" : refundId) + "\", "
				+ " \"店铺ID\": \"" + (shopId == null ? "空" : shopId) + "\", "
				+ " \"订单ID\": \"" + (orderId == null ? "空" : orderId) + "\", "
				+ " \"订单流水号\": \"" + (orderNumber == null ? "空" : orderNumber) + "\", "
				+ " \"订单总金额\": \"" + (orderAmount == null ? "空" : orderAmount) + "\", "
				+ " \"订单项ID 全部退款是0\": \"" + (orderItemId == null ? "空" : orderItemId) + "\", "
				+ " \"退款编号\": \"" + (refundSn == null ? "空" : refundSn) + "\", "
				+ " \"订单支付流水号\": \"" + (flowTradeNo == null ? "空" : flowTradeNo) + "\", "
				+ " \"第三方退款单号(微信退款单号)\": \"" + (outRefundNo == null ? "空" : outRefundNo) + "\", "
				+ " \"订单支付方式 1 微信支付 2 支付宝\": \"" + (payType == null ? "空" : payType) + "\", "
				+ " \"订单支付名称\": \"" + (payTypeName == null ? "空" : payTypeName) + "\", "
				+ " \"买家ID\": \"" + (userId == null ? "空" : userId) + "\", "
				+ " \"退货数量\": \"" + (goodsNum == null ? "空" : goodsNum) + "\", "
				+ " \"退款金额\": \"" + (refundAmount == null ? "空" : refundAmount) + "\", "
				+ " \"申请类型:1,仅退款,2退款退货\": \"" + (applyType == null ? "空" : applyType) + "\", "
				+ " \"处理状态:1为待审核,2为同意,3为不同意\": \"" + (refundSts == null ? "空" : refundSts) + "\", "
				+ " \"处理退款状态: 0:退款处理中 1:退款成功 -1:退款失败\": \"" + (returnMoneySts == null ? "空" : returnMoneySts) + "\", "
				+ " \"申请时间\": \"" + (applyTime == null ? "空" : DateUtils.format(applyTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"卖家处理时间\": \"" + (handelTime == null ? "空" : DateUtils.format(handelTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"退款时间\": \"" + (refundTime == null ? "空" : DateUtils.format(refundTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"文件凭证json\": \"" + (photoFiles == null ? "空" : photoFiles) + "\", "
				+ " \"申请原因\": \"" + (buyerMsg == null ? "空" : buyerMsg) + "\", "
				+ " \"卖家备注\": \"" + (sellerMsg == null ? "空" : sellerMsg) + "\", "
				+ " \"物流公司名称\": \"" + (expressName == null ? "空" : expressName) + "\", "
				+ " \"物流单号\": \"" + (expressNo == null ? "空" : expressNo) + "\", "
				+ " \"发货时间\": \"" + (shipTime == null ? "空" : DateUtils.format(shipTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"收货时间\": \"" + (receiveTime == null ? "空" : DateUtils.format(receiveTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"收货备注\": \"" + (receiveMessage == null ? "空" : receiveMessage) + "\" "
				+ "}";

	}
}