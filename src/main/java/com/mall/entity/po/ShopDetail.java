package com.mall.entity.po;

import java.io.Serializable;
import java.math.BigDecimal;
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
public class ShopDetail implements Serializable {

	/**
	 * 店铺id
	 */
	private Long shopId;

	/**
	 * 店铺名称(数字、中文，英文(可混合，不可有特殊字符)，可修改)、不唯一
	 */
	private String shopName;

	/**
	 * 店长用户id
	 */
	private String userId;

	/**
	 * 店铺类型
	 */
	private Integer shopType;

	/**
	 * 店铺简介(可修改)
	 */
	private String intro;

	/**
	 * 店铺公告(可修改)
	 */
	private String shopNotice;

	/**
	 * 店铺行业(餐饮、生鲜果蔬、鲜花等)
	 */
	private Integer shopIndustry;

	/**
	 * 店长
	 */
	private String shopOwner;

	/**
	 * 店铺绑定的手机(登录账号：唯一)
	 */
	private String mobile;

	/**
	 * 店铺联系电话
	 */
	private String tel;

	/**
	 * 店铺所在纬度(可修改)
	 */
	private String shopLat;

	/**
	 * 店铺所在经度(可修改)
	 */
	private String shopLng;

	/**
	 * 店铺详细地址
	 */
	private String shopAddress;

	/**
	 * 店铺所在省份（描述）
	 */
	private String province;

	/**
	 * 店铺所在城市（描述）
	 */
	private String city;

	/**
	 * 店铺所在区域（描述）
	 */
	private String area;

	/**
	 * 店铺省市区代码，用于回显
	 */
	private String pcaCode;

	/**
	 * 店铺logo(可修改)
	 */
	private String shopLogo;

	/**
	 * 店铺相册
	 */
	private String shopPhotos;

	/**
	 * 每天营业时间段(可修改)
	 */
	private String openTime;

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
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/**
	 * 更新时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

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
	@Override
	public String toString() {
		return "Tz_shop_detail: {"
				+ " \"店铺id\": \"" + (shopId == null ? "空" : shopId) + "\", "
				+ " \"店铺名称(数字、中文，英文(可混合，不可有特殊字符)，可修改)、不唯一\": \"" + (shopName == null ? "空" : shopName) + "\", "
				+ " \"店长用户id\": \"" + (userId == null ? "空" : userId) + "\", "
				+ " \"店铺类型\": \"" + (shopType == null ? "空" : shopType) + "\", "
				+ " \"店铺简介(可修改)\": \"" + (intro == null ? "空" : intro) + "\", "
				+ " \"店铺公告(可修改)\": \"" + (shopNotice == null ? "空" : shopNotice) + "\", "
				+ " \"店铺行业(餐饮、生鲜果蔬、鲜花等)\": \"" + (shopIndustry == null ? "空" : shopIndustry) + "\", "
				+ " \"店长\": \"" + (shopOwner == null ? "空" : shopOwner) + "\", "
				+ " \"店铺绑定的手机(登录账号：唯一)\": \"" + (mobile == null ? "空" : mobile) + "\", "
				+ " \"店铺联系电话\": \"" + (tel == null ? "空" : tel) + "\", "
				+ " \"店铺所在纬度(可修改)\": \"" + (shopLat == null ? "空" : shopLat) + "\", "
				+ " \"店铺所在经度(可修改)\": \"" + (shopLng == null ? "空" : shopLng) + "\", "
				+ " \"店铺详细地址\": \"" + (shopAddress == null ? "空" : shopAddress) + "\", "
				+ " \"店铺所在省份（描述）\": \"" + (province == null ? "空" : province) + "\", "
				+ " \"店铺所在城市（描述）\": \"" + (city == null ? "空" : city) + "\", "
				+ " \"店铺所在区域（描述）\": \"" + (area == null ? "空" : area) + "\", "
				+ " \"店铺省市区代码，用于回显\": \"" + (pcaCode == null ? "空" : pcaCode) + "\", "
				+ " \"店铺logo(可修改)\": \"" + (shopLogo == null ? "空" : shopLogo) + "\", "
				+ " \"店铺相册\": \"" + (shopPhotos == null ? "空" : shopPhotos) + "\", "
				+ " \"每天营业时间段(可修改)\": \"" + (openTime == null ? "空" : openTime) + "\", "
				+ " \"店铺状态(-1:未开通 0: 停业中 1:营业中)，可修改\": \"" + (shopStatus == null ? "空" : shopStatus) + "\", "
				+ " \"0:商家承担运费; 1:买家承担运费\": \"" + (transportType == null ? "空" : transportType) + "\", "
				+ " \"固定运费\": \"" + (fixedFreight == null ? "空" : fixedFreight) + "\", "
				+ " \"满X包邮\": \"" + (fullFreeShipping == null ? "空" : fullFreeShipping) + "\", "
				+ " \"创建时间\": \"" + (createTime == null ? "空" : DateUtils.format(createTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"更新时间\": \"" + (updateTime == null ? "空" : DateUtils.format(updateTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"分销开关(0:开启 1:关闭)\": \"" + (isDistribution == null ? "空" : isDistribution) + "\" "
				+ "}";

	}
}