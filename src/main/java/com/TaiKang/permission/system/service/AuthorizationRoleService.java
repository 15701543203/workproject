package com.TaiKang.permission.system.service;

import com.TaiKang.permission.system.bean.TempRolePer;

public interface AuthorizationRoleService {

    /**
     * 移除角色权限
     * @return
     */
    boolean revokeRolePermission(TempRolePer tempRolePer);

    /**
     * 角色授权
     * @param tempRolePer
     * @return
     */
    boolean authorizationRole(TempRolePer tempRolePer);
}
