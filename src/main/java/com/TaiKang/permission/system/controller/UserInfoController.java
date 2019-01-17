package com.TaiKang.permission.system.controller;

import com.TaiKang.permission.system.bean.UserInfo;
import com.TaiKang.permission.system.service.UserInfoService;
import com.TaiKang.permission.utils.ResponseMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/userInfo")
@Api(value = "用户CRUD操作", description = "用户信息的的增删查改等")
public class UserInfoController {
    public final static Logger _log = LoggerFactory.getLogger(UserInfoController.class);


    @Autowired
    private UserInfoService userInfoService;

    /**
     * 用户查询.
     *
     * @return
     */
    @RequestMapping("/userList")
//    @RequiresPermissions("userInfo:view")//权限管理;
    @ApiOperation(value = "查询全部用户信息", notes = "")
//    public ResponseMessage userInfo(Model model) {
    public String userInfo(Model model) {
        List<UserInfo>userList=userInfoService.findAll();
        model.addAttribute("userList",userList);
//        return ResponseMessage.ok(userList);
        return "/user/userList";
    }

    /**
     * 用户添加;
     *
     * @return
     */
    @RequestMapping(value = "/doUserAdd",method = RequestMethod.POST)
//    @RequiresPermissions("userInfo:add")//权限管理;
    @ApiOperation(value = "添加用户信息", notes = "")
    public String userInfoAdd(UserInfo userInfo) {
        _log.info("添加用户入参:{}",userInfo);
        if (userInfo == null) {
            return null;
        }
        boolean b = userInfoService.addUserInfo(userInfo);
        if (b){
            return "添加成功";
        }
        return "添加失败";
    }

    /**
     * 用户删除;
     *
     * @return
     */
    @RequestMapping("/userDel")
    @RequiresPermissions("userInfo:del")//权限管理;
    @ApiOperation(value = "删除用户信息", notes = "")
    public String userDel() {
        return "userInfoDel";
    }
}