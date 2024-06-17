package com.mall.entity.query;

import java.math.BigDecimal;
import java.util.Date;


/**
 *  @Description: 查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class ShopDetailQuery extends BaseQuery {

	/**
	 * 店铺id
	 */
	private Long shopId;

	/**
	 * 店铺名称(数字、中文，英文(可混合，不可有特殊字符)，可修改)、不唯一
	 */
	private String shopName;
	private String shopNameFuzzy;

	/**
	 * 店长用户id
	 */
	private String userId;
	private String userIdFuzzy;

	/**
	 * 店铺类型
	 */
	private Integer shopType;

	/**
	 * 店铺简介(可修改)
	 */
	private String intro;
	private String introFuzzy;

	/**
	 * 店铺公告(可修改)
	 */
	private String shopNotice;
	private String shopNoticeFuzzy;

	/**
	 * 店铺行业(餐饮、生鲜果蔬、鲜花等)
	 */
	private Integer shopIndustry;

	/**
	 * 店长
	 */
	private String shopOwner;
	private String shopOwnerFuzzy;

	/**
	 * 店铺绑定的手机(登录账号：唯一)
	 */
	private String mobile;
	private String mobileFuzzy;

	/**
	 * 店铺联系电话
	 */
	private String tel;
	private String telFuzzy;

	/**
	 * 店铺所在纬度(可修改)
	 */
	private String shopLat;
	private String shopLatFuzzy;

	/**
	 * 店铺所在经度(可修改)
	 */
	private String shopLng;
	private String shopLngFuzzy;

	/**
	 * 店铺详细地址
	 */
	private String shopAddress;
	private String shopAddressFuzzy;

	/**
	 * 店铺所在省份（描述）
	 */
	private String province;
	private String provinceFuzzy;

	/**
	 * 店铺所在城市（描述）
	 */
	private String city;
	private String cityFuzzy;

	/**
	 * 店铺所在区域（描述）
	 */
	private String area;
	private String areaFuzzy;

	/**
	 * 店铺省市区代码，用于回显
	 */
	private String pcaCode;
	private String pcaCodeFuzzy;

	/**
	 * 店铺logo(可修改)
	 */
	private String shopLogo;
	private String shopLogoFuzzy;

	/**
	 * 店铺相册
	 */
	private String shopPhotos;
	private String shopPhotosFuzzy;

	/**
	 * 每天营业时间段(可修改)
	 */
	private String openTime;
	private String openTimeFuzzy;

	/**
	 * 店铺状态(-1:未开通 0: 停业中 1:营业中)，可修改
	 */
	private Integer shopStatus;

	/**
	 * 0:商家承担运费; 1:买家承担运费
	 */
	private Integer transportType;

	/**
	 * 固定运费
	 */
	private BigDecimal fixedFreight;

	/**
	 * 满X包邮
	 */
	private BigDecimal fullFreeShipping;

	/**
	 * 创建时间
	 */
	private Date createTime;
	private String createTimeStart;
	private String createTimeEnd;

	/**
	 * 更新时间
	 */
	private Date updateTime;
	private String updateTimeStart;
	private String updateTimeEnd;

	/**
	 * 分销开关(0:开启 1:关闭)
	 */
	private Integer isDistribution;

	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Integer getShopType() {
		return shopType;
	}
	public void setShopType(Integer shopType) {
		this.shopType = shopType;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getShopNotice() {
		return shopNotice;
	}
	public void setShopNotice(String shopNotice) {
		this.shopNotice = shopNotice;
	}
	public Integer getShopIndustry() {
		return shopIndustry;
	}
	public void setShopIndustry(Integer shopIndustry) {
		this.shopIndustry = shopIndustry;
	}
	public String getShopOwner() {
		return shopOwner;
	}
	public void setShopOwner(String shopOwner) {
		this.shopOwner = shopOwner;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getShopLat() {
		return shopLat;
	}
	public void setShopLat(String shopLat) {
		this.shopLat = shopLat;
	}
	public String getShopLng() {
		return shopLng;
	}
	public void setShopLng(String shopLng) {
		this.shopLng = shopLng;
	}
	public String getShopAddress() {
		return shopAddress;
	}
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
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
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPcaCode() {
		return pcaCode;
	}
	public void setPcaCode(String pcaCode) {
		this.pcaCode = pcaCode;
	}
	public String getShopLogo() {
		return shopLogo;
	}
	public void setShopLogo(String shopLogo) {
		this.shopLogo = shopLogo;
	}
	public String getShopPhotos() {
		return shopPhotos;
	}
	public void setShopPhotos(String shopPhotos) {
		this.shopPhotos = shopPhotos;
	}
	public String getOpenTime() {
		return openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}
	public Integer getShopStatus() {
		return shopStatus;
	}
	public void setShopStatus(Integer shopStatus) {
		this.shopStatus = shopStatus;
	}
	public Integer getTransportType() {
		return transportType;
	}
	public void setTransportType(Integer transportType) {
		this.transportType = transportType;
	}
	public BigDecimal getFixedFreight() {
		return fixedFreight;
	}
	public void setFixedFreight(BigDecimal fixedFreight) {
		this.fixedFreight = fixedFreight;
	}
	public BigDecimal getFullFreeShipping() {
		return fullFreeShipping;
	}
	public void setFullFreeShipping(BigDecimal fullFreeShipping) {
		this.fullFreeShipping = fullFreeShipping;
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
	public Integer getIsDistribution() {
		return isDistribution;
	}
	public void setIsDistribution(Integer isDistribution) {
		this.isDistribution = isDistribution;
	}
	public String getShopNameFuzzy() {
		return shopNameFuzzy;
	}
	public void setShopNameFuzzy(String shopNameFuzzy) {
		this.shopNameFuzzy = shopNameFuzzy;
	}
	public String getUserIdFuzzy() {
		return userIdFuzzy;
	}
	public void setUserIdFuzzy(String userIdFuzzy) {
		this.userIdFuzzy = userIdFuzzy;
	}
	public String getIntroFuzzy() {
		return introFuzzy;
	}
	public void setIntroFuzzy(String introFuzzy) {
		this.introFuzzy = introFuzzy;
	}
	public String getShopNoticeFuzzy() {
		return shopNoticeFuzzy;
	}
	public void setShopNoticeFuzzy(String shopNoticeFuzzy) {
		this.shopNoticeFuzzy = shopNoticeFuzzy;
	}
	public String getShopOwnerFuzzy() {
		return shopOwnerFuzzy;
	}
	public void setShopOwnerFuzzy(String shopOwnerFuzzy) {
		this.shopOwnerFuzzy = shopOwnerFuzzy;
	}
	public String getMobileFuzzy() {
		return mobileFuzzy;
	}
	public void setMobileFuzzy(String mobileFuzzy) {
		this.mobileFuzzy = mobileFuzzy;
	}
	public String getTelFuzzy() {
		return telFuzzy;
	}
	public void setTelFuzzy(String telFuzzy) {
		this.telFuzzy = telFuzzy;
	}
	public String getShopLatFuzzy() {
		return shopLatFuzzy;
	}
	public void setShopLatFuzzy(String shopLatFuzzy) {
		this.shopLatFuzzy = shopLatFuzzy;
	}
	public String getShopLngFuzzy() {
		return shopLngFuzzy;
	}
	public void setShopLngFuzzy(String shopLngFuzzy) {
		this.shopLngFuzzy = shopLngFuzzy;
	}
	public String getShopAddressFuzzy() {
		return shopAddressFuzzy;
	}
	public void setShopAddressFuzzy(String shopAddressFuzzy) {
		this.shopAddressFuzzy = shopAddressFuzzy;
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
	public String getPcaCodeFuzzy() {
		return pcaCodeFuzzy;
	}
	public void setPcaCodeFuzzy(String pcaCodeFuzzy) {
		this.pcaCodeFuzzy = pcaCodeFuzzy;
	}
	public String getShopLogoFuzzy() {
		return shopLogoFuzzy;
	}
	public void setShopLogoFuzzy(String shopLogoFuzzy) {
		this.shopLogoFuzzy = shopLogoFuzzy;
	}
	public String getShopPhotosFuzzy() {
		return shopPhotosFuzzy;
	}
	public void setShopPhotosFuzzy(String shopPhotosFuzzy) {
		this.shopPhotosFuzzy = shopPhotosFuzzy;
	}
	public String getOpenTimeFuzzy() {
		return openTimeFuzzy;
	}
	public void setOpenTimeFuzzy(String openTimeFuzzy) {
		this.openTimeFuzzy = openTimeFuzzy;
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
	public String getUpdateTimeStart() {
		return updateTimeStart;
	}
	public void setUpdateTimeStart(String updateTimeStart) {
		this.updateTimeStart = updateTimeStart;
	}
	public String getUpdateTimeEnd() {
		return updateTimeEnd;
	}
	public void setUpdateTimeEnd(String updateTimeEnd) {
		this.updateTimeEnd = updateTimeEnd;
	}
}