package com.mall.controller;

import cn.dev33.satoken.secure.SaSecureUtil;
import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.core.util.IdUtil;
import com.mall.entity.query.LoginQuery;
import com.mall.entity.query.RegisterQuery;
import com.mall.entity.po.User;
import com.mall.entity.vo.ResultVo;
import com.mall.enums.DurationEnum;
import com.mall.enums.ResultCodeEnum;
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
            return ResultVo.fail(ResultCodeEnum.CODE_1002.getCode(), ResultCodeEnum.CODE_1002.getMessage());
        }
        if (user.getLoginPassword().equals(SaSecureUtil.aesEncrypt(key, loginQuery.getLoginPassword()))) {
            // 设置时长
            StpUtil.login(user.getUserId(), DurationEnum.SECONDS_30.getSeconds());
            SaTokenInfo tokenInfo = StpUtil.getTokenInfo();
            return ResultVo.success(ResultCodeEnum.CODE_200.getCode() ,tokenInfo, ResultCodeEnum.CODE_200.getMessage());
        } else {
            return ResultVo.fail(ResultCodeEnum.CODE_1000.getCode(), ResultCodeEnum.CODE_1000.getMessage());
        }
    }

//    StpUtil.renewTimeout(token, timeout);
    @PostMapping("/renewTimeout")
    public ResultVo<?> renewTimeout(String token) {
        StpUtil.renewTimeout(token, DurationEnum.SECONDS_30.getSeconds());
        SaTokenInfo tokenInfo = StpUtil.getTokenInfo();
        return ResultVo.success(ResultCodeEnum.CODE_200.getCode(), tokenInfo, ResultCodeEnum.CODE_200.getMessage());
    }

    /**
     * 退出登录
     * @return
     */
    @GetMapping("/logout")
    public ResultVo<?> logout() {
        logger.info("token{}", StpUtil.getTokenValue());
        StpUtil.logoutByTokenValue(StpUtil.getTokenValue());
        boolean login = StpUtil.isLogin();
        if (login) {
            return ResultVo.fail(ResultCodeEnum.CODE_1002.getCode(),"请重新操作");
        } else {
            return ResultVo.success(ResultCodeEnum.CODE_200,"退出登录成功");
        }
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
            return ResultVo.fail(ResultCodeEnum.CODE_1028.getCode(),ResultCodeEnum.CODE_1028.getMessage());
        }
        if (userServiceImpl.selectByUserMobile(register.getUserMobile()) != null) {
            return ResultVo.fail(ResultCodeEnum.CODE_1001.getCode(), ResultCodeEnum.CODE_1001.getMessage());
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

        if (insert == 1) {
            return ResultVo.success(ResultCodeEnum.CODE_200, ResultCodeEnum.CODE_200.getMessage());
        } else {
            return ResultVo.fail("注册失败");
        }
    }

}
