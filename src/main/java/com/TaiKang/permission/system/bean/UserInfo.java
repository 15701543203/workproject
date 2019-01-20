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

//    public int getUserId() {
//        return userId;
//    }
//
//    public void setUserId(int userId) {
//        this.userId = userId;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getUserPwd() {
//        return userPwd;
//    }
//
//    public void setUserPwd(String userPwd) {
//        this.userPwd = userPwd;
//    }
//
//    public String getTrueName() {
//        return trueName;
//    }
//
//    public void setTrueName(String trueName) {
//        this.trueName = trueName;
//    }
//
//    public String getMobile() {
//        return mobile;
//    }
//
//    public void setMobile(String mobile) {
//        this.mobile = mobile;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Integer getStatus() {
//        return status;
//    }
//
//    public void setStatus(Integer status) {
//        this.status = status;
//    }
//
//    public String getSalt() {
//        return salt;
//    }
//
//    public void setSalt(String salt) {
//        this.salt = salt;
//    }
//
//    public String getRemark() {
//        return remark;
//    }
//
//    public void setRemark(String remark) {
//        this.remark = remark;
//    }
//
//    @Override
//    public String toString() {
//        return "UserInfo{" +
//                "userId=" + userId +
//                ", username='" + username + '\'' +
//                ", userPwd='" + userPwd + '\'' +
//                ", trueName='" + trueName + '\'' +
//                ", mobile='" + mobile + '\'' +
//                ", email='" + email + '\'' +
//                ", status=" + status +
//                ", salt='" + salt + '\'' +
//                ", remark='" + remark + '\'' +
//                '}';
//    }
}
