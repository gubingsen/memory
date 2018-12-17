package com.three.memory.controller;

import com.three.memory.service.CommunityService;
import com.three.memory.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommunityController {

    @Autowired
    private CommunityService service;

    /**
     * 获取所有社区信息
     * @param token
     * @return
     */
    @RequestMapping("communityall.do")
    public ResultBean getCommunityAll(String token) {
        return service.getCommunityAll(token);
    }

    /**
     * 根据社区id查询用户动态信息
     * @param token
     * @param cid
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping("communitybycid.do")
    ResultBean getCommunityByCid(String token, Integer pageNum, Integer pageSize, Integer cid) {
        return service.getCommunityByCidPage(token, pageNum, pageSize, cid);
    }
}
