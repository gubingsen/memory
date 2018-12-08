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
    public ResultBean checkLogin(String token) {
        if (StringUtil.checkEmpty(token)) {
            return ResultUtil.setError(SystemCon.RERROR1, "请重新登录", null);
        }
        String value = (String) service.hmGet(SystemCon.REDISTOKEN, token);

        if (StringUtil.checkNoEmpty(value)) {
            User user = JSON.parseObject(value, User.class);
            User u = mapper.selectByUser(user);
            if (u != null) {
                //更新token
                String tk = TokenUtil.updateToken(TokenUtil.parseToken(token));
                //删除Redis中的存储的token
                service.delHash(SystemCon.REDISTOKEN, token);
                //重新添加token到Redis中
                service.hmSet(SystemCon.REDISTOKEN, tk, JSON.toJSONString(u));

                return ResultUtil.setOKToken(tk, u, "登录信息有效");
            } else {
                return ResultUtil.setError(SystemCon.RERROR1, "请重新登录", null);
            }

        } else {
            return ResultUtil.setError(SystemCon.RERROR1, "请重新登录", null);
        }
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
}
