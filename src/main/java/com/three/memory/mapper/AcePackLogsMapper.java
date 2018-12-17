package com.three.memory.mapper;

import com.three.memory.domain.AcePackLogs;
import org.apache.ibatis.annotations.Param;

public interface AcePackLogsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AcePackLogs record);

    int insertSelective(AcePackLogs record);

    AcePackLogs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AcePackLogs record);

    int updateByPrimaryKey(AcePackLogs record);

    int selectCount(@Param("usrid") Integer usrid, @Param("aceid") Integer aceid);
}