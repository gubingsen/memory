package com.three.memory.mapper;

import com.three.memory.domain.FoodCollect;

public interface FoodCollectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FoodCollect record);

    int insertSelective(FoodCollect record);

    FoodCollect selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FoodCollect record);

    int updateByPrimaryKey(FoodCollect record);
}