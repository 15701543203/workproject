package com.TaiKang.permission.system.dao;

import com.TaiKang.permission.system.bean.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface UserInfoMapper {
    /**
     * 通过username查找用户信息;
     */
    UserInfo selectByUsername(String username);
}
