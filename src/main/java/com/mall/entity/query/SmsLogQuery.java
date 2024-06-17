package com.mall.entity.query;


import java.util.Date;


/**
 *  @Description: 短信记录表查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class SmsLogQuery extends BaseQuery {

	/**
	 * ID
	 */
	private Long id;

	/**
	 * 用户id
	 */
	private String userId;
	private String userIdFuzzy;

	/**
	 * 手机号码
	 */
	private String userPhone;
	private String userPhoneFuzzy;

	/**
	 * 短信内容
	 */
	private String content;
	private String contentFuzzy;

	/**
	 * 手机验证码
	 */
	private String mobileCode;
	private String mobileCodeFuzzy;

	/**
	 * 短信类型  1:注册  2:验证
	 */
	private Integer type;

	/**
	 * 发送时间
	 */
	private Date recDate;
	private String recDateStart;
	private String recDateEnd;

	/**
	 * 发送短信返回码
	 */
	private String responseCode;
	private String responseCodeFuzzy;

	/**
	 * 状态  1:有效  0：失效
	 */
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
	public String getUserIdFuzzy() {
		return userIdFuzzy;
	}
	public void setUserIdFuzzy(String userIdFuzzy) {
		this.userIdFuzzy = userIdFuzzy;
	}
	public String getUserPhoneFuzzy() {
		return userPhoneFuzzy;
	}
	public void setUserPhoneFuzzy(String userPhoneFuzzy) {
		this.userPhoneFuzzy = userPhoneFuzzy;
	}
	public String getContentFuzzy() {
		return contentFuzzy;
	}
	public void setContentFuzzy(String contentFuzzy) {
		this.contentFuzzy = contentFuzzy;
	}
	public String getMobileCodeFuzzy() {
		return mobileCodeFuzzy;
	}
	public void setMobileCodeFuzzy(String mobileCodeFuzzy) {
		this.mobileCodeFuzzy = mobileCodeFuzzy;
	}
	public String getRecDateStart() {
		return recDateStart;
	}
	public void setRecDateStart(String recDateStart) {
		this.recDateStart = recDateStart;
	}
	public String getRecDateEnd() {
		return recDateEnd;
	}
	public void setRecDateEnd(String recDateEnd) {
		this.recDateEnd = recDateEnd;
	}
	public String getResponseCodeFuzzy() {
		return responseCodeFuzzy;
	}
	public void setResponseCodeFuzzy(String responseCodeFuzzy) {
		this.responseCodeFuzzy = responseCodeFuzzy;
	}
}