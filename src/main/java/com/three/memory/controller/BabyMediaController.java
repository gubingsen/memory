package com.three.memory.controller;

import com.three.memory.domain.BabyMedia;
import com.three.memory.service.BabyMediaService;
import com.three.memory.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: memory
 * @BelongsPackage: com.three.memory.controller
 * @Author: Administrator
 * @Description: 用户相册业务控制层
 */
@RestController
@RequestMapping("/babyMedia")
public class BabyMediaController {

    @Autowired
    private BabyMediaService babyMediaService;

    /**
     * 分页查询宝宝相册，一次10条
     * @param page 页码
     * @param babyid 宝宝编号
     * @return vo类
     */
    @GetMapping("/select.do")
    public PageVo<BabyMedia> select(Integer page, Integer babyid) {
        return babyMediaService.select(page,babyid);
    }

    //添加相册信息



}
