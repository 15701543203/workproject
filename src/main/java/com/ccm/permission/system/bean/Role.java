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
public class Role {
    @Id@GeneratedValue
    private Integer roelId;
    private String roleName;
    private Integer roleStatus;
    private String gentime;
    private String roleDescription;

}
