package com.mall.entity.po;

import java.io.Serializable;



/**
 *  @Description: 
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class Area implements Serializable {

	/**
	 * 
	 */
	private Long areaId;

	/**
	 * 
	 */
	private String areaName;

	/**
	 * 
	 */
	private Long parentId;

	/**
	 * 
	 */
	private Integer level;

	public Long getAreaId() {
		return areaId;
	}
	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "Tz_area: {"
				+ " \"areaId\": \"" + (areaId == null ? "空" : areaId) + "\", "
				+ " \"areaName\": \"" + (areaName == null ? "空" : areaName) + "\", "
				+ " \"parentId\": \"" + (parentId == null ? "空" : parentId) + "\", "
				+ " \"level\": \"" + (level == null ? "空" : level) + "\" "
				+ "}";

	}
}