package com.mall.entity.query;




/**
 *  @Description: 查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class CategoryPropQuery extends BaseQuery {

	/**
	 * 
	 */
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
}