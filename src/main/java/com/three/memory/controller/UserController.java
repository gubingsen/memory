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

    @RequestMapping("login.do")
    public ResultBean login(String username, String password) {
        return service.login(username, password);
    }

    @RequestMapping("checklogin.do")
    public ResultBean checkLogin(String token) {
        return service.checkLogin(token);
    }

    @RequestMapping("logout.do")
    public ResultBean logout(String token) {
        return service.loginout(token);
    }

    @RequestMapping("regist.do")
    public ResultBean regist(User user) {
        return service.regist(user);
    }
}
