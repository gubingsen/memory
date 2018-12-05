package com.three.memory.mapper;

import com.three.memory.domain.ProEval;

public interface ProEvalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProEval record);

    int insertSelective(ProEval record);

    ProEval selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProEval record);

    int updateByPrimaryKey(ProEval record);
}