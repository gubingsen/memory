package com.three.memory.controller;

import com.three.memory.service.FoodService;
import com.three.memory.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fod")
public class FoodController {
    @Autowired
    private FoodService service;

    /**
     * 查询所有食物类型
     * @param token
     * @return
     */
    @PostMapping("/selectFtpAll.do")
    @ResponseBody
    public ResultBean selectFtpAll(String token) {
        return service.selectFtpAll(token);
    }

    /**
     * 根据食物类型查询所有的食谱
     * @param token 用户的token
     * @param pageNum 当前的页数
     * @param pageSize 一页总共有多少条数据
     * @return
     */
    @PostMapping("/selectByFtyId.do")
    @ResponseBody
    public ResultBean selectByFtyId(String token,Integer pageNum,Integer pageSize,int ftyid) {
        return service.selectByFtyId(token, pageNum, pageSize, ftyid);
    }

    /**
     * 查询所有食谱
     * @param token 用户的token
     * @param pageNum 当前的页数
     * @param pageSize 一页总共有多少条数据
     * @return
     */
    @PostMapping("/selectFoodAll.do")
    @ResponseBody
    public ResultBean selectFoodAll(String token,Integer pageNum,Integer pageSize) {
        return service.selectFoodAll(token, pageNum, pageSize);
    }

    /**
     * 根据食谱id查询对应食谱的详细信息
     * @param token 用户token
     * @param fodid 食谱id
     * @return
     */
    @PostMapping("/selectByFodId.do")
    @ResponseBody
    public ResultBean selectByFodId(String token,int fodid) {
        return service.selectByFodId(token, fodid);
    }

    /**
     * 查询当前登录用户收藏的食谱
     * @param token 用户token
     * @return
     */
    @PostMapping("/selectCollect.do")
    @ResponseBody
    public ResultBean selectCollect(String token,Integer pageNum,Integer pageSize) {
        return service.selectCollect(token, pageNum, pageSize);
    }

    /**
     * 查询所有适用时期为孕期的食谱
     * @param token 用户token
     * @return
     */
    @PostMapping("/selectGestation.do")
    @ResponseBody
    public ResultBean selectGestation(String token,Integer pageNum,Integer pageSize) {
        return service.selectGestation(token, pageNum, pageSize);
    }

    /**
     * 根据适用时期查询所有对应的食谱
     * @param token
     * @param pageNum
     * @param pageSize
     * @param suitable 适用时期
     * @return
     */
    @PostMapping("/selectBySuitable.do")
    @ResponseBody
    public ResultBean selectBySuitable(String token,Integer pageNum,Integer pageSize,String suitable) {
        return service.selectBySuitable(token, pageNum, pageSize, suitable);
    }

    /**
     * 收藏食谱
     * @param token
     * @param fodid 食谱id
     * @return
     */
    @PostMapping("/insertCollect.do")
    @ResponseBody
    public ResultBean insertCollect(String token,int fodid) {
        return service.insertCollect(token,fodid);
    }

    /**
     * 添加评论
     * @param token
     * @param fodid 食谱id
     * @param comment 评论内容
     * @return
     */
    @PostMapping("/insertComment.do")
    @ResponseBody
    public ResultBean insertComment(String token,int fodid,String comment) {
        return service.insertComment(token, fodid, comment);
    }


}
