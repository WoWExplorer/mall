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
 *  @Description: 商品
 *  @Author: wow
 *  @Date: 2024年06月17日
 */
public class Prod implements Serializable {

	/**
	 * 产品ID
	 */
	private Long prodId;

	/**
	 * 商品名称
	 */
	private String prodName;

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

	/**
	 * 详细描述
	 */
	private String content;

	/**
	 * 商品主图
	 */
	private String pic;

	/**
	 * 商品图片，以,分割
	 */
	private String imgs;

	/**
	 * 默认是1，表示正常状态, -1表示删除, 0下架
	 */
	@JsonIgnore
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

	/**
	 * 运费模板id
	 */
	private Long deliveryTemplateId;

	/**
	 * 录入时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/**
	 * 修改时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

	/**
	 * 上架时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date putawayTime;

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
	@Override
	public String toString() {
		return "商品: {"
				+ " \"产品ID\": \"" + (prodId == null ? "空" : prodId) + "\", "
				+ " \"商品名称\": \"" + (prodName == null ? "空" : prodName) + "\", "
				+ " \"店铺id\": \"" + (shopId == null ? "空" : shopId) + "\", "
				+ " \"原价\": \"" + (oriPrice == null ? "空" : oriPrice) + "\", "
				+ " \"现价\": \"" + (price == null ? "空" : price) + "\", "
				+ " \"简要描述,卖点等\": \"" + (brief == null ? "空" : brief) + "\", "
				+ " \"详细描述\": \"" + (content == null ? "空" : content) + "\", "
				+ " \"商品主图\": \"" + (pic == null ? "空" : pic) + "\", "
				+ " \"商品图片，以,分割\": \"" + (imgs == null ? "空" : imgs) + "\", "
				+ " \"默认是1，表示正常状态, -1表示删除, 0下架\": \"" + (status == null ? "空" : status) + "\", "
				+ " \"商品分类\": \"" + (categoryId == null ? "空" : categoryId) + "\", "
				+ " \"销量\": \"" + (soldNum == null ? "空" : soldNum) + "\", "
				+ " \"总库存\": \"" + (totalStocks == null ? "空" : totalStocks) + "\", "
				+ " \"配送方式json见TransportModeVO\": \"" + (deliveryMode == null ? "空" : deliveryMode) + "\", "
				+ " \"运费模板id\": \"" + (deliveryTemplateId == null ? "空" : deliveryTemplateId) + "\", "
				+ " \"录入时间\": \"" + (createTime == null ? "空" : DateUtils.format(createTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"修改时间\": \"" + (updateTime == null ? "空" : DateUtils.format(updateTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"上架时间\": \"" + (putawayTime == null ? "空" : DateUtils.format(putawayTime, DataTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "\", "
				+ " \"版本 乐观锁\": \"" + (version == null ? "空" : version) + "\" "
				+ "}";

	}
}