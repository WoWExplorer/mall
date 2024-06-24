declare interface Window {
  ipcRenderer: any
}
declare global {
  interface Window {
    $message: {
      error: (msg: string) => void;
      success: (msg: string) => void;
      warning: (msg: string) => void;
    };
  }
}

interface AreaParam {
  /**
   *
   */
  areaId?: number;

  /**
   *
   */
  areaName?: string;
  areaNameFuzzy?: string;

  /**
   *
   */
  parentId?: number;

  /**
   *
   */
  level?: number;
}

interface AttachFileParam {
  /**
   *
   */
  fileId?: number;

  /**
   * 文件路径
   */
  filePath?: string;
  filePathFuzzy?: string;

  /**
   * 文件类型
   */
  fileType?: string;
  fileTypeFuzzy?: string;

  /**
   * 文件大小
   */
  fileSize?: number;

  /**
   * 上传时间
   */
  uploadTime?: string;
  uploadTimeStart?: string;
  uploadTimeEnd?: string;

  /**
   * 文件关联的表主键id
   */
  fileJoinId?: number;

  /**
   * 文件关联表类型：1 商品表  FileJoinType
   */
  fileJoinType?: number;
}

interface BasketParam {
  /**
   * 主键
   */
  basketId?: number;

  /**
   * 店铺ID
   */
  shopId?: number;

  /**
   * 产品ID
   */
  prodId?: number;

  /**
   * SkuID
   */
  skuId?: number;

  /**
   * 用户ID
   */
  userId?: string;
  userIdFuzzy?: string;

  /**
   * 购物车产品个数
   */
  basketCount?: number;

  /**
   * 购物时间
   */
  basketDate?: string;
  basketDateStart?: string;
  basketDateEnd?: string;

  /**
   * 满减活动ID
   */
  discountId?: number;

  /**
   * 分销推广人卡号
   */
  distributionCardNo?: string;
  distributionCardNoFuzzy?: string;
}

interface BrandParam {
  /**
   * 主键
   */
  brandId?: number;

  /**
   * 品牌名称
   */
  brandName?: string;
  brandNameFuzzy?: string;

  /**
   * 图片路径
   */
  brandPic?: string;
  brandPicFuzzy?: string;

  /**
   * 用户ID
   */
  userId?: string;
  userIdFuzzy?: string;

  /**
   * 备注
   */
  memo?: string;
  memoFuzzy?: string;

  /**
   * 顺序
   */
  seq?: number;

  /**
   * 默认是1，表示正常状态,0为下线状态
   */
  status?: number;

  /**
   * 简要描述
   */
  brief?: string;
  briefFuzzy?: string;

  /**
   * 内容
   */
  content?: string;
  contentFuzzy?: string;

  /**
   * 记录时间
   */
  recTime?: string;
  recTimeStart?: string;
  recTimeEnd?: string;

  /**
   * 更新时间
   */
  updateTime?: string;
  updateTimeStart?: string;
  updateTimeEnd?: string;

  /**
   * 品牌首字母
   */
  firstChar?: string;
  firstCharFuzzy?: string;
}

interface CategoryBrandParam {
  /**
   *
   */
  id?: number;

  /**
   * 分类id
   */
  categoryId?: number;

  /**
   * 品牌id
   */
  brandId?: number;
}

interface CategoryParam {
  /**
   * 类目ID
   */
  categoryId?: number;

  /**
   * 店铺ID
   */
  shopId?: number;

  /**
   * 父节点
   */
  parentId?: number;

  /**
   * 产品类目名称
   */
  categoryName?: string;
  categoryNameFuzzy?: string;

  /**
   * 类目图标
   */
  icon?: string;
  iconFuzzy?: string;

  /**
   * 类目的显示图片
   */
  pic?: string;
  picFuzzy?: string;

  /**
   * 排序
   */
  seq?: number;

  /**
   * 默认是1，表示正常状态,0为下线状态
   */
  status?: number;

  /**
   * 记录时间
   */
  recTime?: string;
  recTimeStart?: string;
  recTimeEnd?: string;

  /**
   * 分类层级
   */
  grade?: number;

  /**
   * 更新时间
   */
  updateTime?: string;
  updateTimeStart?: string;
  updateTimeEnd?: string;
}

interface CategoryPropParam {
  /**
   *
   */
  id?: number;

  /**
   * 分类id
   */
  categoryId?: number;

  /**
   * 商品属性id即表tz_prod_prop中的prop_id
   */
  propId?: number;
}

interface DeliveryParam {
  /**
   * ID
   */
  dvyId?: number;

  /**
   * 物流公司名称
   */
  dvyName?: string;
  dvyNameFuzzy?: string;

  /**
   * 公司主页
   */
  companyHomeUrl?: string;
  companyHomeUrlFuzzy?: string;

