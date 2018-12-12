package com.three.memory.mapper;

import com.three.memory.domain.BabyMedia;
import com.three.memory.vo.ResultBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BabyMediaMapper {
    int deleteByPrimaryKey(Integer id);
    int insert(BabyMedia record);
    List<BabyMedia> select(@Param("page") Integer page,@Param("babyid") Integer babyid);
    int updateByPrimaryKeySelective(BabyMedia record);
    int updateByPrimaryKey(BabyMedia record);


    //根据宝宝id查询宝宝所有的照片
    List<BabyMedia> selectByBybyid(Integer bybyid);
}