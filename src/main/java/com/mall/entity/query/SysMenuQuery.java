package com.mall.entity.query;




/**
 *  @Description: 菜单管理查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class SysMenuQuery extends BaseQuery {

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
	private String nameFuzzy;

	/**
	 * 菜单URL
	 */
	private String url;
	private String urlFuzzy;

	/**
	 * 授权(多个用逗号分隔，如：user:list,user:create)
	 */
	private String perms;
	private String permsFuzzy;

	/**
	 * 类型   0：目录   1：菜单   2：按钮
	 */
	private Integer type;

	/**
	 * 菜单图标
	 */
	private String icon;
	private String iconFuzzy;

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
	public String getNameFuzzy() {
		return nameFuzzy;
	}
	public void setNameFuzzy(String nameFuzzy) {
		this.nameFuzzy = nameFuzzy;
	}
	public String getUrlFuzzy() {
		return urlFuzzy;
	}
	public void setUrlFuzzy(String urlFuzzy) {
		this.urlFuzzy = urlFuzzy;
	}
	public String getPermsFuzzy() {
		return permsFuzzy;
	}
	public void setPermsFuzzy(String permsFuzzy) {
		this.permsFuzzy = permsFuzzy;
	}
	public String getIconFuzzy() {
		return iconFuzzy;
	}
	public void setIconFuzzy(String iconFuzzy) {
		this.iconFuzzy = iconFuzzy;
	}
}