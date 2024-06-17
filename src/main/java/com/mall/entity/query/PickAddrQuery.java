package com.mall.entity.query;




/**
 *  @Description: 用户配送地址查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class PickAddrQuery extends BaseQuery {

	/**
	 * ID
	 */
	private Long addrId;

	/**
	 * 自提点名称
	 */
	private String addrName;
	private String addrNameFuzzy;

	/**
	 * 地址
	 */
	private String addr;
	private String addrFuzzy;

	/**
	 * 手机
	 */
	private String mobile;
	private String mobileFuzzy;

	/**
	 * 省份ID
	 */
	private Long provinceId;

	/**
	 * 省份
	 */
	private String province;
	private String provinceFuzzy;

	/**
	 * 城市ID
	 */
	private Long cityId;

	/**
	 * 城市
	 */
	private String city;
	private String cityFuzzy;

	/**
	 * 区/县ID
	 */
	private Long areaId;

	/**
	 * 区/县
	 */
	private String area;
	private String areaFuzzy;

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
	public String getAddrNameFuzzy() {
		return addrNameFuzzy;
	}
	public void setAddrNameFuzzy(String addrNameFuzzy) {
		this.addrNameFuzzy = addrNameFuzzy;
	}
	public String getAddrFuzzy() {
		return addrFuzzy;
	}
	public void setAddrFuzzy(String addrFuzzy) {
		this.addrFuzzy = addrFuzzy;
	}
	public String getMobileFuzzy() {
		return mobileFuzzy;
	}
	public void setMobileFuzzy(String mobileFuzzy) {
		this.mobileFuzzy = mobileFuzzy;
	}
	public String getProvinceFuzzy() {
		return provinceFuzzy;
	}
	public void setProvinceFuzzy(String provinceFuzzy) {
		this.provinceFuzzy = provinceFuzzy;
	}
	public String getCityFuzzy() {
		return cityFuzzy;
	}
	public void setCityFuzzy(String cityFuzzy) {
		this.cityFuzzy = cityFuzzy;
	}
	public String getAreaFuzzy() {
		return areaFuzzy;
	}
	public void setAreaFuzzy(String areaFuzzy) {
		this.areaFuzzy = areaFuzzy;
	}
}