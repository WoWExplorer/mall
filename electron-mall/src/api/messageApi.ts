import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function messageSelectListByCondition(data: MessageParam){
	return request({
		url: '/message/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function messageSelectCount(data: MessageParam){
	return request({
		url: '/message/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function messageSelectList(data: MessageParam){
	return request({
		url: '/message/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function messageInsert(data: MessageParam){
	return request({
		url: '/message/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function messageInsertBatch(data: MessageParam){
	return request({
		url: '/message/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function messageInsertOrUpdateBatch(data: MessageParam){
	return request({
		url: '/message/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function messageselectById(data: any) {
	return request({
		url: '/message/selectById',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function messageupdateById(data: any) {
	return request({
		url: '/message/updateById',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function messagedeleteById(data: any ){
	return request({
		url: '/message/deleteById',
		method: 'POST',
		data
	})
}
