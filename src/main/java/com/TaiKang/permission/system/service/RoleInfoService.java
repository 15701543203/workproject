package com.TaiKang.permission.system.service;

import com.TaiKang.permission.system.bean.RoleInfo;

import java.util.List;

public interface RoleInfoService {


    List<RoleInfo> getRolesByUserId(int userId);

    boolean addRole(RoleInfo roleInfo);

    boolean delRole(int roleId);

    boolean updateRole(RoleInfo roleInfo);

    List<RoleInfo> getAll();

    RoleInfo getOne(int roleId);


}
