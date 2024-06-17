package com.mall.entity.po;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 *  @Description: 系统配置信息表
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class SysConfig implements Serializable {

	/**
	 * 
	 */
	@JsonIgnore
	private Long id;

	/**
	 * key
	 */
	private String paramKey;

	/**
	 * value
	 */
	private String paramValue;

	/**
	 * 备注
	 */
	private String remark;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getParamKey() {
		return paramKey;
	}
	public void setParamKey(String paramKey) {
		this.paramKey = paramKey;
	}
	public String getParamValue() {
		return paramValue;
	}
	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "系统配置信息表: {"
				+ " \"id\": \"" + (id == null ? "空" : id) + "\", "
				+ " \"Key\": \"" + (paramKey == null ? "空" : paramKey) + "\", "
				+ " \"Value\": \"" + (paramValue == null ? "空" : paramValue) + "\", "
				+ " \"备注\": \"" + (remark == null ? "空" : remark) + "\" "
				+ "}";

	}
}