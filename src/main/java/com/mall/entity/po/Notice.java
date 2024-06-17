package com.mall.entity.po;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Notice implements Serializable {

	/**
	 * 公告id
	 */
	@JsonIgnore
	private Long id;

	/**
	 * 店铺id
	 */
	private Long shopId;

	/**
	 * 公告标题
	 */
	private String title;

	/**
	 * 公告内容
	 */
	private String content;

	/**
	 * 状态(1:公布 0:撤回)
	 */
	@JsonIgnore
	private Integer status;

	/**
	 * 是否置顶
	 */
	private Integer isTop;

	/**
	 * 发布时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date publishTime;

	/**
	 * 更新时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getIsTop() {
		return isTop;
	}
	public void setIsTop(Integer isTop) {
		this.isTop = isTop;
	}
	public Date getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "Tz_notice: {"
				+ " \"公告id\": \"" + (id == null ? "空" : id) + "\", "
				+ " \"店铺id\": \"" + (shopId == null ? "空" : shopId) + "\", "
				+ " \"公告标题\": \"" + (title == null ? "空" : title) + "\", "
				+ " \"公告内容\": \"" + (content == null ? "空" : content) + "\", "
				+ " \"状态(1:公布 0:撤回)\": \"" + (status == null ? "空" : status) + "\", "
				+ " \"是否置顶\": \"" + (isTop == null ? "空" : isTop) + "\", "
				+ " \"发布时间\": \"" + (publishTime == null ? "空" : DateUtils.format(publishTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"更新时间\": \"" + (updateTime == null ? "空" : DateUtils.format(updateTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\" "
				+ "}";

	}
}