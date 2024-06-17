package com.mall.entity.po;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.mall.enums.DataTimePatternEnum;
import com.mall.utils.DateUtils;


/**
 *  @Description: 热搜
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class HotSearch implements Serializable {

	/**
	 * 主键
	 */
	private Long hotSearchId;

	/**
	 * 店铺ID 0为全局热搜
	 */
	private Long shopId;

	/**
	 * 内容
	 */
	private String content;

	/**
	 * 录入时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date recDate;

	/**
	 * 顺序
	 */
	private Integer seq;

	/**
	 * 状态 0下线 1上线
	 */
	@JsonIgnore
	private Integer status;

	/**
	 * 热搜标题
	 */
	private String title;

	public Long getHotSearchId() {
		return hotSearchId;
	}
	public void setHotSearchId(Long hotSearchId) {
		this.hotSearchId = hotSearchId;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRecDate() {
		return recDate;
	}
	public void setRecDate(Date recDate) {
		this.recDate = recDate;
	}
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "热搜: {"
				+ " \"主键\": \"" + (hotSearchId == null ? "空" : hotSearchId) + "\", "
				+ " \"店铺ID 0为全局热搜\": \"" + (shopId == null ? "空" : shopId) + "\", "
				+ " \"内容\": \"" + (content == null ? "空" : content) + "\", "
				+ " \"录入时间\": \"" + (recDate == null ? "空" : DateUtils.format(recDate, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"顺序\": \"" + (seq == null ? "空" : seq) + "\", "
				+ " \"状态 0下线 1上线\": \"" + (status == null ? "空" : status) + "\", "
				+ " \"热搜标题\": \"" + (title == null ? "空" : title) + "\" "
				+ "}";

	}
}