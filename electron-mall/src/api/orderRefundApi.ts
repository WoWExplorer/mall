import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderRefundSelectListByCondition(data: OrderRefundParam){
	return request({
		url: '/orderRefund/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderRefundSelectCount(data: OrderRefundParam){
	return request({
		url: '/orderRefund/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderRefundSelectList(data: OrderRefundParam){
	return request({
		url: '/orderRefund/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderRefundInsert(data: OrderRefundParam){
	return request({
		url: '/orderRefund/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderRefundInsertBatch(data: OrderRefundParam){
	return request({
		url: '/orderRefund/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderRefundInsertOrUpdateBatch(data: OrderRefundParam){
	return request({
		url: '/orderRefund/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据RefundId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderRefundselectByRefundId(data: any) {
	return request({
		url: '/orderRefund/selectByRefundId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据RefundId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderRefundupdateByRefundId(data: any) {
	return request({
		url: '/orderRefund/updateByRefundId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据RefundId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderRefunddeleteByRefundId(data: any ){
	return request({
		url: '/orderRefund/deleteByRefundId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据RefundSn查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderRefundselectByRefundSn(data: any) {
	return request({
		url: '/orderRefund/selectByRefundSn',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据RefundSn更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderRefundupdateByRefundSn(data: any) {
	return request({
		url: '/orderRefund/updateByRefundSn',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据RefundSn删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderRefunddeleteByRefundSn(data: any ){
	return request({
		url: '/orderRefund/deleteByRefundSn',
		method: 'POST',
		data
	})
}
