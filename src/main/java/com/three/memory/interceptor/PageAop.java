package com.three.memory.interceptor;

import com.github.pagehelper.PageHelper;
import com.three.memory.util.ResultUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PageAop {
    @Pointcut("execution(public * com.three.memory.service.impl.*.*Page(java.lang.String, java.lang.Integer, java.lang.Integer,..))")
    public void pointcut(){}

    @Before("pointcut()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {

        Object[] params = joinPoint.getArgs();
        Integer pageNum = (Integer) params[1];
        Integer pageSize = (Integer) params[2];
        PageHelper.startPage(ResultUtil.getPageNum(pageNum), ResultUtil.getPageSize(pageSize));
    }
}

