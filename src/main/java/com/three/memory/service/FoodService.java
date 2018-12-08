package com.three.memory.service;

import com.three.memory.vo.ResultBean;

public interface FoodService {
    //查询所有食谱
    ResultBean selectFoodAll();
    //查询所有食谱类型
    ResultBean selectFtpAll();
    //根据食谱类型查询所有食谱
    ResultBean selectByFtyId(int ftyid);
    //根据食谱id查询对应食谱的详细信息
    ResultBean selectByFodId(int fodid);
    //根据用户id查询用户收藏的食物
    ResultBean selectByUsrId(int usrid);
}
