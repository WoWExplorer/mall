package com.mall.entity.po;

import java.io.Serializable;



/**
 *  @Description: 
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class TranscityFree implements Serializable {

	/**
	 * 指定条件包邮城市项id
	 */
	private Long transcityFreeId;

	/**
	 * 指定条件包邮项id
	 */
	private Long transfeeFreeId;

	/**
	 * 城市id
	 */
	private Long freeCityId;

	public Long getTranscityFreeId() {
		return transcityFreeId;
	}
	public void setTranscityFreeId(Long transcityFreeId) {
		this.transcityFreeId = transcityFreeId;
	}
	public Long getTransfeeFreeId() {
		return transfeeFreeId;
	}
	public void setTransfeeFreeId(Long transfeeFreeId) {
		this.transfeeFreeId = transfeeFreeId;
	}
	public Long getFreeCityId() {
		return freeCityId;
	}
	public void setFreeCityId(Long freeCityId) {
		this.freeCityId = freeCityId;
	}
	@Override
	public String toString() {
		return "Tz_transcity_free: {"
				+ " \"指定条件包邮城市项id\": \"" + (transcityFreeId == null ? "空" : transcityFreeId) + "\", "
				+ " \"指定条件包邮项id\": \"" + (transfeeFreeId == null ? "空" : transfeeFreeId) + "\", "
				+ " \"城市id\": \"" + (freeCityId == null ? "空" : freeCityId) + "\" "
				+ "}";

	}
}