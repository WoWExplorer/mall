package com.mall.entity.query;




/**
 *  @Description: 系统配置信息表查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class SysConfigQuery extends BaseQuery {

	/**
	 * 
	 */
	private Long id;

	/**
	 * key
	 */
	private String paramKey;
	private String paramKeyFuzzy;

	/**
	 * value
	 */
	private String paramValue;
	private String paramValueFuzzy;

	/**
	 * 备注
	 */
	private String remark;
	private String remarkFuzzy;

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
	public String getParamKeyFuzzy() {
		return paramKeyFuzzy;
	}
	public void setParamKeyFuzzy(String paramKeyFuzzy) {
		this.paramKeyFuzzy = paramKeyFuzzy;
	}
	public String getParamValueFuzzy() {
		return paramValueFuzzy;
	}
	public void setParamValueFuzzy(String paramValueFuzzy) {
		this.paramValueFuzzy = paramValueFuzzy;
	}
	public String getRemarkFuzzy() {
		return remarkFuzzy;
	}
	public void setRemarkFuzzy(String remarkFuzzy) {
		this.remarkFuzzy = remarkFuzzy;
	}
}