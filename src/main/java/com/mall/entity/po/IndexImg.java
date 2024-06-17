package com.mall.entity.po;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.mall.enums.DataTimePatternEnum;
import com.mall.utils.DateUtils;


/**
 *  @Description: 主页轮播图
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class IndexImg implements Serializable {

	/**
	 * 主键
	 */
	private Long imgId;

	/**
	 * 店铺ID
	 */
	private Long shopId;

	/**
	 * 图片
	 */
	private String imgUrl;

	/**
	 * 说明文字,描述
	 */
	private String des;

	/**
	 * 标题
	 */
	private String title;

	/**
	 * 链接
	 */
	private String link;

	/**
	 * 状态
	 */
	@JsonIgnore
	private Integer status;

	/**
	 * 顺序
	 */
	private Integer seq;

	/**
	 * 上传时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date uploadTime;

	/**
	 * 关联
	 */
	private Long relation;

	/**
	 * 类型
	 */
	private Integer type;

	public Long getImgId() {
		return imgId;
	}
	public void setImgId(Long imgId) {
		this.imgId = imgId;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	public Date getUploadTime() {
		return uploadTime;
	}
	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}
	public Long getRelation() {
		return relation;
	}
	public void setRelation(Long relation) {
		this.relation = relation;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "主页轮播图: {"
				+ " \"主键\": \"" + (imgId == null ? "空" : imgId) + "\", "
				+ " \"店铺ID\": \"" + (shopId == null ? "空" : shopId) + "\", "
				+ " \"图片\": \"" + (imgUrl == null ? "空" : imgUrl) + "\", "
				+ " \"说明文字,描述\": \"" + (des == null ? "空" : des) + "\", "
				+ " \"标题\": \"" + (title == null ? "空" : title) + "\", "
				+ " \"链接\": \"" + (link == null ? "空" : link) + "\", "
				+ " \"状态\": \"" + (status == null ? "空" : status) + "\", "
				+ " \"顺序\": \"" + (seq == null ? "空" : seq) + "\", "
				+ " \"上传时间\": \"" + (uploadTime == null ? "空" : DateUtils.format(uploadTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"关联\": \"" + (relation == null ? "空" : relation) + "\", "
				+ " \"类型\": \"" + (type == null ? "空" : type) + "\" "
				+ "}";

	}
}