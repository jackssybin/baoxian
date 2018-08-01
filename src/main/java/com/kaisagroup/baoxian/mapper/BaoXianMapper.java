package com.kaisagroup.baoxian.mapper;

import com.kaisagroup.baoxian.entity.BaoXian;
import com.kaisagroup.baoxian.entity.BaoXianExample;
import java.util.List;

public interface BaoXianMapper {
    int deleteByPrimaryKey(String id);

    int insert(BaoXian record);

    int insertSelective(BaoXian record);

    List<BaoXian> selectByExample(BaoXianExample example);

    BaoXian selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BaoXian record);

    int updateByPrimaryKey(BaoXian record);
}