package com.TaiKang.permission.system.dao;

import com.TaiKang.permission.system.bean.TempUserRole;

public interface AuthorizationUserMapper {

    int deleteUserRole(TempUserRole tempUserRole);

    int insertAuthorization(TempUserRole tempUserRole);
}
