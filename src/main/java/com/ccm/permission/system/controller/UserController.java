package com.ccm.permission.system.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api("swagger2集成")
@RestController
@RequestMapping("userApi")
public class UserController {

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public String test(){
        return "swagger2集成测试！";
    }
}
