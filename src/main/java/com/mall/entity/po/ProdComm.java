package com.mall.entity.po;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.mall.enums.DataTimePatternEnum;
import com.mall.utils.DateUtils;


/**
 *  @Description: 商品评论
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class ProdComm implements Serializable {

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

	/**
	 * 评论内容
	 */
	private String content;

	/**
	 * 掌柜回复
	 */
	private String replyContent;

	/**
	 * 记录时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date recTime;

	/**
	 * 回复时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date replyTime;

	/**
	 * 是否回复 0:未回复  1:已回复
	 */
	private Integer replySts;

	/**
	 * IP来源
	 */
	private String postip;

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

	/**
	 * 是否匿名(1:是  0:否)
	 */
	private Integer isAnonymous;

	/**
	 * 是否显示，1:为显示，0:待审核， -1：不通过审核，不显示。 如果需要审核评论，则是0,，否则1
	 */
	@JsonIgnore
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
	@Override
	public String toString() {
		return "商品评论: {"
				+ " \"ID\": \"" + (prodCommId == null ? "空" : prodCommId) + "\", "
				+ " \"商品ID\": \"" + (prodId == null ? "空" : prodId) + "\", "
				+ " \"订单项ID\": \"" + (orderItemId == null ? "空" : orderItemId) + "\", "
				+ " \"评论用户ID\": \"" + (userId == null ? "空" : userId) + "\", "
				+ " \"评论内容\": \"" + (content == null ? "空" : content) + "\", "
				+ " \"掌柜回复\": \"" + (replyContent == null ? "空" : replyContent) + "\", "
				+ " \"记录时间\": \"" + (recTime == null ? "空" : DateUtils.format(recTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"回复时间\": \"" + (replyTime == null ? "空" : DateUtils.format(replyTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"是否回复 0:未回复  1:已回复\": \"" + (replySts == null ? "空" : replySts) + "\", "
				+ " \"IP来源\": \"" + (postip == null ? "空" : postip) + "\", "
				+ " \"得分，0-5分\": \"" + (score == null ? "空" : score) + "\", "
				+ " \"有用的计数\": \"" + (usefulCounts == null ? "空" : usefulCounts) + "\", "
				+ " \"晒图的json字符串\": \"" + (pics == null ? "空" : pics) + "\", "
				+ " \"是否匿名(1:是  0:否)\": \"" + (isAnonymous == null ? "空" : isAnonymous) + "\", "
				+ " \"是否显示，1:为显示，0:待审核， -1：不通过审核，不显示。 如果需要审核评论，则是0,，否则1\": \"" + (status == null ? "空" : status) + "\", "
				+ " \"评价(0好评 1中评 2差评)\": \"" + (evaluate == null ? "空" : evaluate) + "\" "
				+ "}";

	}
}