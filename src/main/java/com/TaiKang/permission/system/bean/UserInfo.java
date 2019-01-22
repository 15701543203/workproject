package com.TaiKang.permission.system.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;


@Getter
@Setter
@ToString
public class UserInfo{
    //用戶id
    private int userId;
    //用戶姓名
    private String username;
    //密码
    private String userPwd;
    //真实姓名
    private String trueName;
    //电话号码
    private String mobile;
    //邮箱
    private String email;
    //状态
    private Integer status;
    //盐
    private String salt;
    //备注
    private String remark;

    private String perms;

    private List<String> roleNames;

    public int getUserId() {
        return userId;
    }
}
