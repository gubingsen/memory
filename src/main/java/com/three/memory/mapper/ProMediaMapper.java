package com.three.memory.mapper;

import com.three.memory.domain.ProMedia;

import java.util.List;
import java.util.Map;

public interface ProMediaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProMedia record);

    int insertSelective(ProMedia record);

    ProMedia selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProMedia record);

    int updateByPrimaryKey(ProMedia record);

}