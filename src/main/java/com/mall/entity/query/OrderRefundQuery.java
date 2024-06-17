package com.mall.entity.query;

import java.math.BigDecimal;
import java.util.Date;


/**
 *  @Description: 查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class OrderRefundQuery extends BaseQuery {

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
	private String orderNumberFuzzy;

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
	private String refundSnFuzzy;

	/**
	 * 订单支付流水号
	 */
	private String flowTradeNo;
	private String flowTradeNoFuzzy;

	/**
	 * 第三方退款单号(微信退款单号)
	 */
	private String outRefundNo;
	private String outRefundNoFuzzy;

	/**
	 * 订单支付方式 1 微信支付 2 支付宝
	 */
	private Integer payType;

	/**
	 * 订单支付名称
	 */
	private String payTypeName;
	private String payTypeNameFuzzy;

	/**
	 * 买家ID
	 */
	private String userId;
	private String userIdFuzzy;

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
	private Date applyTime;
	private String applyTimeStart;
	private String applyTimeEnd;

	/**
	 * 卖家处理时间
	 */
	private Date handelTime;
	private String handelTimeStart;
	private String handelTimeEnd;

	/**
	 * 退款时间
	 */
	private Date refundTime;
	private String refundTimeStart;
	private String refundTimeEnd;

	/**
	 * 文件凭证json
	 */
	private String photoFiles;
	private String photoFilesFuzzy;

	/**
	 * 申请原因
	 */
	private String buyerMsg;
	private String buyerMsgFuzzy;

	/**
	 * 卖家备注
	 */
	private String sellerMsg;
	private String sellerMsgFuzzy;

	/**
	 * 物流公司名称
	 */
	private String expressName;
	private String expressNameFuzzy;

	/**
	 * 物流单号
	 */
	private String expressNo;
	private String expressNoFuzzy;

	/**
	 * 发货时间
	 */
	private Date shipTime;
	private String shipTimeStart;
	private String shipTimeEnd;

	/**
	 * 收货时间
	 */
	private Date receiveTime;
	private String receiveTimeStart;
	private String receiveTimeEnd;

	/**
	 * 收货备注
	 */
	private String receiveMessage;
	private String receiveMessageFuzzy;

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
	public String getOrderNumberFuzzy() {
		return orderNumberFuzzy;
	}
	public void setOrderNumberFuzzy(String orderNumberFuzzy) {
		this.orderNumberFuzzy = orderNumberFuzzy;
	}
	public String getRefundSnFuzzy() {
		return refundSnFuzzy;
	}
	public void setRefundSnFuzzy(String refundSnFuzzy) {
		this.refundSnFuzzy = refundSnFuzzy;
	}
	public String getFlowTradeNoFuzzy() {
		return flowTradeNoFuzzy;
	}
	public void setFlowTradeNoFuzzy(String flowTradeNoFuzzy) {
		this.flowTradeNoFuzzy = flowTradeNoFuzzy;
	}
	public String getOutRefundNoFuzzy() {
		return outRefundNoFuzzy;
	}
	public void setOutRefundNoFuzzy(String outRefundNoFuzzy) {
		this.outRefundNoFuzzy = outRefundNoFuzzy;
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
	public String getApplyTimeStart() {
		return applyTimeStart;
	}
	public void setApplyTimeStart(String applyTimeStart) {
		this.applyTimeStart = applyTimeStart;
	}
	public String getApplyTimeEnd() {
		return applyTimeEnd;
	}
	public void setApplyTimeEnd(String applyTimeEnd) {
		this.applyTimeEnd = applyTimeEnd;
	}
	public String getHandelTimeStart() {
		return handelTimeStart;
	}
	public void setHandelTimeStart(String handelTimeStart) {
		this.handelTimeStart = handelTimeStart;
	}
	public String getHandelTimeEnd() {
		return handelTimeEnd;
	}
	public void setHandelTimeEnd(String handelTimeEnd) {
		this.handelTimeEnd = handelTimeEnd;
	}
	public String getRefundTimeStart() {
		return refundTimeStart;
	}
	public void setRefundTimeStart(String refundTimeStart) {
		this.refundTimeStart = refundTimeStart;
	}
	public String getRefundTimeEnd() {
		return refundTimeEnd;
	}
	public void setRefundTimeEnd(String refundTimeEnd) {
		this.refundTimeEnd = refundTimeEnd;
	}
	public String getPhotoFilesFuzzy() {
		return photoFilesFuzzy;
	}
	public void setPhotoFilesFuzzy(String photoFilesFuzzy) {
		this.photoFilesFuzzy = photoFilesFuzzy;
	}
	public String getBuyerMsgFuzzy() {
		return buyerMsgFuzzy;
	}
	public void setBuyerMsgFuzzy(String buyerMsgFuzzy) {
		this.buyerMsgFuzzy = buyerMsgFuzzy;
	}
	public String getSellerMsgFuzzy() {
		return sellerMsgFuzzy;
	}
	public void setSellerMsgFuzzy(String sellerMsgFuzzy) {
		this.sellerMsgFuzzy = sellerMsgFuzzy;
	}
	public String getExpressNameFuzzy() {
		return expressNameFuzzy;
	}
	public void setExpressNameFuzzy(String expressNameFuzzy) {
		this.expressNameFuzzy = expressNameFuzzy;
	}
	public String getExpressNoFuzzy() {
		return expressNoFuzzy;
	}
	public void setExpressNoFuzzy(String expressNoFuzzy) {
		this.expressNoFuzzy = expressNoFuzzy;
	}
	public String getShipTimeStart() {
		return shipTimeStart;
	}
	public void setShipTimeStart(String shipTimeStart) {
		this.shipTimeStart = shipTimeStart;
	}
	public String getShipTimeEnd() {
		return shipTimeEnd;
	}
	public void setShipTimeEnd(String shipTimeEnd) {
		this.shipTimeEnd = shipTimeEnd;
	}
	public String getReceiveTimeStart() {
		return receiveTimeStart;
	}
	public void setReceiveTimeStart(String receiveTimeStart) {
		this.receiveTimeStart = receiveTimeStart;
	}
	public String getReceiveTimeEnd() {
		return receiveTimeEnd;
	}
	public void setReceiveTimeEnd(String receiveTimeEnd) {
		this.receiveTimeEnd = receiveTimeEnd;
	}
	public String getReceiveMessageFuzzy() {
		return receiveMessageFuzzy;
	}
	public void setReceiveMessageFuzzy(String receiveMessageFuzzy) {
		this.receiveMessageFuzzy = receiveMessageFuzzy;
	}
}