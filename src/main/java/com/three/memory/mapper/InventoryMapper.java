package com.three.memory.mapper;

import com.three.memory.domain.Inventory;
import org.apache.ibatis.annotations.Param;

public interface InventoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Inventory record);

    int insertSelective(Inventory record);

    Inventory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Inventory record);

    int updateByPrimaryKey(Inventory record);

    int selectByPid(Integer proclaid);

    int updateByPid(@Param("proclaid") Integer proclaid, @Param("num") Integer num);
}