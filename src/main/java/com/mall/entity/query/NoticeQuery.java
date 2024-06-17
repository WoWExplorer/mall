package com.mall.entity.query;


import java.util.Date;


/**
 *  @Description: 查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class NoticeQuery extends BaseQuery {

	/**
	 * 公告id
	 */
	private Long id;

	/**
	 * 店铺id
	 */
	private Long shopId;

	/**
	 * 公告标题
	 */
	private String title;
	private String titleFuzzy;

	/**
	 * 公告内容
	 */
	private String content;
	private String contentFuzzy;

	/**
	 * 状态(1:公布 0:撤回)
	 */
	private Integer status;

	/**
	 * 是否置顶
	 */
	private Integer isTop;

	/**
	 * 发布时间
	 */
	private Date publishTime;
	private String publishTimeStart;
	private String publishTimeEnd;

	/**
	 * 更新时间
	 */
	private Date updateTime;
	private String updateTimeStart;
	private String updateTimeEnd;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getIsTop() {
		return isTop;
	}
	public void setIsTop(Integer isTop) {
		this.isTop = isTop;
	}
	public Date getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getTitleFuzzy() {
		return titleFuzzy;
	}
	public void setTitleFuzzy(String titleFuzzy) {
		this.titleFuzzy = titleFuzzy;
	}
	public String getContentFuzzy() {
		return contentFuzzy;
	}
	public void setContentFuzzy(String contentFuzzy) {
		this.contentFuzzy = contentFuzzy;
	}
	public String getPublishTimeStart() {
		return publishTimeStart;
	}
	public void setPublishTimeStart(String publishTimeStart) {
		this.publishTimeStart = publishTimeStart;
	}
	public String getPublishTimeEnd() {
		return publishTimeEnd;
	}
	public void setPublishTimeEnd(String publishTimeEnd) {
		this.publishTimeEnd = publishTimeEnd;
	}
	public String getUpdateTimeStart() {
		return updateTimeStart;
	}
	public void setUpdateTimeStart(String updateTimeStart) {
		this.updateTimeStart = updateTimeStart;
	}
	public String getUpdateTimeEnd() {
		return updateTimeEnd;
	}
	public void setUpdateTimeEnd(String updateTimeEnd) {
		this.updateTimeEnd = updateTimeEnd;
	}
}