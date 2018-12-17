package com.three.memory.service;

import com.three.memory.vo.ResultBean;

public interface FoodService {
    //查询所有食谱类型
    ResultBean selectFtpAll(String token);
    //根据食物类型查询所有的食谱
    ResultBean selectByFtyId(String token,Integer pageNum,Integer pageSize,int ftyid);
    //查询所有食谱
    ResultBean selectFoodAll(String token,Integer pageNum,Integer pageSize);
    //根据食谱id查询对应食谱的详细信息
    ResultBean selectByFodId(String token,int fodid);
    //查询当前登录用户收藏的食谱
    ResultBean selectCollect(String token,Integer pageNum,Integer pageSize);
    //查询所有适用时期为孕期的食谱
    ResultBean selectGestation(String token,Integer pageNum,Integer pageSize);
    //根据适用时期查询所有对应的食谱
    ResultBean selectBySuitable(String token,Integer pageNum,Integer pageSize,String suitable);
    //收藏食谱
    ResultBean insertCollect(String token,int fodid);
    //添加评论
    ResultBean insertComment(String token,int fodid,String comment);
}
