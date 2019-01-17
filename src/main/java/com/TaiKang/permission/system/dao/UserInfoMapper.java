package com.TaiKang.permission.system.dao;

import com.TaiKang.permission.system.bean.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserInfoMapper {
    /**
     * 通过username查找用户信息;
     */
    UserInfo selectByUsername(String username);

    int insertUserInfo(UserInfo userInfo);

    int delUserInfo(int userId);

    int updateUserInfo(UserInfo userInfo);

    UserInfo selectbyId(int userId);

    List<UserInfo> selectAll();
}
