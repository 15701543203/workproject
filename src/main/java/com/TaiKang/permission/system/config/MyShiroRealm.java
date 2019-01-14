package com.TaiKang.permission.system.config;


import com.TaiKang.permission.system.bean.Permission;
import com.TaiKang.permission.system.bean.RoleInfo;
import com.TaiKang.permission.system.bean.UserInfo;
import com.TaiKang.permission.system.service.RoleInfoService;
import com.TaiKang.permission.system.service.UserInfoService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

public class MyShiroRealm extends AuthorizingRealm {
    private final static Logger _log = LoggerFactory.getLogger(MyShiroRealm.class);
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
//        _log.info("[MyShiroRealm/doGetAuthorizationInfo-INFO]权限配置");
//        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
//        UserInfo userInfo = (UserInfo) principals.getPrimaryPrincipal();
//        List<RoleInfo> roleInfos = roleInfoService.getRolesByUserId(userInfo.getUserId());
//        for(RoleInfo role:roleInfos){
//            authorizationInfo.addRole(role.getRoleName());
//            for(Permission p:role.getPermissions()){
//                authorizationInfo.addStringPermission(p.getPermission());
//            }
//        }
//        return authorizationInfo;
        System.err.println("执行权限认证逻辑");
        return null;
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
        UserInfo userInfo = userInfoService.findByUsername(username);

        if (userInfo == null) {
            return null;
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                userInfo, //用户名
                userInfo.getUserPwd(), //密码
//                ByteSource.Util.bytes(userInfo.getSalt()),//salt=username+salt
                getName()  //realm name
        );
        return authenticationInfo;
    }
}