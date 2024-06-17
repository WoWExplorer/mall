package com.mall.entity.po;

import java.io.Serializable;



/**
 *  @Description: 
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class Transcity implements Serializable {

	/**
	 * 
	 */
	private Long transcityId;

	/**
	 * 运费项id
	 */
	private Long transfeeId;

	/**
	 * 城市id
	 */
	private Long cityId;

	public Long getTranscityId() {
		return transcityId;
	}
	public void setTranscityId(Long transcityId) {
		this.transcityId = transcityId;
	}
	public Long getTransfeeId() {
		return transfeeId;
	}
	public void setTransfeeId(Long transfeeId) {
		this.transfeeId = transfeeId;
	}
	public Long getCityId() {
		return cityId;
	}
	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}
	@Override
	public String toString() {
		return "Tz_transcity: {"
				+ " \"transcityId\": \"" + (transcityId == null ? "空" : transcityId) + "\", "
				+ " \"运费项id\": \"" + (transfeeId == null ? "空" : transfeeId) + "\", "
				+ " \"城市id\": \"" + (cityId == null ? "空" : cityId) + "\" "
				+ "}";

	}
}