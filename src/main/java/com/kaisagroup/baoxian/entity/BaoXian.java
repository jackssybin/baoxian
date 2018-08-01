package com.kaisagroup.baoxian.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.kaisagroup.baoxian.util.Constants;

import java.math.BigDecimal;
import java.util.Date;

public class BaoXian {
    private String id;

    private String deptcode;

    private Integer year;

    private Integer month;

    private String deptname;

    private Integer deptpeoplenow;

    private Integer deptpeoplepre;

    private Integer certificatepeoplenow;

    private Integer certificatepeoplepre;

    private BigDecimal premiumnow;

    private BigDecimal premiumpre;

    private BigDecimal turnovernow;

    private BigDecimal turnoverpre;

    private BigDecimal profitnow;

    @JSONField(serialize=false)
    private String remark;

    private BigDecimal profitpre;
    @JSONField(serialize=false)
    private String reportplace;

    @JSONField(serialize=false)
    private String createman;

    @JSONField(serialize=false)
    private String auditman;

    @JSONField(serialize=false)
    private String status;

    private String statusCn;

    public String getStatusCn() {
        return Constants.Status.getNameByCode(status);
    }

    public void setStatusCn(String statusCn) {
        this.statusCn = statusCn;
    }

    @JSONField(serialize=false)
    private Date createtime;

    @JSONField(serialize=false)
    private Date updatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode == null ? null : deptcode.trim();
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

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public Integer getDeptpeoplenow() {
        return deptpeoplenow;
    }

    public void setDeptpeoplenow(Integer deptpeoplenow) {
        this.deptpeoplenow = deptpeoplenow;
    }

    public Integer getDeptpeoplepre() {
        return deptpeoplepre;
    }

    public void setDeptpeoplepre(Integer deptpeoplepre) {
        this.deptpeoplepre = deptpeoplepre;
    }

    public Integer getCertificatepeoplenow() {
        return certificatepeoplenow;
    }

    public void setCertificatepeoplenow(Integer certificatepeoplenow) {
        this.certificatepeoplenow = certificatepeoplenow;
    }

    public Integer getCertificatepeoplepre() {
        return certificatepeoplepre;
    }

    public void setCertificatepeoplepre(Integer certificatepeoplepre) {
        this.certificatepeoplepre = certificatepeoplepre;
    }

    public BigDecimal getPremiumnow() {
        return premiumnow;
    }

    public void setPremiumnow(BigDecimal premiumnow) {
        this.premiumnow = premiumnow;
    }

    public BigDecimal getPremiumpre() {
        return premiumpre;
    }

    public void setPremiumpre(BigDecimal premiumpre) {
        this.premiumpre = premiumpre;
    }

    public BigDecimal getTurnovernow() {
        return turnovernow;
    }

    public void setTurnovernow(BigDecimal turnovernow) {
        this.turnovernow = turnovernow;
    }

    public BigDecimal getTurnoverpre() {
        return turnoverpre;
    }

    public void setTurnoverpre(BigDecimal turnoverpre) {
        this.turnoverpre = turnoverpre;
    }

    public BigDecimal getProfitnow() {
        return profitnow;
    }

    public void setProfitnow(BigDecimal profitnow) {
        this.profitnow = profitnow;
    }

    public BigDecimal getProfitpre() {
        return profitpre;
    }

    public void setProfitpre(BigDecimal profitpre) {
        this.profitpre = profitpre;
    }

    public String getReportplace() {
        return reportplace;
    }

    public void setReportplace(String reportplace) {
        this.reportplace = reportplace == null ? null : reportplace.trim();
    }

    public String getCreateman() {
        return createman;
    }

    public void setCreateman(String createman) {
        this.createman = createman == null ? null : createman.trim();
    }

    public String getAuditman() {
        return auditman;
    }

    public void setAuditman(String auditman) {
        this.auditman = auditman == null ? null : auditman.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}