package com.three.memory.mapper;

import com.three.memory.domain.BabyGrowth;

public interface BabyGrowthMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BabyGrowth record);

    int insertSelective(BabyGrowth record);

    BabyGrowth selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BabyGrowth record);

    int updateByPrimaryKey(BabyGrowth record);
}