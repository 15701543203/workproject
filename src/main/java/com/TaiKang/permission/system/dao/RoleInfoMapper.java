package com.TaiKang.permission.system.dao;

import com.TaiKang.permission.system.bean.RoleInfo;

import java.util.List;

public interface RoleInfoMapper {
    List<RoleInfo> selectRolesByUserId(int userId);

    int insertRole(RoleInfo roleInfo);

    int deleteRole(int roleId);

    int updateRole(RoleInfo roleInfo);

    List<RoleInfo> selectAll();

    RoleInfo selectOne(int roleId);











}
