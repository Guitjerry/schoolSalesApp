package com.example.xiaoyuanappplatform.entity;

import javax.persistence.*;

@Entity
@Table(name = "tc_func", schema = "saleapp", catalog = "")
public class TcFunc {
    private int funcId;
    private Integer parFuncId;
    private String funcCode;
    private String funcName;
    private Integer funcType;
    private String funcEnName;
    private Integer sortOrder;
    private Integer createBy;
    private Integer updateBy;
    private String funcUrl;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "FUNC_ID")
    public int getFuncId() {
        return funcId;
    }

    public void setFuncId(int funcId) {
        this.funcId = funcId;
    }

    @Basic
    @Column(name = "PAR_FUNC_ID")
    public Integer getParFuncId() {
        return parFuncId;
    }

    public void setParFuncId(Integer parFuncId) {
        this.parFuncId = parFuncId;
    }

    @Basic
    @Column(name = "FUNC_CODE")
    public String getFuncCode() {
        return funcCode;
    }

    public void setFuncCode(String funcCode) {
        this.funcCode = funcCode;
    }

    @Basic
    @Column(name = "FUNC_NAME")
    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    @Basic
    @Column(name = "FUNC_TYPE")
    public Integer getFuncType() {
        return funcType;
    }

    public void setFuncType(Integer funcType) {
        this.funcType = funcType;
    }

    @Basic
    @Column(name = "FUNC_EN_NAME")
    public String getFuncEnName() {
        return funcEnName;
    }

    public void setFuncEnName(String funcEnName) {
        this.funcEnName = funcEnName;
    }

    @Basic
    @Column(name = "SORT_ORDER")
    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
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
    @Column(name = "UPDATE_BY")
    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    @Basic
    @Column(name = "FUNC_URL")
    public String getFuncUrl() {
        return funcUrl;
    }

    public void setFuncUrl(String funcUrl) {
        this.funcUrl = funcUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TcFunc tcFunc = (TcFunc) o;

        if (funcId != tcFunc.funcId) return false;
        if (parFuncId != null ? !parFuncId.equals(tcFunc.parFuncId) : tcFunc.parFuncId != null) return false;
        if (funcCode != null ? !funcCode.equals(tcFunc.funcCode) : tcFunc.funcCode != null) return false;
        if (funcName != null ? !funcName.equals(tcFunc.funcName) : tcFunc.funcName != null) return false;
        if (funcType != null ? !funcType.equals(tcFunc.funcType) : tcFunc.funcType != null) return false;
        if (funcEnName != null ? !funcEnName.equals(tcFunc.funcEnName) : tcFunc.funcEnName != null) return false;
        if (sortOrder != null ? !sortOrder.equals(tcFunc.sortOrder) : tcFunc.sortOrder != null) return false;
        if (createBy != null ? !createBy.equals(tcFunc.createBy) : tcFunc.createBy != null) return false;
        if (updateBy != null ? !updateBy.equals(tcFunc.updateBy) : tcFunc.updateBy != null) return false;
        if (funcUrl != null ? !funcUrl.equals(tcFunc.funcUrl) : tcFunc.funcUrl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = funcId;
        result = 31 * result + (parFuncId != null ? parFuncId.hashCode() : 0);
        result = 31 * result + (funcCode != null ? funcCode.hashCode() : 0);
        result = 31 * result + (funcName != null ? funcName.hashCode() : 0);
        result = 31 * result + (funcType != null ? funcType.hashCode() : 0);
        result = 31 * result + (funcEnName != null ? funcEnName.hashCode() : 0);
        result = 31 * result + (sortOrder != null ? sortOrder.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        result = 31 * result + (funcUrl != null ? funcUrl.hashCode() : 0);
        return result;
    }
}
