package com.TaiKang.permission.system.controller;

import com.TaiKang.permission.system.bean.RoleInfo;
import com.TaiKang.permission.system.service.RoleInfoService;
import com.TaiKang.permission.utils.ResponseMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/roleInfo")
public class RoleInfoController {
    private final static Logger _log = LoggerFactory.getLogger(RoleInfoController.class);

    @Autowired
    private RoleInfoService roleInfoService;

    @RequestMapping(value = "/getOne")
    public ResponseMessage getOne(@RequestBody RoleInfo roleInfo) {
        _log.info("查询入参:{}", roleInfo);
        if (null == roleInfo.getRoleId()) {
            return null;
        }
        RoleInfo one = roleInfoService.getOne(roleInfo.getRoleId());
        return ResponseMessage.ok(one);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.POST)
    public ResponseMessage getAll() {
        List<RoleInfo> all = roleInfoService.getAll();
        return ResponseMessage.ok(all);
    }

    @RequestMapping(value = "/addRole", method = RequestMethod.POST)
    public ResponseMessage addRole(@RequestBody RoleInfo roleInfo) {
        if (roleInfo == null) {
            return ResponseMessage.error("入参为空");
        }
        boolean b = roleInfoService.addRole(roleInfo);
        if (b) {
            return ResponseMessage.ok("添加成功");
        }
        return ResponseMessage.error("网络故障,请稍后重试或联系技术人员");
    }

    @RequestMapping(value = "/updateRole", method = RequestMethod.POST)
    public ResponseMessage updateRole(@RequestBody RoleInfo roleInfo) {
        if (roleInfo == null) {
            return ResponseMessage.error("入参为空");
        }
        boolean b = roleInfoService.updateRole(roleInfo);
        if (b) {
            return ResponseMessage.ok("更新成功");
        }
        return ResponseMessage.error("网络故障,请稍后重试或联系技术人员");
    }

    @RequestMapping(value = "/delRole", method = RequestMethod.POST)
    public ResponseMessage delRole(@RequestBody RoleInfo roleInfo) {
        if (null == roleInfo.getRoleId()) {
            return ResponseMessage.error("入参为空");
        }
        boolean b = roleInfoService.delRole(roleInfo.getRoleId());
        if (b) {
            return ResponseMessage.ok("删除成功");
        }
        return ResponseMessage.error("网络故障,请稍后重试或联系技术人员");
    }

}
