package com.mall.entity.po;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.mall.enums.DataTimePatternEnum;
import com.mall.utils.DateUtils;


/**
 *  @Description: 用户配送地址
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class UserAddr implements Serializable {

	/**
	 * ID
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
	 * 城市
	 */
	private String city;

	/**
	 * 城市ID
	 */
	private Long cityId;

	/**
	 * 区
	 */
	private String area;

	/**
	 * 区ID
	 */
	private Long areaId;

	/**
	 * 邮编
	 */
	private String postCode;

	/**
	 * 地址
	 */
	private String addr;

	/**
	 * 手机
	 */
	private String mobile;

	/**
	 * 状态,1正常，0无效
	 */
	@JsonIgnore
	private Integer status;

	/**
	 * 是否默认地址 1是
	 */
	private Integer commonAddr;

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

	/**
	 * 更新时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Long getCityId() {
		return cityId;
	}
	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Long getAreaId() {
		return areaId;
	}
	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getCommonAddr() {
		return commonAddr;
	}
	public void setCommonAddr(Integer commonAddr) {
		this.commonAddr = commonAddr;
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
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "用户配送地址: {"
				+ " \"ID\": \"" + (addrId == null ? "空" : addrId) + "\", "
				+ " \"用户ID\": \"" + (userId == null ? "空" : userId) + "\", "
				+ " \"收货人\": \"" + (receiver == null ? "空" : receiver) + "\", "
				+ " \"省ID\": \"" + (provinceId == null ? "空" : provinceId) + "\", "
				+ " \"省\": \"" + (province == null ? "空" : province) + "\", "
				+ " \"城市\": \"" + (city == null ? "空" : city) + "\", "
				+ " \"城市ID\": \"" + (cityId == null ? "空" : cityId) + "\", "
				+ " \"区\": \"" + (area == null ? "空" : area) + "\", "
				+ " \"区ID\": \"" + (areaId == null ? "空" : areaId) + "\", "
				+ " \"邮编\": \"" + (postCode == null ? "空" : postCode) + "\", "
				+ " \"地址\": \"" + (addr == null ? "空" : addr) + "\", "
				+ " \"手机\": \"" + (mobile == null ? "空" : mobile) + "\", "
				+ " \"状态,1正常，0无效\": \"" + (status == null ? "空" : status) + "\", "
				+ " \"是否默认地址 1是\": \"" + (commonAddr == null ? "空" : commonAddr) + "\", "
				+ " \"建立时间\": \"" + (createTime == null ? "空" : DateUtils.format(createTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"版本号\": \"" + (version == null ? "空" : version) + "\", "
				+ " \"更新时间\": \"" + (updateTime == null ? "空" : DateUtils.format(updateTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\" "
				+ "}";

	}
}