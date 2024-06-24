import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userCollectionSelectListByCondition(data: UserCollectionParam){
	return request({
		url: '/userCollection/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userCollectionSelectCount(data: UserCollectionParam){
	return request({
		url: '/userCollection/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userCollectionSelectList(data: UserCollectionParam){
	return request({
		url: '/userCollection/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userCollectionInsert(data: UserCollectionParam){
	return request({
		url: '/userCollection/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userCollectionInsertBatch(data: UserCollectionParam){
	return request({
		url: '/userCollection/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userCollectionInsertOrUpdateBatch(data: UserCollectionParam){
	return request({
		url: '/userCollection/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userCollectionselectById(data: any) {
	return request({
		url: '/userCollection/selectById',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userCollectionupdateById(data: any) {
	return request({
		url: '/userCollection/updateById',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function userCollectiondeleteById(data: any ){
	return request({
		url: '/userCollection/deleteById',
		method: 'POST',
		data
	})
}
