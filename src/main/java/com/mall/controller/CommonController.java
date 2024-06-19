package com.mall.controller;

import cn.dev33.satoken.secure.SaSecureUtil;
import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.core.util.IdUtil;
import com.alibaba.fastjson2.JSON;
import com.mall.entity.query.LoginQuery;
import com.mall.entity.query.RegisterQuery;
import com.mall.entity.po.User;
import com.mall.entity.vo.ResultVo;
import com.mall.service.impl.UserServiceImpl;
import com.mall.utils.ValidatorUtils;
import com.mall.utils.WOWNicknameGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.Date;
import java.util.Objects;

@RestController
public class CommonController {
    private static Logger logger = LoggerFactory.getLogger(CommonController.class);

    @Autowired
    private UserServiceImpl userServiceImpl;

    // 文本
    private static final String key = "wowMall";
    /**
     * 登录
     * @return
     */
    @PostMapping("/login")
    public ResultVo<?> login(@RequestBody LoginQuery loginQuery) {
        User user = userServiceImpl.selectByUserMobile(loginQuery.getUserMobile());

        if (user == null) {
            return ResultVo.fail("此账号尚未注册");
        }
        if (user.getLoginPassword().equals(SaSecureUtil.aesEncrypt(key, loginQuery.getLoginPassword()))) {
            StpUtil.login(user.getUserId());
            SaTokenInfo tokenInfo = StpUtil.getTokenInfo();
            return ResultVo.success(tokenInfo,"登录成功");
        } else {
            return ResultVo.fail("密码错误");
        }
    }


    /**
     * 退出登录
     * @return
     */
    @GetMapping("/logout")
    public ResultVo<?> logout() {
        logger.info("token{}", StpUtil.getTokenValue());
        StpUtil.logoutByTokenValue(StpUtil.getTokenValue());
        return ResultVo.success(200,"退出登录成功");
    }

    /**
     * 注册
     * @return
     */
    @PostMapping("/register")
    public ResultVo<?> register(@RequestBody RegisterQuery register) {

        if (!ValidatorUtils.isMobileValid(register.getUserMobile())) {
            return ResultVo.fail("手机号格式错误");
        }
        if (!ValidatorUtils.isChineseNameValid(register.getRealName())) {
            return ResultVo.fail("真实姓名格式错误");
        }
        if (Objects.equals(register.getNickName(), "")|| register.getNickName() == null) {
                register.setNickName(WOWNicknameGenerator.generateWOWNickname());
        }
        if (!ValidatorUtils.isPasswordStrongValid(register.getLoginPassword())) {
            return ResultVo.fail("密码必须包含大写字母、小写字母、数字和(#?!@$%^&*-)且8-32位");
        }
        if (userServiceImpl.selectByUserMobile(register.getUserMobile()) != null) {
            return ResultVo.fail("此手机号已注册");
        }
        User user = new User();
        user.setUserId(IdUtil.simpleUUID());
        user.setNickName(register.getNickName());
        user.setUserMobile(register.getUserMobile());
        user.setRealName(register.getRealName());

        user.setLoginPassword(SaSecureUtil.aesEncrypt(key, register.getLoginPassword()));
        user.setModifyTime(Date.from(Instant.now()));
        user.setUserRegtime(Date.from(Instant.now()));
        Integer insert = userServiceImpl.insert(user);

        logger.info("注册成功，用户：{}", JSON.toJSONString(user));

        if (insert == 1) {
            return ResultVo.success("注册成功");
        } else {
            return ResultVo.fail("注册失败");
        }
    }
}
