package com.ccm.permission.system.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Getter
@Setter
@ToString
@Entity
public class UserInfo{
    //用戶id
    @Id@GeneratedValue
    private Integer userId;
    //用戶姓名
    private String username;
    //密码
    private String userPwd;
    //真实姓名
    private String tureName;
    //电话号码
    private String mobile;
    //邮箱
    private String email;
    //状态
    private Integer status;
    //盐
    private String salt;

}
