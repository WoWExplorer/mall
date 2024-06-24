import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function pickAddrSelectListByCondition(data: PickAddrParam){
	return request({
		url: '/pickAddr/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function pickAddrSelectCount(data: PickAddrParam){
	return request({
		url: '/pickAddr/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function pickAddrSelectList(data: PickAddrParam){
	return request({
		url: '/pickAddr/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function pickAddrInsert(data: PickAddrParam){
	return request({
		url: '/pickAddr/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function pickAddrInsertBatch(data: PickAddrParam){
	return request({
		url: '/pickAddr/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function pickAddrInsertOrUpdateBatch(data: PickAddrParam){
	return request({
		url: '/pickAddr/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据AddrId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function pickAddrselectByAddrId(data: any) {
	return request({
		url: '/pickAddr/selectByAddrId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据AddrId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function pickAddrupdateByAddrId(data: any) {
	return request({
		url: '/pickAddr/updateByAddrId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据AddrId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function pickAddrdeleteByAddrId(data: any ){
	return request({
		url: '/pickAddr/deleteByAddrId',
		method: 'POST',
		data
	})
}
