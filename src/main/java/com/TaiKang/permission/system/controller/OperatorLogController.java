package com.TaiKang.permission.system.controller;

import com.TaiKang.permission.system.bean.OperatorLog;
import com.TaiKang.permission.system.bean.UserInfo;
import com.TaiKang.permission.system.service.OperatorLogService;
import com.TaiKang.permission.system.service.RoleInfoService;
import com.TaiKang.permission.system.service.UserInfoService;
import com.TaiKang.permission.utils.ResponseMessage;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/log")
public class OperatorLogController {
    @Autowired
    private OperatorLogService operatorLogService;

    @Autowired
    private RoleInfoService roleInfoService;

    @Autowired
    private UserInfoService userInfoService;

    /**
     * 需要传入一个操作类型和操作内容
     *
     * @param operatorLog
     * @return
     */
    @RequestMapping(value = "/addLog", method = RequestMethod.POST)
    public ResponseMessage addLog(@RequestBody OperatorLog operatorLog) {

        Subject subject = SecurityUtils.getSubject();
        UserInfo userInfo = (UserInfo) subject.getPrincipal();
        UserInfo info = userInfoService.findByUsername(userInfo.getUsername());
        operatorLog.setUserId(info.getUserId());
        operatorLog.setUsername(info.getUsername());
        operatorLog.setTrueName(info.getTrueName());
        List<String> roleNames = roleInfoService.getRoleNames(info.getUserId());
        String rNames = "";

        for (int i = 0; i < roleNames.size(); i++) {

            if (i < roleNames.size()) {
                rNames += roleNames.get(i) + ",";
            }
            System.out.println(rNames);
        }
        //去掉最后一位的逗号
        rNames = rNames.substring(0, rNames.length() - 1);
        operatorLog.setRoleName(rNames);
        boolean b = operatorLogService.addOperatorLog(operatorLog);
        if (b) {
            return ResponseMessage.ok("日志添加成功");
        }
        return ResponseMessage.error("网络故障,请稍后重试或联系技术人员");

    }
}
