import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function deliverySelectListByCondition(data: DeliveryParam){
	return request({
		url: '/delivery/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function deliverySelectCount(data: DeliveryParam){
	return request({
		url: '/delivery/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function deliverySelectList(data: DeliveryParam){
	return request({
		url: '/delivery/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function deliveryInsert(data: DeliveryParam){
	return request({
		url: '/delivery/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function deliveryInsertBatch(data: DeliveryParam){
	return request({
		url: '/delivery/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function deliveryInsertOrUpdateBatch(data: DeliveryParam){
	return request({
		url: '/delivery/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据DvyId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function deliveryselectByDvyId(data: any) {
	return request({
		url: '/delivery/selectByDvyId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据DvyId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function deliveryupdateByDvyId(data: any) {
	return request({
		url: '/delivery/updateByDvyId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据DvyId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function deliverydeleteByDvyId(data: any ){
	return request({
		url: '/delivery/deleteByDvyId',
		method: 'POST',
		data
	})
}
