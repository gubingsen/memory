package com.three.memory.mapper;

import com.three.memory.domain.BabyMedia;

public interface BabyMediaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BabyMedia record);

    int insertSelective(BabyMedia record);

    BabyMedia selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BabyMedia record);

    int updateByPrimaryKey(BabyMedia record);
}