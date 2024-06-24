import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function categorySelectListByCondition(data: CategoryParam){
	return request({
		url: '/category/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function categorySelectCount(data: CategoryParam){
	return request({
		url: '/category/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function categorySelectList(data: CategoryParam){
	return request({
		url: '/category/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function categoryInsert(data: CategoryParam){
	return request({
		url: '/category/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function categoryInsertBatch(data: CategoryParam){
	return request({
		url: '/category/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function categoryInsertOrUpdateBatch(data: CategoryParam){
	return request({
		url: '/category/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据CategoryId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function categoryselectByCategoryId(data: any) {
	return request({
		url: '/category/selectByCategoryId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据CategoryId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function categoryupdateByCategoryId(data: any) {
	return request({
		url: '/category/updateByCategoryId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据CategoryId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function categorydeleteByCategoryId(data: any ){
	return request({
		url: '/category/deleteByCategoryId',
		method: 'POST',
		data
	})
}
