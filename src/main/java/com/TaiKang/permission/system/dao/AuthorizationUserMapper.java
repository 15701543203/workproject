package com.TaiKang.permission.system.dao;

import com.TaiKang.permission.system.bean.TempUserRole;

public interface AuthorizationUserMapper {

    /**
     * 取消权限
     * @param tempUserRole
     * @return
     */
    int deleteUserRole(TempUserRole tempUserRole);

    /**
     * 用户授角色
     * @param tempUserRole
     * @return
     */
    int insertUserAuthorization(TempUserRole tempUserRole);

    int updateAuthorization(TempUserRole tempUserRole);

}
