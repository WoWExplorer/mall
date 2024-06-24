import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodTagReferenceSelectListByCondition(data: ProdTagReferenceParam){
	return request({
		url: '/prodTagReference/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodTagReferenceSelectCount(data: ProdTagReferenceParam){
	return request({
		url: '/prodTagReference/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodTagReferenceSelectList(data: ProdTagReferenceParam){
	return request({
		url: '/prodTagReference/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodTagReferenceInsert(data: ProdTagReferenceParam){
	return request({
		url: '/prodTagReference/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodTagReferenceInsertBatch(data: ProdTagReferenceParam){
	return request({
		url: '/prodTagReference/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodTagReferenceInsertOrUpdateBatch(data: ProdTagReferenceParam){
	return request({
		url: '/prodTagReference/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据ReferenceId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodTagReferenceselectByReferenceId(data: any) {
	return request({
		url: '/prodTagReference/selectByReferenceId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据ReferenceId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodTagReferenceupdateByReferenceId(data: any) {
	return request({
		url: '/prodTagReference/updateByReferenceId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据ReferenceId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodTagReferencedeleteByReferenceId(data: any ){
	return request({
		url: '/prodTagReference/deleteByReferenceId',
		method: 'POST',
		data
	})
}
