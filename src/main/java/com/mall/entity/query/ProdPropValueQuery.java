package com.mall.entity.query;




/**
 *  @Description: 查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class ProdPropValueQuery extends BaseQuery {

	/**
	 * 属性值ID
	 */
	private Long valueId;

	/**
	 * 属性值名称
	 */
	private String propValue;
	private String propValueFuzzy;

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
	public String getPropValueFuzzy() {
		return propValueFuzzy;
	}
	public void setPropValueFuzzy(String propValueFuzzy) {
		this.propValueFuzzy = propValueFuzzy;
	}
}