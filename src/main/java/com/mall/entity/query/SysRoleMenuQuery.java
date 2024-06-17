package com.mall.entity.query;




/**
 *  @Description: 角色与菜单对应关系查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class SysRoleMenuQuery extends BaseQuery {

	/**
	 * 
	 */
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
}