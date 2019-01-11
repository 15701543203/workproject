package com.TaiKang.permission.system.service.impl;

import com.TaiKang.permission.system.bean.RoleInfo;
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
    public List<RoleInfo> getRolesByUserId(int userId) {


        return roleInfoMapper.selectRolesByUserId(userId);
    }
}
