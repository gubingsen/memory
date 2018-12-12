package com.three.memory.service.impl;

import com.github.pagehelper.PageInfo;
import com.three.memory.domain.Food;
import com.three.memory.domain.FoodCollect;
import com.three.memory.domain.FoodComment;
import com.three.memory.mapper.*;
import com.three.memory.service.FoodService;
import com.three.memory.token.Token;
import com.three.memory.token.TokenUtil;
import com.three.memory.util.ResultUtil;
import com.three.memory.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class FoodServiceImpl implements FoodService {
    @Autowired
    private FoodTypeMapper foodTypeMapper;
    @Autowired
    private FoodMapper foodMapper;
    @Autowired
    private FoodDetailMapper foodDetailMapper;
    @Autowired
    private FoodCollectMapper colMapper;
    @Autowired
    private FoodCommentMapper comMapper;
    @Override
    public ResultBean selectFtpAll(String token) {
        return ResultUtil.setOKToken(token,foodTypeMapper.selectAll(),"查询所有食谱类型");
    }

    @Override
    public ResultBean selectByFtyId(String token,Integer pageNum,Integer pageSize,int ftyid) {
        List<Food> list = foodMapper.selectByFtyId(ftyid);
        PageInfo<Food> info = new PageInfo<>(list);

        return ResultUtil.setPage(token,null,"根据食物类型查询所有的食谱",info.getList(),info.getTotal(),info.getPages(),info.getPageNum(),info.getPageSize());
    }

    @Override
    public ResultBean selectFoodAll(String token,Integer pageNum,Integer pageSize) {
        List<Food> list = foodMapper.selectFoodAll();
        PageInfo<Food> info = new PageInfo<>(list);

        return ResultUtil.setPage(token,null,"查询所有食谱",info.getList(),info.getTotal(),info.getPages(),info.getPageNum(),info.getPageSize());
    }



    @Override
    public ResultBean selectByFodId(String token,int fodid) {
        return ResultUtil.setOKToken(token,foodDetailMapper.selectByFodId(fodid),"根据食物id查询对应食物的详细信息");
    }

    @Override
    public ResultBean selectCollect(String token,Integer pageNum,Integer pageSize) {
        Token t = TokenUtil.parseToken(token);
        List<Food> list = foodMapper.selectCollect(t.getId());
        PageInfo<Food> info = new PageInfo<>(list);
        return ResultUtil.setPage(token,null,"查询当前登录用户收藏的食谱",info.getList(),info.getTotal(),info.getPages(),info.getPageNum(),info.getPageSize());
     }

    @Override
    public ResultBean selectGestation(String token, Integer pageNum, Integer pageSize) {
        List<Food> list = foodMapper.selectGestation();
        PageInfo<Food> info = new PageInfo<>(list);
        return ResultUtil.setPage(token,null,"查询所有适用时期为孕期的食谱",info.getList(),info.getTotal(),info.getPages(),info.getPageNum(),info.getPageSize());
    }

    @Override
    public ResultBean selectBySuitable(String token, Integer pageNum, Integer pageSize, String suitable) {
        List<Food> list = foodMapper.selectBySuitable(suitable);
        PageInfo<Food> info = new PageInfo<>(list);
        return ResultUtil.setPage(token,null,"根据适用时期查询所有对应的食谱",info.getList(),info.getTotal(),info.getPages(),info.getPageNum(),info.getPageSize());
    }

    @Override
    public ResultBean insertCollect(String token, int fodid) {
        Token t = TokenUtil.parseToken(token);
        SimpleDateFormat df = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        FoodCollect collect = new FoodCollect(fodid,t.getId(),df.format(new Date()));
        int i = colMapper.insert(collect);
        return ResultUtil.execOp(i,"收藏");
    }

    @Override
    public ResultBean insertComment(String token, int fodid, String comment) {
        Token t = TokenUtil.parseToken(token);
        SimpleDateFormat df = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        FoodComment com = new FoodComment(fodid,t.getId(),comment,df.format(new Date()));
        int i = comMapper.insert(com);
        return ResultUtil.execOp(i,"评论");
    }


}
