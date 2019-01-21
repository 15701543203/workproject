package com.TaiKang.permission.system.service.impl;

import com.TaiKang.permission.system.bean.TempRolePer;
import com.TaiKang.permission.system.dao.AuthorizationRoleMapper;
import com.TaiKang.permission.system.service.AuthorizationRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationRoleServiceImpl implements AuthorizationRoleService {

    @Autowired
    private AuthorizationRoleMapper authorizationRoleMapper;

    @Override
    public boolean revokeRolePermission(TempRolePer tempRolePer) {
        int i = authorizationRoleMapper.deleteRolePer(tempRolePer);
        if (i>0){
            return true;
        }
        return false;
    }
}
