package com.woniu.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Sal implements Serializable {
    private Integer salId;

    private Integer empId;
    private Emps emps;
    private Integer year;

    private Integer month;

    private BigDecimal basepay;

    private BigDecimal jobAllowance;

    private BigDecimal commAllowance;

    private BigDecimal dutyAllowance;

    private BigDecimal healthAllowance;

    private BigDecimal publicHousingFund;

    private BigDecimal extraIncomeId;

    private BigDecimal withholdingTax;

    private BigDecimal withholdingTotle;

    private BigDecimal payableSal;

    private BigDecimal actualSal;

    private static final long serialVersionUID = 1L;

    public Integer getSalId() {
        return salId;
    }

    public void setSalId(Integer salId) {
        this.salId = salId;
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

    public BigDecimal getBasepay() {
        return basepay;
    }

    public void setBasepay(BigDecimal basepay) {
        this.basepay = basepay;
    }

    public BigDecimal getJobAllowance() {
        return jobAllowance;
    }

    public void setJobAllowance(BigDecimal jobAllowance) {
        this.jobAllowance = jobAllowance;
    }

    public BigDecimal getCommAllowance() {
        return commAllowance;
    }

    public void setCommAllowance(BigDecimal commAllowance) {
        this.commAllowance = commAllowance;
    }

    public BigDecimal getDutyAllowance() {
        return dutyAllowance;
    }

    public void setDutyAllowance(BigDecimal dutyAllowance) {
        this.dutyAllowance = dutyAllowance;
    }

    public BigDecimal getHealthAllowance() {
        return healthAllowance;
    }

    public void setHealthAllowance(BigDecimal healthAllowance) {
        this.healthAllowance = healthAllowance;
    }

    public BigDecimal getPublicHousingFund() {
        return publicHousingFund;
    }

    public void setPublicHousingFund(BigDecimal publicHousingFund) {
        this.publicHousingFund = publicHousingFund;
    }

    public BigDecimal getExtraIncomeId() {
        return extraIncomeId;
    }

    public void setExtraIncomeId(BigDecimal extraIncomeId) {
        this.extraIncomeId = extraIncomeId;
    }

    public BigDecimal getWithholdingTax() {
        return withholdingTax;
    }

    public void setWithholdingTax(BigDecimal withholdingTax) {
        this.withholdingTax = withholdingTax;
    }

    public BigDecimal getWithholdingTotle() {
        return withholdingTotle;
    }

    public void setWithholdingTotle(BigDecimal withholdingTotle) {
        this.withholdingTotle = withholdingTotle;
    }

    public BigDecimal getPayableSal() {
        return payableSal;
    }

    public void setPayableSal(BigDecimal payableSal) {
        this.payableSal = payableSal;
    }

    public BigDecimal getActualSal() {
        return actualSal;
    }

    public void setActualSal(BigDecimal actualSal) {
        this.actualSal = actualSal;
    }
    
    public Emps getEmps() {
		return emps;
	}

	public void setEmps(Emps emps) {
		this.emps = emps;
	}



	@Override
	public String toString() {
		return "Sal [salId=" + salId + ", empId=" + empId + ", emps=" + emps + ", year=" + year
				+ ", month=" + month + ", basepay=" + basepay + ", jobAllowance=" + jobAllowance + ", commAllowance="
				+ commAllowance + ", dutyAllowance=" + dutyAllowance + ", healthAllowance=" + healthAllowance
				+ ", publicHousingFund=" + publicHousingFund + ", extraIncomeId=" + extraIncomeId + ", withholdingTax="
				+ withholdingTax + ", withholdingTotle=" + withholdingTotle + ", payableSal=" + payableSal
				+ ", actualSal=" + actualSal + "]";
	}
}