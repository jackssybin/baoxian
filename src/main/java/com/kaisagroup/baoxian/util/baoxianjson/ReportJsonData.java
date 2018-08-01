package com.kaisagroup.baoxian.util.baoxianjson;

import com.alibaba.fastjson.JSON;
import com.kaisagroup.baoxian.entity.BaoXian;
import com.kaisagroup.baoxian.entity.ChanXian;
import com.kaisagroup.baoxian.entity.ShouXian;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jackssy on 2018/7/30.
 */
public class ReportJsonData {

    private BaoXian data;

    private List<ChanXian> listproperty ;

    private List<ShouXian> listlife ;

    private String key;

    public BaoXian getData() {
        return data;
    }

    public void setData(BaoXian data) {
        this.data = data;
    }

    public List<ChanXian> getListproperty() {
        return listproperty;
    }

    public void setListproperty(List<ChanXian> listproperty) {
        this.listproperty = listproperty;
    }

    public List<ShouXian> getListlife() {
        return listlife;
    }

    public void setListlife(List<ShouXian> listlife) {
        this.listlife = listlife;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public static void main(String[] args) {
        ReportJsonData data = new ReportJsonData();
        BaoXian baoxian = new BaoXian();
        baoxian.setId("11");
        data.setData(baoxian);
        List<ShouXian> shouXians = new ArrayList<>();
        ShouXian shouxian = new ShouXian() ;
        shouxian.setInsname("asfdasd");
        shouXians.add(shouxian);
        data.setListlife(shouXians);

        List<ChanXian> chanXians  = new ArrayList<>();
        ChanXian chanXian = new ChanXian() ;
        chanXian.setInsname("产险");
        chanXians.add(chanXian);
        data.setListproperty(chanXians);

        data.setKey("测试密钥");
        String jsonString2 = JSON.toJSONString(data);
        System.out.println(jsonString2);

    }
}
