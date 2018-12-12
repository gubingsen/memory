package com.three.memory.mapper;

import com.three.memory.domain.Concern;

public interface ConcernMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Concern record);

    int insertSelective(Concern record);

    Concern selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Concern record);

    int updateByPrimaryKey(Concern record);

    long getFollow(Integer uid);

    long getFollowed(Integer uid);
}