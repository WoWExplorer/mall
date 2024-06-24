import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function attachFileSelectListByCondition(data: AttachFileParam){
	return request({
		url: '/attachFile/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function attachFileSelectCount(data: AttachFileParam){
	return request({
		url: '/attachFile/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function attachFileSelectList(data: AttachFileParam){
	return request({
		url: '/attachFile/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function attachFileInsert(data: AttachFileParam){
	return request({
		url: '/attachFile/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function attachFileInsertBatch(data: AttachFileParam){
	return request({
		url: '/attachFile/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function attachFileInsertOrUpdateBatch(data: AttachFileParam){
	return request({
		url: '/attachFile/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据FileId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function attachFileselectByFileId(data: any) {
	return request({
		url: '/attachFile/selectByFileId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据FileId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function attachFileupdateByFileId(data: any) {
	return request({
		url: '/attachFile/updateByFileId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据FileId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function attachFiledeleteByFileId(data: any ){
	return request({
		url: '/attachFile/deleteByFileId',
		method: 'POST',
		data
	})
}
