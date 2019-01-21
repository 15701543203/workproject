package com.TaiKang.permission.system.dao;

import com.TaiKang.permission.system.bean.TempRolePer;
import com.TaiKang.permission.system.bean.TempUserRole;

public interface AuthorizationRoleMapper {

    /**
     * 删除角色权限
     *
     * @param tempRolePer
     * @return
     */
    int deleteRolePer(TempRolePer tempRolePer);

    /**
     * 角色授权限
     *
     * @param tempUserRole
     * @return
     */
    int insertRolePermission(TempUserRole tempUserRole);
}
