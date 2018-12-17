package com.three.memory.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.three.memory.domain.BabyMedia;
import com.three.memory.domain.UserBaby;
import com.three.memory.mapper.BabyMediaMapper;
import com.three.memory.mapper.UserBabyMapper;
import com.three.memory.service.BybyService;
import com.three.memory.token.Token;
import com.three.memory.token.TokenUtil;
import com.three.memory.util.ResultUtil;
import com.three.memory.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BybyServiceImpl implements BybyService {
    @Autowired
    private UserBabyMapper uMapper;
    @Autowired
    private BabyMediaMapper mMapper;

    @Override
    public ResultBean selectByUid(String token) {
        Token t = TokenUtil.parseToken(token);
        List<UserBaby> list = uMapper.selectByUid(t.getId());
        for (UserBaby l:list) {
            Integer i = l.getIntage();
            if (i < 12 && i!=0) {
                l.setStyage(i + "个月");
            } else if (i%12==0 && i !=0) {
                l.setStyage(i/12 + "岁");
            } else if (i%12!=0 && i%12>1){
                l.setStyage(i/12 + "岁" + i%12 + "个月");
            }
        }
        return ResultUtil.setOK("根据用户id查询宝宝的详细信息",list);
    }

    @Override
    public ResultBean selectByBybyid(String token, Integer pageNum, Integer pageSize,Integer bybyid) {
        List<BabyMedia> list = mMapper.selectByBybyid(bybyid);
        PageInfo<BabyMedia> info = new PageInfo<>(list);

        return ResultUtil.setPage(token,null,"根据宝宝id查询宝宝所有的照片",info.getList(),info.getTotal(),info.getPages(),info.getPageNum(),info.getPageSize());
    }
}
