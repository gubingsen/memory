package com.three.memory.mapper;

import com.three.memory.domain.ProEvalMedia;

public interface ProEvalMediaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProEvalMedia record);

    int insertSelective(ProEvalMedia record);

    ProEvalMedia selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProEvalMedia record);

    int updateByPrimaryKey(ProEvalMedia record);
}