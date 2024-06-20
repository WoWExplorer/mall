import request from '@/utils/request';

/**
 * 根据手机号查询用户
 * @param data
 */
export function selectByUserMobile(data: any){
  return request({
    url: '/user/selectByUserMobile',
    method: 'POST',
    data
  })
}


/**
 * {"value":"f28af5eb-4cea-4694-8498-b964359d8ec2","expire":1719393496941}
 */
