package com.kaisagroup.baoxian.service.impl;

import com.alibaba.fastjson.JSON;
import com.kaisagroup.baoxian.config.BaoXianProperties;
import com.kaisagroup.baoxian.entity.*;
import com.kaisagroup.baoxian.mapper.BaoXianMapper;
import com.kaisagroup.baoxian.mapper.ChanXianMapper;
import com.kaisagroup.baoxian.mapper.ShouXianMapper;
import com.kaisagroup.baoxian.service.BaoXioanService;
import com.kaisagroup.baoxian.util.*;
import com.kaisagroup.baoxian.util.baoxianjson.ReportJsonData;
import com.kaisagroup.baoxian.util.baoxianjson.RepostJsonDataResp;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.thymeleaf.util.StringUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by jackssy on 2018/7/27.
 */
@Service
public class BaoXianServiceImpl  implements BaoXioanService {

    private Log logger = LogFactory.getLog(this.getClass());

    @Autowired
    private BaoXianMapper baoXianMapper;

    @Autowired
    private ChanXianMapper chanXianMapper;

    @Autowired
    private ShouXianMapper shouXianMapper;

    @Autowired
    private BaoXianProperties baoXianProperties;

    @Override
    @Transactional
    public void save(BaoXian baoxian, ShouXian shouxian,ChanXian chanxian){
        String id = UuidUtil.getUuid();

        baoxian.setId(id);
        baoxian.setCreateman("admin");
        baoxian.setStatus(Constants.Status.toAudit.getCode());
        baoxian.setCreatetime(new Date());

        this.baoXianMapper.insertSelective(baoxian);

        shouxian.setBxId(id);
        shouxian.setId(UuidUtil.getUuid());
        this.shouXianMapper.insertSelective(shouxian);

        chanxian.setBxId(id);
        chanxian.setId(UuidUtil.getUuid());
        this.chanXianMapper.insertSelective(chanxian);

    }

    @Override
    public void saveOrUpdateBaoXian(BaoXian baoxian) {
        if(StringUtils.isEmpty(baoxian.getId())){
            String id = UuidUtil.getUuid();
            baoxian.setId(id);
            baoxian.setCreateman("admin");
            baoxian.setStatus(Constants.Status.toAudit.getCode());
            baoxian.setCreatetime(new Date());
            this.baoXianMapper.insertSelective(baoxian);
        }else{
            baoxian.setUpdatetime(new Date());
            if(!StringUtils.isEmpty(baoxian.getStatus())){
                baoxian.setStatus(Constants.Status.toAudit.getCode());
                baoxian.setCreatetime(new Date());
                baoxian.setCreateman(Constants.OPER_MAN);
            }
            this.baoXianMapper.updateByPrimaryKeySelective(baoxian);
        }
    }

    @Override
    public void saveOrUpdateChanXian(ChanXian chanxian) {
            if(StringUtils.isEmpty(chanxian.getId())){
                this.chanXianMapper.insertSelective(chanxian);
            }else{
                this.chanXianMapper.updateByPrimaryKeySelective(chanxian);
            }
    }

    @Override
    public void saveOrUpdateShouXian(ShouXian shouxian) {
            if(StringUtils.isEmpty(shouxian.getId())){
                this.shouXianMapper.insertSelective(shouxian);
            }else{
                this.shouXianMapper.updateByPrimaryKeySelective(shouxian);
            }
    }


    @Override
    @Transactional
    public void update(BaoXian baoxian, ShouXian shouxian, ChanXian chanxian) {
        baoxian.setUpdatetime(new Date());
        if(!StringUtils.isEmpty(baoxian.getStatus())){
            baoxian.setStatus(Constants.Status.toAudit.getCode());
            baoxian.setCreatetime(new Date());
            baoxian.setCreateman(Constants.OPER_MAN);
        }

        this.baoXianMapper.updateByPrimaryKeySelective(baoxian);

        this.shouXianMapper.updateByPrimaryKeySelective(shouxian);

        this.chanXianMapper.updateByPrimaryKeySelective(chanxian);

    }


    @Override
    public int auditStatus(String id, String status, String man) {
         return auditStatus(id,status,man,"报送成功!");
    }

    @Override
    public int auditStatus(String id, String status, String man,String remark) {
        BaoXian baoxian = new BaoXian();
        baoxian.setId(id);
        baoxian.setStatus(status);
        baoxian.setUpdatetime(new Date());
        baoxian.setAuditman(man);
        baoxian.setRemark(remark);

        return this.baoXianMapper.updateByPrimaryKeySelective(baoxian);
    }



