package com.three.memory.service;

import com.three.memory.vo.ResultBean;

public interface LifeService {

    /**
     * 获取当前用户未关注的用户
     * @param token
     * @param pageNum
     * @param pageSize
     * @return
     */
    ResultBean getUserToConcernPage(String token, Integer pageNum, Integer pageSize);

    /**
     * 一建关注
     * @param token
     * @param ids
     * @return
     */
    ResultBean concernAll(String token, Integer[] ids);

    /**
     * 当前用户关注用户的社区动态
     * @param token
     * @param pageNum
     * @param pageSize
     * @return
     */
    ResultBean concernagoPage(String token, Integer pageNum, Integer pageSize);
}
