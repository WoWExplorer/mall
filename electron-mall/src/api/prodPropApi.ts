import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodPropSelectListByCondition(data: ProdPropParam){
	return request({
		url: '/prodProp/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodPropSelectCount(data: ProdPropParam){
	return request({
		url: '/prodProp/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodPropSelectList(data: ProdPropParam){
	return request({
		url: '/prodProp/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodPropInsert(data: ProdPropParam){
	return request({
		url: '/prodProp/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodPropInsertBatch(data: ProdPropParam){
	return request({
		url: '/prodProp/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodPropInsertOrUpdateBatch(data: ProdPropParam){
	return request({
		url: '/prodProp/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据PropId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodPropselectByPropId(data: any) {
	return request({
		url: '/prodProp/selectByPropId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据PropId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodPropupdateByPropId(data: any) {
	return request({
		url: '/prodProp/updateByPropId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据PropId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodPropdeleteByPropId(data: any ){
	return request({
		url: '/prodProp/deleteByPropId',
		method: 'POST',
		data
	})
}
