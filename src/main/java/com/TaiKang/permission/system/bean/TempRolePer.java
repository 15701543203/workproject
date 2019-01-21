package com.TaiKang.permission.system.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class TempRolePer {
    private Integer trpId;
    private Integer roleId;
    private Integer perId;
    private List<Permission> permissions = new ArrayList<>();

}