  /**
   * 建立时间
   */
  recTime?: string;
  recTimeStart?: string;
  recTimeEnd?: string;

  /**
   * 修改时间
   */
  modifyTime?: string;
  modifyTimeStart?: string;
  modifyTimeEnd?: string;

  /**
   * 物流查询接口
   */
  queryUrl?: string;
  queryUrlFuzzy?: string;
}

interface HotSearchParam {
  /**
   * 主键
   */
  hotSearchId?: number;

  /**
   * 店铺ID 0为全局热搜
   */
  shopId?: number;

  /**
   * 内容
   */
  content?: string;
  contentFuzzy?: string;

  /**
   * 录入时间
   */
  recDate?: string;
  recDateStart?: string;
  recDateEnd?: string;

  /**
   * 顺序
   */
  seq?: number;

  /**
   * 状态 0下线 1上线
   */
  status?: number;

  /**
   * 热搜标题
   */
  title?: string;
  titleFuzzy?: string;
}

interface IndexImgParam {
  /**
   * 主键
   */
  imgId?: number;

  /**
   * 店铺ID
   */
  shopId?: number;

  /**
   * 图片
   */
  imgUrl?: string;
  imgUrlFuzzy?: string;

  /**
   * 说明文字,描述
   */
  des?: string;
  desFuzzy?: string;

  /**
   * 标题
   */
  title?: string;
  titleFuzzy?: string;

  /**
   * 链接
   */
  link?: string;
  linkFuzzy?: string;

  /**
   * 状态
   */
  status?: number;

  /**
   * 顺序
   */
  seq?: number;

  /**
   * 上传时间
   */
  uploadTime?: string;
  uploadTimeStart?: string;
  uploadTimeEnd?: string;

  /**
   * 关联
   */
  relation?: number;

  /**
   * 类型
   */
  type?: number;
}

interface MessageParam {
  /**
   *
   */
  id?: number;

  /**
   * 留言创建时间
   */
  createTime?: string;
  createTimeStart?: string;
  createTimeEnd?: string;

  /**
   * 姓名
   */
  userName?: string;
  userNameFuzzy?: string;

  /**
   * 邮箱
   */
  email?: string;
  emailFuzzy?: string;

  /**
   * 联系方式
   */
  contact?: string;
  contactFuzzy?: string;

  /**
   * 留言内容
   */
  content?: string;
  contentFuzzy?: string;

  /**
   * 留言回复
   */
  reply?: string;
  replyFuzzy?: string;

  /**
   * 状态：0:未审核 1审核通过
   */
  status?: number;
}

interface NoticeParam {
  /**
   * 公告id
   */
  id?: number;

  /**
   * 店铺id
   */
  shopId?: number;

  /**
   * 公告标题
   */
  title?: string;
  titleFuzzy?: string;

  /**
   * 公告内容
   */
  content?: string;
  contentFuzzy?: string;

  /**
   * 状态(1:公布 0:撤回)
   */
  status?: number;

  /**
   * 是否置顶
   */
  isTop?: number;

  /**
   * 发布时间
   */
  publishTime?: string;
  publishTimeStart?: string;
  publishTimeEnd?: string;

  /**
   * 更新时间
   */
  updateTime?: string;
  updateTimeStart?: string;
  updateTimeEnd?: string;
}

interface OrderItemParam {
  /**
   * 订单项ID
   */
  orderItemId?: number;

  /**
   * 店铺id
   */
  shopId?: number;

  /**
   * 订单order_number
   */
  orderNumber?: string;
  orderNumberFuzzy?: string;

  /**
   * 产品ID
   */
  prodId?: number;

  /**
   * 产品SkuID
   */
  skuId?: number;

  /**
   * 购物车产品个数
   */
  prodCount?: number;

  /**
   * 产品名称
   */
  prodName?: string;
  prodNameFuzzy?: string;

  /**
   * sku名称
   */
  skuName?: string;
  skuNameFuzzy?: string;

  /**
   * 产品主图片路径
   */
  pic?: string;
  picFuzzy?: string;

  /**
   * 产品价格
   */
  price?: string;

  /**
   * 用户Id
   */
  userId?: string;
  userIdFuzzy?: string;

  /**
   * 商品总金额
   */
  productTotalAmount?: string;

  /**
   * 购物时间
   */
  recTime?: string;
  recTimeStart?: string;
  recTimeEnd?: string;

  /**
   * 评论状态： 0 未评价  1 已评价
   */
  commSts?: number;

  /**
   * 推广员使用的推销卡号
   */
  distributionCardNo?: string;
  distributionCardNoFuzzy?: string;

  /**
   * 加入购物车时间
   */
  basketDate?: string;
  basketDateStart?: string;
  basketDateEnd?: string;
}

interface OrderParam {
  /**
   * 订单ID
   */
  orderId?: number;

  /**
   * 店铺id
   */
  shopId?: number;

