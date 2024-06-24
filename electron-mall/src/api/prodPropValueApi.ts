import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodPropValueSelectListByCondition(data: ProdPropValueParam){
	return request({
		url: '/prodPropValue/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodPropValueSelectCount(data: ProdPropValueParam){
	return request({
		url: '/prodPropValue/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodPropValueSelectList(data: ProdPropValueParam){
	return request({
		url: '/prodPropValue/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodPropValueInsert(data: ProdPropValueParam){
	return request({
		url: '/prodPropValue/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodPropValueInsertBatch(data: ProdPropValueParam){
	return request({
		url: '/prodPropValue/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodPropValueInsertOrUpdateBatch(data: ProdPropValueParam){
	return request({
		url: '/prodPropValue/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据ValueId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodPropValueselectByValueId(data: any) {
	return request({
		url: '/prodPropValue/selectByValueId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据ValueId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodPropValueupdateByValueId(data: any) {
	return request({
		url: '/prodPropValue/updateByValueId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据ValueId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodPropValuedeleteByValueId(data: any ){
	return request({
		url: '/prodPropValue/deleteByValueId',
		method: 'POST',
		data
	})
}
