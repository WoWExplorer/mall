import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function brandSelectListByCondition(data: BrandParam){
	return request({
		url: '/brand/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function brandSelectCount(data: BrandParam){
	return request({
		url: '/brand/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function brandSelectList(data: BrandParam){
	return request({
		url: '/brand/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function brandInsert(data: BrandParam){
	return request({
		url: '/brand/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function brandInsertBatch(data: BrandParam){
	return request({
		url: '/brand/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function brandInsertOrUpdateBatch(data: BrandParam){
	return request({
		url: '/brand/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据BrandId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function brandselectByBrandId(data: any) {
	return request({
		url: '/brand/selectByBrandId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据BrandId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function brandupdateByBrandId(data: any) {
	return request({
		url: '/brand/updateByBrandId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据BrandId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function branddeleteByBrandId(data: any ){
	return request({
		url: '/brand/deleteByBrandId',
		method: 'POST',
		data
	})
}
