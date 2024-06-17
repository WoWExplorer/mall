package com.mall.entity.query;


import java.util.Date;


/**
 *  @Description: 商品收藏表查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class ProdFavoriteQuery extends BaseQuery {

	/**
	 * 主键
	 */
	private Long favoriteId;

	/**
	 * 商品ID
	 */
	private Long prodId;

	/**
	 * 收藏时间
	 */
	private Date recTime;
	private String recTimeStart;
	private String recTimeEnd;

	/**
	 * 用户ID
	 */
	private String userId;
	private String userIdFuzzy;

	public Long getFavoriteId() {
		return favoriteId;
	}
	public void setFavoriteId(Long favoriteId) {
		this.favoriteId = favoriteId;
	}
	public Long getProdId() {
		return prodId;
	}
	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}
	public Date getRecTime() {
		return recTime;
	}
	public void setRecTime(Date recTime) {
		this.recTime = recTime;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public String getUserIdFuzzy() {
		return userIdFuzzy;
	}
	public void setUserIdFuzzy(String userIdFuzzy) {
		this.userIdFuzzy = userIdFuzzy;
	}
}