package com.kaisagroup.baoxian.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jackssy on 2018/7/30.
 */

@Configuration
@ConfigurationProperties(prefix = BaoXianProperties.BX, ignoreUnknownFields = false)
public class BaoXianProperties {

    final static String BX = "baoxian";

    private String reportAddress ;

    private String reportKey ;

    private String reportInterface ;

    private String reportUrl;

    public String getReportUrl() {
        return reportAddress+reportInterface;
    }


    public String getReportAddress() {
        return reportAddress;
    }

    public void setReportAddress(String reportAddress) {
        this.reportAddress = reportAddress;
    }

    public String getReportKey() {
        return reportKey;
    }

    public void setReportKey(String reportKey) {
        this.reportKey = reportKey;
    }

    public String getReportInterface() {
        return reportInterface;
    }

    public void setReportInterface(String reportInterface) {
        this.reportInterface = reportInterface;
    }
}
