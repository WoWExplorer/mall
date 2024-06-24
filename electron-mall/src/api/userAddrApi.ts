import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userAddrSelectListByCondition(data: UserAddrParam){
	return request({
		url: '/userAddr/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userAddrSelectCount(data: UserAddrParam){
	return request({
		url: '/userAddr/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userAddrSelectList(data: UserAddrParam){
	return request({
		url: '/userAddr/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userAddrInsert(data: UserAddrParam){
	return request({
		url: '/userAddr/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userAddrInsertBatch(data: UserAddrParam){
	return request({
		url: '/userAddr/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userAddrInsertOrUpdateBatch(data: UserAddrParam){
	return request({
		url: '/userAddr/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据AddrId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userAddrselectByAddrId(data: any) {
	return request({
		url: '/userAddr/selectByAddrId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据AddrId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userAddrupdateByAddrId(data: any) {
	return request({
		url: '/userAddr/updateByAddrId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据AddrId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userAddrdeleteByAddrId(data: any ){
	return request({
		url: '/userAddr/deleteByAddrId',
		method: 'POST',
		data
	})
}
