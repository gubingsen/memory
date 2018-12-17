package com.three.memory.mapper;

import com.three.memory.domain.FoodComment;

public interface FoodCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FoodComment record);

    int insertSelective(FoodComment record);

    FoodComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FoodComment record);

    int updateByPrimaryKey(FoodComment record);
}