  /**
   * 产品名称,多个产品将会以逗号隔开
   */
  prodName?: string;
  prodNameFuzzy?: string;

  /**
   * 订购用户ID
   */
  userId?: string;
  userIdFuzzy?: string;

  /**
   * 订购流水号
   */
  orderNumber?: string;
  orderNumberFuzzy?: string;

  /**
   * 总值
   */
  total?: string;

  /**
   * 实际总值
   */
  actualTotal?: string;

  /**
   * 支付方式 0 手动代付 1 微信支付 2 支付宝
   */
  payType?: number;

  /**
   * 订单备注
   */
  remarks?: string;
  remarksFuzzy?: string;

  /**
   * 订单状态 1:待付款 2:待发货 3:待收货 4:待评价 5:成功 6:失败
   */
  status?: number;

  /**
   * 配送类型
   */
  dvyType?: string;
  dvyTypeFuzzy?: string;

  /**
   * 配送方式ID
   */
  dvyId?: number;

  /**
   * 物流单号
   */
  dvyFlowId?: string;
  dvyFlowIdFuzzy?: string;

  /**
   * 订单运费
   */
  freightAmount?: string;

  /**
   * 用户订单地址Id
   */
  addrOrderId?: number;

  /**
   * 订单商品总数
   */
  productNums?: number;

  /**
   * 订购时间
   */
  createTime?: string;
  createTimeStart?: string;
  createTimeEnd?: string;

  /**
   * 订单更新时间
   */
  updateTime?: string;
  updateTimeStart?: string;
  updateTimeEnd?: string;

  /**
   * 付款时间
   */
  payTime?: string;
  payTimeStart?: string;
  payTimeEnd?: string;

  /**
   * 发货时间
   */
  dvyTime?: string;
  dvyTimeStart?: string;
  dvyTimeEnd?: string;

  /**
   * 完成时间
   */
  finallyTime?: string;
  finallyTimeStart?: string;
  finallyTimeEnd?: string;

  /**
   * 取消时间
   */
  cancelTime?: string;
  cancelTimeStart?: string;
  cancelTimeEnd?: string;

  /**
   * 是否已经支付，1：已经支付过，0：，没有支付过
   */
  isPayed?: number;

  /**
   * 用户订单删除状态，0：没有删除， 1：回收站， 2：永久删除
   */
  deleteStatus?: number;

  /**
   * 0:默认,1:在处理,2:处理完成
   */
  refundSts?: number;

  /**
   * 优惠总额
   */
  reduceAmount?: string;

  /**
   * 订单类型
   */
  orderType?: number;

  /**
   * 订单关闭原因 1-超时未支付 2-退款关闭 4-买家取消 15-已通过货到付款交易
   */
  closeType?: number;
}

interface OrderRefundParam {
  /**
   * 记录ID
   */
  refundId?: number;

  /**
   * 店铺ID
   */
  shopId?: number;

  /**
   * 订单ID
   */
  orderId?: number;

  /**
   * 订单流水号
   */
  orderNumber?: string;
  orderNumberFuzzy?: string;

  /**
   * 订单总金额
   */
  orderAmount?: string;

  /**
   * 订单项ID 全部退款是0
   */
  orderItemId?: number;

  /**
   * 退款编号
   */
  refundSn?: string;
  refundSnFuzzy?: string;

  /**
   * 订单支付流水号
   */
  flowTradeNo?: string;
  flowTradeNoFuzzy?: string;

  /**
   * 第三方退款单号(微信退款单号)
   */
  outRefundNo?: string;
  outRefundNoFuzzy?: string;

  /**
   * 订单支付方式 1 微信支付 2 支付宝
   */
  payType?: number;

  /**
   * 订单支付名称
   */
  payTypeName?: string;
  payTypeNameFuzzy?: string;

  /**
   * 买家ID
   */
  userId?: string;
  userIdFuzzy?: string;

  /**
   * 退货数量
   */
  goodsNum?: number;

  /**
   * 退款金额
   */
  refundAmount?: string;

  /**
   * 申请类型:1,仅退款,2退款退货
   */
  applyType?: number;

  /**
   * 处理状态:1为待审核,2为同意,3为不同意
   */
  refundSts?: number;

  /**
   * 处理退款状态: 0:退款处理中 1:退款成功 -1:退款失败
   */
  returnMoneySts?: number;

  /**
   * 申请时间
   */
  applyTime?: string;
  applyTimeStart?: string;
  applyTimeEnd?: string;

  /**
   * 卖家处理时间
   */
  handelTime?: string;
  handelTimeStart?: string;
  handelTimeEnd?: string;

  /**
   * 退款时间
   */
  refundTime?: string;
  refundTimeStart?: string;
  refundTimeEnd?: string;

  /**
   * 文件凭证json
   */
  photoFiles?: string;
  photoFilesFuzzy?: string;

