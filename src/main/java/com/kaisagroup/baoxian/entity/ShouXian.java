package com.kaisagroup.baoxian.entity;

import java.math.BigDecimal;

public class ShouXian {
    private String id;

    private String bxId;

    private String arearange;

    private String insname;

    private String insurancename;

    private BigDecimal premiumnow;

    private BigDecimal premiumpre;

    private BigDecimal premiumrenewalnow;

    private BigDecimal premiumrenewalpre;

    private BigDecimal commissionnow;

    private BigDecimal commissionpre;

    private BigDecimal commissionrenewalnow;

    private BigDecimal commissionrenewalpre;

    private BigDecimal premiumnet;

    private BigDecimal premiumtel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBxId() {
        return bxId;
    }

    public void setBxId(String bxId) {
        this.bxId = bxId == null ? null : bxId.trim();
    }

    public String getArearange() {
        return arearange;
    }

    public void setArearange(String arearange) {
        this.arearange = arearange == null ? null : arearange.trim();
    }

    public String getInsname() {
        return insname;
    }

    public void setInsname(String insname) {
        this.insname = insname == null ? null : insname.trim();
    }

    public String getInsurancename() {
        return insurancename;
    }

    public void setInsurancename(String insurancename) {
        this.insurancename = insurancename == null ? null : insurancename.trim();
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

    public BigDecimal getPremiumrenewalnow() {
        return premiumrenewalnow;
    }

    public void setPremiumrenewalnow(BigDecimal premiumrenewalnow) {
        this.premiumrenewalnow = premiumrenewalnow;
    }

    public BigDecimal getPremiumrenewalpre() {
        return premiumrenewalpre;
    }

    public void setPremiumrenewalpre(BigDecimal premiumrenewalpre) {
        this.premiumrenewalpre = premiumrenewalpre;
    }

    public BigDecimal getCommissionnow() {
        return commissionnow;
    }

    public void setCommissionnow(BigDecimal commissionnow) {
        this.commissionnow = commissionnow;
    }

    public BigDecimal getCommissionpre() {
        return commissionpre;
    }

    public void setCommissionpre(BigDecimal commissionpre) {
        this.commissionpre = commissionpre;
    }

    public BigDecimal getCommissionrenewalnow() {
        return commissionrenewalnow;
    }

    public void setCommissionrenewalnow(BigDecimal commissionrenewalnow) {
        this.commissionrenewalnow = commissionrenewalnow;
    }

    public BigDecimal getCommissionrenewalpre() {
        return commissionrenewalpre;
    }

    public void setCommissionrenewalpre(BigDecimal commissionrenewalpre) {
        this.commissionrenewalpre = commissionrenewalpre;
    }

    public BigDecimal getPremiumnet() {
        return premiumnet;
    }

    public void setPremiumnet(BigDecimal premiumnet) {
        this.premiumnet = premiumnet;
    }

    public BigDecimal getPremiumtel() {
        return premiumtel;
    }

    public void setPremiumtel(BigDecimal premiumtel) {
        this.premiumtel = premiumtel;
    }
}