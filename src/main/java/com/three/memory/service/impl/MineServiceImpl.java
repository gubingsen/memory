package com.three.memory.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.three.memory.constant.SystemCon;
import com.three.memory.domain.*;
import com.three.memory.mapper.*;
import com.three.memory.service.MineService;
import com.three.memory.token.Token;
import com.three.memory.token.TokenUtil;
import com.three.memory.util.ResultUtil;
import com.three.memory.vo.PageVo;
import com.three.memory.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class MineServiceImpl implements MineService {

    @Autowired
    private ConcernMapper cMapper;

    @Autowired
    private UserMapper uMapper;

    @Autowired
    private FoodMapper fMapper;

    @Autowired
    private IntegralMapper iMapper;

    @Autowired
    private SigninMapper sMapper;

    @Autowired
    private ProDuctMapper pMapper;

    @Autowired
    private CartMapper scMapper;

    @Autowired
    private InventoryMapper ivMapper;

    @Autowired
    private OrderMapper oMapper;

    @Autowired
    private CartProMapper cpMapper;

    @Override
    public ResultBean getMine(String token) {

        //从token中取出user的ID
        Token token1 = TokenUtil.parseToken(token);
        //通过user的id 获取关注数
        long follow = cMapper.getFollow(token1.getId());
        //通过user的id 获取被关注数
        long followed = cMapper.getFollowed(token1.getId());
        //通过user的id 获取user对象
        User user = uMapper.selectByPrimaryKey(token1.getId());
        //将关注数放入user
        user.setFollow(follow);
        //将被关注数放入user
        user.setFollwoed(followed);

        return ResultUtil.setOKToken(token,user,"获取我的信息");
    }

    @Override
    public ResultBean getCollection(Integer pageNum,Integer pageSize,String token) {

        //从token中取出user的ID
        Token token1 = TokenUtil.parseToken(token);

        Integer pageNumInt = SystemCon.PAGENUM;

        Integer pageSizeInt = SystemCon.PAGESIZE;

        if (pageNum != null){
            pageNumInt = pageNum;
        } else if (pageSize != null){
            pageSizeInt = pageSize;
        }

        PageHelper.startPage(pageNumInt,pageSizeInt);

        //通过user的ID获取收藏的食谱
        List<Food> foods = fMapper.selectByUsrId(token1.getId());

        if (foods != null){

            PageInfo<Food> info = new PageInfo<Food>(foods);

           return ResultUtil.setPage(token,null,"获取用户收藏",foods,info.getTotal(),info.getPages(),info.getPageNum(),info.getPageSize());

        } else {
            return ResultUtil.setError(SystemCon.RERROR1,"网络异常",null);
        }

    }

    @Override
    public ResultBean getPoint(String token) {

        //从token中取出user的ID
        Token token1 = TokenUtil.parseToken(token);
        //通过userId获取积分情况
        Integral integral = iMapper.selectByUid(token1.getId());

        if (integral != null) {

            return ResultUtil.setOKToken(token,integral,"获取积分");
        } else {
            return ResultUtil.setError(SystemCon.RERROR1,"网络异常",null);
        }

    }

    @Override
    public ResultBean getSign(String token) {
        //从token中取出user的ID
        Token token1 = TokenUtil.parseToken(token);
        //根据UserId获取签到情况
        Signin signin = sMapper.selectByUid(token1.getId());

        if (signin != null){
            return ResultUtil.setOKToken(token,signin,"获取签到");
        } else {
            return ResultUtil.setError(SystemCon.RERROR1,"网络异常",signin);
        }

    }

    @Override
    public ResultBean getCenter(Integer pageNum, Integer pageSize) {

        Integer pageNumInt = SystemCon.PAGENUM;

        Integer pageSizeInt = SystemCon.PAGESIZE;

        if (pageNum != null){
            pageNumInt = pageNum;
        } else if (pageSize != null){
            pageSizeInt = pageSize;
        }

        PageHelper.startPage(pageNumInt,pageSizeInt);
        //获取所有商品信息
        List<MineCenter> mineCenters = pMapper.selectAll();

        if (mineCenters != null){
            PageInfo<MineCenter> info = new PageInfo<MineCenter>(mineCenters);

            return ResultUtil.setPage(null,null,"获取商品",mineCenters,info.getTotal(),info.getPages(),info.getPageNum(),info.getPageSize());
        }

        return ResultUtil.setError(SystemCon.RERROR1,"网络异常",null);
    }

    @Override
    public ResultBean getShopCar(Integer pageNum, Integer pageSize, String token) {

        //从token中取出user的ID
        Token token1 = TokenUtil.parseToken(token);

        Integer pageNumInt = SystemCon.PAGENUM;

        Integer pageSizeInt = SystemCon.PAGESIZE;

        if (pageNum != null){
            pageNumInt = pageNum;
        } else if (pageSize != null){
            pageSizeInt = pageSize;
        }

        PageHelper.startPage(pageNumInt,pageSizeInt);

        List<ShopCar> shopCars = scMapper.getAll(token1.getId());

        if (shopCars != null){
            PageInfo<ShopCar> info = new PageInfo<ShopCar>(shopCars);

            return ResultUtil.setPage(token,null,"获取购物车",shopCars,info.getTotal(),info.getPages(),info.getPageNum(),info.getPageSize());
        }

        return ResultUtil.setError(SystemCon.RERROR1,"网络异常",null);
    }

    @Override
    public ResultBean createOrder(String token, int[] ids) {
        //从token中取出user的ID
        Token token1 = TokenUtil.parseToken(token);

        int i = SystemCon.JUDGEORDER;

        int j = SystemCon.JUDEGINVENTORY;

        for (int id:ids) {
            //获取购物车中的商品数量
            int carNum = scMapper.getNumById(token1.getId(), id);
            //校验库存
            if (carNum <= ivMapper.selectByPid(id)){
                //有货
            } else {
                //没货
                i = ++i;
                return ResultUtil.setError(SystemCon.RERROR1,"商品没有这么多库存",null);
            }
        }

        if (i == SystemCon.JUDGEORDER){
           String onum = UUID.randomUUID().toString().replaceAll("-","");
            List<Order> orders = new ArrayList<Order>();

            for (int id:ids) {
                //获取购物车中的商品数量
                int carNum = scMapper.getNumById(token1.getId(), id);
                Order order = new Order();
                order.setOnum(onum);
                order.setUid(token1.getId());
                order.setProid(id);
                order.setPnum(carNum);
                orders.add(order);
            }

            int o = oMapper.createOrder(orders);

            if (o != 0){
                //更新库存
                for (int id:ids) {
                    //获取购物车中的商品数量
                    int carNum = scMapper.getNumById(token1.getId(), id);
                    int num = ivMapper.selectByPid(id) - carNum;
                    int kc = ivMapper.updateByPid(id, num);
                    if (kc != 0){

                    } else {
                        j = j++;
                    }
                }
                if (j == SystemCon.JUDEGINVENTORY){
                    int carId = scMapper.getCarId(token1.getId());
                    int k = 0;
                    for (int id:ids) {
                        k += cpMapper.deleById(carId, id);
                    }
                    if (k == ids.length){
                        return ResultUtil.setOKToken(token,null,"生成订单成功");
                    } else {
                        return ResultUtil.setError(SystemCon.RERROR1,"生成订单失败",null);
                    }

                } else {
                    return ResultUtil.setError(SystemCon.RERROR1,"生成订单失败",null);
                }

            } else {
                return ResultUtil.setError(SystemCon.RERROR1,"生成订单失败",null);
            }

        } else {
            return ResultUtil.setError(SystemCon.RERROR1,"生成订单失败",null);
        }

    }

    @Override
    public ResultBean getOrder(Integer pageNum, Integer pageSize, String token, Integer flag) {
        //从token中取出user的ID
        Token token1 = TokenUtil.parseToken(token);

        Integer pageNumInt = SystemCon.PAGENUM;

        Integer pageSizeInt = SystemCon.PAGESIZE;

        if (pageNum != null){
            pageNumInt = pageNum;
        } else if (pageSize != null){
            pageSizeInt = pageSize;
        }

        PageHelper.startPage(pageNumInt,pageSizeInt);

        List<OderDetail> orders = oMapper.getOrder(token1.getId(), flag);

        if (orders != null){
            PageInfo<OderDetail> info = new PageInfo<OderDetail>();

          return ResultUtil.setPage(token,null,"获取详细订单信息成功",orders,info.getTotal(),info.getPages(),info.getPageNum(),info.getPageSize());
        } else {
          return ResultUtil.setError(SystemCon.RERROR1,"网络异常",null);
        }

    }
}
