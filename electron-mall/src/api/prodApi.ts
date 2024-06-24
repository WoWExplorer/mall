import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodSelectListByCondition(data: ProdParam){
	return request({
		url: '/prod/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodSelectCount(data: ProdParam){
	return request({
		url: '/prod/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodSelectList(data: ProdParam){
	return request({
		url: '/prod/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodInsert(data: ProdParam){
	return request({
		url: '/prod/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodInsertBatch(data: ProdParam){
	return request({
		url: '/prod/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodInsertOrUpdateBatch(data: ProdParam){
	return request({
		url: '/prod/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据ProdId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodselectByProdId(data: any) {
	return request({
		url: '/prod/selectByProdId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据ProdId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function produpdateByProdId(data: any) {
	return request({
		url: '/prod/updateByProdId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据ProdId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function proddeleteByProdId(data: any ){
	return request({
		url: '/prod/deleteByProdId',
		method: 'POST',
		data
	})
}
