package com.woniu.domain;

import java.io.Serializable;
import java.util.Date;

public class Emps implements Serializable {
    private Integer empId;

    private String ename;

    private String sex;

    private Date birthday;

    private String phone;

    private Date hiredate;

    private Integer deptId;

    private String status;

    private String oaAccount;

    private String oaPassword;

    private String salt;

    private static final long serialVersionUID = 1L;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getOaAccount() {
        return oaAccount;
    }

    public void setOaAccount(String oaAccount) {
        this.oaAccount = oaAccount == null ? null : oaAccount.trim();
    }

    public String getOaPassword() {
        return oaPassword;
    }

    public void setOaPassword(String oaPassword) {
        this.oaPassword = oaPassword == null ? null : oaPassword.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", empId=").append(empId);
        sb.append(", ename=").append(ename);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", phone=").append(phone);
        sb.append(", hiredate=").append(hiredate);
        sb.append(", deptId=").append(deptId);
        sb.append(", status=").append(status);
        sb.append(", oaAccount=").append(oaAccount);
        sb.append(", oaPassword=").append(oaPassword);
        sb.append(", salt=").append(salt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}