package com.three.memory.mapper;

import com.three.memory.domain.BabyMedia;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BabyMediaMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(BabyMedia record);


    /**
     * 根据宝宝编号，查询宝宝对应相册 默认10条
     * @param babyid 宝宝编号
     * @param page 页码
     * @return
     */
    List<BabyMedia> select(@Param("page") Integer page,@Param("babyid") Integer babyid);


    int updateByPrimaryKeySelective(BabyMedia record);

    int updateByPrimaryKey(BabyMedia record);
}