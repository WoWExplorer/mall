package com.mall.entity.query;




/**
 *  @Description: 查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class TranscityFreeQuery extends BaseQuery {

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
}