package com.ccm.permission.system.controller;

import com.ccm.permission.system.bean.UserInfo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    private final static Logger _log = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping({"/","/index"})
    public String index(){
        return"/index";
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request, @RequestBody UserInfo userInfo) throws Exception{
        _log.info("————————————————————————[LoginController/login-INFO]用户登录{}————————————————————————",userInfo);

        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userInfo.getUsername(),userInfo.getUserPwd());
        try {
            subject.login(token);
        } catch (UnknownAccountException Ue) {
            _log.error("用户名不正确异常信息:"+Ue);
            return "用户名不正确";
        }catch (IncorrectCredentialsException Ie){
            _log.error("密码不正确异常信息"+Ie);
            return "密码不正确";
        }catch (AuthenticationException Ae){
            _log.error("身份认证异常信息"+Ae);
        }

        return "/login";
    }

    @RequestMapping("/403")
    public String unauthorizedRole(){
        System.out.println("------没有权限-------");
        return "403";
    }
}
