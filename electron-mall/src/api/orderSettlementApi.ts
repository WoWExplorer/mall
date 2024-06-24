import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderSettlementSelectListByCondition(data: OrderSettlementParam){
	return request({
		url: '/orderSettlement/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderSettlementSelectCount(data: OrderSettlementParam){
	return request({
		url: '/orderSettlement/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderSettlementSelectList(data: OrderSettlementParam){
	return request({
		url: '/orderSettlement/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderSettlementInsert(data: OrderSettlementParam){
	return request({
		url: '/orderSettlement/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderSettlementInsertBatch(data: OrderSettlementParam){
	return request({
		url: '/orderSettlement/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderSettlementInsertOrUpdateBatch(data: OrderSettlementParam){
	return request({
		url: '/orderSettlement/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据SettlementId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderSettlementselectBySettlementId(data: any) {
	return request({
		url: '/orderSettlement/selectBySettlementId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据SettlementId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderSettlementupdateBySettlementId(data: any) {
	return request({
		url: '/orderSettlement/updateBySettlementId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据SettlementId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderSettlementdeleteBySettlementId(data: any ){
	return request({
		url: '/orderSettlement/deleteBySettlementId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据OrderNumber查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderSettlementselectByOrderNumber(data: any) {
	return request({
		url: '/orderSettlement/selectByOrderNumber',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据OrderNumber更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderSettlementupdateByOrderNumber(data: any) {
	return request({
		url: '/orderSettlement/updateByOrderNumber',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据OrderNumber删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function orderSettlementdeleteByOrderNumber(data: any ){
	return request({
		url: '/orderSettlement/deleteByOrderNumber',
		method: 'POST',
		data
	})
}
