package com.mall.entity.po;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.mall.enums.DataTimePatternEnum;
import com.mall.utils.DateUtils;


/**
 *  @Description: 商品分组表
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class ProdTag implements Serializable {

	/**
	 * 分组标签id
	 */
	@JsonIgnore
	private Long id;

	/**
	 * 分组标题
	 */
	private String title;

	/**
	 * 店铺Id
	 */
	private Long shopId;

	/**
	 * 状态(1为正常,0为删除)
	 */
	@JsonIgnore
	private Integer status;

	/**
	 * 默认类型(0:商家自定义,1:系统默认)
	 */
	private Integer isDefault;

	/**
	 * 商品数量
	 */
	private Long prodCount;

	/**
	 * 列表样式(0:一列一个,1:一列两个,2:一列三个)
	 */
	private Integer style;

	/**
	 * 排序
	 */
	private Integer seq;

	/**
	 * 创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/**
	 * 修改时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

	/**
	 * 删除时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date deleteTime;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}
	public Long getProdCount() {
		return prodCount;
	}
	public void setProdCount(Long prodCount) {
		this.prodCount = prodCount;
	}
	public Integer getStyle() {
		return style;
	}
	public void setStyle(Integer style) {
		this.style = style;
	}
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
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
	public Date getDeleteTime() {
		return deleteTime;
	}
	public void setDeleteTime(Date deleteTime) {
		this.deleteTime = deleteTime;
	}
	@Override
	public String toString() {
		return "商品分组表: {"
				+ " \"分组标签id\": \"" + (id == null ? "空" : id) + "\", "
				+ " \"分组标题\": \"" + (title == null ? "空" : title) + "\", "
				+ " \"店铺Id\": \"" + (shopId == null ? "空" : shopId) + "\", "
				+ " \"状态(1为正常,0为删除)\": \"" + (status == null ? "空" : status) + "\", "
				+ " \"默认类型(0:商家自定义,1:系统默认)\": \"" + (isDefault == null ? "空" : isDefault) + "\", "
				+ " \"商品数量\": \"" + (prodCount == null ? "空" : prodCount) + "\", "
				+ " \"列表样式(0:一列一个,1:一列两个,2:一列三个)\": \"" + (style == null ? "空" : style) + "\", "
				+ " \"排序\": \"" + (seq == null ? "空" : seq) + "\", "
				+ " \"创建时间\": \"" + (createTime == null ? "空" : DateUtils.format(createTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"修改时间\": \"" + (updateTime == null ? "空" : DateUtils.format(updateTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"删除时间\": \"" + (deleteTime == null ? "空" : DateUtils.format(deleteTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\" "
				+ "}";

	}
}