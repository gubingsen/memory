package com.three.memory.service.impl;

import com.alibaba.fastjson.JSON;
import com.three.memory.constant.SystemCon;
import com.three.memory.domain.User;
import com.three.memory.mapper.UserMapper;
import com.three.memory.service.UserService;
import com.three.memory.token.Token;
import com.three.memory.token.TokenUtil;
import com.three.memory.util.ResultUtil;
import com.three.memory.util.StringUtil;
import com.three.memory.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;
    @Autowired
    private RedisService service;

    @Override
    public ResultBean login(String username, String password) {
        User user = mapper.selectByUsername(username);
        if (user != null) {
            if(Objects.equals(user.getPassword(),password)){
                //登录成功
                //生成令牌
                String token= TokenUtil.createToken(JSON.toJSONString(user),user.getId());
                //将token存入Redis
                service.hmSet(SystemCon.REDISTOKEN, token, JSON.toJSONString(user));
                //返回值需要携带生成Token和对应的登录信息
                return ResultUtil.setOKToken(token, user, "登录成功");
            }
        }
        return ResultUtil.setError(SystemCon.RERROR1,"登录失败",null);
    }

    @Override
    public ResultBean loginout(String token) {
        service.delHash("token", token);
        return ResultUtil.setOK("退出成功", null);
    }

    @Override
    public ResultBean regist(User user) {
        return ResultUtil.execOp(mapper.insertSelective(user), "注册");
    }

    @Override
    public ResultBean checkUsername(String username) {
        User user = mapper.selectByUsername(username);
        if (user == null) {
            return ResultUtil.setOK("用户名可用", null);
        } else {
            return ResultUtil.setError(SystemCon.RERROR2, "用户名不可用", null);
        }
    }
}
