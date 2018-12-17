package com.three.memory.service;

import com.three.memory.vo.ResultBean;

public interface BestgoodsService {

    /**
     *
     * @param token
     * @return
     */
    ResultBean selectImg(String token);

    /**
     * 获取指定等级商品类型
     * @param token
     * @param pageNum
     * @param pageSize
     * @param level
     * @return
     */
    ResultBean selectByLevelPage(String token, Integer pageNum, Integer pageSize, Integer level);

    /**
     * 获取指定类型的商品
     * @param token
     * @param pageNum
     * @param pageSize
     * @param tid 商品类型id
     * @return
     */
    ResultBean selectProductPage(String token, Integer pageNum, Integer pageSize, Integer tid);

    /**
     * 商品详情
     * @param token
     * @param pageNum
     * @param pageSize
     * @param pid
     * @return
     */
    ResultBean selectdetailPage(String token, Integer pageNum, Integer pageSize, Integer pid);
}
