package com.TaiKang.permission.system.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OperatorLog {
    private String logId;
    private int userId;
    private String username;
    private String trueName;
    private String roleName;
    private String operDate;
    private String operType;
    private String operContent;

}
