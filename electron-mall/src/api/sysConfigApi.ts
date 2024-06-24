import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysConfigSelectListByCondition(data: SysConfigParam){
	return request({
		url: '/sysConfig/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysConfigSelectCount(data: SysConfigParam){
	return request({
		url: '/sysConfig/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysConfigSelectList(data: SysConfigParam){
	return request({
		url: '/sysConfig/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysConfigInsert(data: SysConfigParam){
	return request({
		url: '/sysConfig/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysConfigInsertBatch(data: SysConfigParam){
	return request({
		url: '/sysConfig/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysConfigInsertOrUpdateBatch(data: SysConfigParam){
	return request({
		url: '/sysConfig/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysConfigselectById(data: any) {
	return request({
		url: '/sysConfig/selectById',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysConfigupdateById(data: any) {
	return request({
		url: '/sysConfig/updateById',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysConfigdeleteById(data: any ){
	return request({
		url: '/sysConfig/deleteById',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据ParamKey查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysConfigselectByParamKey(data: any) {
	return request({
		url: '/sysConfig/selectByParamKey',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据ParamKey更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysConfigupdateByParamKey(data: any) {
	return request({
		url: '/sysConfig/updateByParamKey',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据ParamKey删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysConfigdeleteByParamKey(data: any ){
	return request({
		url: '/sysConfig/deleteByParamKey',
		method: 'POST',
		data
	})
}
