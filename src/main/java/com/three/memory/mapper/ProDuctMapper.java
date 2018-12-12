package com.three.memory.mapper;

import com.three.memory.domain.MineCenter;
import com.three.memory.domain.ProDuct;

import java.util.List;

public interface ProDuctMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProDuct record);

    int insertSelective(ProDuct record);

    ProDuct selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProDuct record);

    int updateByPrimaryKey(ProDuct record);

    List<MineCenter> selectAll();
}