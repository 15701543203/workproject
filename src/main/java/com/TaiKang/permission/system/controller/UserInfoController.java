package com.TaiKang.permission.system.controller;

import com.TaiKang.permission.system.bean.UserInfo;
import com.TaiKang.permission.utils.ResponseMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userInfo")
@Api(value = "用户CRUD操作",description = "用户信息的的增删查改等")
public class UserInfoController {

    /**
     * 用户查询.
     * @return
     */
    @RequestMapping("/userList")
    @RequiresPermissions("userInfo:view")//权限管理;
    @ApiOperation(value = "查询全部用户信息",notes = "")
    public ResponseMessage userInfo(){
        return ResponseMessage.ok("userList");
    }

    /**
     * 用户添加;
     * @return
     */
    @RequestMapping("/userAdd")
//    @RequiresPermissions("userInfo:add")//权限管理;
    @ApiOperation(value = "添加用户信息",notes = "")
    public String userInfoAdd(UserInfo userInfo){


        return "userInfoAdd";
    }

    /**
     * 用户删除;
     * @return
     */
    @RequestMapping("/userDel")
    @RequiresPermissions("userInfo:del")//权限管理;
    @ApiOperation(value = "删除用户信息",notes = "")
    public String userDel(){
        return "userInfoDel";
    }
}