  /**
   * 申请原因
   */
  buyerMsg?: string;
  buyerMsgFuzzy?: string;

  /**
   * 卖家备注
   */
  sellerMsg?: string;
  sellerMsgFuzzy?: string;

  /**
   * 物流公司名称
   */
  expressName?: string;
  expressNameFuzzy?: string;

  /**
   * 物流单号
   */
  expressNo?: string;
  expressNoFuzzy?: string;

  /**
   * 发货时间
   */
  shipTime?: string;
  shipTimeStart?: string;
  shipTimeEnd?: string;

  /**
   * 收货时间
   */
  receiveTime?: string;
  receiveTimeStart?: string;
  receiveTimeEnd?: string;

  /**
   * 收货备注
   */
  receiveMessage?: string;
  receiveMessageFuzzy?: string;
}

interface OrderSettlementParam {
  /**
   * 支付结算单据ID
   */
  settlementId?: number;

  /**
   * 支付单号
   */
  payNo?: string;
  payNoFuzzy?: string;

  /**
   * 外部订单流水号
   */
  bizPayNo?: string;
  bizPayNoFuzzy?: string;

  /**
   * order表中的订单号
   */
  orderNumber?: string;
  orderNumberFuzzy?: string;

  /**
   * 支付方式 1 微信支付 2 支付宝
   */
  payType?: number;

  /**
   * 支付方式名称
   */
  payTypeName?: string;
  payTypeNameFuzzy?: string;

  /**
   * 支付金额
   */
  payAmount?: string;

  /**
   * 是否清算 0:否 1:是
   */
  isClearing?: number;

  /**
   * 用户ID
   */
  userId?: string;
  userIdFuzzy?: string;

  /**
   * 创建时间
   */
  createTime?: string;
  createTimeStart?: string;
  createTimeEnd?: string;

  /**
   * 清算时间
   */
  clearingTime?: string;
  clearingTimeStart?: string;
  clearingTimeEnd?: string;

  /**
   * 版本号
   */
  version?: number;

  /**
   * 支付状态
   */
  payStatus?: number;
}

interface PickAddrParam {
  /**
   * ID
   */
  addrId?: number;

  /**
   * 自提点名称
   */
  addrName?: string;
  addrNameFuzzy?: string;

  /**
   * 地址
   */
  addr?: string;
  addrFuzzy?: string;

  /**
   * 手机
   */
  mobile?: string;
  mobileFuzzy?: string;

  /**
   * 省份ID
   */
  provinceId?: number;

  /**
   * 省份
   */
  province?: string;
  provinceFuzzy?: string;

  /**
   * 城市ID
   */
  cityId?: number;

  /**
   * 城市
   */
  city?: string;
  cityFuzzy?: string;

  /**
   * 区/县ID
   */
  areaId?: number;

  /**
   * 区/县
   */
  area?: string;
  areaFuzzy?: string;

  /**
   * 店铺id
   */
  shopId?: number;
}

interface ProdCommParam {
  /**
   * ID
   */
  prodCommId?: number;

  /**
   * 商品ID
   */
  prodId?: number;

  /**
   * 订单项ID
   */
  orderItemId?: number;

  /**
   * 评论用户ID
   */
  userId?: string;
  userIdFuzzy?: string;

  /**
   * 评论内容
   */
  content?: string;
  contentFuzzy?: string;

  /**
   * 掌柜回复
   */
  replyContent?: string;
  replyContentFuzzy?: string;

  /**
   * 记录时间
   */
  recTime?: string;
  recTimeStart?: string;
  recTimeEnd?: string;

  /**
   * 回复时间
   */
  replyTime?: string;
  replyTimeStart?: string;
  replyTimeEnd?: string;

  /**
   * 是否回复 0:未回复  1:已回复
   */
  replySts?: number;

  /**
   * IP来源
   */
  postip?: string;
  postipFuzzy?: string;

  /**
   * 得分，0-5分
   */
  score?: number;

  /**
   * 有用的计数
   */
  usefulCounts?: number;

  /**
   * 晒图的json字符串
   */
  pics?: string;
  picsFuzzy?: string;

  /**
   * 是否匿名(1:是  0:否)
   */
  isAnonymous?: number;

  /**
   * 是否显示，1:为显示，0:待审核， -1：不通过审核，不显示。 如果需要审核评论，则是0,，否则1
   */
  status?: number;

  /**
   * 评价(0好评 1中评 2差评)
   */
  evaluate?: number;
}

interface ProdFavoriteParam {
  /**
   * 主键
   */
  favoriteId?: number;

  /**
   * 商品ID
   */
  prodId?: number;

  /**
   * 收藏时间
   */
  recTime?: string;
  recTimeStart?: string;
  recTimeEnd?: string;

  /**
   * 用户ID
   */
  userId?: string;
  userIdFuzzy?: string;
}

