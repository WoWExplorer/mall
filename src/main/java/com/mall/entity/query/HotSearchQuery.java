package com.mall.entity.query;


import java.util.Date;


/**
 *  @Description: 热搜查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class HotSearchQuery extends BaseQuery {

	/**
	 * 主键
	 */
	private Long hotSearchId;

	/**
	 * 店铺ID 0为全局热搜
	 */
	private Long shopId;

	/**
	 * 内容
	 */
	private String content;
	private String contentFuzzy;

	/**
	 * 录入时间
	 */
	private Date recDate;
	private String recDateStart;
	private String recDateEnd;

	/**
	 * 顺序
	 */
	private Integer seq;

	/**
	 * 状态 0下线 1上线
	 */
	private Integer status;

	/**
	 * 热搜标题
	 */
	private String title;
	private String titleFuzzy;

	public Long getHotSearchId() {
		return hotSearchId;
	}
	public void setHotSearchId(Long hotSearchId) {
		this.hotSearchId = hotSearchId;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRecDate() {
		return recDate;
	}
	public void setRecDate(Date recDate) {
		this.recDate = recDate;
	}
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContentFuzzy() {
		return contentFuzzy;
	}
	public void setContentFuzzy(String contentFuzzy) {
		this.contentFuzzy = contentFuzzy;
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
	public String getTitleFuzzy() {
		return titleFuzzy;
	}
	public void setTitleFuzzy(String titleFuzzy) {
		this.titleFuzzy = titleFuzzy;
	}
}