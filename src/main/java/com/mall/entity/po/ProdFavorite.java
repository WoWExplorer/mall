package com.mall.entity.po;

import java.io.Serializable;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.mall.enums.DataTimePatternEnum;
import com.mall.utils.DateUtils;


/**
 *  @Description: 商品收藏表
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class ProdFavorite implements Serializable {

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
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date recTime;

	/**
	 * 用户ID
	 */
	private String userId;

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
	@Override
	public String toString() {
		return "商品收藏表: {"
				+ " \"主键\": \"" + (favoriteId == null ? "空" : favoriteId) + "\", "
				+ " \"商品ID\": \"" + (prodId == null ? "空" : prodId) + "\", "
				+ " \"收藏时间\": \"" + (recTime == null ? "空" : DateUtils.format(recTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"用户ID\": \"" + (userId == null ? "空" : userId) + "\" "
				+ "}";

	}
}