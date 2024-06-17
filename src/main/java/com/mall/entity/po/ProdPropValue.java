package com.mall.entity.po;

import java.io.Serializable;



/**
 *  @Description: 
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class ProdPropValue implements Serializable {

	/**
	 * 属性值ID
	 */
	private Long valueId;

	/**
	 * 属性值名称
	 */
	private String propValue;

	/**
	 * 属性ID
	 */
	private Long propId;

	public Long getValueId() {
		return valueId;
	}
	public void setValueId(Long valueId) {
		this.valueId = valueId;
	}
	public String getPropValue() {
		return propValue;
	}
	public void setPropValue(String propValue) {
		this.propValue = propValue;
	}
	public Long getPropId() {
		return propId;
	}
	public void setPropId(Long propId) {
		this.propId = propId;
	}
	@Override
	public String toString() {
		return "Tz_prod_prop_value: {"
				+ " \"属性值ID\": \"" + (valueId == null ? "空" : valueId) + "\", "
				+ " \"属性值名称\": \"" + (propValue == null ? "空" : propValue) + "\", "
				+ " \"属性ID\": \"" + (propId == null ? "空" : propId) + "\" "
				+ "}";

	}
}