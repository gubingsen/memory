package com.three.memory.controller;

import com.three.memory.domain.BabyGrowth;
import com.three.memory.domain.UserBaby;
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

    /**
     * 添加宝宝
     * @param token
     * @return
     */
    @PostMapping("/insertByby.do")
    @ResponseBody
    public ResultBean insertByby(String token, UserBaby byby) {

        return bybyService.insertByby(token, byby);
    }

    /**
     * 修改宝宝信息
     * @param token
     * @return
     */
    @PostMapping("/updateByby.do")
    @ResponseBody
    public ResultBean updateByby(String token, UserBaby byby) {
        return bybyService.updateByby(token, byby);
    }

    /**
     * 根据宝宝id查询宝宝的成长记录
     * @param token
     * @return
     */
    @PostMapping("/selectGrowthByBybyid.do")
    @ResponseBody
    public ResultBean selectGrowthByBybyid(String token, Integer bybyid) {
        return bybyService.selectGrowthByBybyid(token, bybyid);
    }

    /**
     * 添加宝宝的成长记录
     * @param token
     * @return
     */
    @PostMapping("/insertGrowth.do")
    @ResponseBody
    public ResultBean insertGrowth(String token, BabyGrowth growth) {
        return bybyService.insertGrowth(token, growth);
    }

}
