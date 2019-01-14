package com.TaiKang.permission.config;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class GlobalException {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public String defaultExceptionHandler(HttpServletRequest request,Exception ex){
        return "测试全局异常";
    }

}
