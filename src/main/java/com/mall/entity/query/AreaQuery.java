package com.mall.entity.query;




/**
 *  @Description: 查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class AreaQuery extends BaseQuery {

	/**
	 * 
	 */
	private Long areaId;

	/**
	 * 
	 */
	private String areaName;
	private String areaNameFuzzy;

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
	public String getAreaNameFuzzy() {
		return areaNameFuzzy;
	}
	public void setAreaNameFuzzy(String areaNameFuzzy) {
		this.areaNameFuzzy = areaNameFuzzy;
	}
}