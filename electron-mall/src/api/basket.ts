import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function basketSelectListByCondition(data: BasketParam){
	return request({
		url: '/basket/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function basketSelectCount(data: BasketParam){
	return request({
		url: '/basket/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function basketSelectList(data: BasketParam){
	return request({
		url: '/basket/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function basketInsert(data: BasketParam){
	return request({
		url: '/basket/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function basketInsertBatch(data: BasketParam){
	return request({
		url: '/basket/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function basketInsertOrUpdateBatch(data: BasketParam){
	return request({
		url: '/basket/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据BasketId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function basketselectByBasketId(data: any) {
	return request({
		url: '/basket/selectByBasketId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据BasketId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function basketupdateByBasketId(data: any) {
	return request({
		url: '/basket/updateByBasketId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据BasketId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function basketdeleteByBasketId(data: any ){
	return request({
		url: '/basket/deleteByBasketId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据SkuIdAndUserIdAndShopId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function basketselectBySkuIdAndUserIdAndShopId(data: any) {
	return request({
		url: '/basket/selectBySkuIdAndUserIdAndShopId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据SkuIdAndUserIdAndShopId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function basketupdateBySkuIdAndUserIdAndShopId(data: any) {
	return request({
		url: '/basket/updateBySkuIdAndUserIdAndShopId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据SkuIdAndUserIdAndShopId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function basketdeleteBySkuIdAndUserIdAndShopId(data: any ){
	return request({
		url: '/basket/deleteBySkuIdAndUserIdAndShopId',
		method: 'POST',
		data
	})
}
