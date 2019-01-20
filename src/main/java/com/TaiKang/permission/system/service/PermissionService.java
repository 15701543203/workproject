package com.TaiKang.permission.system.service;

import com.TaiKang.permission.system.bean.Permission;

public interface PermissionService {
    boolean addPermission(Permission permission);
    boolean delPermission(Permission permissionId);
    boolean editorPermission(Permission permission);
    boolean getPermission(Permission permission);
    boolean getPermissions(Permission permission);

}