interface ProdParam {
  /**
   * 产品ID
   */
  prodId?: number;

  /**
   * 商品名称
   */
  prodName?: string;
  prodNameFuzzy?: string;

  /**
   * 店铺id
   */
  shopId?: number;

  /**
   * 原价
   */
  oriPrice?: string;

  /**
   * 现价
   */
  price?: string;

  /**
   * 简要描述,卖点等
   */
  brief?: string;
  briefFuzzy?: string;

  /**
   * 详细描述
   */
  content?: string;
  contentFuzzy?: string;

  /**
   * 商品主图
   */
  pic?: string;
  picFuzzy?: string;

  /**
   * 商品图片，以,分割
   */
  imgs?: string;
  imgsFuzzy?: string;

  /**
   * 默认是1，表示正常状态, -1表示删除, 0下架
   */
  status?: number;

  /**
   * 商品分类
   */
  categoryId?: number;

  /**
   * 销量
   */
  soldNum?: number;

  /**
   * 总库存
   */
  totalStocks?: number;

  /**
   * 配送方式json见TransportModeVO
   */
  deliveryMode?: string;
  deliveryModeFuzzy?: string;

  /**
   * 运费模板id
   */
  deliveryTemplateId?: number;

  /**
   * 录入时间
   */
  createTime?: string;
  createTimeStart?: string;
  createTimeEnd?: string;

  /**
   * 修改时间
   */
  updateTime?: string;
  updateTimeStart?: string;
  updateTimeEnd?: string;

  /**
   * 上架时间
   */
  putawayTime?: string;
  putawayTimeStart?: string;
  putawayTimeEnd?: string;

  /**
   * 版本 乐观锁
   */
  version?: number;
}

interface ProdPropParam {
  /**
   * 属性id
   */
  propId?: number;

  /**
   * 属性名称
   */
  propName?: string;
  propNameFuzzy?: string;

  /**
   * ProdPropRule 1:销售属性(规格); 2:参数属性;
   */
  rule?: number;

  /**
   * 店铺id
   */
  shopId?: number;
}

interface ProdPropValueParam {
  /**
   * 属性值ID
   */
  valueId?: number;

  /**
   * 属性值名称
   */
  propValue?: string;
  propValueFuzzy?: string;

  /**
   * 属性ID
   */
  propId?: number;
}

interface ProdTagParam {
  /**
   * 分组标签id
   */
  id?: number;

  /**
   * 分组标题
   */
  title?: string;
  titleFuzzy?: string;

  /**
   * 店铺Id
   */
  shopId?: number;

  /**
   * 状态(1为正常,0为删除)
   */
  status?: number;

  /**
   * 默认类型(0:商家自定义,1:系统默认)
   */
  isDefault?: number;

  /**
   * 商品数量
   */
  prodCount?: number;

  /**
   * 列表样式(0:一列一个,1:一列两个,2:一列三个)
   */
  style?: number;

  /**
   * 排序
   */
  seq?: number;

  /**
   * 创建时间
   */
  createTime?: string;
  createTimeStart?: string;
  createTimeEnd?: string;

  /**
   * 修改时间
   */
  updateTime?: string;
  updateTimeStart?: string;
  updateTimeEnd?: string;

  /**
   * 删除时间
   */
  deleteTime?: string;
  deleteTimeStart?: string;
  deleteTimeEnd?: string;
}

interface ProdTagReferenceParam {
  /**
   * 分组引用id
   */
  referenceId?: number;

  /**
   * 店铺id
   */
  shopId?: number;

  /**
   * 标签id
   */
  tagId?: number;

  /**
   * 商品id
   */
  prodId?: number;

  /**
   * 状态(1:正常,0:删除)
   */
  status?: number;

  /**
   * 创建时间
   */
  createTime?: string;
  createTimeStart?: string;
  createTimeEnd?: string;
}

interface ShopDetailParam {
  /**
   * 店铺id
   */
  shopId?: number;

  /**
   * 店铺名称(数字、中文，英文(可混合，不可有特殊字符)，可修改)、不唯一
   */
  shopName?: string;
  shopNameFuzzy?: string;

  /**
   * 店长用户id
   */
  userId?: string;
  userIdFuzzy?: string;

  /**
   * 店铺类型
   */
  shopType?: number;

  /**
   * 店铺简介(可修改)
   */
  intro?: string;
  introFuzzy?: string;

  /**
   * 店铺公告(可修改)
   */
  shopNotice?: string;
  shopNoticeFuzzy?: string;

  /**
   * 店铺行业(餐饮、生鲜果蔬、鲜花等)
   */
  shopIndustry?: number;

  /**
   * 店长
   */
  shopOwner?: string;
  shopOwnerFuzzy?: string;

  /**
   * 店铺绑定的手机(登录账号：唯一)
   */
  mobile?: string;
  mobileFuzzy?: string;

