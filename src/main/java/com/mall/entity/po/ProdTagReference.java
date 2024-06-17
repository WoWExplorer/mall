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
public class ProdTagReference implements Serializable {

	/**
	 * 分组引用id
	 */
	private Long referenceId;

	/**
	 * 店铺id
	 */
	private Long shopId;

	/**
	 * 标签id
	 */
	private Long tagId;

	/**
	 * 商品id
	 */
	private Long prodId;

	/**
	 * 状态(1:正常,0:删除)
	 */
	@JsonIgnore
	private Integer status;

	/**
	 * 创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	public Long getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(Long referenceId) {
		this.referenceId = referenceId;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public Long getTagId() {
		return tagId;
	}
	public void setTagId(Long tagId) {
		this.tagId = tagId;
	}
	public Long getProdId() {
		return prodId;
	}
	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "Tz_prod_tag_reference: {"
				+ " \"分组引用id\": \"" + (referenceId == null ? "空" : referenceId) + "\", "
				+ " \"店铺id\": \"" + (shopId == null ? "空" : shopId) + "\", "
				+ " \"标签id\": \"" + (tagId == null ? "空" : tagId) + "\", "
				+ " \"商品id\": \"" + (prodId == null ? "空" : prodId) + "\", "
				+ " \"状态(1:正常,0:删除)\": \"" + (status == null ? "空" : status) + "\", "
				+ " \"创建时间\": \"" + (createTime == null ? "空" : DateUtils.format(createTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\" "
				+ "}";

	}
}