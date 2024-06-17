package com.mall.entity.query;


import java.util.Date;


/**
 *  @Description: 用户表查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class UserQuery extends BaseQuery {

	/**
	 * ID
	 */
	private String userId;
	private String userIdFuzzy;

	/**
	 * 用户昵称
	 */
	private String nickName;
	private String nickNameFuzzy;

	/**
	 * 真实姓名
	 */
	private String realName;
	private String realNameFuzzy;

	/**
	 * 用户邮箱
	 */
	private String userMail;
	private String userMailFuzzy;

	/**
	 * 登录密码
	 */
	private String loginPassword;
	private String loginPasswordFuzzy;

	/**
	 * 支付密码
	 */
	private String payPassword;
	private String payPasswordFuzzy;

	/**
	 * 手机号码
	 */
	private String userMobile;
	private String userMobileFuzzy;

	/**
	 * 修改时间
	 */
	private Date modifyTime;
	private String modifyTimeStart;
	private String modifyTimeEnd;

	/**
	 * 注册时间
	 */
	private Date userRegtime;
	private String userRegtimeStart;
	private String userRegtimeEnd;

	/**
	 * 注册IP
	 */
	private String userRegip;
	private String userRegipFuzzy;

	/**
	 * 最后登录时间
	 */
	private Date userLasttime;
	private String userLasttimeStart;
	private String userLasttimeEnd;

	/**
	 * 最后登录IP
	 */
	private String userLastip;
	private String userLastipFuzzy;

	/**
	 * 备注
	 */
	private String userMemo;
	private String userMemoFuzzy;

	/**
	 * M(男) or F(女)
	 */
	private String sex;
	private String sexFuzzy;

	/**
	 * 例如：2009-11-27
	 */
	private String birthDate;
	private String birthDateFuzzy;

	/**
	 * 头像图片路径
	 */
	private String pic;
	private String picFuzzy;

	/**
	 * 状态 1 正常 0 无效
	 */
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
	public String getUserIdFuzzy() {
		return userIdFuzzy;
	}
	public void setUserIdFuzzy(String userIdFuzzy) {
		this.userIdFuzzy = userIdFuzzy;
	}
	public String getNickNameFuzzy() {
		return nickNameFuzzy;
	}
	public void setNickNameFuzzy(String nickNameFuzzy) {
		this.nickNameFuzzy = nickNameFuzzy;
	}
	public String getRealNameFuzzy() {
		return realNameFuzzy;
	}
	public void setRealNameFuzzy(String realNameFuzzy) {
		this.realNameFuzzy = realNameFuzzy;
	}
	public String getUserMailFuzzy() {
		return userMailFuzzy;
	}
	public void setUserMailFuzzy(String userMailFuzzy) {
		this.userMailFuzzy = userMailFuzzy;
	}
	public String getLoginPasswordFuzzy() {
		return loginPasswordFuzzy;
	}
	public void setLoginPasswordFuzzy(String loginPasswordFuzzy) {
		this.loginPasswordFuzzy = loginPasswordFuzzy;
	}
	public String getPayPasswordFuzzy() {
		return payPasswordFuzzy;
	}
	public void setPayPasswordFuzzy(String payPasswordFuzzy) {
		this.payPasswordFuzzy = payPasswordFuzzy;
	}
	public String getUserMobileFuzzy() {
		return userMobileFuzzy;
	}
	public void setUserMobileFuzzy(String userMobileFuzzy) {
		this.userMobileFuzzy = userMobileFuzzy;
	}
	public String getModifyTimeStart() {
		return modifyTimeStart;
	}
	public void setModifyTimeStart(String modifyTimeStart) {
		this.modifyTimeStart = modifyTimeStart;
	}
	public String getModifyTimeEnd() {
		return modifyTimeEnd;
	}
	public void setModifyTimeEnd(String modifyTimeEnd) {
		this.modifyTimeEnd = modifyTimeEnd;
	}
	public String getUserRegtimeStart() {
		return userRegtimeStart;
	}
	public void setUserRegtimeStart(String userRegtimeStart) {
		this.userRegtimeStart = userRegtimeStart;
	}
	public String getUserRegtimeEnd() {
		return userRegtimeEnd;
	}
	public void setUserRegtimeEnd(String userRegtimeEnd) {
		this.userRegtimeEnd = userRegtimeEnd;
	}
	public String getUserRegipFuzzy() {
		return userRegipFuzzy;
	}
	public void setUserRegipFuzzy(String userRegipFuzzy) {
		this.userRegipFuzzy = userRegipFuzzy;
	}
	public String getUserLasttimeStart() {
		return userLasttimeStart;
	}
	public void setUserLasttimeStart(String userLasttimeStart) {
		this.userLasttimeStart = userLasttimeStart;
	}
	public String getUserLasttimeEnd() {
		return userLasttimeEnd;
	}
	public void setUserLasttimeEnd(String userLasttimeEnd) {
		this.userLasttimeEnd = userLasttimeEnd;
	}
	public String getUserLastipFuzzy() {
		return userLastipFuzzy;
	}
	public void setUserLastipFuzzy(String userLastipFuzzy) {
		this.userLastipFuzzy = userLastipFuzzy;
	}
	public String getUserMemoFuzzy() {
		return userMemoFuzzy;
	}
	public void setUserMemoFuzzy(String userMemoFuzzy) {
		this.userMemoFuzzy = userMemoFuzzy;
	}
	public String getSexFuzzy() {
		return sexFuzzy;
	}
	public void setSexFuzzy(String sexFuzzy) {
		this.sexFuzzy = sexFuzzy;
	}
	public String getBirthDateFuzzy() {
		return birthDateFuzzy;
	}
	public void setBirthDateFuzzy(String birthDateFuzzy) {
		this.birthDateFuzzy = birthDateFuzzy;
	}
	public String getPicFuzzy() {
		return picFuzzy;
	}
	public void setPicFuzzy(String picFuzzy) {
		this.picFuzzy = picFuzzy;
	}
}