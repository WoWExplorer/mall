import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transfeeFreeSelectListByCondition(data: TransfeeFreeParam){
	return request({
		url: '/transfeeFree/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transfeeFreeSelectCount(data: TransfeeFreeParam){
	return request({
		url: '/transfeeFree/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transfeeFreeSelectList(data: TransfeeFreeParam){
	return request({
		url: '/transfeeFree/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transfeeFreeInsert(data: TransfeeFreeParam){
	return request({
		url: '/transfeeFree/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transfeeFreeInsertBatch(data: TransfeeFreeParam){
	return request({
		url: '/transfeeFree/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transfeeFreeInsertOrUpdateBatch(data: TransfeeFreeParam){
	return request({
		url: '/transfeeFree/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据TransfeeFreeId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transfeeFreeselectByTransfeeFreeId(data: any) {
	return request({
		url: '/transfeeFree/selectByTransfeeFreeId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据TransfeeFreeId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transfeeFreeupdateByTransfeeFreeId(data: any) {
	return request({
		url: '/transfeeFree/updateByTransfeeFreeId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据TransfeeFreeId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transfeeFreedeleteByTransfeeFreeId(data: any ){
	return request({
		url: '/transfeeFree/deleteByTransfeeFreeId',
		method: 'POST',
		data
	})
}
