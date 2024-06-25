package com.mall.configuration;

import com.alibaba.fastjson2.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    private static Logger logger = LoggerFactory.getLogger(WebConfig.class);
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

//        String uploadDir = "/uploads";
        File file = new File("/uploads");
//        logger.info("registry : {}", JSON.toJSONString(registry));
        registry.addResourceHandler("/uploads/**")
                .addResourceLocations("file:" + file.getAbsolutePath() + File.separator);
    }
}

