package com.TaiKang.permission.system.service.impl;

import com.TaiKang.permission.system.bean.UserInfo;
import com.TaiKang.permission.system.dao.UserInfoMapper;
import com.TaiKang.permission.system.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        if (userInfoMapper.insertUserInfo(userInfo) == 1) {
            tag = true;
        }
        return tag;
    }

    @Override
    public boolean removeUserInfo(int userId) {
        int tag = userInfoMapper.delUserInfo(userId);
        if (tag > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean editorUserInfo(UserInfo userInfo) {
        int tag = userInfoMapper.updateUserInfo(userInfo);
        if (tag == 1) {
            return true;
        }
        return false;
    }

    @Override
    public UserInfo findUserbyId(int userId) {
        UserInfo userInfo = userInfoMapper.selectbyId(userId);
        return userInfo;
    }

    @Override
    public List<UserInfo> findAll() {
        List<UserInfo> userList = userInfoMapper.selectAll();
        return userList;
    }

}
