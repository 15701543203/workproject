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
public class Permission {
    @Id@GeneratedValue
    private Integer perId;
    private String perName;
    private Integer parentId;
    private String pageUrl;
    private String meta;
    private Integer orderNumber;
    private Integer isParent;
    private String permission;
    private String type;
    private String perDescription;
}
