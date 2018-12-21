package com.ccm.permission.system.dao;

import com.ccm.permission.system.bean.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Resource
public interface UserInfoDao {
    /**
     * 通过username查找用户信息;
     */
    UserInfo findByUsername(@Param("username") String username);
}
