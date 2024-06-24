import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function skuSelectListByCondition(data: SkuParam){
	return request({
		url: '/sku/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function skuSelectCount(data: SkuParam){
	return request({
		url: '/sku/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function skuSelectList(data: SkuParam){
	return request({
		url: '/sku/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function skuInsert(data: SkuParam){
	return request({
		url: '/sku/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function skuInsertBatch(data: SkuParam){
	return request({
		url: '/sku/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function skuInsertOrUpdateBatch(data: SkuParam){
	return request({
		url: '/sku/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据SkuId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function skuselectBySkuId(data: any) {
	return request({
		url: '/sku/selectBySkuId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据SkuId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function skuupdateBySkuId(data: any) {
	return request({
		url: '/sku/updateBySkuId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据SkuId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function skudeleteBySkuId(data: any ){
	return request({
		url: '/sku/deleteBySkuId',
		method: 'POST',
		data
	})
}
