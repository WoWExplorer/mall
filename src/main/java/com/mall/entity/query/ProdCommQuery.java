package com.mall.entity.query;


import java.util.Date;


/**
 *  @Description: 商品评论查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class ProdCommQuery extends BaseQuery {

	/**
	 * ID
	 */
	private Long prodCommId;

	/**
	 * 商品ID
	 */
	private Long prodId;

	/**
	 * 订单项ID
	 */
	private Long orderItemId;

	/**
	 * 评论用户ID
	 */
	private String userId;
	private String userIdFuzzy;

	/**
	 * 评论内容
	 */
	private String content;
	private String contentFuzzy;

	/**
	 * 掌柜回复
	 */
	private String replyContent;
	private String replyContentFuzzy;

	/**
	 * 记录时间
	 */
	private Date recTime;
	private String recTimeStart;
	private String recTimeEnd;

	/**
	 * 回复时间
	 */
	private Date replyTime;
	private String replyTimeStart;
	private String replyTimeEnd;

	/**
	 * 是否回复 0:未回复  1:已回复
	 */
	private Integer replySts;

	/**
	 * IP来源
	 */
	private String postip;
	private String postipFuzzy;

	/**
	 * 得分，0-5分
	 */
	private Integer score;

	/**
	 * 有用的计数
	 */
	private Integer usefulCounts;

	/**
	 * 晒图的json字符串
	 */
	private String pics;
	private String picsFuzzy;

	/**
	 * 是否匿名(1:是  0:否)
	 */
	private Integer isAnonymous;

	/**
	 * 是否显示，1:为显示，0:待审核， -1：不通过审核，不显示。 如果需要审核评论，则是0,，否则1
	 */
	private Integer status;

	/**
	 * 评价(0好评 1中评 2差评)
	 */
	private Integer evaluate;

	public Long getProdCommId() {
		return prodCommId;
	}
	public void setProdCommId(Long prodCommId) {
		this.prodCommId = prodCommId;
	}
	public Long getProdId() {
		return prodId;
	}
	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}
	public Long getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(Long orderItemId) {
		this.orderItemId = orderItemId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getReplyContent() {
		return replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	public Date getRecTime() {
		return recTime;
	}
	public void setRecTime(Date recTime) {
		this.recTime = recTime;
	}
	public Date getReplyTime() {
		return replyTime;
	}
	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}
	public Integer getReplySts() {
		return replySts;
	}
	public void setReplySts(Integer replySts) {
		this.replySts = replySts;
	}
	public String getPostip() {
		return postip;
	}
	public void setPostip(String postip) {
		this.postip = postip;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public Integer getUsefulCounts() {
		return usefulCounts;
	}
	public void setUsefulCounts(Integer usefulCounts) {
		this.usefulCounts = usefulCounts;
	}
	public String getPics() {
		return pics;
	}
	public void setPics(String pics) {
		this.pics = pics;
	}
	public Integer getIsAnonymous() {
		return isAnonymous;
	}
	public void setIsAnonymous(Integer isAnonymous) {
		this.isAnonymous = isAnonymous;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getEvaluate() {
		return evaluate;
	}
	public void setEvaluate(Integer evaluate) {
		this.evaluate = evaluate;
	}
	public String getUserIdFuzzy() {
		return userIdFuzzy;
	}
	public void setUserIdFuzzy(String userIdFuzzy) {
		this.userIdFuzzy = userIdFuzzy;
	}
	public String getContentFuzzy() {
		return contentFuzzy;
	}
	public void setContentFuzzy(String contentFuzzy) {
		this.contentFuzzy = contentFuzzy;
	}
	public String getReplyContentFuzzy() {
		return replyContentFuzzy;
	}
	public void setReplyContentFuzzy(String replyContentFuzzy) {
		this.replyContentFuzzy = replyContentFuzzy;
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
	public String getReplyTimeStart() {
		return replyTimeStart;
	}
	public void setReplyTimeStart(String replyTimeStart) {
		this.replyTimeStart = replyTimeStart;
	}
	public String getReplyTimeEnd() {
		return replyTimeEnd;
	}
	public void setReplyTimeEnd(String replyTimeEnd) {
		this.replyTimeEnd = replyTimeEnd;
	}
	public String getPostipFuzzy() {
		return postipFuzzy;
	}
	public void setPostipFuzzy(String postipFuzzy) {
		this.postipFuzzy = postipFuzzy;
	}
	public String getPicsFuzzy() {
		return picsFuzzy;
	}
	public void setPicsFuzzy(String picsFuzzy) {
		this.picsFuzzy = picsFuzzy;
	}
}