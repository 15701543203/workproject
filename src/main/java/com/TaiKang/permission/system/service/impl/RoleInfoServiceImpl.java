package com.TaiKang.permission.system.service.impl;

import com.TaiKang.permission.system.bean.RoleInfo;
import com.TaiKang.permission.system.bean.UserInfo;
import com.TaiKang.permission.system.dao.RoleInfoMapper;
import com.TaiKang.permission.system.service.RoleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleInfoServiceImpl implements RoleInfoService {
    @Autowired
    private RoleInfoMapper roleInfoMapper;
    @Override
    public boolean addRole(RoleInfo roleInfo) {
        int i = roleInfoMapper.insertRole(roleInfo);
        if (i==1){
            return true;
        }
        return false;
    }

    @Override
    public boolean delRole(int roleId) {
        int i = roleInfoMapper.deleteRole(roleId);
        if (i==1){
            return true;
        }
        return false;
    }

    @Override
    public boolean updateRole(RoleInfo roleInfo) {
        int i =roleInfoMapper.updateRole(roleInfo);
        if (i==1){
            return true;
        }
        return false;
    }

    @Override
    public List<RoleInfo> getAll() {
        List<RoleInfo> roleInfos = roleInfoMapper.selectAll();
        return roleInfos;
    }

    @Override
    public RoleInfo getOne(int roleId) {
        RoleInfo roleInfo = roleInfoMapper.selectOne(roleId);
        return roleInfo;
    }

    @Override
    public List<RoleInfo> getRoleListByUserId(UserInfo userInfo) {
        List<RoleInfo> roleInfos = roleInfoMapper.selectRoleListByUserId(userInfo.getUserId());


        return roleInfos;
    }

    @Override
    public List<String> getRoleNames(int userId) {
        return roleInfoMapper.selectRoleNamesByUserId(userId);
    }
}
