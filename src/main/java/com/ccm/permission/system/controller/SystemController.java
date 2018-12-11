package com.ccm.permission.system.controller;

import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("loginApi")
@Api("权限管理——登录")
public class SystemController {
    private static final Logger _log = LoggerFactory.getLogger(SystemController.class);

}
