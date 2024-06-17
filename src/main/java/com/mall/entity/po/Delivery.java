package com.mall.entity.po;

import java.io.Serializable;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.mall.enums.DataTimePatternEnum;
import com.mall.utils.DateUtils;


/**
 *  @Description: 物流公司
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class Delivery implements Serializable {

	/**
	 * ID
	 */
	private Long dvyId;

	/**
	 * 物流公司名称
	 */
	private String dvyName;

	/**
	 * 公司主页
	 */
	private String companyHomeUrl;

	/**
	 * 建立时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date recTime;

	/**
	 * 修改时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date modifyTime;

	/**
	 * 物流查询接口
	 */
	private String queryUrl;

	public Long getDvyId() {
		return dvyId;
	}
	public void setDvyId(Long dvyId) {
		this.dvyId = dvyId;
	}
	public String getDvyName() {
		return dvyName;
	}
	public void setDvyName(String dvyName) {
		this.dvyName = dvyName;
	}
	public String getCompanyHomeUrl() {
		return companyHomeUrl;
	}
	public void setCompanyHomeUrl(String companyHomeUrl) {
		this.companyHomeUrl = companyHomeUrl;
	}
	public Date getRecTime() {
		return recTime;
	}
	public void setRecTime(Date recTime) {
		this.recTime = recTime;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public String getQueryUrl() {
		return queryUrl;
	}
	public void setQueryUrl(String queryUrl) {
		this.queryUrl = queryUrl;
	}
	@Override
	public String toString() {
		return "物流公司: {"
				+ " \"ID\": \"" + (dvyId == null ? "空" : dvyId) + "\", "
				+ " \"物流公司名称\": \"" + (dvyName == null ? "空" : dvyName) + "\", "
				+ " \"公司主页\": \"" + (companyHomeUrl == null ? "空" : companyHomeUrl) + "\", "
				+ " \"建立时间\": \"" + (recTime == null ? "空" : DateUtils.format(recTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"修改时间\": \"" + (modifyTime == null ? "空" : DateUtils.format(modifyTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"物流查询接口\": \"" + (queryUrl == null ? "空" : queryUrl) + "\" "
				+ "}";

	}
}