package com.mall.entity.query;

import java.math.BigDecimal;


/**
 *  @Description: 查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class TransfeeFreeQuery extends BaseQuery {

	/**
	 * 指定条件包邮项id
	 */
	private Long transfeeFreeId;

	/**
	 * 运费模板id
	 */
	private Long transportId;

	/**
	 * 包邮方式 （0 满x件/重量/体积包邮 1满金额包邮 2满x件/重量/体积且满金额包邮）
	 */
	private Integer freeType;

	/**
	 * 需满金额
	 */
	private BigDecimal amount;

	/**
	 * 包邮x件/重量/体积
	 */
	private BigDecimal piece;

	public Long getTransfeeFreeId() {
		return transfeeFreeId;
	}
	public void setTransfeeFreeId(Long transfeeFreeId) {
		this.transfeeFreeId = transfeeFreeId;
	}
	public Long getTransportId() {
		return transportId;
	}
	public void setTransportId(Long transportId) {
		this.transportId = transportId;
	}
	public Integer getFreeType() {
		return freeType;
	}
	public void setFreeType(Integer freeType) {
		this.freeType = freeType;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public BigDecimal getPiece() {
		return piece;
	}
	public void setPiece(BigDecimal piece) {
		this.piece = piece;
	}
}