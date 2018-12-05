package com.three.memory.mapper;

import com.three.memory.domain.DynEvalRepl;

public interface DynEvalReplMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DynEvalRepl record);

    int insertSelective(DynEvalRepl record);

    DynEvalRepl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DynEvalRepl record);

    int updateByPrimaryKey(DynEvalRepl record);
}