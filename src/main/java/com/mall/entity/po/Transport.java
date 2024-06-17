package com.mall.entity.po;

import java.io.Serializable;

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
public class Transport implements Serializable {

	/**
	 * 运费模板id
	 */
	private Long transportId;

	/**
	 * 运费模板名称
	 */
	private String transName;

	/**
	 * 创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/**
	 * 店铺id
	 */
	private Long shopId;

	/**
	 * 收费方式（0 按件数,1 按重量 2 按体积）
	 */
	private Integer chargeType;

	/**
	 * 是否包邮 0:不包邮 1:包邮
	 */
	private Integer isFreeFee;

	/**
	 * 是否含有包邮条件 0 否 1是
	 */
	private Integer hasFreeCondition;

	public Long getTransportId() {
		return transportId;
	}
	public void setTransportId(Long transportId) {
		this.transportId = transportId;
	}
	public String getTransName() {
		return transName;
	}
	public void setTransName(String transName) {
		this.transName = transName;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public Integer getChargeType() {
		return chargeType;
	}
	public void setChargeType(Integer chargeType) {
		this.chargeType = chargeType;
	}
	public Integer getIsFreeFee() {
		return isFreeFee;
	}
	public void setIsFreeFee(Integer isFreeFee) {
		this.isFreeFee = isFreeFee;
	}
	public Integer getHasFreeCondition() {
		return hasFreeCondition;
	}
	public void setHasFreeCondition(Integer hasFreeCondition) {
		this.hasFreeCondition = hasFreeCondition;
	}
	@Override
	public String toString() {
		return "Tz_transport: {"
				+ " \"运费模板id\": \"" + (transportId == null ? "空" : transportId) + "\", "
				+ " \"运费模板名称\": \"" + (transName == null ? "空" : transName) + "\", "
				+ " \"创建时间\": \"" + (createTime == null ? "空" : DateUtils.format(createTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"店铺id\": \"" + (shopId == null ? "空" : shopId) + "\", "
				+ " \"收费方式（0 按件数,1 按重量 2 按体积）\": \"" + (chargeType == null ? "空" : chargeType) + "\", "
				+ " \"是否包邮 0:不包邮 1:包邮\": \"" + (isFreeFee == null ? "空" : isFreeFee) + "\", "
				+ " \"是否含有包邮条件 0 否 1是\": \"" + (hasFreeCondition == null ? "空" : hasFreeCondition) + "\" "
				+ "}";

	}
}