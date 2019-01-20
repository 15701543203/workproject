package com.TaiKang.permission.system.controller;


import com.TaiKang.permission.system.bean.Permission;
import com.TaiKang.permission.utils.ResponseMessage;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/permisson")
public class PermissionController {

    @RequestMapping(value = "/addPermission",method = RequestMethod.POST)
    public ResponseMessage addPermission(@RequestBody Permission permission){
        return ResponseMessage.ok("添加成功");
    }

    @RequestMapping(value = "/delPermission",method = RequestMethod.POST)
    public ResponseMessage delPermission(@RequestBody Permission permission){
        return ResponseMessage.ok("添加成功");
    }

    @RequestMapping(value = "/ediorPermission",method = RequestMethod.POST)
    public ResponseMessage ediorPermission(@RequestBody Permission permission){
        return ResponseMessage.ok("添加成功");
    }

    @RequestMapping(value = "/getPermission",method = RequestMethod.POST)
    public ResponseMessage getPermission(@RequestBody Permission permission){
        return ResponseMessage.ok("添加成功");
    }

    @RequestMapping(value = "/getPermissions",method = RequestMethod.POST)
    public ResponseMessage getPermissions(@RequestBody Permission permission){
        return ResponseMessage.ok("添加成功");
    }
}
