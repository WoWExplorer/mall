package com.mall.entity.po;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.mall.enums.DataTimePatternEnum;
import com.mall.utils.DateUtils;


/**
 *  @Description: 品牌表
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class Brand implements Serializable {

	/**
	 * 主键
	 */
	private Long brandId;

	/**
	 * 品牌名称
	 */
	private String brandName;

	/**
	 * 图片路径
	 */
	private String brandPic;

	/**
	 * 用户ID
	 */
	private String userId;

	/**
	 * 备注
	 */
	private String memo;

	/**
	 * 顺序
	 */
	private Integer seq;

	/**
	 * 默认是1，表示正常状态,0为下线状态
	 */
	@JsonIgnore
	private Integer status;

	/**
	 * 简要描述
	 */
	private String brief;

	/**
	 * 内容
	 */
	private String content;

	/**
	 * 记录时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date recTime;

	/**
	 * 更新时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

	/**
	 * 品牌首字母
	 */
	private String firstChar;

	public Long getBrandId() {
		return brandId;
	}
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getBrandPic() {
		return brandPic;
	}
	public void setBrandPic(String brandPic) {
		this.brandPic = brandPic;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
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
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRecTime() {
		return recTime;
	}
	public void setRecTime(Date recTime) {
		this.recTime = recTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getFirstChar() {
		return firstChar;
	}
	public void setFirstChar(String firstChar) {
		this.firstChar = firstChar;
	}
	@Override
	public String toString() {
		return "品牌表: {"
				+ " \"主键\": \"" + (brandId == null ? "空" : brandId) + "\", "
				+ " \"品牌名称\": \"" + (brandName == null ? "空" : brandName) + "\", "
				+ " \"图片路径\": \"" + (brandPic == null ? "空" : brandPic) + "\", "
				+ " \"用户ID\": \"" + (userId == null ? "空" : userId) + "\", "
				+ " \"备注\": \"" + (memo == null ? "空" : memo) + "\", "
				+ " \"顺序\": \"" + (seq == null ? "空" : seq) + "\", "
				+ " \"默认是1，表示正常状态,0为下线状态\": \"" + (status == null ? "空" : status) + "\", "
				+ " \"简要描述\": \"" + (brief == null ? "空" : brief) + "\", "
				+ " \"内容\": \"" + (content == null ? "空" : content) + "\", "
				+ " \"记录时间\": \"" + (recTime == null ? "空" : DateUtils.format(recTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"更新时间\": \"" + (updateTime == null ? "空" : DateUtils.format(updateTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"品牌首字母\": \"" + (firstChar == null ? "空" : firstChar) + "\" "
				+ "}";

	}
}