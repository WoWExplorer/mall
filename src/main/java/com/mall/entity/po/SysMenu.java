package com.mall.entity.po;

import java.io.Serializable;



/**
 *  @Description: 菜单管理
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class SysMenu implements Serializable {

	/**
	 * 
	 */
	private Long menuId;

	/**
	 * 父菜单ID，一级菜单为0
	 */
	private Long parentId;

	/**
	 * 菜单名称
	 */
	private String name;

	/**
	 * 菜单URL
	 */
	private String url;

	/**
	 * 授权(多个用逗号分隔，如：user:list,user:create)
	 */
	private String perms;

	/**
	 * 类型   0：目录   1：菜单   2：按钮
	 */
	private Integer type;

	/**
	 * 菜单图标
	 */
	private String icon;

	/**
	 * 排序
	 */
	private Integer orderNum;

	public Long getMenuId() {
		return menuId;
	}
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPerms() {
		return perms;
	}
	public void setPerms(String perms) {
		this.perms = perms;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public Integer getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	@Override
	public String toString() {
		return "菜单管理: {"
				+ " \"menuId\": \"" + (menuId == null ? "空" : menuId) + "\", "
				+ " \"父菜单ID，一级菜单为0\": \"" + (parentId == null ? "空" : parentId) + "\", "
				+ " \"菜单名称\": \"" + (name == null ? "空" : name) + "\", "
				+ " \"菜单URL\": \"" + (url == null ? "空" : url) + "\", "
				+ " \"授权(多个用逗号分隔，如：user:list,user:create)\": \"" + (perms == null ? "空" : perms) + "\", "
				+ " \"类型   0：目录   1：菜单   2：按钮\": \"" + (type == null ? "空" : type) + "\", "
				+ " \"菜单图标\": \"" + (icon == null ? "空" : icon) + "\", "
				+ " \"排序\": \"" + (orderNum == null ? "空" : orderNum) + "\" "
				+ "}";

	}
}