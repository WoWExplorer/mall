package com.mall.entity.query;


import java.util.Date;


/**
 *  @Description: 用户订单配送地址查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class UserAddrOrderQuery extends BaseQuery {

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
	private String userIdFuzzy;

	/**
	 * 收货人
	 */
	private String receiver;
	private String receiverFuzzy;

	/**
	 * 省ID
	 */
	private Long provinceId;

	/**
	 * 省
	 */
	private String province;
	private String provinceFuzzy;

	/**
	 * 区域ID
	 */
	private Long areaId;

	/**
	 * 区
	 */
	private String area;
	private String areaFuzzy;

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
	 * 地址
	 */
	private String addr;
	private String addrFuzzy;

	/**
	 * 邮编
	 */
	private String postCode;
	private String postCodeFuzzy;

	/**
	 * 手机
	 */
	private String mobile;
	private String mobileFuzzy;

	/**
	 * 建立时间
	 */
	private Date createTime;
	private String createTimeStart;
	private String createTimeEnd;

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
	public String getUserIdFuzzy() {
		return userIdFuzzy;
	}
	public void setUserIdFuzzy(String userIdFuzzy) {
		this.userIdFuzzy = userIdFuzzy;
	}
	public String getReceiverFuzzy() {
		return receiverFuzzy;
	}
	public void setReceiverFuzzy(String receiverFuzzy) {
		this.receiverFuzzy = receiverFuzzy;
	}
	public String getProvinceFuzzy() {
		return provinceFuzzy;
	}
	public void setProvinceFuzzy(String provinceFuzzy) {
		this.provinceFuzzy = provinceFuzzy;
	}
	public String getAreaFuzzy() {
		return areaFuzzy;
	}
	public void setAreaFuzzy(String areaFuzzy) {
		this.areaFuzzy = areaFuzzy;
	}
	public String getCityFuzzy() {
		return cityFuzzy;
	}
	public void setCityFuzzy(String cityFuzzy) {
		this.cityFuzzy = cityFuzzy;
	}
	public String getAddrFuzzy() {
		return addrFuzzy;
	}
	public void setAddrFuzzy(String addrFuzzy) {
		this.addrFuzzy = addrFuzzy;
	}
	public String getPostCodeFuzzy() {
		return postCodeFuzzy;
	}
	public void setPostCodeFuzzy(String postCodeFuzzy) {
		this.postCodeFuzzy = postCodeFuzzy;
	}
	public String getMobileFuzzy() {
		return mobileFuzzy;
	}
	public void setMobileFuzzy(String mobileFuzzy) {
		this.mobileFuzzy = mobileFuzzy;
	}
	public String getCreateTimeStart() {
		return createTimeStart;
	}
	public void setCreateTimeStart(String createTimeStart) {
		this.createTimeStart = createTimeStart;
	}
	public String getCreateTimeEnd() {
		return createTimeEnd;
	}
	public void setCreateTimeEnd(String createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
	}
}