package com.three.memory.mapper;

import com.three.memory.domain.UserBaby;

public interface UserBabyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserBaby record);

    int insertSelective(UserBaby record);

    UserBaby selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserBaby record);

    int updateByPrimaryKey(UserBaby record);
}