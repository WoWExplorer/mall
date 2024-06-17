package com.mall.entity.po;

import java.io.Serializable;



/**
 *  @Description: 用户配送地址
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class PickAddr implements Serializable {

	/**
	 * ID
	 */
	private Long addrId;

	/**
	 * 自提点名称
	 */
	private String addrName;

	/**
	 * 地址
	 */
	private String addr;

	/**
	 * 手机
	 */
	private String mobile;

	/**
	 * 省份ID
	 */
	private Long provinceId;

	/**
	 * 省份
	 */
	private String province;

	/**
	 * 城市ID
	 */
	private Long cityId;

	/**
	 * 城市
	 */
	private String city;

	/**
	 * 区/县ID
	 */
	private Long areaId;

	/**
	 * 区/县
	 */
	private String area;

	/**
	 * 店铺id
	 */
	private Long shopId;

	public Long getAddrId() {
		return addrId;
	}
	public void setAddrId(Long addrId) {
		this.addrId = addrId;
	}
	public String getAddrName() {
		return addrName;
	}
	public void setAddrName(String addrName) {
		this.addrName = addrName;
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
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	@Override
	public String toString() {
		return "用户配送地址: {"
				+ " \"ID\": \"" + (addrId == null ? "空" : addrId) + "\", "
				+ " \"自提点名称\": \"" + (addrName == null ? "空" : addrName) + "\", "
				+ " \"地址\": \"" + (addr == null ? "空" : addr) + "\", "
				+ " \"手机\": \"" + (mobile == null ? "空" : mobile) + "\", "
				+ " \"省份ID\": \"" + (provinceId == null ? "空" : provinceId) + "\", "
				+ " \"省份\": \"" + (province == null ? "空" : province) + "\", "
				+ " \"城市ID\": \"" + (cityId == null ? "空" : cityId) + "\", "
				+ " \"城市\": \"" + (city == null ? "空" : city) + "\", "
				+ " \"区/县ID\": \"" + (areaId == null ? "空" : areaId) + "\", "
				+ " \"区/县\": \"" + (area == null ? "空" : area) + "\", "
				+ " \"店铺id\": \"" + (shopId == null ? "空" : shopId) + "\" "
				+ "}";

	}
}