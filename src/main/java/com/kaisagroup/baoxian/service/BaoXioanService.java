package com.kaisagroup.baoxian.service;

import com.kaisagroup.baoxian.entity.BaoXian;
import com.kaisagroup.baoxian.entity.BaoXianExample;
import com.kaisagroup.baoxian.entity.ChanXian;
import com.kaisagroup.baoxian.entity.ShouXian;
import com.kaisagroup.baoxian.util.baoxianjson.RepostJsonDataResp;

import java.util.List;

/**
 * Created by jackssy on 2018/7/27.
 */
public interface BaoXioanService {

    //保存
    void save(BaoXian baoxian, ShouXian shouxian, ChanXian chanxian);

    //更新
    void update(BaoXian baoxian, ShouXian shouxian, ChanXian chanxian);
    //审核状态
    int auditStatus(String id,String status,String man);

    int auditStatus(String id,String status,String man,String remark);

    //提交报送
    RepostJsonDataResp postReportPlaceData(String operId);

    List<BaoXian> findBiaoXianList(BaoXianExample example);

    int deleteBaoXianById(String operId);

    BaoXian findBaoxianById(String id);

    ShouXian findShouxianByBxId(String bxid);

    List<ShouXian> findShouxianListByBxId(String bxid);

    ChanXian findChanxianByBxId(String bxid);


    List<ChanXian> findChanxianListByBxId(String bxid);
}
