import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodFavoriteSelectListByCondition(data: ProdFavoriteParam){
	return request({
		url: '/prodFavorite/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodFavoriteSelectCount(data: ProdFavoriteParam){
	return request({
		url: '/prodFavorite/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodFavoriteSelectList(data: ProdFavoriteParam){
	return request({
		url: '/prodFavorite/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodFavoriteInsert(data: ProdFavoriteParam){
	return request({
		url: '/prodFavorite/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodFavoriteInsertBatch(data: ProdFavoriteParam){
	return request({
		url: '/prodFavorite/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodFavoriteInsertOrUpdateBatch(data: ProdFavoriteParam){
	return request({
		url: '/prodFavorite/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据FavoriteId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodFavoriteselectByFavoriteId(data: any) {
	return request({
		url: '/prodFavorite/selectByFavoriteId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据FavoriteId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodFavoriteupdateByFavoriteId(data: any) {
	return request({
		url: '/prodFavorite/updateByFavoriteId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据FavoriteId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function prodFavoritedeleteByFavoriteId(data: any ){
	return request({
		url: '/prodFavorite/deleteByFavoriteId',
		method: 'POST',
		data
	})
}
