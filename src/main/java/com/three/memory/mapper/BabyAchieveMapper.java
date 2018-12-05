package com.three.memory.mapper;

import com.three.memory.domain.BabyAchieve;

public interface BabyAchieveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BabyAchieve record);

    int insertSelective(BabyAchieve record);

    BabyAchieve selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BabyAchieve record);

    int updateByPrimaryKey(BabyAchieve record);
}