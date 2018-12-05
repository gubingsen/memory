package com.three.memory.mapper;

import com.three.memory.domain.Inventory;

public interface InventoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Inventory record);

    int insertSelective(Inventory record);

    Inventory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Inventory record);

    int updateByPrimaryKey(Inventory record);
}