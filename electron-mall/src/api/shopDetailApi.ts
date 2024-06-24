import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function shopDetailSelectListByCondition(data: ShopDetailParam){
	return request({
		url: '/shopDetail/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function shopDetailSelectCount(data: ShopDetailParam){
	return request({
		url: '/shopDetail/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function shopDetailSelectList(data: ShopDetailParam){
	return request({
		url: '/shopDetail/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function shopDetailInsert(data: ShopDetailParam){
	return request({
		url: '/shopDetail/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function shopDetailInsertBatch(data: ShopDetailParam){
	return request({
		url: '/shopDetail/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function shopDetailInsertOrUpdateBatch(data: ShopDetailParam){
	return request({
		url: '/shopDetail/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据ShopId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function shopDetailselectByShopId(data: any) {
	return request({
		url: '/shopDetail/selectByShopId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据ShopId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function shopDetailupdateByShopId(data: any) {
	return request({
		url: '/shopDetail/updateByShopId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据ShopId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function shopDetaildeleteByShopId(data: any ){
	return request({
		url: '/shopDetail/deleteByShopId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Mobile查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function shopDetailselectByMobile(data: any) {
	return request({
		url: '/shopDetail/selectByMobile',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Mobile更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function shopDetailupdateByMobile(data: any) {
	return request({
		url: '/shopDetail/updateByMobile',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Mobile删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function shopDetaildeleteByMobile(data: any ){
	return request({
		url: '/shopDetail/deleteByMobile',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据UserId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function shopDetailselectByUserId(data: any) {
	return request({
		url: '/shopDetail/selectByUserId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据UserId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function shopDetailupdateByUserId(data: any) {
	return request({
		url: '/shopDetail/updateByUserId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据UserId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function shopDetaildeleteByUserId(data: any ){
	return request({
		url: '/shopDetail/deleteByUserId',
		method: 'POST',
		data
	})
}
