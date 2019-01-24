package com.TaiKang.permission.system.service;

import com.TaiKang.permission.system.bean.RoleInfo;
import com.TaiKang.permission.system.bean.UserInfo;

import java.util.List;

public interface RoleInfoService {
    /**
     * 添加角色
     * @param roleInfo
     * @return
     */
    boolean addRole(RoleInfo roleInfo);

    /**
     * 删除角色
     * @param roleId
     * @return
     */
    boolean delRole(int roleId);

    /**
     * 修改角色
     * @param roleInfo
     * @return
     */
    boolean updateRole(RoleInfo roleInfo);

    /**
     *  全部角色
     * @return
     */
    List<RoleInfo> getAll();

    /**
     * 查询一个角色
     * @param roleId
     * @return
     */
    RoleInfo getOne(int roleId);

    /**
     * 根据登录用户信息查询角色信息
     * @param userInfo
     * @return
     */
    List<RoleInfo> getRoleListByUserId(UserInfo userInfo);

    /**
     * 使用userId查询出具备的所有jues
     * @param userId
     * @return
     */
    List<String> getRoleNames(int userId);


}
