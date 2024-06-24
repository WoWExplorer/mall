import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysRoleMenuSelectListByCondition(data: SysRoleMenuParam){
	return request({
		url: '/sysRoleMenu/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysRoleMenuSelectCount(data: SysRoleMenuParam){
	return request({
		url: '/sysRoleMenu/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysRoleMenuSelectList(data: SysRoleMenuParam){
	return request({
		url: '/sysRoleMenu/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysRoleMenuInsert(data: SysRoleMenuParam){
	return request({
		url: '/sysRoleMenu/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysRoleMenuInsertBatch(data: SysRoleMenuParam){
	return request({
		url: '/sysRoleMenu/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysRoleMenuInsertOrUpdateBatch(data: SysRoleMenuParam){
	return request({
		url: '/sysRoleMenu/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysRoleMenuselectById(data: any) {
	return request({
		url: '/sysRoleMenu/selectById',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysRoleMenuupdateById(data: any) {
	return request({
		url: '/sysRoleMenu/updateById',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysRoleMenudeleteById(data: any ){
	return request({
		url: '/sysRoleMenu/deleteById',
		method: 'POST',
		data
	})
}