  /**
   * 店铺联系电话
   */
  tel?: string;
  telFuzzy?: string;

  /**
   * 店铺所在纬度(可修改)
   */
  shopLat?: string;
  shopLatFuzzy?: string;

  /**
   * 店铺所在经度(可修改)
   */
  shopLng?: string;
  shopLngFuzzy?: string;

  /**
   * 店铺详细地址
   */
  shopAddress?: string;
  shopAddressFuzzy?: string;

  /**
   * 店铺所在省份（描述）
   */
  province?: string;
  provinceFuzzy?: string;

  /**
   * 店铺所在城市（描述）
   */
  city?: string;
  cityFuzzy?: string;

  /**
   * 店铺所在区域（描述）
   */
  area?: string;
  areaFuzzy?: string;

  /**
   * 店铺省市区代码，用于回显
   */
  pcaCode?: string;
  pcaCodeFuzzy?: string;

  /**
   * 店铺logo(可修改)
   */
  shopLogo?: string;
  shopLogoFuzzy?: string;

  /**
   * 店铺相册
   */
  shopPhotos?: string;
  shopPhotosFuzzy?: string;

  /**
   * 每天营业时间段(可修改)
   */
  openTime?: string;
  openTimeFuzzy?: string;

  /**
   * 店铺状态(-1:未开通 0: 停业中 1:营业中)，可修改
   */
  shopStatus?: number;

  /**
   * 0:商家承担运费; 1:买家承担运费
   */
  transportType?: number;

  /**
   * 固定运费
   */
  fixedFreight?: string;

  /**
   * 满X包邮
   */
  fullFreeShipping?: string;

  /**
   * 创建时间
   */
  createTime?: string;
  createTimeStart?: string;
  createTimeEnd?: string;

  /**
   * 更新时间
   */
  updateTime?: string;
  updateTimeStart?: string;
  updateTimeEnd?: string;

  /**
   * 分销开关(0:开启 1:关闭)
   */
  isDistribution?: number;
}

interface SkuParam {
  /**
   * 单品ID
   */
  skuId?: number;

  /**
   * 商品ID
   */
  prodId?: number;

  /**
   * 销售属性组合字符串 格式是p1:v1;p2:v2
   */
  properties?: string;
  propertiesFuzzy?: string;

  /**
   * 原价
   */
  oriPrice?: string;

  /**
   * 价格
   */
  price?: string;

  /**
   * 商品在付款减库存的状态下，该sku上未付款的订单数量
   */
  stocks?: number;

  /**
   * 实际库存
   */
  actualStocks?: number;

  /**
   * 修改时间
   */
  updateTime?: string;
  updateTimeStart?: string;
  updateTimeEnd?: string;

  /**
   * 记录时间
   */
  recTime?: string;
  recTimeStart?: string;
  recTimeEnd?: string;

  /**
   * 商家编码
   */
  partyCode?: string;
  partyCodeFuzzy?: string;

  /**
   * 商品条形码
   */
  modelId?: string;
  modelIdFuzzy?: string;

  /**
   * sku图片
   */
  pic?: string;
  picFuzzy?: string;

  /**
   * sku名称
   */
  skuName?: string;
  skuNameFuzzy?: string;

  /**
   * 商品名称
   */
  prodName?: string;
  prodNameFuzzy?: string;

  /**
   * 版本号
   */
  version?: number;

  /**
   * 商品重量
   */
  weight?: string;

  /**
   * 商品体积
   */
  volume?: string;

  /**
   * 0 禁用 1 启用
   */
  status?: number;

  /**
   * 0 正常 1 已被删除
   */
  isDelete?: number;
}

interface SmsLogParam {
  /**
   * ID
   */
  id?: number;

  /**
   * 用户id
   */
  userId?: string;
  userIdFuzzy?: string;

  /**
   * 手机号码
   */
  userPhone?: string;
  userPhoneFuzzy?: string;

  /**
   * 短信内容
   */
  content?: string;
  contentFuzzy?: string;

  /**
   * 手机验证码
   */
  mobileCode?: string;
  mobileCodeFuzzy?: string;

  /**
   * 短信类型  1:注册  2:验证
   */
  type?: number;

  /**
   * 发送时间
   */
  recDate?: string;
  recDateStart?: string;
  recDateEnd?: string;

  /**
   * 发送短信返回码
   */
  responseCode?: string;
  responseCodeFuzzy?: string;

  /**
   * 状态  1:有效  0：失效
   */
  status?: number;
}

interface SysConfigParam {
  /**
   *
   */
  id?: number;

  /**
   * key
   */
  paramKey?: string;
  paramKeyFuzzy?: string;

  /**
   * value
   */
  paramValue?: string;
  paramValueFuzzy?: string;

  /**
   * 备注
   */
  remark?: string;
  remarkFuzzy?: string;
}

