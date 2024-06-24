import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderItemSelectListByCondition(data: OrderItemParam){
	return request({
		url: '/orderItem/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderItemSelectCount(data: OrderItemParam){
	return request({
		url: '/orderItem/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderItemSelectList(data: OrderItemParam){
	return request({
		url: '/orderItem/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderItemInsert(data: OrderItemParam){
	return request({
		url: '/orderItem/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderItemInsertBatch(data: OrderItemParam){
	return request({
		url: '/orderItem/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderItemInsertOrUpdateBatch(data: OrderItemParam){
	return request({
		url: '/orderItem/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据OrderItemId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderItemselectByOrderItemId(data: any) {
	return request({
		url: '/orderItem/selectByOrderItemId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据OrderItemId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderItemupdateByOrderItemId(data: any) {
	return request({
		url: '/orderItem/updateByOrderItemId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据OrderItemId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderItemdeleteByOrderItemId(data: any ){
	return request({
		url: '/orderItem/deleteByOrderItemId',
		method: 'POST',
		data
	})
}
