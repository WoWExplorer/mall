package com.mall.entity.query;


import java.util.Date;


/**
 *  @Description: 物流公司查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class DeliveryQuery extends BaseQuery {

	/**
	 * ID
	 */
	private Long dvyId;

	/**
	 * 物流公司名称
	 */
	private String dvyName;
	private String dvyNameFuzzy;

	/**
	 * 公司主页
	 */
	private String companyHomeUrl;
	private String companyHomeUrlFuzzy;

	/**
	 * 建立时间
	 */
	private Date recTime;
	private String recTimeStart;
	private String recTimeEnd;

	/**
	 * 修改时间
	 */
	private Date modifyTime;
	private String modifyTimeStart;
	private String modifyTimeEnd;

	/**
	 * 物流查询接口
	 */
	private String queryUrl;
	private String queryUrlFuzzy;

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
	public String getDvyNameFuzzy() {
		return dvyNameFuzzy;
	}
	public void setDvyNameFuzzy(String dvyNameFuzzy) {
		this.dvyNameFuzzy = dvyNameFuzzy;
	}
	public String getCompanyHomeUrlFuzzy() {
		return companyHomeUrlFuzzy;
	}
	public void setCompanyHomeUrlFuzzy(String companyHomeUrlFuzzy) {
		this.companyHomeUrlFuzzy = companyHomeUrlFuzzy;
	}
	public String getRecTimeStart() {
		return recTimeStart;
	}
	public void setRecTimeStart(String recTimeStart) {
		this.recTimeStart = recTimeStart;
	}
	public String getRecTimeEnd() {
		return recTimeEnd;
	}
	public void setRecTimeEnd(String recTimeEnd) {
		this.recTimeEnd = recTimeEnd;
	}
	public String getModifyTimeStart() {
		return modifyTimeStart;
	}
	public void setModifyTimeStart(String modifyTimeStart) {
		this.modifyTimeStart = modifyTimeStart;
	}
	public String getModifyTimeEnd() {
		return modifyTimeEnd;
	}
	public void setModifyTimeEnd(String modifyTimeEnd) {
		this.modifyTimeEnd = modifyTimeEnd;
	}
	public String getQueryUrlFuzzy() {
		return queryUrlFuzzy;
	}
	public void setQueryUrlFuzzy(String queryUrlFuzzy) {
		this.queryUrlFuzzy = queryUrlFuzzy;
	}
}