package com.ccm.permission.system.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@ToString
public class User {

private Integer userId;
private String userName;
private String userPwd;
private String tureName;
private String mobile;
private String email;
private Integer status;
private String salt;
}
