import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transcityFreeSelectListByCondition(data: TranscityFreeParam){
	return request({
		url: '/transcityFree/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transcityFreeSelectCount(data: TranscityFreeParam){
	return request({
		url: '/transcityFree/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transcityFreeSelectList(data: TranscityFreeParam){
	return request({
		url: '/transcityFree/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transcityFreeInsert(data: TranscityFreeParam){
	return request({
		url: '/transcityFree/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transcityFreeInsertBatch(data: TranscityFreeParam){
	return request({
		url: '/transcityFree/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transcityFreeInsertOrUpdateBatch(data: TranscityFreeParam){
	return request({
		url: '/transcityFree/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据TranscityFreeId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transcityFreeselectByTranscityFreeId(data: any) {
	return request({
		url: '/transcityFree/selectByTranscityFreeId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据TranscityFreeId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transcityFreeupdateByTranscityFreeId(data: any) {
	return request({
		url: '/transcityFree/updateByTranscityFreeId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据TranscityFreeId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transcityFreedeleteByTranscityFreeId(data: any ){
	return request({
		url: '/transcityFree/deleteByTranscityFreeId',
		method: 'POST',
		data
	})
}
