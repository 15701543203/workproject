package com.ccm.permission.system.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@ToString
public class Role {
private Integer roelId;
private String roleName;
private Integer roleStatus;
private String gentime;
private String roleDescription;

}
