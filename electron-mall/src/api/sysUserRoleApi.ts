import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysUserRoleSelectListByCondition(data: SysUserRoleParam){
	return request({
		url: '/sysUserRole/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysUserRoleSelectCount(data: SysUserRoleParam){
	return request({
		url: '/sysUserRole/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysUserRoleSelectList(data: SysUserRoleParam){
	return request({
		url: '/sysUserRole/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysUserRoleInsert(data: SysUserRoleParam){
	return request({
		url: '/sysUserRole/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysUserRoleInsertBatch(data: SysUserRoleParam){
	return request({
		url: '/sysUserRole/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysUserRoleInsertOrUpdateBatch(data: SysUserRoleParam){
	return request({
		url: '/sysUserRole/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysUserRoleselectById(data: any) {
	return request({
		url: '/sysUserRole/selectById',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysUserRoleupdateById(data: any) {
	return request({
		url: '/sysUserRole/updateById',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysUserRoledeleteById(data: any ){
	return request({
		url: '/sysUserRole/deleteById',
		method: 'POST',
		data
	})
}
