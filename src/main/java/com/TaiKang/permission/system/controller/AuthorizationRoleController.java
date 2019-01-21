package com.TaiKang.permission.system.controller;

import com.TaiKang.permission.system.bean.TempRolePer;
import com.TaiKang.permission.system.service.AuthorizationRoleService;
import com.TaiKang.permission.utils.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Role-Authorization")
@RestController
public class AuthorizationRoleController {

    @Autowired
    private AuthorizationRoleService authorizationRoleService;

    @RequestMapping(value = "/revokeRolePermission", method = RequestMethod.POST)
    public ResponseMessage revokeRolePermission(@RequestBody TempRolePer tempRolePer) {
        if (tempRolePer.getPerId() == null || tempRolePer.getPerId() == null) {
            return ResponseMessage.error("入参缺省");
        }

        boolean b = authorizationRoleService.revokeRolePermission(tempRolePer);
        if (b){
            return ResponseMessage.ok("操作成功");
        }
        return ResponseMessage.error("网络故障,请稍后重试或联系技术人员");
    }
}
