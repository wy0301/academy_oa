package com.woniu.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

public class ExtraIncome implements Serializable {
    private Integer extraIncomeId;

    private Integer empId;

    private Integer year;

    private Integer month;

    private String extraIncomeDetail;

    private String remark;

    private BigDecimal total;
    private Map map;

    private static final long serialVersionUID = 1L;

    public Integer getExtraIncomeId() {
        return extraIncomeId;
    }

    public void setExtraIncomeId(Integer extraIncomeId) {
        this.extraIncomeId = extraIncomeId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public String getExtraIncomeDetail() {
        return extraIncomeDetail;
    }

    public void setExtraIncomeDetail(String extraIncomeDetail) {
        this.extraIncomeDetail = extraIncomeDetail == null ? null : extraIncomeDetail.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
    
    

    public void setMap(Map map) {
		this.map = map;
	}

	public Map getMap() {
		Map map =JSONObject.parseObject(extraIncomeDetail);
		return map;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", extraIncomeId=").append(extraIncomeId);
        sb.append(", empId=").append(empId);
        sb.append(", year=").append(year);
        sb.append(", month=").append(month);
        sb.append(", extraIncomeDetail=").append(extraIncomeDetail);
        sb.append(", remark=").append(remark);
        sb.append(", total=").append(total);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}