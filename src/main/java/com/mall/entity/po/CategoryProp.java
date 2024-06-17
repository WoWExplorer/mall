package com.mall.entity.po;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 *  @Description: 
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class CategoryProp implements Serializable {

	/**
	 * 
	 */
	@JsonIgnore
	private Long id;

	/**
	 * 分类id
	 */
	private Long categoryId;

	/**
	 * 商品属性id即表tz_prod_prop中的prop_id
	 */
	private Long propId;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public Long getPropId() {
		return propId;
	}
	public void setPropId(Long propId) {
		this.propId = propId;
	}
	@Override
	public String toString() {
		return "Tz_category_prop: {"
				+ " \"id\": \"" + (id == null ? "空" : id) + "\", "
				+ " \"分类id\": \"" + (categoryId == null ? "空" : categoryId) + "\", "
				+ " \"商品属性id即表tz_prod_prop中的prop_id\": \"" + (propId == null ? "空" : propId) + "\" "
				+ "}";

	}
}