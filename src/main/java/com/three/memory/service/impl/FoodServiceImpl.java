package com.three.memory.service.impl;

import com.three.memory.mapper.FoodDetailMapper;
import com.three.memory.mapper.FoodMapper;
import com.three.memory.mapper.FoodTypeMapper;
import com.three.memory.service.FoodService;
import com.three.memory.util.ResultUtil;
import com.three.memory.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FoodServiceImpl implements FoodService {
    @Autowired
    private FoodTypeMapper foodTypeMapper;
    @Autowired
    private FoodMapper foodMapper;
    @Autowired
    private FoodDetailMapper foodDetailMapper;

    @Override
    public ResultBean selectFoodAll() {
        return ResultUtil.setOK("查询所有食物图片",foodMapper.selectFoodAll());
    }

    @Override
    public ResultBean selectFtpAll() {
        return ResultUtil.setOK("查询所有食物类型",foodTypeMapper.selectAll());
    }

    @Override
    public ResultBean selectByFtyId(int ftyid) {
        return ResultUtil.setOK("根据食物类型查询所有食物",foodMapper.selectByFtyId(ftyid));
    }

    @Override
    public ResultBean selectByFodId(int fodid) {
        return ResultUtil.setOK("根据食物id查询对应食物的详细信息",foodDetailMapper.selectByFodId(fodid));
    }

    @Override
    public ResultBean selectByUsrId(int usrid) {
        return ResultUtil.setOK("根据用户id查询用户收藏的食物",foodMapper.selectByUsrId(usrid));
    }


}
