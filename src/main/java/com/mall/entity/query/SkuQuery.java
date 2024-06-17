package com.mall.entity.query;

import java.math.BigDecimal;
import java.util.Date;


/**
 *  @Description: 单品SKU表查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class SkuQuery extends BaseQuery {

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
	private String propertiesFuzzy;

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
	private Date updateTime;
	private String updateTimeStart;
	private String updateTimeEnd;

	/**
	 * 记录时间
	 */
	private Date recTime;
	private String recTimeStart;
	private String recTimeEnd;

	/**
	 * 商家编码
	 */
	private String partyCode;
	private String partyCodeFuzzy;

	/**
	 * 商品条形码
	 */
	private String modelId;
	private String modelIdFuzzy;

	/**
	 * sku图片
	 */
	private String pic;
	private String picFuzzy;

	/**
	 * sku名称
	 */
	private String skuName;
	private String skuNameFuzzy;

	/**
	 * 商品名称
	 */
	private String prodName;
	private String prodNameFuzzy;

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
	public String getPropertiesFuzzy() {
		return propertiesFuzzy;
	}
	public void setPropertiesFuzzy(String propertiesFuzzy) {
		this.propertiesFuzzy = propertiesFuzzy;
	}
	public String getUpdateTimeStart() {
		return updateTimeStart;
	}
	public void setUpdateTimeStart(String updateTimeStart) {
		this.updateTimeStart = updateTimeStart;
	}
	public String getUpdateTimeEnd() {
		return updateTimeEnd;
	}
	public void setUpdateTimeEnd(String updateTimeEnd) {
		this.updateTimeEnd = updateTimeEnd;
	}
	public String getRecTimeStart() {
		return recTimeStart;
	}
	public void setRecTimeStart(String recTimeStart) {
		this.recTimeStart = recTimeStart;
	}
	public String getRecTimeEnd() {
		return recTimeEnd;
	}
	public void setRecTimeEnd(String recTimeEnd) {
		this.recTimeEnd = recTimeEnd;
	}
	public String getPartyCodeFuzzy() {
		return partyCodeFuzzy;
	}
	public void setPartyCodeFuzzy(String partyCodeFuzzy) {
		this.partyCodeFuzzy = partyCodeFuzzy;
	}
	public String getModelIdFuzzy() {
		return modelIdFuzzy;
	}
	public void setModelIdFuzzy(String modelIdFuzzy) {
		this.modelIdFuzzy = modelIdFuzzy;
	}
	public String getPicFuzzy() {
		return picFuzzy;
	}
	public void setPicFuzzy(String picFuzzy) {
		this.picFuzzy = picFuzzy;
	}
	public String getSkuNameFuzzy() {
		return skuNameFuzzy;
	}
	public void setSkuNameFuzzy(String skuNameFuzzy) {
		this.skuNameFuzzy = skuNameFuzzy;
	}
	public String getProdNameFuzzy() {
		return prodNameFuzzy;
	}
	public void setProdNameFuzzy(String prodNameFuzzy) {
		this.prodNameFuzzy = prodNameFuzzy;
	}
}