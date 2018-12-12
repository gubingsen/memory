package com.three.memory.service;

import com.three.memory.vo.ResultBean;

public interface MineService {
    ResultBean getMine(String token);

    ResultBean getCollection(Integer pageNum,Integer pageSize,String token);

    ResultBean getPoint(String token);

    ResultBean getSign(String token);

    ResultBean getCenter(Integer pageNum,Integer pageSize);

    ResultBean getShopCar(Integer pageNum,Integer pageSize,String token);

    ResultBean createOrder(String token,int[] ids);

    ResultBean getOrder(Integer pageNum,Integer pageSize,String token,Integer flag);
}
