import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transcitySelectListByCondition(data: TranscityParam){
	return request({
		url: '/transcity/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transcitySelectCount(data: TranscityParam){
	return request({
		url: '/transcity/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transcitySelectList(data: TranscityParam){
	return request({
		url: '/transcity/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transcityInsert(data: TranscityParam){
	return request({
		url: '/transcity/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transcityInsertBatch(data: TranscityParam){
	return request({
		url: '/transcity/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transcityInsertOrUpdateBatch(data: TranscityParam){
	return request({
		url: '/transcity/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据TranscityId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transcityselectByTranscityId(data: any) {
	return request({
		url: '/transcity/selectByTranscityId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据TranscityId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transcityupdateByTranscityId(data: any) {
	return request({
		url: '/transcity/updateByTranscityId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据TranscityId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transcitydeleteByTranscityId(data: any ){
	return request({
		url: '/transcity/deleteByTranscityId',
		method: 'POST',
		data
	})
}
