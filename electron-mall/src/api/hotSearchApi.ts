import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function hotSearchSelectListByCondition(data: HotSearchParam){
	return request({
		url: '/hotSearch/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function hotSearchSelectCount(data: HotSearchParam){
	return request({
		url: '/hotSearch/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function hotSearchSelectList(data: HotSearchParam){
	return request({
		url: '/hotSearch/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function hotSearchInsert(data: HotSearchParam){
	return request({
		url: '/hotSearch/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function hotSearchInsertBatch(data: HotSearchParam){
	return request({
		url: '/hotSearch/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function hotSearchInsertOrUpdateBatch(data: HotSearchParam){
	return request({
		url: '/hotSearch/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据HotSearchId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function hotSearchselectByHotSearchId(data: any) {
	return request({
		url: '/hotSearch/selectByHotSearchId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据HotSearchId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function hotSearchupdateByHotSearchId(data: any) {
	return request({
		url: '/hotSearch/updateByHotSearchId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据HotSearchId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function hotSearchdeleteByHotSearchId(data: any ){
	return request({
		url: '/hotSearch/deleteByHotSearchId',
		method: 'POST',
		data
	})
}
