package com.woniu.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Syslog implements Serializable {
    private Integer logId;
    private Date opTime;

    private Integer opEmp;

    private String ip;

    private String opModule;

    private String opType;

    private String opContent;

    private BigDecimal opDuration;

    private static final long serialVersionUID = 1L;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public String getOpTime() {
        return new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(opTime);
    }

    public void setOpTime(Date opTime) {
        this.opTime = opTime;
    }

    public Integer getOpEmp() {
        return opEmp;
    }

    public void setOpEmp(Integer opEmp) {
        this.opEmp = opEmp;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getOpModule() {
        return opModule;
    }

    public void setOpModule(String opModule) {
        this.opModule = opModule == null ? null : opModule.trim();
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType == null ? null : opType.trim();
    }

    public String getOpContent() {
        return opContent;
    }

    public void setOpContent(String opContent) {
        this.opContent = opContent == null ? null : opContent.trim();
    }

    public BigDecimal getOpDuration() {
        return opDuration;
    }

    public void setOpDuration(BigDecimal opDuration) {
        this.opDuration = opDuration;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logId=").append(logId);
        sb.append(", opTime=").append(opTime);
        sb.append(", opEmp=").append(opEmp);
        sb.append(", ip=").append(ip);
        sb.append(", opModule=").append(opModule);
        sb.append(", opType=").append(opType);
        sb.append(", opContent=").append(opContent);
        sb.append(", opDuration=").append(opDuration);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}