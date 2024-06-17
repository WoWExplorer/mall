package com.mall.entity.po;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.mall.enums.DataTimePatternEnum;
import com.mall.utils.DateUtils;


/**
 *  @Description: 产品类目
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class Category implements Serializable {

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

	/**
	 * 类目图标
	 */
	private String icon;

	/**
	 * 类目的显示图片
	 */
	private String pic;

	/**
	 * 排序
	 */
	private Integer seq;

	/**
	 * 默认是1，表示正常状态,0为下线状态
	 */
	@JsonIgnore
	private Integer status;

	/**
	 * 记录时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date recTime;

	/**
	 * 分类层级
	 */
	private Integer grade;

	/**
	 * 更新时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

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
	@Override
	public String toString() {
		return "产品类目: {"
				+ " \"类目ID\": \"" + (categoryId == null ? "空" : categoryId) + "\", "
				+ " \"店铺ID\": \"" + (shopId == null ? "空" : shopId) + "\", "
				+ " \"父节点\": \"" + (parentId == null ? "空" : parentId) + "\", "
				+ " \"产品类目名称\": \"" + (categoryName == null ? "空" : categoryName) + "\", "
				+ " \"类目图标\": \"" + (icon == null ? "空" : icon) + "\", "
				+ " \"类目的显示图片\": \"" + (pic == null ? "空" : pic) + "\", "
				+ " \"排序\": \"" + (seq == null ? "空" : seq) + "\", "
				+ " \"默认是1，表示正常状态,0为下线状态\": \"" + (status == null ? "空" : status) + "\", "
				+ " \"记录时间\": \"" + (recTime == null ? "空" : DateUtils.format(recTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"分类层级\": \"" + (grade == null ? "空" : grade) + "\", "
				+ " \"更新时间\": \"" + (updateTime == null ? "空" : DateUtils.format(updateTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\" "
				+ "}";

	}
}