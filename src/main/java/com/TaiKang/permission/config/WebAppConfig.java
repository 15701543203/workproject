package com.TaiKang.permission.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

//@Configuration
public class WebAppConfig extends WebMvcConfigurationSupport {

    private final static Logger _log = LoggerFactory.getLogger(WebAppConfig.class);


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        _log.info("[ViewConfig-INFO]页面控制器");

        registry.addViewController("/").setViewName("index");
    }
}
