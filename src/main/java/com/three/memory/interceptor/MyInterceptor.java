package com.three.memory.interceptor;

import com.alibaba.fastjson.JSON;
import com.three.memory.constant.SystemCon;
import com.three.memory.domain.User;
import com.three.memory.mapper.UserMapper;
import com.three.memory.service.impl.RedisService;
import com.three.memory.util.ResultUtil;
import com.three.memory.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

@Component
public class MyInterceptor implements HandlerInterceptor {

    private String token;

    @Autowired
    private RedisService service;
    @Autowired
    private UserMapper mapper;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/text;charset=UTF-8");

        //从请求参数中获取用户令牌
        token = request.getParameter("token");
        System.out.println("token = " + token);
        //如果令牌为空则需要登录
        if (StringUtil.checkEmpty(token)) {

            response.getWriter().print(JSON.toJSONString(ResultUtil.setError(SystemCon.RERROR1, "请先登录", null)));
            return false;
        }
        //从Redis中获取存储的用户信息
        Object o = service.hmGet(SystemCon.REDISTOKEN, token);
        System.out.println("o = " + JSON.toJSONString(o));
        if (o != null && o != "") {
            String value = (String) o;
            User user = JSON.parseObject(value, User.class);
            User u = mapper.selectByUser(user);
            if (u != null) {
                return true;
            } else {
                response.getWriter().print(JSON.toJSONString(ResultUtil.setError(SystemCon.RERROR2, "请先登录", null)));
                return false;
            }

        } else {
            response.getWriter().print(JSON.toJSONString(ResultUtil.setError(SystemCon.RERROR3, "请先登录", null)));
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws IOException {
        //更新token


    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
    }
}
