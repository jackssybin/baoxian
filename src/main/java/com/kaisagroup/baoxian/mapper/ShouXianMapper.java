package com.kaisagroup.baoxian.mapper;

import com.kaisagroup.baoxian.entity.ShouXian;
import com.kaisagroup.baoxian.entity.ShouXianExample;
import java.util.List;

public interface ShouXianMapper {
    int deleteByPrimaryKey(String id);

    int deleteByBxId(String bxId);

    int insert(ShouXian record);

    int insertSelective(ShouXian record);

    List<ShouXian> selectByExample(ShouXianExample example);

    ShouXian selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ShouXian record);

    int updateByPrimaryKey(ShouXian record);
}