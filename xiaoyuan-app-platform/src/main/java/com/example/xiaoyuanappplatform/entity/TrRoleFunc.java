package com.example.xiaoyuanappplatform.entity;

import javax.persistence.*;

@Entity
@Table(name = "tr_role_func", schema = "saleapp", catalog = "")
public class TrRoleFunc {
    private int roleFuncId;
    private Integer roleId;
    private Integer funcId;
    private Integer createBy;

    @Id
    @Column(name = "ROLE_FUNC_ID")
    public int getRoleFuncId() {
        return roleFuncId;
    }

    public void setRoleFuncId(int roleFuncId) {
        this.roleFuncId = roleFuncId;
    }

    @Basic
    @Column(name = "ROLE_ID")
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "FUNC_ID")
    public Integer getFuncId() {
        return funcId;
    }

    public void setFuncId(Integer funcId) {
        this.funcId = funcId;
    }

    @Basic
    @Column(name = "CREATE_BY")
    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrRoleFunc that = (TrRoleFunc) o;

        if (roleFuncId != that.roleFuncId) return false;
        if (roleId != null ? !roleId.equals(that.roleId) : that.roleId != null) return false;
        if (funcId != null ? !funcId.equals(that.funcId) : that.funcId != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleFuncId;
        result = 31 * result + (roleId != null ? roleId.hashCode() : 0);
        result = 31 * result + (funcId != null ? funcId.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        return result;
    }
}
