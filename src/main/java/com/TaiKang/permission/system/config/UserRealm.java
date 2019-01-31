package com.TaiKang.permission.system.config;


import com.TaiKang.permission.system.bean.Permission;
import com.TaiKang.permission.system.bean.RoleInfo;
import com.TaiKang.permission.system.bean.UserInfo;
import com.TaiKang.permission.system.service.RoleInfoService;
import com.TaiKang.permission.system.service.UserInfoService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

public class UserRealm extends AuthorizingRealm {
    private final static Logger _log = LoggerFactory.getLogger(UserRealm.class);
    @Resource
    private UserInfoService userInfoService;

    @Autowired
    private RoleInfoService roleInfoService;

    /*
     * @Author:LEEZHEN
     * @Description:权限判定
     * @Date: 14:20 2018/12/27
     * @Param
     * @return
     **/
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        _log.info("执行授权认证逻辑");
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();

        //查询当前用户的授权字符串
        Subject subject = SecurityUtils.getSubject();
        UserInfo user = (UserInfo) subject.getPrincipal();

        List<RoleInfo> roleList = roleInfoService.getRoleListByUserId(user);
        for (RoleInfo roleInfo : roleList) {
            //添加角色授权逻辑
            authorizationInfo.addRole(roleInfo.getRoleName());
            //获取角色拥有的权限
            List<Permission> perList = roleInfo.getPermissionList();
            for (Permission permission : perList) {
                //添加权限授权逻辑
                authorizationInfo.addStringPermission(permission.getPermission());
            }
        }
//      authorizationInfo.addStringPermission("user:add");
        return authorizationInfo;
    }

    /*
     * @Author:LEEZHEN
     * @Description:用户身份认证，验证账号密码是否则正确
     * @Date: 15:26 2018/12/25
     * @Param
     * @return
     **/
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
            throws AuthenticationException {
        _log.info("执行登录认证逻辑");
        //获取用户的输入的账号.
        String username = (String) token.getPrincipal();
        UserInfo dbUser = userInfoService.findByUsername(username);

        if (dbUser == null) {
            return null;
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                dbUser, //用户
                dbUser.getUserPwd(), //密码
//                ByteSource.Util.bytes(userInfo.getSalt()),//salt=username+salt
                getName()  //realm name
        );
        return authenticationInfo;
    }
}