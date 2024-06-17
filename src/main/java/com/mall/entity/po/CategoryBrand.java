package com.mall.entity.po;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 *  @Description: 
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class CategoryBrand implements Serializable {

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
	 * 品牌id
	 */
	private Long brandId;

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
	public Long getBrandId() {
		return brandId;
	}
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}
	@Override
	public String toString() {
		return "Tz_category_brand: {"
				+ " \"id\": \"" + (id == null ? "空" : id) + "\", "
				+ " \"分类id\": \"" + (categoryId == null ? "空" : categoryId) + "\", "
				+ " \"品牌id\": \"" + (brandId == null ? "空" : brandId) + "\" "
				+ "}";

	}
}