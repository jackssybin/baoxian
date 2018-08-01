package com.kaisagroup.baoxian.entity;

import java.math.BigDecimal;

public class ChanXian {
    private String id;

    private String bxId;

    private String arearange;

    private String insname;

    private String insurancename;

    private BigDecimal premiumnow;

    private BigDecimal premiumsurrender;

    private BigDecimal premiumadd;

    private BigDecimal premiumminus;

    private BigDecimal premiumpre;

    private BigDecimal commissionnow;

    private BigDecimal commissionsurrender;

    private BigDecimal commissionadd;

    private BigDecimal commissionminus;

    private BigDecimal commissionreinsurance;

    private BigDecimal commissionpre;

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

    public BigDecimal getPremiumsurrender() {
        return premiumsurrender;
    }

    public void setPremiumsurrender(BigDecimal premiumsurrender) {
        this.premiumsurrender = premiumsurrender;
    }

    public BigDecimal getPremiumadd() {
        return premiumadd;
    }

    public void setPremiumadd(BigDecimal premiumadd) {
        this.premiumadd = premiumadd;
    }

    public BigDecimal getPremiumminus() {
        return premiumminus;
    }

    public void setPremiumminus(BigDecimal premiumminus) {
        this.premiumminus = premiumminus;
    }

    public BigDecimal getPremiumpre() {
        return premiumpre;
    }

    public void setPremiumpre(BigDecimal premiumpre) {
        this.premiumpre = premiumpre;
    }

    public BigDecimal getCommissionnow() {
        return commissionnow;
    }

    public void setCommissionnow(BigDecimal commissionnow) {
        this.commissionnow = commissionnow;
    }

    public BigDecimal getCommissionsurrender() {
        return commissionsurrender;
    }

    public void setCommissionsurrender(BigDecimal commissionsurrender) {
        this.commissionsurrender = commissionsurrender;
    }

    public BigDecimal getCommissionadd() {
        return commissionadd;
    }

    public void setCommissionadd(BigDecimal commissionadd) {
        this.commissionadd = commissionadd;
    }

    public BigDecimal getCommissionminus() {
        return commissionminus;
    }

    public void setCommissionminus(BigDecimal commissionminus) {
        this.commissionminus = commissionminus;
    }

    public BigDecimal getCommissionreinsurance() {
        return commissionreinsurance;
    }

    public void setCommissionreinsurance(BigDecimal commissionreinsurance) {
        this.commissionreinsurance = commissionreinsurance;
    }

    public BigDecimal getCommissionpre() {
        return commissionpre;
    }

    public void setCommissionpre(BigDecimal commissionpre) {
        this.commissionpre = commissionpre;
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