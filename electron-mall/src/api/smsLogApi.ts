import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function smsLogSelectListByCondition(data: SmsLogParam){
	return request({
		url: '/smsLog/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function smsLogSelectCount(data: SmsLogParam){
	return request({
		url: '/smsLog/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function smsLogSelectList(data: SmsLogParam){
	return request({
		url: '/smsLog/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function smsLogInsert(data: SmsLogParam){
	return request({
		url: '/smsLog/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function smsLogInsertBatch(data: SmsLogParam){
	return request({
		url: '/smsLog/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function smsLogInsertOrUpdateBatch(data: SmsLogParam){
	return request({
		url: '/smsLog/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function smsLogselectById(data: any) {
	return request({
		url: '/smsLog/selectById',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function smsLogupdateById(data: any) {
	return request({
		url: '/smsLog/updateById',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function smsLogdeleteById(data: any ){
	return request({
		url: '/smsLog/deleteById',
		method: 'POST',
		data
	})
}
