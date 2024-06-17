package com.mall.entity.po;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.mall.enums.DataTimePatternEnum;
import com.mall.utils.DateUtils;


/**
 *  @Description: 系统用户
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class SysUser implements Serializable {

	/**
	 * 
	 */
	private Long userId;

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 手机号
	 */
	private String mobile;

	/**
	 * 状态  0：禁用   1：正常
	 */
	@JsonIgnore
	private Integer status;

	/**
	 * 创建者ID
	 */
	private Long createUserId;

	/**
	 * 创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

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
	@Override
	public String toString() {
		return "系统用户: {"
				+ " \"userId\": \"" + (userId == null ? "空" : userId) + "\", "
				+ " \"用户名\": \"" + (username == null ? "空" : username) + "\", "
				+ " \"密码\": \"" + (password == null ? "空" : password) + "\", "
				+ " \"邮箱\": \"" + (email == null ? "空" : email) + "\", "
				+ " \"手机号\": \"" + (mobile == null ? "空" : mobile) + "\", "
				+ " \"状态  0：禁用   1：正常\": \"" + (status == null ? "空" : status) + "\", "
				+ " \"创建者ID\": \"" + (createUserId == null ? "空" : createUserId) + "\", "
				+ " \"创建时间\": \"" + (createTime == null ? "空" : DateUtils.format(createTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"用户所在的商城Id\": \"" + (shopId == null ? "空" : shopId) + "\" "
				+ "}";

	}
}