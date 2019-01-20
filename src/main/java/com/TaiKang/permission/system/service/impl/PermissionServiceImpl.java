package com.TaiKang.permission.system.service.impl;

import com.TaiKang.permission.system.bean.Permission;
import com.TaiKang.permission.system.service.PermissionService;
import org.springframework.stereotype.Service;


@Service
public class PermissionServiceImpl implements PermissionService {
    @Override
    public boolean addPermission(Permission permission) {
        return false;
    }

    @Override
    public boolean delPermission(Permission permissionId) {
        return false;
    }

    @Override
    public boolean editorPermission(Permission permission) {
        return false;
    }

    @Override
    public boolean getPermission(Permission permission) {
        return false;
    }

    @Override
    public boolean getPermissions(Permission permission) {
        return false;
    }
}
