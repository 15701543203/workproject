package com.TaiKang.permission.system.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class TempUserRole{
    Integer id;
    Integer userId;
    Integer roleId;
    List<Integer>roleList;
}