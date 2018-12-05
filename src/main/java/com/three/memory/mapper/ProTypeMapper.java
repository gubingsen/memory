package com.three.memory.mapper;

import com.three.memory.domain.ProType;

public interface ProTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProType record);

    int insertSelective(ProType record);

    ProType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProType record);

    int updateByPrimaryKey(ProType record);
}