interface SysLogParam {
  /**
   *
   */
  id?: number;

  /**
   * 用户名
   */
  username?: string;
  usernameFuzzy?: string;

  /**
   * 用户操作
   */
  operation?: string;
  operationFuzzy?: string;

  /**
   * 请求方法
   */
  method?: string;
  methodFuzzy?: string;

  /**
   * 请求参数
   */
  params?: string;
  paramsFuzzy?: string;

  /**
   * 执行时长(毫秒)
   */
  time?: number;

  /**
   * IP地址
   */
  ip?: string;
  ipFuzzy?: string;

  /**
   * 创建时间
   */
  createDate?: string;
  createDateStart?: string;
  createDateEnd?: string;
}

interface SysMenuParam {
  /**
   *
   */
  menuId?: number;

  /**
   * 父菜单ID，一级菜单为0
   */
  parentId?: number;

  /**
   * 菜单名称
   */
  name?: string;
  nameFuzzy?: string;

  /**
   * 菜单URL
   */
  url?: string;
  urlFuzzy?: string;

  /**
   * 授权(多个用逗号分隔，如：user:list,user:create)
   */
  perms?: string;
  permsFuzzy?: string;

  /**
   * 类型   0：目录   1：菜单   2：按钮
   */
  type?: number;

  /**
   * 菜单图标
   */
  icon?: string;
  iconFuzzy?: string;

  /**
   * 排序
   */
  orderNum?: number;
}

interface SysRoleMenuParam {
  /**
   *
   */
  id?: number;

  /**
   * 角色ID
   */
  roleId?: number;

  /**
   * 菜单ID
   */
  menuId?: number;
}

interface SysRoleParam {
  /**
   *
   */
  roleId?: number;

  /**
   * 角色名称
   */
  roleName?: string;
  roleNameFuzzy?: string;

  /**
   * 备注
   */
  remark?: string;
  remarkFuzzy?: string;

  /**
   * 创建者ID
   */
  createUserId?: number;

  /**
   * 创建时间
   */
  createTime?: string;
  createTimeStart?: string;
  createTimeEnd?: string;
}
interface SysUserParam {
  /**
   *
   */
  userId?: number;

  /**
   * 用户名
   */
  username?: string;
  usernameFuzzy?: string;

  /**
   * 密码
   */
  password?: string;
  passwordFuzzy?: string;

  /**
   * 邮箱
   */
  email?: string;
  emailFuzzy?: string;

  /**
   * 手机号
   */
  mobile?: string;
  mobileFuzzy?: string;

  /**
   * 状态  0：禁用   1：正常
   */
  status?: number;

  /**
   * 创建者ID
   */
  createUserId?: number;

  /**
   * 创建时间
   */
  createTime?: string;
  createTimeStart?: string;
  createTimeEnd?: string;

  /**
   * 用户所在的商城Id
   */
  shopId?: number;
}

interface SysUserRoleParam {
  /**
   *
   */
  id?: number;

  /**
   * 用户ID
   */
  userId?: number;

  /**
   * 角色ID
   */
  roleId?: number;
}

interface TranscityFreeParam {
  /**
   * 指定条件包邮城市项id
   */
  transcityFreeId?: number;

  /**
   * 指定条件包邮项id
   */
  transfeeFreeId?: number;

  /**
   * 城市id
   */
  freeCityId?: number;
}

interface TranscityParam {
  /**
   *
   */
  transcityId?: number;

  /**
   * 运费项id
   */
  transfeeId?: number;

  /**
   * 城市id
   */
  cityId?: number;
}

interface TransfeeFreeParam {
  /**
   * 指定条件包邮项id
   */
  transfeeFreeId?: number;

  /**
   * 运费模板id
   */
  transportId?: number;

  /**
   * 包邮方式 （0 满x件/重量/体积包邮 1满金额包邮 2满x件/重量/体积且满金额包邮）
   */
  freeType?: number;

  /**
   * 需满金额
   */
  amount?: string;

  /**
   * 包邮x件/重量/体积
   */
  piece?: string;
}

interface TransfeeParam {
  /**
   * 运费项id
   */
  transfeeId?: number;

  /**
   * 运费模板id
   */
  transportId?: number;

  /**
   * 续件数量
   */
  continuousPiece?: string;

  /**
   * 首件数量
   */
  firstPiece?: string;

  /**
   * 续件费用
   */
  continuousFee?: string;

  /**
   * 首件费用
   */
  firstFee?: string;
}

interface TransportParam {
  /**
   * 运费模板id
   */
  transportId?: number;

  /**
   * 运费模板名称
   */
  transName?: string;
  transNameFuzzy?: string;

  /**
   * 创建时间
   */
  createTime?: string;
  createTimeStart?: string;
  createTimeEnd?: string;

  /**
   * 店铺id
   */
  shopId?: number;

