import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function categoryBrandSelectListByCondition(data: CategoryBrandParam){
	return request({
		url: '/categoryBrand/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function categoryBrandSelectCount(data: CategoryBrandParam){
	return request({
		url: '/categoryBrand/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function categoryBrandSelectList(data: CategoryBrandParam){
	return request({
		url: '/categoryBrand/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function categoryBrandInsert(data: CategoryBrandParam){
	return request({
		url: '/categoryBrand/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function categoryBrandInsertBatch(data: CategoryBrandParam){
	return request({
		url: '/categoryBrand/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function categoryBrandInsertOrUpdateBatch(data: CategoryBrandParam){
	return request({
		url: '/categoryBrand/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function categoryBrandselectById(data: any) {
	return request({
		url: '/categoryBrand/selectById',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function categoryBrandupdateById(data: any) {
	return request({
		url: '/categoryBrand/updateById',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据Id删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function categoryBranddeleteById(data: any ){
	return request({
		url: '/categoryBrand/deleteById',
		method: 'POST',
		data
	})
}
