import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysLogSelectListByCondition(data: SysLogParam){
	return request({
		url: '/sysLog/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysLogSelectCount(data: SysLogParam){
	return request({
		url: '/sysLog/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysLogSelectList(data: SysLogParam){
	return request({
		url: '/sysLog/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysLogInsert(data: SysLogParam){
	return request({
		url: '/sysLog/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysLogInsertBatch(data: SysLogParam){
	return request({
		url: '/sysLog/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysLogInsertOrUpdateBatch(data: SysLogParam){
	return request({
		url: '/sysLog/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysLogselectById(data: any) {
	return request({
		url: '/sysLog/selectById',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysLogupdateById(data: any) {
	return request({
		url: '/sysLog/updateById',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function sysLogdeleteById(data: any ){
	return request({
		url: '/sysLog/deleteById',
		method: 'POST',
		data
	})
}
