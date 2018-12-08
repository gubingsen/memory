package com.three.memory.mapper;

import com.three.memory.domain.FoodDetail;

public interface FoodDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FoodDetail record);

    int insertSelective(FoodDetail record);

    FoodDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FoodDetail record);

    int updateByPrimaryKey(FoodDetail record);

    FoodDetail selectByFodId(int fodid);
}