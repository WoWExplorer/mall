package com.mall.entity.query;

import java.math.BigDecimal;
import java.util.Date;


/**
 *  @Description: 商品查询对象
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class ProdQuery extends BaseQuery {

	/**
	 * 产品ID
	 */
	private Long prodId;

	/**
	 * 商品名称
	 */
	private String prodName;
	private String prodNameFuzzy;

	/**
	 * 店铺id
	 */
	private Long shopId;

	/**
	 * 原价
	 */
	private BigDecimal oriPrice;

	/**
	 * 现价
	 */
	private BigDecimal price;

	/**
	 * 简要描述,卖点等
	 */
	private String brief;
	private String briefFuzzy;

	/**
	 * 详细描述
	 */
	private String content;
	private String contentFuzzy;

	/**
	 * 商品主图
	 */
	private String pic;
	private String picFuzzy;

	/**
	 * 商品图片，以,分割
	 */
	private String imgs;
	private String imgsFuzzy;

	/**
	 * 默认是1，表示正常状态, -1表示删除, 0下架
	 */
	private Integer status;

	/**
	 * 商品分类
	 */
	private Long categoryId;

	/**
	 * 销量
	 */
	private Integer soldNum;

	/**
	 * 总库存
	 */
	private Integer totalStocks;

	/**
	 * 配送方式json见TransportModeVO
	 */
	private String deliveryMode;
	private String deliveryModeFuzzy;

	/**
	 * 运费模板id
	 */
	private Long deliveryTemplateId;

	/**
	 * 录入时间
	 */
	private Date createTime;
	private String createTimeStart;
	private String createTimeEnd;

	/**
	 * 修改时间
	 */
	private Date updateTime;
	private String updateTimeStart;
	private String updateTimeEnd;

	/**
	 * 上架时间
	 */
	private Date putawayTime;
	private String putawayTimeStart;
	private String putawayTimeEnd;

	/**
	 * 版本 乐观锁
	 */
	private Integer version;

	public Long getProdId() {
		return prodId;
	}
	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
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
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getImgs() {
		return imgs;
	}
	public void setImgs(String imgs) {
		this.imgs = imgs;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public Integer getSoldNum() {
		return soldNum;
	}
	public void setSoldNum(Integer soldNum) {
		this.soldNum = soldNum;
	}
	public Integer getTotalStocks() {
		return totalStocks;
	}
	public void setTotalStocks(Integer totalStocks) {
		this.totalStocks = totalStocks;
	}
	public String getDeliveryMode() {
		return deliveryMode;
	}
	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}
	public Long getDeliveryTemplateId() {
		return deliveryTemplateId;
	}
	public void setDeliveryTemplateId(Long deliveryTemplateId) {
		this.deliveryTemplateId = deliveryTemplateId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Date getPutawayTime() {
		return putawayTime;
	}
	public void setPutawayTime(Date putawayTime) {
		this.putawayTime = putawayTime;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public String getProdNameFuzzy() {
		return prodNameFuzzy;
	}
	public void setProdNameFuzzy(String prodNameFuzzy) {
		this.prodNameFuzzy = prodNameFuzzy;
	}
	public String getBriefFuzzy() {
		return briefFuzzy;
	}
	public void setBriefFuzzy(String briefFuzzy) {
		this.briefFuzzy = briefFuzzy;
	}
	public String getContentFuzzy() {
		return contentFuzzy;
	}
	public void setContentFuzzy(String contentFuzzy) {
		this.contentFuzzy = contentFuzzy;
	}
	public String getPicFuzzy() {
		return picFuzzy;
	}
	public void setPicFuzzy(String picFuzzy) {
		this.picFuzzy = picFuzzy;
	}
	public String getImgsFuzzy() {
		return imgsFuzzy;
	}
	public void setImgsFuzzy(String imgsFuzzy) {
		this.imgsFuzzy = imgsFuzzy;
	}
	public String getDeliveryModeFuzzy() {
		return deliveryModeFuzzy;
	}
	public void setDeliveryModeFuzzy(String deliveryModeFuzzy) {
		this.deliveryModeFuzzy = deliveryModeFuzzy;
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
	public String getPutawayTimeStart() {
		return putawayTimeStart;
	}
	public void setPutawayTimeStart(String putawayTimeStart) {
		this.putawayTimeStart = putawayTimeStart;
	}
	public String getPutawayTimeEnd() {
		return putawayTimeEnd;
	}
	public void setPutawayTimeEnd(String putawayTimeEnd) {
		this.putawayTimeEnd = putawayTimeEnd;
	}
}