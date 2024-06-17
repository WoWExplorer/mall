package com.mall.entity.query;


import java.util.Date;


/**
 *  @Description: 主页轮播图查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class IndexImgQuery extends BaseQuery {

	/**
	 * 主键
	 */
	private Long imgId;

	/**
	 * 店铺ID
	 */
	private Long shopId;

	/**
	 * 图片
	 */
	private String imgUrl;
	private String imgUrlFuzzy;

	/**
	 * 说明文字,描述
	 */
	private String des;
	private String desFuzzy;

	/**
	 * 标题
	 */
	private String title;
	private String titleFuzzy;

	/**
	 * 链接
	 */
	private String link;
	private String linkFuzzy;

	/**
	 * 状态
	 */
	private Integer status;

	/**
	 * 顺序
	 */
	private Integer seq;

	/**
	 * 上传时间
	 */
	private Date uploadTime;
	private String uploadTimeStart;
	private String uploadTimeEnd;

	/**
	 * 关联
	 */
	private Long relation;

	/**
	 * 类型
	 */
	private Integer type;

	public Long getImgId() {
		return imgId;
	}
	public void setImgId(Long imgId) {
		this.imgId = imgId;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	public Date getUploadTime() {
		return uploadTime;
	}
	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}
	public Long getRelation() {
		return relation;
	}
	public void setRelation(Long relation) {
		this.relation = relation;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getImgUrlFuzzy() {
		return imgUrlFuzzy;
	}
	public void setImgUrlFuzzy(String imgUrlFuzzy) {
		this.imgUrlFuzzy = imgUrlFuzzy;
	}
	public String getDesFuzzy() {
		return desFuzzy;
	}
	public void setDesFuzzy(String desFuzzy) {
		this.desFuzzy = desFuzzy;
	}
	public String getTitleFuzzy() {
		return titleFuzzy;
	}
	public void setTitleFuzzy(String titleFuzzy) {
		this.titleFuzzy = titleFuzzy;
	}
	public String getLinkFuzzy() {
		return linkFuzzy;
	}
	public void setLinkFuzzy(String linkFuzzy) {
		this.linkFuzzy = linkFuzzy;
	}
	public String getUploadTimeStart() {
		return uploadTimeStart;
	}
	public void setUploadTimeStart(String uploadTimeStart) {
		this.uploadTimeStart = uploadTimeStart;
	}
	public String getUploadTimeEnd() {
		return uploadTimeEnd;
	}
	public void setUploadTimeEnd(String uploadTimeEnd) {
		this.uploadTimeEnd = uploadTimeEnd;
	}
}