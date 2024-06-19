package com.mall.entity.query;

import lombok.Data;

@Data
public class LoginQuery {
    /**
     * 登录密码
     */
    private String loginPassword;

    /**
     * 手机号码
     */
    private String userMobile;
}
