package com.three.memory.mapper;

import com.three.memory.domain.ProClassify;

public interface ProClassifyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProClassify record);

    int insertSelective(ProClassify record);

    ProClassify selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProClassify record);

    int updateByPrimaryKey(ProClassify record);
}