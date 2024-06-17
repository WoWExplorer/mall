package com.mall.entity.po;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.mall.enums.DataTimePatternEnum;
import com.mall.utils.DateUtils;


/**
 *  @Description: 系统日志
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class SysLog implements Serializable {

	/**
	 * 
	 */
	@JsonIgnore
	private Long id;

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 用户操作
	 */
	private String operation;

	/**
	 * 请求方法
	 */
	private String method;

	/**
	 * 请求参数
	 */
	private String params;

	/**
	 * 执行时长(毫秒)
	 */
	private Long time;

	/**
	 * IP地址
	 */
	private String ip;

	/**
	 * 创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createDate;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getParams() {
		return params;
	}
	public void setParams(String params) {
		this.params = params;
	}
	public Long getTime() {
		return time;
	}
	public void setTime(Long time) {
		this.time = time;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "系统日志: {"
				+ " \"id\": \"" + (id == null ? "空" : id) + "\", "
				+ " \"用户名\": \"" + (username == null ? "空" : username) + "\", "
				+ " \"用户操作\": \"" + (operation == null ? "空" : operation) + "\", "
				+ " \"请求方法\": \"" + (method == null ? "空" : method) + "\", "
				+ " \"请求参数\": \"" + (params == null ? "空" : params) + "\", "
				+ " \"执行时长(毫秒)\": \"" + (time == null ? "空" : time) + "\", "
				+ " \"IP地址\": \"" + (ip == null ? "空" : ip) + "\", "
				+ " \"创建时间\": \"" + (createDate == null ? "空" : DateUtils.format(createDate, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\" "
				+ "}";

	}
}