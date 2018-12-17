package com.three.memory.mapper;

import com.three.memory.domain.ProType;

import java.util.List;

public interface ProTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProType record);

    int insertSelective(ProType record);

    ProType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProType record);

    int updateByPrimaryKey(ProType record);

    /**
     * 获取指定等级商品类型
     * @param level
     * @return
     */
    List<ProType> selectByLevel(Integer level);
}