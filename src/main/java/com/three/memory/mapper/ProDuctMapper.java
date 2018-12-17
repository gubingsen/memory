package com.three.memory.mapper;

import com.three.memory.domain.ProDuct;
import com.three.memory.domain.ProductInfo;

import java.util.List;
import java.util.Map;

public interface ProDuctMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProDuct record);

    int insertSelective(ProDuct record);

    ProDuct selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProDuct record);

    int updateByPrimaryKey(ProDuct record);

    List<Map<String,Object>> selectProduct(Integer tid);

    List<ProductInfo> selectdetail(Integer pid);
}