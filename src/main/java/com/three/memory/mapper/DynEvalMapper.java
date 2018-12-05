package com.three.memory.mapper;

import com.three.memory.domain.DynEval;

public interface DynEvalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DynEval record);

    int insertSelective(DynEval record);

    DynEval selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DynEval record);

    int updateByPrimaryKey(DynEval record);
}