    @Override
    public RepostJsonDataResp postReportPlaceData(String operId) {
        RepostJsonDataResp resp = new RepostJsonDataResp();

        ReportJsonData data = new ReportJsonData();

        BaoXian baoxian  = this.findBaoxianById(operId);
        data.setData(baoxian);


        List<ShouXian> shouXians = new ArrayList<>();
        ShouXian shouXian =this.findShouxianByBxId(operId);
        shouXians.add(shouXian);
        data.setListlife(shouXians);


        List<ChanXian> chanXians = new ArrayList<>();
        ChanXian chanXian =this.findChanxianByBxId(operId);
        chanXians.add(chanXian);
        data.setListproperty(chanXians);

        setKeyStation(data);

        String postDataParamStr = JSON.toJSONString(data);
        logger.info("提交数据：参数为;"+postDataParamStr);

        String postUrl =baoXianProperties.getReportUrl();
        APIHttpClient api = new APIHttpClient(postUrl);
        String resutlStr =api.post(postDataParamStr);
        logger.info("提交数据返回结果为:"+resutlStr);
        if(!StringUtils.isEmpty(resutlStr)){
            resp =JSON.parseObject(resutlStr,RepostJsonDataResp.class);

            if(!StringUtils.isEmpty(resp.getResult().getCode())&&"0".equals(resp.getResult().getCode()))//1:成功 , 0 :失败
            {
                //失败之后需要更新产品状态。
                this.auditStatus(baoxian.getId(),Constants.Status.reject.getCode(),Constants.OPER_MAN,resp.getResult().getMessage());
            }
            return resp ;
        }
        return resp;

    }

    private void setKeyStation(ReportJsonData data) {
        String key = baoXianProperties.getReportKey();

        String md5PreStr= JSON.toJSONString(data);
        String originStr="";
        try {
             originStr = URLEncoder.encode(md5PreStr,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String md5KeyStr= Md5Util.getBigMD5String(originStr+key);
        logger.info("提交数据：加密原始数据为:"+originStr+" key为:"+key);
        logger.info("提交数据: 加密之后的数据为:"+md5KeyStr);
        data.setKey(md5KeyStr);
    }


    @Override
    public List<BaoXian> findBiaoXianList(BaoXianExample example) {

        return this.baoXianMapper.selectByExample(example);
    }

    @Override
    public int deleteBaoXianById(String operId) {
        int result=this.baoXianMapper.deleteByPrimaryKey(operId);
        if(result>0){
            logger.info("删除保险主表成功");
            this.chanXianMapper.deleteByBxId(operId);
        }

        if(result>0){
            logger.info("删除产险表成功");
            this.shouXianMapper.deleteByBxId(operId);
        }

        if(result>0){
            logger.info("删除寿险表成功");
        }
        return result;
    }

    @Override
    public BaoXian findBaoxianById(String id) {
        BaoXian baoxian =this.baoXianMapper.selectByPrimaryKey(id);
        if(null!=baoxian)return baoxian;
        return new BaoXian();
    }

    @Override
    public ShouXian findShouxianByBxId(String bxid) {
        ShouXianExample example =new ShouXianExample();
        example.createCriteria().andBxIdEqualTo(bxid);
        List<ShouXian> list = this.shouXianMapper.selectByExample(example);
        if(null!=list&&list.size()>0){
            return list.get(0);
        }
        return new ShouXian();
    }

    @Override
    public List<ShouXian> findShouxianListByBxId(String bxid) {
        ShouXianExample example =new ShouXianExample();
        example.createCriteria().andBxIdEqualTo(bxid);
        List<ShouXian> list = this.shouXianMapper.selectByExample(example);
        return list;
    }

    @Override
    public ChanXian findChanxianByBxId(String bxid) {
        ChanXianExample example = new ChanXianExample();
        example.createCriteria().andBxIdEqualTo(bxid);
        List<ChanXian> list =this.chanXianMapper.selectByExample(example);
        if(null!=list && list.size()>0){
            return list.get(0);
        }
        return new ChanXian();
    }

    @Override
    public List<ChanXian> findChanxianListByBxId(String bxid) {
        ChanXianExample example = new ChanXianExample();
        example.createCriteria().andBxIdEqualTo(bxid);
        List<ChanXian> list =this.chanXianMapper.selectByExample(example);
        return list;
    }


}
