package com.TaiKang.permission.system.service;

import com.TaiKang.permission.system.bean.UserInfo;
import java.util.List;

public interface UserInfoService {
    /**
     * 使用用户名查询用户，用在刚开始登录
     *
     * @param username
     * @return
     */
    UserInfo findByUsername(String username);

    /**
     * 添加
     *
     * @param userInfo
     * @return
     */
    boolean addUserInfo(UserInfo userInfo);


    /**
     * 删除用户
     *
     * @param userId
     * @return
     */
    boolean removeUserInfo(int userId);

    /**
     * 修改用户
     *
     * @param userInfo
     * @return
     */
    boolean editorUserInfo(UserInfo userInfo);


    /**
     * 查询一个用户
     *
     * @param userId
     * @return
     */
    UserInfo findUserbyId(int userId);

    /**
     * 全部
     *
     * @return
     */
    List<UserInfo> findAll();
}
