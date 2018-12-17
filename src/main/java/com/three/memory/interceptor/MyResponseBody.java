//package com.three.memory.interceptor;
//
//import com.alibaba.fastjson.JSON;
//import com.three.memory.constant.SystemCon;
//import com.three.memory.service.impl.RedisService;
//import com.three.memory.token.TokenUtil;
//import com.three.memory.util.ResultUtil;
//import com.three.memory.vo.ResultBean;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.MethodParameter;
//import org.springframework.http.MediaType;
//import org.springframework.http.server.ServerHttpRequest;
//import org.springframework.http.server.ServerHttpResponse;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;
//
//@ControllerAdvice
//public class MyResponseBody implements ResponseBodyAdvice {
//
//    @Autowired
//    private RedisService service;
//
//    // 这里直接返回true,表示对任何handler的responsebody都调用beforeBodyWrite方法
//    @Override
//    public boolean supports(MethodParameter methodParameter, Class aClass) {
//        return true;
//    }
//    // 修改responsebody
//    @Override
//    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
//
//        ResultBean rb = (ResultBean) o;
//        Object token = rb.getToken();
//        Object data = rb.getData();
//        if (token == null) {
//            return rb;
//        } else {
//            String t = JSON.toJSONString(token);
//            //更新token
//            String tk = TokenUtil.updateToken(TokenUtil.parseToken(t));
//            //删除Redis中的存储的token
//            service.delHash(SystemCon.REDISTOKEN, t);
//            //重新添加token到Redis中
//            service.hmSet(SystemCon.REDISTOKEN, tk, JSON.toJSONString(data));
//
//            rb.setToken(tk);
//
//            return rb;
//        }
//    }
//}
