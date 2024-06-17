package com.mall.entity.query;




/**
 *  @Description: 查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class ProdPropQuery extends BaseQuery {

	/**
	 * 属性id
	 */
	private Long propId;

	/**
	 * 属性名称
	 */
	private String propName;
	private String propNameFuzzy;

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
	public String getPropNameFuzzy() {
		return propNameFuzzy;
	}
	public void setPropNameFuzzy(String propNameFuzzy) {
		this.propNameFuzzy = propNameFuzzy;
	}
}