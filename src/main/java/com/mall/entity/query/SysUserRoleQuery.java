package com.mall.entity.query;




/**
 *  @Description: 用户与角色对应关系查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class SysUserRoleQuery extends BaseQuery {

	/**
	 * 
	 */
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
}