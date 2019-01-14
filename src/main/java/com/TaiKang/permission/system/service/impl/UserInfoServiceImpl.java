package com.TaiKang.permission.system.service.impl;

import com.TaiKang.permission.system.bean.UserInfo;
import com.TaiKang.permission.system.dao.UserInfoMapper;
import com.TaiKang.permission.system.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo findByUsername(String username) {
        UserInfo userInfo = userInfoMapper.selectByUsername(username);
        return userInfo;
    }

    @Override
    public boolean addUserInfo(UserInfo userInfo) {
        boolean tag = false;
        if (userInfoMapper.insertUserInfo(userInfo)==1){
            tag = true;
        }
        return false;
    }

}
