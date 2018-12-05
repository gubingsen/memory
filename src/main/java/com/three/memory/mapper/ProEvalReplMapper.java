package com.three.memory.mapper;

import com.three.memory.domain.ProEvalRepl;

public interface ProEvalReplMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProEvalRepl record);

    int insertSelective(ProEvalRepl record);

    ProEvalRepl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProEvalRepl record);

    int updateByPrimaryKey(ProEvalRepl record);
}