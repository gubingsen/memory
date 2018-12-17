package com.three.memory.controller;

import com.three.memory.service.LifeService;
import com.three.memory.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LifeController {

    @Autowired
    private LifeService service;

    /**
     * 获取当前用户未关注的用户
     * @param token
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping("userConcern.do")
    public ResultBean getUserToConcernPage(String token, Integer pageNum, Integer pageSize) {
        return service.getUserToConcernPage(token, pageNum, pageSize);
    }

    /**
     * 一键关注
     * @param token
     * @param ids
     * @return
     */
    @RequestMapping("concernAll.do")
    public ResultBean concernAll(String token, Integer[] ids) {
        return service.concernAll(token, ids);
    }

    /**
     * 当前用户关注用户的社区动态
     * @param token
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping("concernago.do")
    public ResultBean concernagoPage(String token, Integer pageNum, Integer pageSize) {
        return service.concernagoPage(token, pageNum, pageSize);
    }
}
