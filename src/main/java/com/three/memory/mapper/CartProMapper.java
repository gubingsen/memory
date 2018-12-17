package com.three.memory.mapper;

import com.three.memory.domain.CartPro;
import org.apache.ibatis.annotations.Param;

public interface CartProMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CartPro record);

    int insertSelective(CartPro record);

    CartPro selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CartPro record);

    int updateByPrimaryKey(CartPro record);

    int deleById(@Param("cartid") Integer cartid, @Param("prodetid") Integer prodetid);
}