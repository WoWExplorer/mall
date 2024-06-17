package com.mall.entity.query;


import java.util.Date;


/**
 *  @Description: 查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class TransportQuery extends BaseQuery {

	/**
	 * 运费模板id
	 */
	private Long transportId;

	/**
	 * 运费模板名称
	 */
	private String transName;
	private String transNameFuzzy;

	/**
	 * 创建时间
	 */
	private Date createTime;
	private String createTimeStart;
	private String createTimeEnd;

	/**
	 * 店铺id
	 */
	private Long shopId;

	/**
	 * 收费方式（0 按件数,1 按重量 2 按体积）
	 */
	private Integer chargeType;

	/**
	 * 是否包邮 0:不包邮 1:包邮
	 */
	private Integer isFreeFee;

	/**
	 * 是否含有包邮条件 0 否 1是
	 */
	private Integer hasFreeCondition;

	public Long getTransportId() {
		return transportId;
	}
	public void setTransportId(Long transportId) {
		this.transportId = transportId;
	}
	public String getTransName() {
		return transName;
	}
	public void setTransName(String transName) {
		this.transName = transName;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public Integer getChargeType() {
		return chargeType;
	}
	public void setChargeType(Integer chargeType) {
		this.chargeType = chargeType;
	}
	public Integer getIsFreeFee() {
		return isFreeFee;
	}
	public void setIsFreeFee(Integer isFreeFee) {
		this.isFreeFee = isFreeFee;
	}
	public Integer getHasFreeCondition() {
		return hasFreeCondition;
	}
	public void setHasFreeCondition(Integer hasFreeCondition) {
		this.hasFreeCondition = hasFreeCondition;
	}
	public String getTransNameFuzzy() {
		return transNameFuzzy;
	}
	public void setTransNameFuzzy(String transNameFuzzy) {
		this.transNameFuzzy = transNameFuzzy;
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
}