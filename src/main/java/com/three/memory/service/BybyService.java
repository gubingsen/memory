package com.three.memory.service;

import com.three.memory.vo.ResultBean;

public interface BybyService {
    //根据用户id查询宝宝的详细信息
    ResultBean selectByUid(String token);
    //根据宝宝id查询宝宝所有的照片
    ResultBean selectByBybyid(String token,Integer pageNum,Integer pageSize,Integer bybyid);


}
