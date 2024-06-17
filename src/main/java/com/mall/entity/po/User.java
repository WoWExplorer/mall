package com.mall.entity.po;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.mall.enums.DataTimePatternEnum;
import com.mall.utils.DateUtils;


/**
 *  @Description: 用户表
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class User implements Serializable {

	/**
	 * ID
	 */
	private String userId;

	/**
	 * 用户昵称
	 */
	private String nickName;

	/**
	 * 真实姓名
	 */
	private String realName;

	/**
	 * 用户邮箱
	 */
	private String userMail;

	/**
	 * 登录密码
	 */
	private String loginPassword;

	/**
	 * 支付密码
	 */
	private String payPassword;

	/**
	 * 手机号码
	 */
	private String userMobile;

	/**
	 * 修改时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date modifyTime;

	/**
	 * 注册时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date userRegtime;

	/**
	 * 注册IP
	 */
	private String userRegip;

	/**
	 * 最后登录时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date userLasttime;

	/**
	 * 最后登录IP
	 */
	private String userLastip;

	/**
	 * 备注
	 */
	private String userMemo;

	/**
	 * M(男) or F(女)
	 */
	private String sex;

	/**
	 * 例如：2009-11-27
	 */
	private String birthDate;

	/**
	 * 头像图片路径
	 */
	private String pic;

	/**
	 * 状态 1 正常 0 无效
	 */
	@JsonIgnore
	private Integer status;

	/**
	 * 用户积分
	 */
	private Integer score;

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getPayPassword() {
		return payPassword;
	}
	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public Date getUserRegtime() {
		return userRegtime;
	}
	public void setUserRegtime(Date userRegtime) {
		this.userRegtime = userRegtime;
	}
	public String getUserRegip() {
		return userRegip;
	}
	public void setUserRegip(String userRegip) {
		this.userRegip = userRegip;
	}
	public Date getUserLasttime() {
		return userLasttime;
	}
	public void setUserLasttime(Date userLasttime) {
		this.userLasttime = userLasttime;
	}
	public String getUserLastip() {
		return userLastip;
	}
	public void setUserLastip(String userLastip) {
		this.userLastip = userLastip;
	}
	public String getUserMemo() {
		return userMemo;
	}
	public void setUserMemo(String userMemo) {
		this.userMemo = userMemo;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "用户表: {"
				+ " \"ID\": \"" + (userId == null ? "空" : userId) + "\", "
				+ " \"用户昵称\": \"" + (nickName == null ? "空" : nickName) + "\", "
				+ " \"真实姓名\": \"" + (realName == null ? "空" : realName) + "\", "
				+ " \"用户邮箱\": \"" + (userMail == null ? "空" : userMail) + "\", "
				+ " \"登录密码\": \"" + (loginPassword == null ? "空" : loginPassword) + "\", "
				+ " \"支付密码\": \"" + (payPassword == null ? "空" : payPassword) + "\", "
				+ " \"手机号码\": \"" + (userMobile == null ? "空" : userMobile) + "\", "
				+ " \"修改时间\": \"" + (modifyTime == null ? "空" : DateUtils.format(modifyTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"注册时间\": \"" + (userRegtime == null ? "空" : DateUtils.format(userRegtime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"注册IP\": \"" + (userRegip == null ? "空" : userRegip) + "\", "
				+ " \"最后登录时间\": \"" + (userLasttime == null ? "空" : DateUtils.format(userLasttime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"最后登录IP\": \"" + (userLastip == null ? "空" : userLastip) + "\", "
				+ " \"备注\": \"" + (userMemo == null ? "空" : userMemo) + "\", "
				+ " \"M(男) or F(女)\": \"" + (sex == null ? "空" : sex) + "\", "
				+ " \"例如：2009-11-27\": \"" + (birthDate == null ? "空" : birthDate) + "\", "
				+ " \"头像图片路径\": \"" + (pic == null ? "空" : pic) + "\", "
				+ " \"状态 1 正常 0 无效\": \"" + (status == null ? "空" : status) + "\", "
				+ " \"用户积分\": \"" + (score == null ? "空" : score) + "\" "
				+ "}";

	}
}