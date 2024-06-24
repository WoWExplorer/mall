import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysMenuSelectListByCondition(data: SysMenuParam){
	return request({
		url: '/sysMenu/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysMenuSelectCount(data: SysMenuParam){
	return request({
		url: '/sysMenu/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysMenuSelectList(data: SysMenuParam){
	return request({
		url: '/sysMenu/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysMenuInsert(data: SysMenuParam){
	return request({
		url: '/sysMenu/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysMenuInsertBatch(data: SysMenuParam){
	return request({
		url: '/sysMenu/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysMenuInsertOrUpdateBatch(data: SysMenuParam){
	return request({
		url: '/sysMenu/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据MenuId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysMenuselectByMenuId(data: any) {
	return request({
		url: '/sysMenu/selectByMenuId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据MenuId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysMenuupdateByMenuId(data: any) {
	return request({
		url: '/sysMenu/updateByMenuId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据MenuId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysMenudeleteByMenuId(data: any ){
	return request({
		url: '/sysMenu/deleteByMenuId',
		method: 'POST',
		data
	})
}
