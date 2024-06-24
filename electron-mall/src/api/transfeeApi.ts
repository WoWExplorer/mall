import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transfeeSelectListByCondition(data: TransfeeParam){
	return request({
		url: '/transfee/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transfeeSelectCount(data: TransfeeParam){
	return request({
		url: '/transfee/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transfeeSelectList(data: TransfeeParam){
	return request({
		url: '/transfee/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transfeeInsert(data: TransfeeParam){
	return request({
		url: '/transfee/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transfeeInsertBatch(data: TransfeeParam){
	return request({
		url: '/transfee/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transfeeInsertOrUpdateBatch(data: TransfeeParam){
	return request({
		url: '/transfee/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据TransfeeId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transfeeselectByTransfeeId(data: any) {
	return request({
		url: '/transfee/selectByTransfeeId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据TransfeeId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transfeeupdateByTransfeeId(data: any) {
	return request({
		url: '/transfee/updateByTransfeeId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据TransfeeId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function transfeedeleteByTransfeeId(data: any ){
	return request({
		url: '/transfee/deleteByTransfeeId',
		method: 'POST',
		data
	})
}
