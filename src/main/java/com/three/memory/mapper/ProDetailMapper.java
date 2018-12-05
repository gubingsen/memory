package com.three.memory.mapper;

import com.three.memory.domain.ProDetail;

public interface ProDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProDetail record);

    int insertSelective(ProDetail record);

    ProDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProDetail record);

    int updateByPrimaryKey(ProDetail record);
}