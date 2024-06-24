import request from '@/utils/request';

/**
 *	@Description: 根据条件查询列表
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function indexImgSelectListByCondition(data: IndexImgParam){
	return request({
		url: '/indexImg/selectListByCondition',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据条件查询数量
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function indexImgSelectCount(data: IndexImgParam){
	return request({
		url: '/indexImg/selectCount',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 分页查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function indexImgSelectList(data: IndexImgParam){
	return request({
		url: '/indexImg/selectList',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function indexImgInsert(data: IndexImgParam){
	return request({
		url: '/indexImg/insert',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function indexImgInsertBatch(data: IndexImgParam){
	return request({
		url: '/indexImg/insertBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 批量新增或修改
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function indexImgInsertOrUpdateBatch(data: IndexImgParam){
	return request({
		url: '/indexImg/insertOrUpdateBatch',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据ImgId查询
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function indexImgselectByImgId(data: any) {
	return request({
		url: '/indexImg/selectByImgId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据ImgId更新
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function indexImgupdateByImgId(data: any) {
	return request({
		url: '/indexImg/updateByImgId',
		method: 'POST',
		data
	})
}
/**
 *	@Description: 根据ImgId删除
 *	@Author: wow
 *	@Date: 2024年06月24日
 */
export function indexImgdeleteByImgId(data: any ){
	return request({
		url: '/indexImg/deleteByImgId',
		method: 'POST',
		data
	})
}
