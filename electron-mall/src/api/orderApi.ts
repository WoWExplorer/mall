import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderSelectListByCondition(data: OrderParam){
	return request({
		url: '/order/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderSelectCount(data: OrderParam){
	return request({
		url: '/order/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderSelectList(data: OrderParam){
	return request({
		url: '/order/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderInsert(data: OrderParam){
	return request({
		url: '/order/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderInsertBatch(data: OrderParam){
	return request({
		url: '/order/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderInsertOrUpdateBatch(data: OrderParam){
	return request({
		url: '/order/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据OrderId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderselectByOrderId(data: any) {
	return request({
		url: '/order/selectByOrderId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据OrderId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderupdateByOrderId(data: any) {
	return request({
		url: '/order/updateByOrderId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据OrderId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderdeleteByOrderId(data: any ){
	return request({
		url: '/order/deleteByOrderId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据OrderNumber查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderselectByOrderNumber(data: any) {
	return request({
		url: '/order/selectByOrderNumber',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据OrderNumber更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderupdateByOrderNumber(data: any) {
	return request({
		url: '/order/updateByOrderNumber',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据OrderNumber删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderdeleteByOrderNumber(data: any ){
	return request({
		url: '/order/deleteByOrderNumber',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据UserIdAndOrderNumber查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderselectByUserIdAndOrderNumber(data: any) {
	return request({
		url: '/order/selectByUserIdAndOrderNumber',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据UserIdAndOrderNumber更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderupdateByUserIdAndOrderNumber(data: any) {
	return request({
		url: '/order/updateByUserIdAndOrderNumber',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据UserIdAndOrderNumber删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderdeleteByUserIdAndOrderNumber(data: any ){
	return request({
		url: '/order/deleteByUserIdAndOrderNumber',
		method: 'POST',
		data
	})
}
