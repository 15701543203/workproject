package com.TaiKang.permission.system.controller;


import com.TaiKang.permission.system.bean.RoleInfo;
import com.TaiKang.permission.system.bean.TempUserRole;
import com.TaiKang.permission.system.bean.UserInfo;
import com.TaiKang.permission.system.service.AuthorizationUserService;
import com.TaiKang.permission.utils.ResponseMessage;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User-Authorization")
public class AuthorizationUserController {

    @Autowired
    private AuthorizationUserService authorizationUserService;

    @RequestMapping(value = "/revoke", method = RequestMethod.POST)
    public ResponseMessage revoke(@RequestBody TempUserRole tempUserRole) {

        if (tempUserRole == null) {
            return ResponseMessage.error("入参为空");
        }
        boolean revoke = authorizationUserService.revoke(tempUserRole);
        if (revoke) {
            return ResponseMessage.ok("操作成功");
        }
        return ResponseMessage.error("网络故障,请稍后重试或联系技术人员");
    }

    @RequestMapping(value = "/authorization", method = RequestMethod.POST)
    public ResponseMessage authorization(@RequestBody TempUserRole tempUserRole) {
        if (tempUserRole == null) {
            return ResponseMessage.error("入参为空");
        }

        boolean boo = authorizationUserService.authorization(tempUserRole);
        if (boo) {
            return ResponseMessage.ok("操作成功");
        }

        return ResponseMessage.error("网络故障,请稍后重试或联系技术人员");

    }

}
