package com.TaiKang.permission.system.service.impl;

import com.TaiKang.permission.system.bean.RoleInfo;
import com.TaiKang.permission.system.bean.TempUserRole;
import com.TaiKang.permission.system.bean.UserInfo;
import com.TaiKang.permission.system.dao.AuthorizationUserMapper;
import com.TaiKang.permission.system.service.AuthorizationUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorizationUserServiceImpl implements AuthorizationUserService {

    @Autowired
    private AuthorizationUserMapper authorizationUserMapper;

    @Override
    public boolean revoke(TempUserRole tempUserRole) {
        int tag = authorizationUserMapper.deleteUserRole(tempUserRole);
        if (tag == 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean authorization(TempUserRole tempUserRole) {
        List<Integer> roleList = tempUserRole.getRoleList();

        TempUserRole tur = new TempUserRole();
        tur.setUserId(tempUserRole.getUserId());
        int i = 0;
        for (Integer roleId : roleList) {
            tur.setRoleId(roleId);
            int i1 = authorizationUserMapper.insertAuthorization(tur);
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
