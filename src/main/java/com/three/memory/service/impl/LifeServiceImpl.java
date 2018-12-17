package com.three.memory.service.impl;

import com.github.pagehelper.PageInfo;
import com.three.memory.domain.Concern;
import com.three.memory.domain.User;
import com.three.memory.domain.UserInfo;
import com.three.memory.mapper.ConcernMapper;
import com.three.memory.mapper.UserInfoMapper;
import com.three.memory.mapper.UserMapper;
import com.three.memory.service.LifeService;
import com.three.memory.token.Token;
import com.three.memory.token.TokenUtil;
import com.three.memory.util.ResultUtil;
import com.three.memory.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class LifeServiceImpl implements LifeService {

    @Autowired
    private UserMapper mapper;
    @Autowired
    private ConcernMapper cMapper;
    @Autowired
    private UserInfoMapper infoMapper;

    @Override
    public ResultBean getUserToConcernPage(String token, Integer pageNum, Integer pageSize) {
        Token t = TokenUtil.parseToken(token);
        int id = t.getId();
        List<User> users = mapper.selectToConcern(id);
        PageInfo<User> info = new PageInfo<User>(users);

        return ResultUtil.setPage(token, null, "ok", info.getList(), info.getTotal(), info.getPages(), info.getPageNum(), info.getPageSize());
    }

    @Override
    public ResultBean concernAll(String token, Integer[] ids) {
        int uid = TokenUtil.parseToken(token).getId();
        List<Concern> concerns = new ArrayList<>();
        for (Integer i: ids) {
            Concern concern = new Concern();
            concern.setUid(uid);
            concern.setByuid(i);
            concerns.add(concern);
        }

        return ResultUtil.execOp(cMapper.insertAll(concerns), "关注");
    }

    @Override
    public ResultBean concernagoPage(String token, Integer pageNum, Integer pageSize) {
        int uid = TokenUtil.parseToken(token).getId();
        List<UserInfo> list = infoMapper.select(uid);
        PageInfo<UserInfo> info = new PageInfo<>(list);

        return ResultUtil.setPage(token, null, "ok", info.getList(), info.getTotal(), info.getPages(), info.getPageNum(), info.getPageSize());
    }
}
