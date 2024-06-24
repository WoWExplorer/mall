import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysUserSelectListByCondition(data: SysUserParam){
	return request({
		url: '/sysUser/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysUserSelectCount(data: SysUserParam){
	return request({
		url: '/sysUser/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysUserSelectList(data: SysUserParam){
	return request({
		url: '/sysUser/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysUserInsert(data: SysUserParam){
	return request({
		url: '/sysUser/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysUserInsertBatch(data: SysUserParam){
	return request({
		url: '/sysUser/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysUserInsertOrUpdateBatch(data: SysUserParam){
	return request({
		url: '/sysUser/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据UserId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysUserselectByUserId(data: any) {
	return request({
		url: '/sysUser/selectByUserId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据UserId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysUserupdateByUserId(data: any) {
	return request({
		url: '/sysUser/updateByUserId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据UserId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysUserdeleteByUserId(data: any ){
	return request({
		url: '/sysUser/deleteByUserId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Username查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysUserselectByUsername(data: any) {
	return request({
		url: '/sysUser/selectByUsername',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Username更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysUserupdateByUsername(data: any) {
	return request({
		url: '/sysUser/updateByUsername',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Username删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysUserdeleteByUsername(data: any ){
	return request({
		url: '/sysUser/deleteByUsername',
		method: 'POST',
		data
	})
}
