package com.mall.entity.po;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 *  @Description: 角色与菜单对应关系
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class SysRoleMenu implements Serializable {

	/**
	 * 
	 */
	@JsonIgnore
	private Long id;

	/**
	 * 角色ID
	 */
	private Long roleId;

	/**
	 * 菜单ID
	 */
	private Long menuId;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public Long getMenuId() {
		return menuId;
	}
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
	@Override
	public String toString() {
		return "角色与菜单对应关系: {"
				+ " \"id\": \"" + (id == null ? "空" : id) + "\", "
				+ " \"角色ID\": \"" + (roleId == null ? "空" : roleId) + "\", "
				+ " \"菜单ID\": \"" + (menuId == null ? "空" : menuId) + "\" "
				+ "}";

	}
}