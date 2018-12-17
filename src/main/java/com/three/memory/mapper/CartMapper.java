package com.three.memory.mapper;

import com.three.memory.domain.Cart;
import com.three.memory.domain.ShopCar;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    List<ShopCar> getAll(Integer uid);

    int getNumById(@Param("uid") Integer uid, @Param("proid") Integer proid);

    int getCarId(Integer uid);
}