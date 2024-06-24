import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userAddrOrderSelectListByCondition(data: UserAddrOrderParam){
	return request({
		url: '/userAddrOrder/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userAddrOrderSelectCount(data: UserAddrOrderParam){
	return request({
		url: '/userAddrOrder/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userAddrOrderSelectList(data: UserAddrOrderParam){
	return request({
		url: '/userAddrOrder/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userAddrOrderInsert(data: UserAddrOrderParam){
	return request({
		url: '/userAddrOrder/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userAddrOrderInsertBatch(data: UserAddrOrderParam){
	return request({
		url: '/userAddrOrder/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userAddrOrderInsertOrUpdateBatch(data: UserAddrOrderParam){
	return request({
		url: '/userAddrOrder/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据AddrOrderId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userAddrOrderselectByAddrOrderId(data: any) {
	return request({
		url: '/userAddrOrder/selectByAddrOrderId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据AddrOrderId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userAddrOrderupdateByAddrOrderId(data: any) {
	return request({
		url: '/userAddrOrder/updateByAddrOrderId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据AddrOrderId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userAddrOrderdeleteByAddrOrderId(data: any ){
	return request({
		url: '/userAddrOrder/deleteByAddrOrderId',
		method: 'POST',
		data
	})
}
