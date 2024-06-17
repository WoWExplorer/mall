package com.mall.entity.po;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 *  @Description: 
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class Transfee implements Serializable {

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
	@Override
	public String toString() {
		return "Tz_transfee: {"
				+ " \"运费项id\": \"" + (transfeeId == null ? "空" : transfeeId) + "\", "
				+ " \"运费模板id\": \"" + (transportId == null ? "空" : transportId) + "\", "
				+ " \"续件数量\": \"" + (continuousPiece == null ? "空" : continuousPiece) + "\", "
				+ " \"首件数量\": \"" + (firstPiece == null ? "空" : firstPiece) + "\", "
				+ " \"续件费用\": \"" + (continuousFee == null ? "空" : continuousFee) + "\", "
				+ " \"首件费用\": \"" + (firstFee == null ? "空" : firstFee) + "\" "
				+ "}";

	}
}