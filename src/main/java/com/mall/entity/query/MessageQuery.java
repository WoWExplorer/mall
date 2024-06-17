package com.mall.entity.query;


import java.util.Date;


/**
 *  @Description: 查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class MessageQuery extends BaseQuery {

	/**
	 * 
	 */
	private Long id;

	/**
	 * 留言创建时间
	 */
	private Date createTime;
	private String createTimeStart;
	private String createTimeEnd;

	/**
	 * 姓名
	 */
	private String userName;
	private String userNameFuzzy;

	/**
	 * 邮箱
	 */
	private String email;
	private String emailFuzzy;

	/**
	 * 联系方式
	 */
	private String contact;
	private String contactFuzzy;

	/**
	 * 留言内容
	 */
	private String content;
	private String contentFuzzy;

	/**
	 * 留言回复
	 */
	private String reply;
	private String replyFuzzy;

	/**
	 * 状态：0:未审核 1审核通过
	 */
	private Integer status;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
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
	public String getUserNameFuzzy() {
		return userNameFuzzy;
	}
	public void setUserNameFuzzy(String userNameFuzzy) {
		this.userNameFuzzy = userNameFuzzy;
	}
	public String getEmailFuzzy() {
		return emailFuzzy;
	}
	public void setEmailFuzzy(String emailFuzzy) {
		this.emailFuzzy = emailFuzzy;
	}
	public String getContactFuzzy() {
		return contactFuzzy;
	}
	public void setContactFuzzy(String contactFuzzy) {
		this.contactFuzzy = contactFuzzy;
	}
	public String getContentFuzzy() {
		return contentFuzzy;
	}
	public void setContentFuzzy(String contentFuzzy) {
		this.contentFuzzy = contentFuzzy;
	}
	public String getReplyFuzzy() {
		return replyFuzzy;
	}
	public void setReplyFuzzy(String replyFuzzy) {
		this.replyFuzzy = replyFuzzy;
	}
}