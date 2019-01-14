package com.TaiKang.permission.system.service;
import com.TaiKang.permission.system.bean.UserInfo;

public interface UserInfoService {
    /**
     * 使用用户名查询用户，用在刚开始登录
     * @param username
     * @return
     */
    UserInfo findByUsername(String username);

    boolean addUserInfo(UserInfo userInfo);
}
