package com.TaiKang.permission.system.dao;

import com.TaiKang.permission.system.bean.RoleInfo;

import java.util.List;

public interface RoleInfoMapper {
    /**
     * 添加角色
     * @param roleInfo
     * @return
     */
    int insertRole(RoleInfo roleInfo);

    /**
     * 删除角色
     * @param roleId
     * @return
     */
    int deleteRole(int roleId);

    /**
     * 修改角色
     * @param roleInfo
     * @return
     */
    int updateRole(RoleInfo roleInfo);

    /**
     * 全部角色
     * @return
     */
    List<RoleInfo> selectAll();

    /**
     * 一个角色
     * @param roleId
     * @return
     */
    RoleInfo selectOne(int roleId);

    /**
     * 查询用户具备的角色
     * @param userId
     * @return
     */
    List<RoleInfo> selectRoleListByUserId(Integer userId);
}
