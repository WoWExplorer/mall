import Http from '@/utils/http';
import request from '@/utils/request';
const api = new Http('http://localhost:8000/user')

/**
 * 
 * @param data '/selectByUserMobile', data
 * @returns 
 */
export function login(data: any){
  return request({
    url: '/login',
    method: 'POST',
    data
  })
}

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
