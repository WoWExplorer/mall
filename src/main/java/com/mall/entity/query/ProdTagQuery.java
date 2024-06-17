package com.mall.entity.query;


import java.util.Date;


/**
 *  @Description: 商品分组表查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class ProdTagQuery extends BaseQuery {

	/**
	 * 分组标签id
	 */
	private Long id;

	/**
	 * 分组标题
	 */
	private String title;
	private String titleFuzzy;

	/**
	 * 店铺Id
	 */
	private Long shopId;

	/**
	 * 状态(1为正常,0为删除)
	 */
	private Integer status;

	/**
	 * 默认类型(0:商家自定义,1:系统默认)
	 */
	private Integer isDefault;

	/**
	 * 商品数量
	 */
	private Long prodCount;

	/**
	 * 列表样式(0:一列一个,1:一列两个,2:一列三个)
	 */
	private Integer style;

	/**
	 * 排序
	 */
	private Integer seq;

	/**
	 * 创建时间
	 */
	private Date createTime;
	private String createTimeStart;
	private String createTimeEnd;

	/**
	 * 修改时间
	 */
	private Date updateTime;
	private String updateTimeStart;
	private String updateTimeEnd;

	/**
	 * 删除时间
	 */
	private Date deleteTime;
	private String deleteTimeStart;
	private String deleteTimeEnd;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}
	public Long getProdCount() {
		return prodCount;
	}
	public void setProdCount(Long prodCount) {
		this.prodCount = prodCount;
	}
	public Integer getStyle() {
		return style;
	}
	public void setStyle(Integer style) {
		this.style = style;
	}
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Date getDeleteTime() {
		return deleteTime;
	}
	public void setDeleteTime(Date deleteTime) {
		this.deleteTime = deleteTime;
	}
	public String getTitleFuzzy() {
		return titleFuzzy;
	}
	public void setTitleFuzzy(String titleFuzzy) {
		this.titleFuzzy = titleFuzzy;
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
	public String getDeleteTimeStart() {
		return deleteTimeStart;
	}
	public void setDeleteTimeStart(String deleteTimeStart) {
		this.deleteTimeStart = deleteTimeStart;
	}
	public String getDeleteTimeEnd() {
		return deleteTimeEnd;
	}
	public void setDeleteTimeEnd(String deleteTimeEnd) {
		this.deleteTimeEnd = deleteTimeEnd;
	}
}