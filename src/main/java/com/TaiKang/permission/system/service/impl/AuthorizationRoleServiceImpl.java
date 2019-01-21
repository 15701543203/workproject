package com.TaiKang.permission.system.service.impl;

import com.TaiKang.permission.system.bean.Permission;
import com.TaiKang.permission.system.bean.TempRolePer;
import com.TaiKang.permission.system.dao.AuthorizationRoleMapper;
import com.TaiKang.permission.system.service.AuthorizationRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorizationRoleServiceImpl implements AuthorizationRoleService {

    @Autowired
    private AuthorizationRoleMapper authorizationRoleMapper;

    @Override
    public boolean revokeRolePermission(TempRolePer tempRolePer) {
        int i = authorizationRoleMapper.deleteRolePer(tempRolePer);
        if (i > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean authorizationRole(TempRolePer tempRolePer) {
        List<Permission> perList = tempRolePer.getPermissions();

        TempRolePer trp = new TempRolePer();
        trp.setRoleId(tempRolePer.getRoleId());
        int i = 0;
        for (Permission per : perList) {
            trp.setRoleId(per.getPerId());
            int i1 = authorizationRoleMapper.insertRolePermission(trp);
            if (i1 > 0) {
                i++;
            }
        }
        if (i > 0) {
            return true;
        }
        return false;
    }
}
