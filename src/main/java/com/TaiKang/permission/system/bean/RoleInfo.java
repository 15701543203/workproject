package com.TaiKang.permission.system.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


@Getter
@Setter
@ToString
public class RoleInfo {
    private Integer roleId;
    private String roleName;
    private Integer roleStatus;
    private String gentime;
    private String roleDescription;
    private List<Permission> permissions;
    private List<UserInfo> userInfos;
}
