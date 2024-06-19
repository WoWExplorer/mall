package com.mall.entity.po;

import lombok.Data;

import java.io.Serializable;

@Data
public class Register implements Serializable {

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
