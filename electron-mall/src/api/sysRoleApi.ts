import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysRoleSelectListByCondition(data: SysRoleParam){
	return request({
		url: '/sysRole/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysRoleSelectCount(data: SysRoleParam){
	return request({
		url: '/sysRole/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysRoleSelectList(data: SysRoleParam){
	return request({
		url: '/sysRole/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysRoleInsert(data: SysRoleParam){
	return request({
		url: '/sysRole/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysRoleInsertBatch(data: SysRoleParam){
	return request({
		url: '/sysRole/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysRoleInsertOrUpdateBatch(data: SysRoleParam){
	return request({
		url: '/sysRole/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据RoleId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysRoleselectByRoleId(data: any) {
	return request({
		url: '/sysRole/selectByRoleId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据RoleId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysRoleupdateByRoleId(data: any) {
	return request({
		url: '/sysRole/updateByRoleId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据RoleId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysRoledeleteByRoleId(data: any ){
	return request({
		url: '/sysRole/deleteByRoleId',
		method: 'POST',
		data
	})
}
