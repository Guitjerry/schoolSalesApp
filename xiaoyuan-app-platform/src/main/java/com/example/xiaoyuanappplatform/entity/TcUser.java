package com.example.xiaoyuanappplatform.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tc_user", schema = "saleapp", catalog = "")
public class TcUser {
    private int userId;
    private Integer orgId;
    private String acnt;
    private String empNum;
    private String name;
    private Integer gender;
    private String handPhone;
    private String phone;
    private String email;
    private String addr;
    private Integer zipCode;
    private Integer userStatus;
    private String password;
    private Integer ver;
    private Integer createBy;
    private String acntBack;
    private Integer isDown;
    private Integer approvalLevelCode;
    private String personCode;
    private Integer balanceLevelCode;
    private Integer updateBy;
    private Integer userType;
    private Integer employeeId;
    private Integer loginNumbers;
    private Integer isLocked;
    private Timestamp tstamp;
    private Integer isViewNotice;
    private String recipient;
    private String recipientTel;
    private String dealerCode;
    private String token;

    @Id
    @Column(name = "USER_ID")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "ORG_ID")
    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    @Basic
    @Column(name = "ACNT")
    public String getAcnt() {
        return acnt;
    }

    public void setAcnt(String acnt) {
        this.acnt = acnt;
    }

    @Basic
    @Column(name = "EMP_NUM")
    public String getEmpNum() {
        return empNum;
    }

    public void setEmpNum(String empNum) {
        this.empNum = empNum;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "GENDER")
    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "HAND_PHONE")
    public String getHandPhone() {
        return handPhone;
    }

    public void setHandPhone(String handPhone) {
        this.handPhone = handPhone;
    }

    @Basic
    @Column(name = "PHONE")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "ADDR")
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Basic
    @Column(name = "ZIP_CODE")
    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    @Basic
    @Column(name = "USER_STATUS")
    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    @Basic
    @Column(name = "PASSWORD")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "VER")
    public Integer getVer() {
        return ver;
    }

    public void setVer(Integer ver) {
        this.ver = ver;
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
    @Column(name = "ACNT_BACK")
    public String getAcntBack() {
        return acntBack;
    }

    public void setAcntBack(String acntBack) {
        this.acntBack = acntBack;
    }

    @Basic
    @Column(name = "IS_DOWN")
    public Integer getIsDown() {
        return isDown;
    }

    public void setIsDown(Integer isDown) {
        this.isDown = isDown;
    }

    @Basic
    @Column(name = "APPROVAL_LEVEL_CODE")
    public Integer getApprovalLevelCode() {
        return approvalLevelCode;
    }

    public void setApprovalLevelCode(Integer approvalLevelCode) {
        this.approvalLevelCode = approvalLevelCode;
    }

    @Basic
    @Column(name = "PERSON_CODE")
    public String getPersonCode() {
        return personCode;
    }

    public void setPersonCode(String personCode) {
        this.personCode = personCode;
    }

    @Basic
    @Column(name = "BALANCE_LEVEL_CODE")
    public Integer getBalanceLevelCode() {
        return balanceLevelCode;
    }

    public void setBalanceLevelCode(Integer balanceLevelCode) {
        this.balanceLevelCode = balanceLevelCode;
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
    @Column(name = "USER_TYPE")
    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    @Basic
    @Column(name = "EMPLOYEE_ID")
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    @Basic
    @Column(name = "LOGIN_NUMBERS")
    public Integer getLoginNumbers() {
        return loginNumbers;
    }

    public void setLoginNumbers(Integer loginNumbers) {
        this.loginNumbers = loginNumbers;
    }

    @Basic
    @Column(name = "IS_LOCKED")
    public Integer getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Integer isLocked) {
        this.isLocked = isLocked;
    }

    @Basic
    @Column(name = "TSTAMP")
    public Timestamp getTstamp() {
        return tstamp;
    }

    public void setTstamp(Timestamp tstamp) {
        this.tstamp = tstamp;
    }

    @Basic
    @Column(name = "IS_VIEW_NOTICE")
    public Integer getIsViewNotice() {
        return isViewNotice;
    }

    public void setIsViewNotice(Integer isViewNotice) {
        this.isViewNotice = isViewNotice;
    }

    @Basic
    @Column(name = "RECIPIENT")
    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    @Basic
    @Column(name = "RECIPIENT_TEL")
    public String getRecipientTel() {
        return recipientTel;
    }

    public void setRecipientTel(String recipientTel) {
        this.recipientTel = recipientTel;
    }

    @Basic
    @Column(name = "DEALER_CODE")
    public String getDealerCode() {
        return dealerCode;
    }

    public void setDealerCode(String dealerCode) {
        this.dealerCode = dealerCode;
    }

    @Basic
    @Column(name = "TOKEN")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TcUser tcUser = (TcUser) o;

        if (userId != tcUser.userId) return false;
        if (orgId != null ? !orgId.equals(tcUser.orgId) : tcUser.orgId != null) return false;
        if (acnt != null ? !acnt.equals(tcUser.acnt) : tcUser.acnt != null) return false;
        if (empNum != null ? !empNum.equals(tcUser.empNum) : tcUser.empNum != null) return false;
        if (name != null ? !name.equals(tcUser.name) : tcUser.name != null) return false;
        if (gender != null ? !gender.equals(tcUser.gender) : tcUser.gender != null) return false;
        if (handPhone != null ? !handPhone.equals(tcUser.handPhone) : tcUser.handPhone != null) return false;
        if (phone != null ? !phone.equals(tcUser.phone) : tcUser.phone != null) return false;
        if (email != null ? !email.equals(tcUser.email) : tcUser.email != null) return false;
        if (addr != null ? !addr.equals(tcUser.addr) : tcUser.addr != null) return false;
        if (zipCode != null ? !zipCode.equals(tcUser.zipCode) : tcUser.zipCode != null) return false;
        if (userStatus != null ? !userStatus.equals(tcUser.userStatus) : tcUser.userStatus != null) return false;
        if (password != null ? !password.equals(tcUser.password) : tcUser.password != null) return false;
        if (ver != null ? !ver.equals(tcUser.ver) : tcUser.ver != null) return false;
        if (createBy != null ? !createBy.equals(tcUser.createBy) : tcUser.createBy != null) return false;
        if (acntBack != null ? !acntBack.equals(tcUser.acntBack) : tcUser.acntBack != null) return false;
        if (isDown != null ? !isDown.equals(tcUser.isDown) : tcUser.isDown != null) return false;
        if (approvalLevelCode != null ? !approvalLevelCode.equals(tcUser.approvalLevelCode) : tcUser.approvalLevelCode != null)
            return false;
        if (personCode != null ? !personCode.equals(tcUser.personCode) : tcUser.personCode != null) return false;
        if (balanceLevelCode != null ? !balanceLevelCode.equals(tcUser.balanceLevelCode) : tcUser.balanceLevelCode != null)
            return false;
        if (updateBy != null ? !updateBy.equals(tcUser.updateBy) : tcUser.updateBy != null) return false;
        if (userType != null ? !userType.equals(tcUser.userType) : tcUser.userType != null) return false;
        if (employeeId != null ? !employeeId.equals(tcUser.employeeId) : tcUser.employeeId != null) return false;
        if (loginNumbers != null ? !loginNumbers.equals(tcUser.loginNumbers) : tcUser.loginNumbers != null)
            return false;
        if (isLocked != null ? !isLocked.equals(tcUser.isLocked) : tcUser.isLocked != null) return false;
        if (tstamp != null ? !tstamp.equals(tcUser.tstamp) : tcUser.tstamp != null) return false;
        if (isViewNotice != null ? !isViewNotice.equals(tcUser.isViewNotice) : tcUser.isViewNotice != null)
            return false;
        if (recipient != null ? !recipient.equals(tcUser.recipient) : tcUser.recipient != null) return false;
        if (recipientTel != null ? !recipientTel.equals(tcUser.recipientTel) : tcUser.recipientTel != null)
            return false;
        if (dealerCode != null ? !dealerCode.equals(tcUser.dealerCode) : tcUser.dealerCode != null) return false;
        if (token != null ? !token.equals(tcUser.token) : tcUser.token != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (orgId != null ? orgId.hashCode() : 0);
        result = 31 * result + (acnt != null ? acnt.hashCode() : 0);
        result = 31 * result + (empNum != null ? empNum.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (handPhone != null ? handPhone.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (addr != null ? addr.hashCode() : 0);
        result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
        result = 31 * result + (userStatus != null ? userStatus.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (ver != null ? ver.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (acntBack != null ? acntBack.hashCode() : 0);
        result = 31 * result + (isDown != null ? isDown.hashCode() : 0);
        result = 31 * result + (approvalLevelCode != null ? approvalLevelCode.hashCode() : 0);
        result = 31 * result + (personCode != null ? personCode.hashCode() : 0);
        result = 31 * result + (balanceLevelCode != null ? balanceLevelCode.hashCode() : 0);
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        result = 31 * result + (userType != null ? userType.hashCode() : 0);
        result = 31 * result + (employeeId != null ? employeeId.hashCode() : 0);
        result = 31 * result + (loginNumbers != null ? loginNumbers.hashCode() : 0);
        result = 31 * result + (isLocked != null ? isLocked.hashCode() : 0);
        result = 31 * result + (tstamp != null ? tstamp.hashCode() : 0);
        result = 31 * result + (isViewNotice != null ? isViewNotice.hashCode() : 0);
        result = 31 * result + (recipient != null ? recipient.hashCode() : 0);
        result = 31 * result + (recipientTel != null ? recipientTel.hashCode() : 0);
        result = 31 * result + (dealerCode != null ? dealerCode.hashCode() : 0);
        result = 31 * result + (token != null ? token.hashCode() : 0);
        return result;
    }
}
