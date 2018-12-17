package com.three.memory.mapper;

import com.three.memory.domain.Community;

import java.util.List;

public interface CommunityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Community record);

    int insertSelective(Community record);

    Community selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Community record);

    int updateByPrimaryKey(Community record);

    /**
     * 获取所有社区信息
     * @return
     */
    List<Community> selectAll();
}