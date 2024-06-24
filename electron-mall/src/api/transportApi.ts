import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transportSelectListByCondition(data: TransportParam){
	return request({
		url: '/transport/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transportSelectCount(data: TransportParam){
	return request({
		url: '/transport/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transportSelectList(data: TransportParam){
	return request({
		url: '/transport/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transportInsert(data: TransportParam){
	return request({
		url: '/transport/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transportInsertBatch(data: TransportParam){
	return request({
		url: '/transport/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transportInsertOrUpdateBatch(data: TransportParam){
	return request({
		url: '/transport/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据TransportId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transportselectByTransportId(data: any) {
	return request({
		url: '/transport/selectByTransportId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据TransportId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transportupdateByTransportId(data: any) {
	return request({
		url: '/transport/updateByTransportId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据TransportId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transportdeleteByTransportId(data: any ){
	return request({
		url: '/transport/deleteByTransportId',
		method: 'POST',
		data
	})
}
