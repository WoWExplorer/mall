package com.mall.entity.po;

import java.io.Serializable;



/**
 *  @Description: 
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class ProdProp implements Serializable {

	/**
	 * 属性id
	 */
	private Long propId;

	/**
	 * 属性名称
	 */
	private String propName;

	/**
	 * ProdPropRule 1:销售属性(规格); 2:参数属性;
	 */
	private Integer rule;

	/**
	 * 店铺id
	 */
	private Long shopId;

	public Long getPropId() {
		return propId;
	}
	public void setPropId(Long propId) {
		this.propId = propId;
	}
	public String getPropName() {
		return propName;
	}
	public void setPropName(String propName) {
		this.propName = propName;
	}
	public Integer getRule() {
		return rule;
	}
	public void setRule(Integer rule) {
		this.rule = rule;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	@Override
	public String toString() {
		return "Tz_prod_prop: {"
				+ " \"属性id\": \"" + (propId == null ? "空" : propId) + "\", "
				+ " \"属性名称\": \"" + (propName == null ? "空" : propName) + "\", "
				+ " \"ProdPropRule 1:销售属性(规格); 2:参数属性;\": \"" + (rule == null ? "空" : rule) + "\", "
				+ " \"店铺id\": \"" + (shopId == null ? "空" : shopId) + "\" "
				+ "}";

	}
}