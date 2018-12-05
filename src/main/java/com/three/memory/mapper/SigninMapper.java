package com.three.memory.mapper;

import com.three.memory.domain.Signin;

public interface SigninMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Signin record);

    int insertSelective(Signin record);

    Signin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Signin record);

    int updateByPrimaryKey(Signin record);
}