package com.mall.configuration;

import cn.dev33.satoken.context.SaHolder;
import cn.dev33.satoken.filter.SaServletFilter;
import cn.dev33.satoken.interceptor.SaInterceptor;
import cn.dev33.satoken.router.SaHttpMethod;
import cn.dev33.satoken.router.SaRouter;
import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.json.JSONUtil;
import com.mall.entity.vo.ResultVo;
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
                .addExclude("/favicon.ico", "/activity/**", "/login", "/register", "/logout") // 排除路径
                .setAuth(obj -> {
                    // 配置需要登录认证的路径
//                    SaRouter.match("/**", "/activity/**", StpUtil::checkLogin);
//                    SaRouter.match("/**", "/login", StpUtil::checkLogin);
//                    SaRouter.match("/**", "/register", StpUtil::checkLogin);
                })
                // 异常处理函数：每次认证函数发生异常时执行此函数
                .setError(e -> JSONUtil.toJsonStr(ResultVo.fail(400, e.getMessage())))
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
//    @Bean
//    public SaServletFilter saServletFilter() {
//        return new SaServletFilter()
//                .addInclude("/**").addExclude("/favicon.ico", "/static/**", "/template/**", "/**/*.html")
//                .setAuth(obj -> {
//                    SaRouter.match("/**", "/activity/**", StpUtil::checkLogin);
//                    SaRouter.match("/**", "/login", StpUtil::checkLogin);
//                    SaRouter.match("/**", "/register", StpUtil::checkLogin);
//                })
//                // 异常处理函数：每次认证函数发生异常时执行此函数
//                .setError(e -> {
//                    return JSONUtil.toJsonStr(ResultVo.fail(400, e.getMessage()));
//                })
//                // 前置函数：在每次认证函数之前执行
//                .setBeforeAuth(obj -> {
//                    SaHolder.getResponse()
//                            // ---------- 设置跨域响应头 ----------
//                            // 允许指定域访问跨域资源
//                            .setHeader("Access-Control-Allow-Origin", "*")
//                            // 允许所有请求方式
//                            .setHeader("Access-Control-Allow-Methods", "*")
//                            // 允许的header参数
//                            .setHeader("Access-Control-Allow-Headers", "*")
//                            // 有效时间
//                            .setHeader("Access-Control-Max-Age", "3600")
//                    ;
//                    // 如果是预检请求，则立即返回到前端
//                    SaRouter.match(SaHttpMethod.OPTIONS)
//                            .free(r -> System.out.println("--------OPTIONS预检请求，不做处理"))
//                            .back();
//                });
//    }

//    // 注册拦截器
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        // 注册 Sa-Token 拦截器，校验规则为 StpUtil.checkLogin() 登录校验。
//        registry.addInterceptor(new SaInterceptor(handle -> StpUtil.checkLogin()))
//                .addPathPatterns("/**")
//                .excludePathPatterns("/static/**") // 排除静态资源
//                .excludePathPatterns("/templates/**") // 排除模板文件
//                .excludePathPatterns("/public/**") // 排除公共页面
//                .excludePathPatterns("/**/*.html"); // 排除所有 .html 文件
//    }

}

