package com.three.memory.mapper;

import com.three.memory.domain.ProMainImg;
import com.three.memory.domain.UserInfo;

import java.util.List;

public interface ProMainImgMapper {

    List<Integer> selectAllId();

    ProMainImg selectByPrimaryKey(Integer id);
}
