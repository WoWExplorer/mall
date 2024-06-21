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

export function login(data: any){
    return request({
        url: '/login',
        method: 'POST',
        data
    })
}
export function renewTimeout(data: any){
    return request({
        url: '/renewTimeout',
        method: 'POST',
        data
    })
}

/**
 * 根据条件查询列表
 * {
 *     userId
 *     userIdFuzzy
 *     nickName
 *     nickNameFuzzy
 *     realName
 *     realNameFuzzy
 *     userMail
 *     userMailFuzzy
 * }
 * @param data
 */
export function selectListByCondition(data: UserParam){
    return request({
        url: '/user/selectListByCondition',
        method: 'POST',
        data
    })
}


/**
 * {"value":"f28af5eb-4cea-4694-8498-b964359d8ec2","expire":1719393496941}
 */
