package com.mall.entity.po;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.mall.enums.DataTimePatternEnum;
import com.mall.utils.DateUtils;


/**
 *  @Description: 短信记录表
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class SmsLog implements Serializable {

	/**
	 * ID
	 */
	@JsonIgnore
	private Long id;

	/**
	 * 用户id
	 */
	private String userId;

	/**
	 * 手机号码
	 */
	private String userPhone;

	/**
	 * 短信内容
	 */
	private String content;

	/**
	 * 手机验证码
	 */
	private String mobileCode;

	/**
	 * 短信类型  1:注册  2:验证
	 */
	private Integer type;

	/**
	 * 发送时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date recDate;

	/**
	 * 发送短信返回码
	 */
	private String responseCode;

	/**
	 * 状态  1:有效  0：失效
	 */
	@JsonIgnore
	private Integer status;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getMobileCode() {
		return mobileCode;
	}
	public void setMobileCode(String mobileCode) {
		this.mobileCode = mobileCode;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Date getRecDate() {
		return recDate;
	}
	public void setRecDate(Date recDate) {
		this.recDate = recDate;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "短信记录表: {"
				+ " \"ID\": \"" + (id == null ? "空" : id) + "\", "
				+ " \"用户id\": \"" + (userId == null ? "空" : userId) + "\", "
				+ " \"手机号码\": \"" + (userPhone == null ? "空" : userPhone) + "\", "
				+ " \"短信内容\": \"" + (content == null ? "空" : content) + "\", "
				+ " \"手机验证码\": \"" + (mobileCode == null ? "空" : mobileCode) + "\", "
				+ " \"短信类型  1:注册  2:验证\": \"" + (type == null ? "空" : type) + "\", "
				+ " \"发送时间\": \"" + (recDate == null ? "空" : DateUtils.format(recDate, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"发送短信返回码\": \"" + (responseCode == null ? "空" : responseCode) + "\", "
				+ " \"状态  1:有效  0：失效\": \"" + (status == null ? "空" : status) + "\" "
				+ "}";

	}
}