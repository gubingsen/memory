package com.three.memory.mapper;

import com.three.memory.domain.Food;

import java.util.List;

public interface FoodMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Food record);

    int insertSelective(Food record);

    Food selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Food record);

    int updateByPrimaryKey(Food record);

    List<Food> selectFoodAll();

    List<Food> selectByFtyId(int ftyid);

    List<Food> selectCollect(int usrid);

    List<Food> selectGestation();

    List<Food> selectBySuitable(String suitable);

    List<Food> selectByUsrId(int usrid);

}