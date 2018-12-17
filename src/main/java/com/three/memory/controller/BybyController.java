package com.three.memory.controller;

import com.three.memory.service.BybyService;
import com.three.memory.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/byby")
public class BybyController {
    @Autowired
    private BybyService bybyService;

    /**
     * 根据用户id查询宝宝的详细信息
     * @param token
     * @return
     */
    @PostMapping("/selectByUid.do")
    @ResponseBody
    public ResultBean selectByUid(String token) {
        return bybyService.selectByUid(token);
    }

    /**
     * 根据宝宝id查询宝宝所有的照片
     * @param token
     * @return
     */
    @PostMapping("/selectByBybyid.do")
    @ResponseBody
    public ResultBean selectByBybyid(String token,Integer pageNum,Integer pageSize,Integer bybyid) {
        return bybyService.selectByBybyid(token, pageNum, pageSize, bybyid);
    }

}
