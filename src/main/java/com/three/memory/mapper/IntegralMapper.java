package com.three.memory.mapper;

import com.three.memory.domain.Integral;

public interface IntegralMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Integral record);

    int insertSelective(Integral record);

    Integral selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Integral record);

    int updateByPrimaryKey(Integral record);

    Integral selectByUid(Integer uid);
}