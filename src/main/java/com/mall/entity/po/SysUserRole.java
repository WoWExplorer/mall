package com.mall.entity.po;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 *  @Description: 用户与角色对应关系
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class SysUserRole implements Serializable {

	/**
	 * 
	 */
	@JsonIgnore
	private Long id;

	/**
	 * 用户ID
	 */
	private Long userId;

	/**
	 * 角色ID
	 */
	private Long roleId;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	@Override
	public String toString() {
		return "用户与角色对应关系: {"
				+ " \"id\": \"" + (id == null ? "空" : id) + "\", "
				+ " \"用户ID\": \"" + (userId == null ? "空" : userId) + "\", "
				+ " \"角色ID\": \"" + (roleId == null ? "空" : roleId) + "\" "
				+ "}";

	}
}