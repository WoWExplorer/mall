package com.mall.entity.query;


import java.util.Date;


/**
 *  @Description: 品牌表查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class BrandQuery extends BaseQuery {

	/**
	 * 主键
	 */
	private Long brandId;

	/**
	 * 品牌名称
	 */
	private String brandName;
	private String brandNameFuzzy;

	/**
	 * 图片路径
	 */
	private String brandPic;
	private String brandPicFuzzy;

	/**
	 * 用户ID
	 */
	private String userId;
	private String userIdFuzzy;

	/**
	 * 备注
	 */
	private String memo;
	private String memoFuzzy;

	/**
	 * 顺序
	 */
	private Integer seq;

	/**
	 * 默认是1，表示正常状态,0为下线状态
	 */
	private Integer status;

	/**
	 * 简要描述
	 */
	private String brief;
	private String briefFuzzy;

	/**
	 * 内容
	 */
	private String content;
	private String contentFuzzy;

	/**
	 * 记录时间
	 */
	private Date recTime;
	private String recTimeStart;
	private String recTimeEnd;

	/**
	 * 更新时间
	 */
	private Date updateTime;
	private String updateTimeStart;
	private String updateTimeEnd;

	/**
	 * 品牌首字母
	 */
	private String firstChar;
	private String firstCharFuzzy;

	public Long getBrandId() {
		return brandId;
	}
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getBrandPic() {
		return brandPic;
	}
	public void setBrandPic(String brandPic) {
		this.brandPic = brandPic;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
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
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRecTime() {
		return recTime;
	}
	public void setRecTime(Date recTime) {
		this.recTime = recTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getFirstChar() {
		return firstChar;
	}
	public void setFirstChar(String firstChar) {
		this.firstChar = firstChar;
	}
	public String getBrandNameFuzzy() {
		return brandNameFuzzy;
	}
	public void setBrandNameFuzzy(String brandNameFuzzy) {
		this.brandNameFuzzy = brandNameFuzzy;
	}
	public String getBrandPicFuzzy() {
		return brandPicFuzzy;
	}
	public void setBrandPicFuzzy(String brandPicFuzzy) {
		this.brandPicFuzzy = brandPicFuzzy;
	}
	public String getUserIdFuzzy() {
		return userIdFuzzy;
	}
	public void setUserIdFuzzy(String userIdFuzzy) {
		this.userIdFuzzy = userIdFuzzy;
	}
	public String getMemoFuzzy() {
		return memoFuzzy;
	}
	public void setMemoFuzzy(String memoFuzzy) {
		this.memoFuzzy = memoFuzzy;
	}
	public String getBriefFuzzy() {
		return briefFuzzy;
	}
	public void setBriefFuzzy(String briefFuzzy) {
		this.briefFuzzy = briefFuzzy;
	}
	public String getContentFuzzy() {
		return contentFuzzy;
	}
	public void setContentFuzzy(String contentFuzzy) {
		this.contentFuzzy = contentFuzzy;
	}
	public String getRecTimeStart() {
		return recTimeStart;
	}
	public void setRecTimeStart(String recTimeStart) {
		this.recTimeStart = recTimeStart;
	}
	public String getRecTimeEnd() {
		return recTimeEnd;
	}
	public void setRecTimeEnd(String recTimeEnd) {
		this.recTimeEnd = recTimeEnd;
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
	public String getFirstCharFuzzy() {
		return firstCharFuzzy;
	}
	public void setFirstCharFuzzy(String firstCharFuzzy) {
		this.firstCharFuzzy = firstCharFuzzy;
	}
}