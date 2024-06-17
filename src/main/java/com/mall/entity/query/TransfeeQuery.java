package com.mall.entity.query;

import java.math.BigDecimal;


/**
 *  @Description: 查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class TransfeeQuery extends BaseQuery {

	/**
	 * 运费项id
	 */
	private Long transfeeId;

	/**
	 * 运费模板id
	 */
	private Long transportId;

	/**
	 * 续件数量
	 */
	private BigDecimal continuousPiece;

	/**
	 * 首件数量
	 */
	private BigDecimal firstPiece;

	/**
	 * 续件费用
	 */
	private BigDecimal continuousFee;

	/**
	 * 首件费用
	 */
	private BigDecimal firstFee;

	public Long getTransfeeId() {
		return transfeeId;
	}
	public void setTransfeeId(Long transfeeId) {
		this.transfeeId = transfeeId;
	}
	public Long getTransportId() {
		return transportId;
	}
	public void setTransportId(Long transportId) {
		this.transportId = transportId;
	}
	public BigDecimal getContinuousPiece() {
		return continuousPiece;
	}
	public void setContinuousPiece(BigDecimal continuousPiece) {
		this.continuousPiece = continuousPiece;
	}
	public BigDecimal getFirstPiece() {
		return firstPiece;
	}
	public void setFirstPiece(BigDecimal firstPiece) {
		this.firstPiece = firstPiece;
	}
	public BigDecimal getContinuousFee() {
		return continuousFee;
	}
	public void setContinuousFee(BigDecimal continuousFee) {
		this.continuousFee = continuousFee;
	}
	public BigDecimal getFirstFee() {
		return firstFee;
	}
	public void setFirstFee(BigDecimal firstFee) {
		this.firstFee = firstFee;
	}
}