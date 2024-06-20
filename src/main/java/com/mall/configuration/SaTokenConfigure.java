package com.mall.configuration;

import cn.dev33.satoken.context.SaHolder;
import cn.dev33.satoken.filter.SaServletFilter;
import cn.dev33.satoken.router.SaHttpMethod;
import cn.dev33.satoken.router.SaRouter;
import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.json.JSONUtil;
import com.mall.entity.vo.ResultVo;
import com.mall.enums.ResultCodeEnum;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * [Sa-Token 权限认证] 配置类
 */
@Configuration
public class SaTokenConfigure implements WebMvcConfigurer {
    @Bean
    public SaServletFilter saServletFilter() {
        return new SaServletFilter()
                .addInclude("/**") // 拦截所有路径
                .addExclude("/favicon.ico", "/activity/**", "/login", "/static/*") // 排除路径
                .setAuth(obj -> {
                    // 配置需要登录认证的路径
//                    SaRouter.match("/**", "/activity/**", StpUtil::checkLogin);
//                    SaRouter.match("/**", "/login", StpUtil::checkLogin);
                    SaRouter.match("/**", "/register", StpUtil::checkLogin);
//                    SaRouter.match("/**", "/logout", StpUtil::checkLogin);
                })
                // 异常处理函数：每次认证函数发生异常时执行此函数
                .setError(e -> JSONUtil.toJsonStr(ResultVo.fail(ResultCodeEnum.CODE_1025.getCode(), null, ResultCodeEnum.CODE_1025.getMessage())))
                // 前置函数：在每次认证函数之前执行
                .setBeforeAuth(obj -> {
                    SaHolder.getResponse()
                            // ---------- 设置跨域响应头 ----------
                            // 允许指定域访问跨域资源
                            .setHeader("Access-Control-Allow-Origin", "*")
                            // 允许所有请求方式
                            .setHeader("Access-Control-Allow-Methods", "*")
                            // 允许的header参数
                            .setHeader("Access-Control-Allow-Headers", "*")
                            // 有效时间
                            .setHeader("Access-Control-Max-Age", "3600");
                    // 如果是预检请求，则立即返回到前端
                    SaRouter.match(SaHttpMethod.OPTIONS)
                            .free(r -> System.out.println("--------OPTIONS预检请求，不做处理"))
                            .back();
                });
    }

}

