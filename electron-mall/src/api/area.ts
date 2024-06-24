import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function areaSelectListByCondition(data: AreaParam){
	return request({
		url: '/area/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function areaSelectCount(data: AreaParam){
	return request({
		url: '/area/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function areaSelectList(data: AreaParam){
	return request({
		url: '/area/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function areaInsert(data: AreaParam){
	return request({
		url: '/area/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function areaInsertBatch(data: AreaParam[]){
	return request({
		url: '/area/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function areaInsertOrUpdateBatch(data: AreaParam[]){
	return request({
		url: '/area/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据AreaId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function areaselectByAreaId(data: any) {
	return request({
		url: '/area/selectByAreaId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据AreaId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function areaupdateByAreaId(data: any) {
	return request({
		url: '/area/updateByAreaId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据AreaId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function areadeleteByAreaId(data: any ){
	return request({
		url: '/area/deleteByAreaId',
		method: 'POST',
		data
	})
}
