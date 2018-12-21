package com.ccm.permission.system.service.impl;

import com.ccm.permission.system.bean.UserInfo;
import com.ccm.permission.system.dao.UserInfoDao;
import com.ccm.permission.system.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService{
    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo findByUsername(String usrename) {

        return userInfoDao.findByUsername(usrename);
    }
}
