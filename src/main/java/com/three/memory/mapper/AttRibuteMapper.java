package com.three.memory.mapper;

import com.three.memory.domain.AttRibute;

public interface AttRibuteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AttRibute record);

    int insertSelective(AttRibute record);

    AttRibute selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AttRibute record);

    int updateByPrimaryKey(AttRibute record);
}