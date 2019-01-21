package com.TaiKang.permission.system.controller;


import com.TaiKang.permission.system.bean.RoleInfo;
import com.TaiKang.permission.system.bean.TempUserRole;
import com.TaiKang.permission.system.bean.UserInfo;
import com.TaiKang.permission.system.service.AuthorizationUserService;
import com.TaiKang.permission.utils.ResponseMessage;
import org.apache.ibatis.jdbc.Null;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/User-Authorization")
public class AuthorizationUserController {
private final  static Logger _log = LoggerFactory.getLogger(AuthorizationUserController.class);
    @Autowired
    private AuthorizationUserService authorizationUserService;

    @RequestMapping(value = "/revoke", method = RequestMethod.POST)
    public ResponseMessage revoke(@RequestBody TempUserRole tempUserRole) {

        if (tempUserRole.getUserId() == null||tempUserRole.getRoleId()==null) {
            return ResponseMessage.error("入参缺省");
        }
        boolean revoke = authorizationUserService.revoke(tempUserRole);
        if (revoke) {
            return ResponseMessage.ok("操作成功");
        }
        return ResponseMessage.error("网络故障,请稍后重试或联系技术人员");
    }

    @RequestMapping(value = "/authorization", method = RequestMethod.POST)
    public ResponseMessage authorization(@RequestBody TempUserRole tempUserRole) {
        _log.info("权限入参：{}",tempUserRole);

        if (tempUserRole.getUserId()==null||tempUserRole.getRoleList().size()==0) {
            return ResponseMessage.error("入参缺省");
        }
        boolean boo = authorizationUserService.authorization(tempUserRole);
        if (boo) {
            return ResponseMessage.ok("操作成功");
        }
        return ResponseMessage.error("网络故障,请稍后重试或联系技术人员");
    }

}
