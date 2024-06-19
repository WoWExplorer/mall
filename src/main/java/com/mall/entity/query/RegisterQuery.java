package com.mall.entity.query;

import lombok.Data;

@Data
public class RegisterQuery {

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 真实姓名
     */
    private String realName;


    /**
     * 登录密码
     */
    private String loginPassword;

    /**
     * 手机号码
     */
    private String userMobile;
}
