import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userSelectListByCondition(data: UserParam){
	return request({
		url: '/user/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userSelectCount(data: UserParam){
	return request({
		url: '/user/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userSelectList(data: UserParam){
	return request({
		url: '/user/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userInsert(data: UserParam){
	return request({
		url: '/user/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userInsertBatch(data: UserParam){
	return request({
		url: '/user/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userInsertOrUpdateBatch(data: UserParam){
	return request({
		url: '/user/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据UserId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userselectByUserId(data: any) {
	return request({
		url: '/user/selectByUserId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据UserId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userupdateByUserId(data: any) {
	return request({
		url: '/user/updateByUserId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据UserId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userdeleteByUserId(data: any ){
	return request({
		url: '/user/deleteByUserId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据UserMail查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userselectByUserMail(data: any) {
	return request({
		url: '/user/selectByUserMail',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据UserMail更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userupdateByUserMail(data: any) {
	return request({
		url: '/user/updateByUserMail',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据UserMail删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userdeleteByUserMail(data: any ){
	return request({
		url: '/user/deleteByUserMail',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据UserMobile查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userselectByUserMobile(data: any) {
	return request({
		url: '/user/selectByUserMobile',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据UserMobile更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userupdateByUserMobile(data: any) {
	return request({
		url: '/user/updateByUserMobile',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据UserMobile删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userdeleteByUserMobile(data: any ){
	return request({
		url: '/user/deleteByUserMobile',
		method: 'POST',
		data
	})
}
