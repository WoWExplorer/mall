import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function categoryPropSelectListByCondition(data: CategoryPropParam){
	return request({
		url: '/categoryProp/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function categoryPropSelectCount(data: CategoryPropParam){
	return request({
		url: '/categoryProp/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function categoryPropSelectList(data: CategoryPropParam){
	return request({
		url: '/categoryProp/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function categoryPropInsert(data: CategoryPropParam){
	return request({
		url: '/categoryProp/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function categoryPropInsertBatch(data: CategoryPropParam){
	return request({
		url: '/categoryProp/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function categoryPropInsertOrUpdateBatch(data: CategoryPropParam){
	return request({
		url: '/categoryProp/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function categoryPropselectById(data: any) {
	return request({
		url: '/categoryProp/selectById',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function categoryPropupdateById(data: any) {
	return request({
		url: '/categoryProp/updateById',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function categoryPropdeleteById(data: any ){
	return request({
		url: '/categoryProp/deleteById',
		method: 'POST',
		data
	})
}
