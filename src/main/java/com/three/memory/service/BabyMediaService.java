package com.three.memory.service;

import com.three.memory.domain.BabyMedia;
import com.three.memory.vo.PageVo;

public interface BabyMediaService {
    /**
     * 根据宝宝编号查询宝宝相册，一次10条
     * @param page 页码
     * @param babyid 宝宝编号
     * @return vo类
     */
    PageVo<BabyMedia> select(Integer page,Integer babyid);
}
