package com.mall.entity.query;


import java.util.Date;


/**
 *  @Description: 角色查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class SysRoleQuery extends BaseQuery {

	/**
	 * 
	 */
	private Long roleId;

	/**
	 * 角色名称
	 */
	private String roleName;
	private String roleNameFuzzy;

	/**
	 * 备注
	 */
	private String remark;
	private String remarkFuzzy;

	/**
	 * 创建者ID
	 */
	private Long createUserId;

	/**
	 * 创建时间
	 */
	private Date createTime;
	private String createTimeStart;
	private String createTimeEnd;

	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Long getCreateUserId() {
		return createUserId;
	}
	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getRoleNameFuzzy() {
		return roleNameFuzzy;
	}
	public void setRoleNameFuzzy(String roleNameFuzzy) {
		this.roleNameFuzzy = roleNameFuzzy;
	}
	public String getRemarkFuzzy() {
		return remarkFuzzy;
	}
	public void setRemarkFuzzy(String remarkFuzzy) {
		this.remarkFuzzy = remarkFuzzy;
	}
	public String getCreateTimeStart() {
		return createTimeStart;
	}
	public void setCreateTimeStart(String createTimeStart) {
		this.createTimeStart = createTimeStart;
	}
	public String getCreateTimeEnd() {
		return createTimeEnd;
	}
	public void setCreateTimeEnd(String createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
	}
}