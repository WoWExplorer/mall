package com.mall.controller;

import com.mall.entity.po.Register;
import com.mall.entity.po.User;
import com.mall.entity.vo.ResultVo;
import com.mall.service.impl.UserServiceImpl;
import com.mall.utils.ValidatorUtils;
import com.mall.utils.WOWNicknameGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;

@RestController
public class CommonController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    /**
     * 登录
     * @return
     */
    @PostMapping("/login")
    public ResultVo<?> login(@RequestBody User user) {
        User user1 = userServiceImpl.selectByUserMobile(user.getUserMobile());

        if (user1 == null) {
            return ResultVo.fail("此账号尚未注册");
        }
        if (user1.getLoginPassword().equals(user.getLoginPassword())) {
            return ResultVo.success("登录成功");
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
        return ResultVo.success("退出登录成功");
    }

    /**
     * 注册
     * @return
     */
    @PostMapping("/register")
    public ResultVo<?> register(@RequestBody Register register) {

        if (!ValidatorUtils.isMobileValid(register.getUserMobile())) {
            return ResultVo.fail("手机号格式错误");
        }
        if (!ValidatorUtils.isChineseNameValid(register.getRealName())) {
            return ResultVo.fail("真实姓名格式错误");
        }
        if (register.getNickName() == null) {
                register.setNickName(WOWNicknameGenerator.generateWOWNickname());
        }
        if (!ValidatorUtils.isPasswordStrongValid(register.getLoginPassword())) {
            return ResultVo.fail("密码必须包含大写字母、小写字母、数字和(#?!@$%^&*-)且8-32位");
        }
        if (userServiceImpl.selectByUserMobile(register.getUserMobile()) != null) {
            return ResultVo.fail("此手机号已注册");
        }
        User user = new User();
        user.setUserId(UUID.randomUUID().toString());
        user.setNickName(register.getNickName());
        user.setUserMobile(register.getUserMobile());
        user.setRealName(register.getRealName());
        user.setLoginPassword(register.getLoginPassword());
        user.setModifyTime(Date.from(Instant.now()));
        user.setUserRegtime(Date.from(Instant.now()));
        Integer insert = userServiceImpl.insert(user);
        if (insert == 1) {
            return ResultVo.success("注册成功");
        } else {
            return ResultVo.fail("注册失败");
        }
    }
}
