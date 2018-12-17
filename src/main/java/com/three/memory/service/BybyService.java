package com.three.memory.service;

import com.three.memory.domain.BabyGrowth;
import com.three.memory.domain.UserBaby;
import com.three.memory.vo.ResultBean;

public interface BybyService {
    //根据用户id查询宝宝的详细信息
    ResultBean selectByUid(String token);
    //根据宝宝id查询宝宝所有的照片
    ResultBean selectByBybyid(String token,Integer pageNum,Integer pageSize,Integer bybyid);
    //添加宝宝
    ResultBean insertByby(String token, UserBaby byby);
    //修改宝宝信息
    ResultBean updateByby(String token, UserBaby byby);
    //根据宝宝id查询宝宝的成长记录
    ResultBean selectGrowthByBybyid(String token, Integer bybyid);
    //添加宝宝的成长记录
    ResultBean insertGrowth(String token, BabyGrowth growth);

}
