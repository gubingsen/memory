package com.three.memory.mapper;

import com.three.memory.domain.DynMedia;

public interface DynMediaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DynMedia record);

    int insertSelective(DynMedia record);

    DynMedia selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DynMedia record);

    int updateByPrimaryKey(DynMedia record);
}