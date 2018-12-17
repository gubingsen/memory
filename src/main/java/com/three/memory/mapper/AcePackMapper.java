package com.three.memory.mapper;

import com.three.memory.domain.AcePack;

import java.util.List;

public interface AcePackMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AcePack record);

    int insertSelective(AcePack record);

    AcePack selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AcePack record);

    int updateByPrimaryKeyWithBLOBs(AcePack record);

    int updateByPrimaryKey(AcePack record);

    List<AcePack> selectAll();

    int updateNumber(Integer aceid);
}