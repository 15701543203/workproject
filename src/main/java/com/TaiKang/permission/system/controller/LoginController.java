package com.TaiKang.permission.system.controller;

import com.TaiKang.permission.system.bean.UserInfo;
import com.TaiKang.permission.system.service.UserInfoService;
import com.TaiKang.permission.utils.ResponseMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@Api(value = "用户登录接口", description = "经过登录验证之后方可进行后续操作")
public class LoginController {

    private final static Logger _log = LoggerFactory.getLogger(LoginController.class);
    @Autowired
    UserInfoService userInfoService;

    @RequestMapping({"/", "/index"})
    @ApiOperation(value = "默认访问index", notes = "")
    public ResponseMessage index() {
        System.out.println("LoginController-index");
        return ResponseMessage.ok("/index");
    }

    /*
     * @Author:LEEZHEN
     * @Description:登录认证
     * @Date: 14:34 2018/12/27
     * @Param
     * @return
     **/
    @RequestMapping(value = "/myLogin",method = RequestMethod.POST)
    @ApiOperation(value = "用户登录", notes = "使用Shiro做登录校验")
    @ApiImplicitParam(name = "userInfo", value = "用户实体类", required = true, dataType = "UserInfo")
    public ResponseMessage login(HttpServletRequest request, @RequestBody UserInfo userInfo) throws Exception {
        _log.info("[LoginController/login-INFO]用户登录{}", userInfo);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userInfo.getUsername(), userInfo.getUserPwd());
        try {
            subject.login(token);
        } catch (UnknownAccountException Ue) {
            _log.error("用户名不正确异常信息:" + Ue);
            return ResponseMessage.error("用户名不正确");
        } catch (IncorrectCredentialsException Ie) {
            _log.error("密码不正确异常信息" + Ie);
            return ResponseMessage.error("密码不正确");
        } catch (AuthenticationException Ae) {
            _log.error("身份认证异常信息" + Ae);
            return ResponseMessage.error("身份认证异常信息");
        } catch (Exception e) {
            return ResponseMessage.error(e);
        }
        return ResponseMessage.ok("登录成功");
    }

    /*
     * @Author:LEEZHEN
     * @Description:没有权限
     * @Date: 14:34 2018/12/27
     * @Param
     * @return
     **/
    @RequestMapping("/unauthor")
    @ApiOperation(value = "无权限", notes = "访问没有权限的URL会走到这里")
    public ResponseMessage unauthorizedRole() {
        _log.error("用户没有登录,或没有权限");
        return ResponseMessage.error("没有权限");
    }

    @RequestMapping("/logout")
    @ApiOperation(value = "退出登录", notes = "退出的方法Shiro已经实现")
    public ResponseMessage logout() {
        return ResponseMessage.ok("/");
    }
}
