package com.ccm.permission.system.service;
import com.ccm.permission.system.bean.UserInfo;

public interface UserInfoService {
    UserInfo findByUsername(String usrename);
}