  /**
   * 收费方式（0 按件数,1 按重量 2 按体积）
   */
  chargeType?: number;

  /**
   * 是否包邮 0:不包邮 1:包邮
   */
  isFreeFee?: number;

  /**
   * 是否含有包邮条件 0 否 1是
   */
  hasFreeCondition?: number;
}

interface UserAddrOrderParam {
  /**
   * ID
   */
  addrOrderId?: number;

  /**
   * 地址ID
   */
  addrId?: number;

  /**
   * 用户ID
   */
  userId?: string;
  userIdFuzzy?: string;

  /**
   * 收货人
   */
  receiver?: string;
  receiverFuzzy?: string;

  /**
   * 省ID
   */
  provinceId?: number;

  /**
   * 省
   */
  province?: string;
  provinceFuzzy?: string;

  /**
   * 区域ID
   */
  areaId?: number;

  /**
   * 区
   */
  area?: string;
  areaFuzzy?: string;

  /**
   * 城市ID
   */
  cityId?: number;

  /**
   * 城市
   */
  city?: string;
  cityFuzzy?: string;

  /**
   * 地址
   */
  addr?: string;
  addrFuzzy?: string;

  /**
   * 邮编
   */
  postCode?: string;
  postCodeFuzzy?: string;

  /**
   * 手机
   */
  mobile?: string;
  mobileFuzzy?: string;

  /**
   * 建立时间
   */
  createTime?: string;
  createTimeStart?: string;
  createTimeEnd?: string;

  /**
   * 版本号
   */
  version?: number;
}

interface UserAddrParam {
  /**
   * ID
   */
  addrId?: number;

  /**
   * 用户ID
   */
  userId?: string;
  userIdFuzzy?: string;

  /**
   * 收货人
   */
  receiver?: string;
  receiverFuzzy?: string;

  /**
   * 省ID
   */
  provinceId?: number;

  /**
   * 省
   */
  province?: string;
  provinceFuzzy?: string;

  /**
   * 城市
   */
  city?: string;
  cityFuzzy?: string;

  /**
   * 城市ID
   */
  cityId?: number;

  /**
   * 区
   */
  area?: string;
  areaFuzzy?: string;

  /**
   * 区ID
   */
  areaId?: number;

  /**
   * 邮编
   */
  postCode?: string;
  postCodeFuzzy?: string;

  /**
   * 地址
   */
  addr?: string;
  addrFuzzy?: string;

  /**
   * 手机
   */
  mobile?: string;
  mobileFuzzy?: string;

  /**
   * 状态,1正常，0无效
   */
  status?: number;

  /**
   * 是否默认地址 1是
   */
  commonAddr?: number;

  /**
   * 建立时间
   */
  createTime?: string;
  createTimeStart?: string;
  createTimeEnd?: string;

  /**
   * 版本号
   */
  version?: number;

  /**
   * 更新时间
   */
  updateTime?: string;
  updateTimeStart?: string;
  updateTimeEnd?: string;
}

interface UserParam {
  /**
   * ID
   */
  userId?: string;
  userIdFuzzy?: string;

  /**
   * 用户昵称
   */
  nickName?: string;
  nickNameFuzzy?: string;

  /**
   * 真实姓名
   */
  realName?: string;
  realNameFuzzy?: string;

  /**
   * 用户邮箱
   */
  userMail?: string;
  userMailFuzzy?: string;

  /**
   * 登录密码
   */
  loginPassword?: string;
  loginPasswordFuzzy?: string;

  /**
   * 支付密码
   */
  payPassword?: string;
  payPasswordFuzzy?: string;

  /**
   * 手机号码
   */
  userMobile?: string;
  userMobileFuzzy?: string;

  /**
   * 修改时间
   */
  modifyTime?: string;
  modifyTimeStart?: string;
  modifyTimeEnd?: string;

  /**
   * 注册时间
   */
  userRegtime?: string;
  userRegtimeStart?: string;
  userRegtimeEnd?: string;

  /**
   * 注册IP
   */
  userRegip?: string;
  userRegipFuzzy?: string;

  /**
   * 最后登录时间
   */
  userLasttime?: string;
  userLasttimeStart?: string;
  userLasttimeEnd?: string;

  /**
   * 最后登录IP
   */
  userLastip?: string;
  userLastipFuzzy?: string;

  /**
   * 备注
   */
  userMemo?: string;
  userMemoFuzzy?: string;

  /**
   * M(男) or F(女)
   */
  sex?: string;
  sexFuzzy?: string;

  /**
   * 例如：2009-11-27
   */
  birthDate?: string;
  birthDateFuzzy?: string;

  /**
   * 头像图片路径
   */
  pic?: string;
  picFuzzy?: string;

  /**
   * 状态 1 正常 0 无效
   */
  status?: number;

  /**
   * 用户积分
   */
  score?: number;
}
