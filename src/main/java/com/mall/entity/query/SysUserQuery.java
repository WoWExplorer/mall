package com.mall.entity.query;


import java.util.Date;


/**
 *  @Description: 系统用户查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class SysUserQuery extends BaseQuery {

	/**
	 * 
	 */
	private Long userId;

	/**
	 * 用户名
	 */
	private String username;
	private String usernameFuzzy;

	/**
	 * 密码
	 */
	private String password;
	private String passwordFuzzy;

	/**
	 * 邮箱
	 */
	private String email;
	private String emailFuzzy;

	/**
	 * 手机号
	 */
	private String mobile;
	private String mobileFuzzy;

	/**
	 * 状态  0：禁用   1：正常
	 */
	private Integer status;

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

	/**
	 * 用户所在的商城Id
	 */
	private Long shopId;

	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
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
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public String getUsernameFuzzy() {
		return usernameFuzzy;
	}
	public void setUsernameFuzzy(String usernameFuzzy) {
		this.usernameFuzzy = usernameFuzzy;
	}
	public String getPasswordFuzzy() {
		return passwordFuzzy;
	}
	public void setPasswordFuzzy(String passwordFuzzy) {
		this.passwordFuzzy = passwordFuzzy;
	}
	public String getEmailFuzzy() {
		return emailFuzzy;
	}
	public void setEmailFuzzy(String emailFuzzy) {
		this.emailFuzzy = emailFuzzy;
	}
	public String getMobileFuzzy() {
		return mobileFuzzy;
	}
	public void setMobileFuzzy(String mobileFuzzy) {
		this.mobileFuzzy = mobileFuzzy;
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