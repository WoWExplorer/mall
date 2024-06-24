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
