package com.three.memory.mapper;

import com.three.memory.domain.FoodType;

import java.util.List;

public interface FoodTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FoodType record);

    int insertSelective(FoodType record);

    FoodType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FoodType record);

    int updateByPrimaryKey(FoodType record);

    List<FoodType> selectAll();
}