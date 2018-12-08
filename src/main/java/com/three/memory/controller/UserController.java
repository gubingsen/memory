package com.three.memory.controller;

import com.three.memory.domain.User;
import com.three.memory.service.UserService;
import com.three.memory.service.impl.RedisService;
import com.three.memory.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;
    @Autowired
    private RedisService redisService;

    /**
     * 实现用户登录
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("login.do")
    public ResultBean login(String username, String password) {
        return service.login(username, password);
    }

    /**
     * 实现退出登录
     * @param token
     * @return
     */
    @RequestMapping("logout.do")
    public ResultBean logout(String token) {
        return service.loginout(token);
    }

    /**
     * 用户注册
     * @param user
     * @return
     */
    @RequestMapping("regist.do")
    public ResultBean regist(User user) {
        return service.regist(user);
    }

    /**
     * 判断用户名是否可用
     * @param username
     * @return
     */
    @RequestMapping("checkUsername.do")
    public ResultBean checkName(String username) {
        return service.checkUsername(username);
    }
}
