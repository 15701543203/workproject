package com.TaiKang.permission.system.dao;

import com.TaiKang.permission.system.bean.Permission;

public interface PermissionMapper {
    int insertPermission(Permission permission);
    int delectPermission(int permissionId);
    int updatePermission(Permission permission);
    int selectPermission(Permission permission);
    int selectPermissions(Permission permission);


}
