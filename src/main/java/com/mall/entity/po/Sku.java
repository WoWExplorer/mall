package com.mall.entity.po;

import java.io.Serializable;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.mall.enums.DataTimePatternEnum;
import com.mall.utils.DateUtils;


/**
 *  @Description: 单品SKU表
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class Sku implements Serializable {

	/**
	 * 单品ID
	 */
	private Long skuId;

	/**
	 * 商品ID
	 */
	private Long prodId;

	/**
	 * 销售属性组合字符串 格式是p1:v1;p2:v2
	 */
	private String properties;

	/**
	 * 原价
	 */
	private BigDecimal oriPrice;

	/**
	 * 价格
	 */
	private BigDecimal price;

	/**
	 * 商品在付款减库存的状态下，该sku上未付款的订单数量
	 */
	private Integer stocks;

	/**
	 * 实际库存
	 */
	private Integer actualStocks;

	/**
	 * 修改时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

	/**
	 * 记录时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date recTime;

	/**
	 * 商家编码
	 */
	private String partyCode;

	/**
	 * 商品条形码
	 */
	private String modelId;

	/**
	 * sku图片
	 */
	private String pic;

	/**
	 * sku名称
	 */
	private String skuName;

	/**
	 * 商品名称
	 */
	private String prodName;

	/**
	 * 版本号
	 */
	private Integer version;

	/**
	 * 商品重量
	 */
	private BigDecimal weight;

	/**
	 * 商品体积
	 */
	private BigDecimal volume;

	/**
	 * 0 禁用 1 启用
	 */
	@JsonIgnore
	private Integer status;

	/**
	 * 0 正常 1 已被删除
	 */
	private Integer isDelete;

	public Long getSkuId() {
		return skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}
	public Long getProdId() {
		return prodId;
	}
	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}
	public String getProperties() {
		return properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}
	public BigDecimal getOriPrice() {
		return oriPrice;
	}
	public void setOriPrice(BigDecimal oriPrice) {
		this.oriPrice = oriPrice;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Integer getStocks() {
		return stocks;
	}
	public void setStocks(Integer stocks) {
		this.stocks = stocks;
	}
	public Integer getActualStocks() {
		return actualStocks;
	}
	public void setActualStocks(Integer actualStocks) {
		this.actualStocks = actualStocks;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Date getRecTime() {
		return recTime;
	}
	public void setRecTime(Date recTime) {
		this.recTime = recTime;
	}
	public String getPartyCode() {
		return partyCode;
	}
	public void setPartyCode(String partyCode) {
		this.partyCode = partyCode;
	}
	public String getModelId() {
		return modelId;
	}
	public void setModelId(String modelId) {
		this.modelId = modelId;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getSkuName() {
		return skuName;
	}
	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public BigDecimal getWeight() {
		return weight;
	}
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}
	public BigDecimal getVolume() {
		return volume;
	}
	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	@Override
	public String toString() {
		return "单品SKU表: {"
				+ " \"单品ID\": \"" + (skuId == null ? "空" : skuId) + "\", "
				+ " \"商品ID\": \"" + (prodId == null ? "空" : prodId) + "\", "
				+ " \"销售属性组合字符串 格式是p1:v1;p2:v2\": \"" + (properties == null ? "空" : properties) + "\", "
				+ " \"原价\": \"" + (oriPrice == null ? "空" : oriPrice) + "\", "
				+ " \"价格\": \"" + (price == null ? "空" : price) + "\", "
				+ " \"商品在付款减库存的状态下，该sku上未付款的订单数量\": \"" + (stocks == null ? "空" : stocks) + "\", "
				+ " \"实际库存\": \"" + (actualStocks == null ? "空" : actualStocks) + "\", "
				+ " \"修改时间\": \"" + (updateTime == null ? "空" : DateUtils.format(updateTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"记录时间\": \"" + (recTime == null ? "空" : DateUtils.format(recTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"商家编码\": \"" + (partyCode == null ? "空" : partyCode) + "\", "
				+ " \"商品条形码\": \"" + (modelId == null ? "空" : modelId) + "\", "
				+ " \"Sku图片\": \"" + (pic == null ? "空" : pic) + "\", "
				+ " \"Sku名称\": \"" + (skuName == null ? "空" : skuName) + "\", "
				+ " \"商品名称\": \"" + (prodName == null ? "空" : prodName) + "\", "
				+ " \"版本号\": \"" + (version == null ? "空" : version) + "\", "
				+ " \"商品重量\": \"" + (weight == null ? "空" : weight) + "\", "
				+ " \"商品体积\": \"" + (volume == null ? "空" : volume) + "\", "
				+ " \"0 禁用 1 启用\": \"" + (status == null ? "空" : status) + "\", "
				+ " \"0 正常 1 已被删除\": \"" + (isDelete == null ? "空" : isDelete) + "\" "
				+ "}";

	}
}