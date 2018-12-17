package com.three.memory.controller;

import com.three.memory.service.BestgoodsService;
import com.three.memory.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BestgoodsController {

    @Autowired
    private BestgoodsService service;

    /**
     *
     * @param token
     * @return
     */
    @RequestMapping("bestgoodsimg.do")
    ResultBean selectAll(String token) {
        return service.selectImg(token);
    }

    @RequestMapping("bestgoodstype.do")
    ResultBean selectByLevel(String token, Integer pageNum, Integer pageSize, Integer level) {
        return service.selectByLevelPage(token, pageNum, pageSize, level);
    }

    @RequestMapping("productbytid.do")
    ResultBean selectProductByTidPage(String token, Integer pageNum, Integer pageSize, Integer tid) {
        return service.selectProductPage(token, pageNum, pageSize, tid);
    }

    @RequestMapping("productdetail.do")
    ResultBean selectdetailPage(String token, Integer pageNum, Integer pageSize, Integer pid) {
        return service.selectdetailPage(token, pageNum, pageSize, pid);
    }
}
