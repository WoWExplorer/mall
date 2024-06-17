package com.mall.entity.query;




/**
 *  @Description: 查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class TranscityQuery extends BaseQuery {

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
}