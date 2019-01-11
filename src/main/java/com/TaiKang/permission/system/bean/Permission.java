package com.TaiKang.permission.system.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@ToString
public class Permission {
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
