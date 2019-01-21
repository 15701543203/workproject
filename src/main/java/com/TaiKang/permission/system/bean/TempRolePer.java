package com.TaiKang.permission.system.bean;


public class TempRolePer {
    private Integer trpId;
    private Integer roleId;
    private Integer perId;

    public Integer getTrpId() {
        return trpId;
    }

    public void setTrpId(Integer trpId) {
        this.trpId = trpId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPerId() {
        return perId;
    }

    public void setPerId(Integer perId) {
        this.perId = perId;
    }

    @Override
    public String toString() {
        return "TempRolePer{" +
                "trpId=" + trpId +
                ", roleId=" + roleId +
                ", perId=" + perId +
                '}';
    }
}
