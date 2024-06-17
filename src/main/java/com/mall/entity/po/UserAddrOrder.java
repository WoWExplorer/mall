package com.mall.entity.po;

import java.io.Serializable;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.mall.enums.DataTimePatternEnum;
import com.mall.utils.DateUtils;


/**
 *  @Description: 用户订单配送地址
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class UserAddrOrder implements Serializable {

	/**
	 * ID
	 */
	private Long addrOrderId;

	/**
	 * 地址ID
	 */
	private Long addrId;

	/**
	 * 用户ID
	 */
	private String userId;

	/**
	 * 收货人
	 */
	private String receiver;

	/**
	 * 省ID
	 */
	private Long provinceId;

	/**
	 * 省
	 */
	private String province;

	/**
	 * 区域ID
	 */
	private Long areaId;

	/**
	 * 区
	 */
	private String area;

	/**
	 * 城市ID
	 */
	private Long cityId;

	/**
	 * 城市
	 */
	private String city;

	/**
	 * 地址
	 */
	private String addr;

	/**
	 * 邮编
	 */
	private String postCode;

	/**
	 * 手机
	 */
	private String mobile;

	/**
	 * 建立时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/**
	 * 版本号
	 */
	private Integer version;

	public Long getAddrOrderId() {
		return addrOrderId;
	}
	public void setAddrOrderId(Long addrOrderId) {
		this.addrOrderId = addrOrderId;
	}
	public Long getAddrId() {
		return addrId;
	}
	public void setAddrId(Long addrId) {
		this.addrId = addrId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public Long getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public Long getAreaId() {
		return areaId;
	}
	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Long getCityId() {
		return cityId;
	}
	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "用户订单配送地址: {"
				+ " \"ID\": \"" + (addrOrderId == null ? "空" : addrOrderId) + "\", "
				+ " \"地址ID\": \"" + (addrId == null ? "空" : addrId) + "\", "
				+ " \"用户ID\": \"" + (userId == null ? "空" : userId) + "\", "
				+ " \"收货人\": \"" + (receiver == null ? "空" : receiver) + "\", "
				+ " \"省ID\": \"" + (provinceId == null ? "空" : provinceId) + "\", "
				+ " \"省\": \"" + (province == null ? "空" : province) + "\", "
				+ " \"区域ID\": \"" + (areaId == null ? "空" : areaId) + "\", "
				+ " \"区\": \"" + (area == null ? "空" : area) + "\", "
				+ " \"城市ID\": \"" + (cityId == null ? "空" : cityId) + "\", "
				+ " \"城市\": \"" + (city == null ? "空" : city) + "\", "
				+ " \"地址\": \"" + (addr == null ? "空" : addr) + "\", "
				+ " \"邮编\": \"" + (postCode == null ? "空" : postCode) + "\", "
				+ " \"手机\": \"" + (mobile == null ? "空" : mobile) + "\", "
				+ " \"建立时间\": \"" + (createTime == null ? "空" : DateUtils.format(createTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"版本号\": \"" + (version == null ? "空" : version) + "\" "
				+ "}";

	}
}