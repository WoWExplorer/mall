package com.mall.entity.query;


import java.util.Date;


/**
 *  @Description: 系统日志查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class SysLogQuery extends BaseQuery {

	/**
	 * 
	 */
	private Long id;

	/**
	 * 用户名
	 */
	private String username;
	private String usernameFuzzy;

	/**
	 * 用户操作
	 */
	private String operation;
	private String operationFuzzy;

	/**
	 * 请求方法
	 */
	private String method;
	private String methodFuzzy;

	/**
	 * 请求参数
	 */
	private String params;
	private String paramsFuzzy;

	/**
	 * 执行时长(毫秒)
	 */
	private Long time;

	/**
	 * IP地址
	 */
	private String ip;
	private String ipFuzzy;

	/**
	 * 创建时间
	 */
	private Date createDate;
	private String createDateStart;
	private String createDateEnd;

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
	public String getUsernameFuzzy() {
		return usernameFuzzy;
	}
	public void setUsernameFuzzy(String usernameFuzzy) {
		this.usernameFuzzy = usernameFuzzy;
	}
	public String getOperationFuzzy() {
		return operationFuzzy;
	}
	public void setOperationFuzzy(String operationFuzzy) {
		this.operationFuzzy = operationFuzzy;
	}
	public String getMethodFuzzy() {
		return methodFuzzy;
	}
	public void setMethodFuzzy(String methodFuzzy) {
		this.methodFuzzy = methodFuzzy;
	}
	public String getParamsFuzzy() {
		return paramsFuzzy;
	}
	public void setParamsFuzzy(String paramsFuzzy) {
		this.paramsFuzzy = paramsFuzzy;
	}
	public String getIpFuzzy() {
		return ipFuzzy;
	}
	public void setIpFuzzy(String ipFuzzy) {
		this.ipFuzzy = ipFuzzy;
	}
	public String getCreateDateStart() {
		return createDateStart;
	}
	public void setCreateDateStart(String createDateStart) {
		this.createDateStart = createDateStart;
	}
	public String getCreateDateEnd() {
		return createDateEnd;
	}
	public void setCreateDateEnd(String createDateEnd) {
		this.createDateEnd = createDateEnd;
	}
}