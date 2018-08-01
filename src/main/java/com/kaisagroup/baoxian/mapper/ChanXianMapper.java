package com.kaisagroup.baoxian.mapper;

import com.kaisagroup.baoxian.entity.ChanXian;
import com.kaisagroup.baoxian.entity.ChanXianExample;
import java.util.List;

public interface ChanXianMapper {
    int deleteByPrimaryKey(String id);

    int deleteByBxId(String bxId);

    int insert(ChanXian record);

    int insertSelective(ChanXian record);

    List<ChanXian> selectByExample(ChanXianExample example);

    ChanXian selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ChanXian record);

    int updateByPrimaryKey(ChanXian record);
}