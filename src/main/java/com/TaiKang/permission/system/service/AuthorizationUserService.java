package com.TaiKang.permission.system.service;

import com.TaiKang.permission.system.bean.RoleInfo;
import com.TaiKang.permission.system.bean.TempUserRole;
import com.TaiKang.permission.system.bean.UserInfo;

public interface AuthorizationUserService {

    boolean revoke(TempUserRole tempUserRole);

    boolean authorization(TempUserRole tempUserRole);
}
