package com.three.memory.controller;

import com.three.memory.service.MineService;
import com.three.memory.service.impl.RedisService;
import com.three.memory.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MineController {

    @Autowired
    private MineService mService;

    /**
     * 进入“我的页面，获取我的一些相关信息”
     * @Author stan
     * @parames token：前端传递过来的令牌
     * @return
     */

    @PostMapping("/mine.do")
    public ResultBean mineInfo(String token){
        return mService.getMine(token);
    }

    /**
     * 进入我的收藏获取用户收藏的食谱
     * @Author stan
     * @param token:前端传递过来的令牌
     * @param pageNum:当前页面页码
     * @param pageSize:每页显示多少条数据
     * @return
     */
    @PostMapping("/minecollection.do")
    public ResultBean minecollection(@RequestParam(required = false)Integer pageNum,@RequestParam(required = false)Integer pageSize ,String token){

        return mService.getCollection(pageNum,pageSize,token);
    }

    /**
     * 进入我的积分查看自己当前积分
     * @Author stan
     * @parames token:前端传递过来的令牌
     * @return
     */
    @PostMapping("/integral.do")
    public ResultBean getPoint(String token){

        return mService.getPoint(token);
    }

    /**
     * @Author stan
     * @parames token:前端传递过来的令牌
     * @return
     */
    @PostMapping("/sign.do")
    public ResultBean getSign(String token){
        return mService.getSign(token);
    }
    /**
     * 进入会员中心展示的商品
     * @Author stan
     * @param pageNum:当前页面页码
     * @param pageSize:每页显示多少条数据
     * @return
     */
    @PostMapping("/vipcenter.do")
    public ResultBean getCenter(@RequestParam(required = false)Integer pageNum,@RequestParam(required = false)Integer pageSize){
        return mService.getCenter(pageNum,pageSize);
    }
    /**
     * 进入购物车页面
     * @Author stan
     * @param pageNum:当前页面页码
     * @param pageSize:每页显示多少条数据
     * @param token:前端页面传来的令牌
     * @return
     */
    @PostMapping("/shopcar.do")
    public ResultBean getShopCar(@RequestParam(required = false)Integer pageNum,@RequestParam(required = false)Integer pageSize,String token){
        return mService.getShopCar(pageNum,pageSize,token);
    }
    /**
     * 生成订单
     * @Author stan
     * @param token:前端传递过来的令牌
     * @param ids:选择购买的商品id
     * @return
     */
    @PostMapping("/order.do")
    public ResultBean createOrder(String token,int[] ids){
        return mService.createOrder(token,ids);
    }
    /**
     * 进入我的订单页面
     * @Author stan
     * @param pageNum:当前页面页码
     * @param pageSize:每页显示多少条数据
     * @param token:前端页面传来的令牌
     * @param flag:需要查看的订单的状态
     * @return
     */
    @PostMapping("/orderinfo.do")
    public ResultBean getOrders(@RequestParam(required = false)Integer pageNum,@RequestParam(required = false)Integer pageSize,String token,@RequestParam(required = false) Integer flag){
        return mService.getOrder(pageNum,pageSize,token,flag);
    }

}
