package com.mall.entity.query;


import java.util.Date;


/**
 *  @Description: 产品类目查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class CategoryQuery extends BaseQuery {

	/**
	 * 类目ID
	 */
	private Long categoryId;

	/**
	 * 店铺ID
	 */
	private Long shopId;

	/**
	 * 父节点
	 */
	private Long parentId;

	/**
	 * 产品类目名称
	 */
	private String categoryName;
	private String categoryNameFuzzy;

	/**
	 * 类目图标
	 */
	private String icon;
	private String iconFuzzy;

	/**
	 * 类目的显示图片
	 */
	private String pic;
	private String picFuzzy;

	/**
	 * 排序
	 */
	private Integer seq;

	/**
	 * 默认是1，表示正常状态,0为下线状态
	 */
	private Integer status;

	/**
	 * 记录时间
	 */
	private Date recTime;
	private String recTimeStart;
	private String recTimeEnd;

	/**
	 * 分类层级
	 */
	private Integer grade;

	/**
	 * 更新时间
	 */
	private Date updateTime;
	private String updateTimeStart;
	private String updateTimeEnd;

	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getRecTime() {
		return recTime;
	}
	public void setRecTime(Date recTime) {
		this.recTime = recTime;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getCategoryNameFuzzy() {
		return categoryNameFuzzy;
	}
	public void setCategoryNameFuzzy(String categoryNameFuzzy) {
		this.categoryNameFuzzy = categoryNameFuzzy;
	}
	public String getIconFuzzy() {
		return iconFuzzy;
	}
	public void setIconFuzzy(String iconFuzzy) {
		this.iconFuzzy = iconFuzzy;
	}
	public String getPicFuzzy() {
		return picFuzzy;
	}
	public void setPicFuzzy(String picFuzzy) {
		this.picFuzzy = picFuzzy;
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
	public String getUpdateTimeStart() {
		return updateTimeStart;
	}
	public void setUpdateTimeStart(String updateTimeStart) {
		this.updateTimeStart = updateTimeStart;
	}
	public String getUpdateTimeEnd() {
		return updateTimeEnd;
	}
	public void setUpdateTimeEnd(String updateTimeEnd) {
		this.updateTimeEnd = updateTimeEnd;
	}
}