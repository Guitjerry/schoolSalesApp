package com.example.xiaoyuanappplatform.entity;

import javax.persistence.*;

@Entity
@Table(name = "tc_role", schema = "saleapp", catalog = "")
public class TcRole {
    private int roleId;
    private String roleName;
    private String roleDesc;
    private int roleStatus;
    private Integer roleType;
    private Integer updateBy;
    private Integer createBy;
    private Integer oemCompanyId;
    private Integer roleBusType;
    private String roleCode;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ROLE_ID")
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "ROLE_NAME")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Basic
    @Column(name = "ROLE_DESC")
    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    @Basic
    @Column(name = "ROLE_STATUS")
    public int getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(int roleStatus) {
        this.roleStatus = roleStatus;
    }

    @Basic
    @Column(name = "ROLE_TYPE")
    public Integer getRoleType() {
        return roleType;
    }

    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }

    @Basic
    @Column(name = "UPDATE_BY")
    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    @Basic
    @Column(name = "CREATE_BY")
    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    @Basic
    @Column(name = "OEM_COMPANY_ID")
    public Integer getOemCompanyId() {
        return oemCompanyId;
    }

    public void setOemCompanyId(Integer oemCompanyId) {
        this.oemCompanyId = oemCompanyId;
    }

    @Basic
    @Column(name = "ROLE_BUS_TYPE")
    public Integer getRoleBusType() {
        return roleBusType;
    }

    public void setRoleBusType(Integer roleBusType) {
        this.roleBusType = roleBusType;
    }

    @Basic
    @Column(name = "ROLE_CODE")
    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TcRole tcRole = (TcRole) o;

        if (roleId != tcRole.roleId) return false;
        if (roleStatus != tcRole.roleStatus) return false;
        if (roleName != null ? !roleName.equals(tcRole.roleName) : tcRole.roleName != null) return false;
        if (roleDesc != null ? !roleDesc.equals(tcRole.roleDesc) : tcRole.roleDesc != null) return false;
        if (roleType != null ? !roleType.equals(tcRole.roleType) : tcRole.roleType != null) return false;
        if (updateBy != null ? !updateBy.equals(tcRole.updateBy) : tcRole.updateBy != null) return false;
        if (createBy != null ? !createBy.equals(tcRole.createBy) : tcRole.createBy != null) return false;
        if (oemCompanyId != null ? !oemCompanyId.equals(tcRole.oemCompanyId) : tcRole.oemCompanyId != null)
            return false;
        if (roleBusType != null ? !roleBusType.equals(tcRole.roleBusType) : tcRole.roleBusType != null) return false;
        if (roleCode != null ? !roleCode.equals(tcRole.roleCode) : tcRole.roleCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleId;
        result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
        result = 31 * result + (roleDesc != null ? roleDesc.hashCode() : 0);
        result = 31 * result + roleStatus;
        result = 31 * result + (roleType != null ? roleType.hashCode() : 0);
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (oemCompanyId != null ? oemCompanyId.hashCode() : 0);
        result = 31 * result + (roleBusType != null ? roleBusType.hashCode() : 0);
        result = 31 * result + (roleCode != null ? roleCode.hashCode() : 0);
        return result;
    }
}
