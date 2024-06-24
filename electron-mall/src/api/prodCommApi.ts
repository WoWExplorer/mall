import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodCommSelectListByCondition(data: ProdCommParam){
	return request({
		url: '/prodComm/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodCommSelectCount(data: ProdCommParam){
	return request({
		url: '/prodComm/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodCommSelectList(data: ProdCommParam){
	return request({
		url: '/prodComm/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodCommInsert(data: ProdCommParam){
	return request({
		url: '/prodComm/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodCommInsertBatch(data: ProdCommParam){
	return request({
		url: '/prodComm/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodCommInsertOrUpdateBatch(data: ProdCommParam){
	return request({
		url: '/prodComm/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据ProdCommId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodCommselectByProdCommId(data: any) {
	return request({
		url: '/prodComm/selectByProdCommId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据ProdCommId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodCommupdateByProdCommId(data: any) {
	return request({
		url: '/prodComm/updateByProdCommId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据ProdCommId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodCommdeleteByProdCommId(data: any ){
	return request({
		url: '/prodComm/deleteByProdCommId',
		method: 'POST',
		data
	})
}
