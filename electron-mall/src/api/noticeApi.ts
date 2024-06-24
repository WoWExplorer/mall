import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function noticeSelectListByCondition(data: NoticeParam){
	return request({
		url: '/notice/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function noticeSelectCount(data: NoticeParam){
	return request({
		url: '/notice/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function noticeSelectList(data: NoticeParam){
	return request({
		url: '/notice/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function noticeInsert(data: NoticeParam){
	return request({
		url: '/notice/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function noticeInsertBatch(data: NoticeParam){
	return request({
		url: '/notice/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function noticeInsertOrUpdateBatch(data: NoticeParam){
	return request({
		url: '/notice/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function noticeselectById(data: any) {
	return request({
		url: '/notice/selectById',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function noticeupdateById(data: any) {
	return request({
		url: '/notice/updateById',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function noticedeleteById(data: any ){
	return request({
		url: '/notice/deleteById',
		method: 'POST',
		data
	})
}
