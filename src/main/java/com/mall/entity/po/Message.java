package com.mall.entity.po;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.mall.enums.DataTimePatternEnum;
import com.mall.utils.DateUtils;


/**
 *  @Description: 
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class Message implements Serializable {

	/**
	 * 
	 */
	@JsonIgnore
	private Long id;

	/**
	 * 留言创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/**
	 * 姓名
	 */
	private String userName;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 联系方式
	 */
	private String contact;

	/**
	 * 留言内容
	 */
	private String content;

	/**
	 * 留言回复
	 */
	private String reply;

	/**
	 * 状态：0:未审核 1审核通过
	 */
	@JsonIgnore
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
	@Override
	public String toString() {
		return "Tz_message: {"
				+ " \"id\": \"" + (id == null ? "空" : id) + "\", "
				+ " \"留言创建时间\": \"" + (createTime == null ? "空" : DateUtils.format(createTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"姓名\": \"" + (userName == null ? "空" : userName) + "\", "
				+ " \"邮箱\": \"" + (email == null ? "空" : email) + "\", "
				+ " \"联系方式\": \"" + (contact == null ? "空" : contact) + "\", "
				+ " \"留言内容\": \"" + (content == null ? "空" : content) + "\", "
				+ " \"留言回复\": \"" + (reply == null ? "空" : reply) + "\", "
				+ " \"状态：0:未审核 1审核通过\": \"" + (status == null ? "空" : status) + "\" "
				+ "}";

	}
}