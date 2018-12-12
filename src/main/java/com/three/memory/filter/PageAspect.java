package com.three.memory.filter;

import com.github.pagehelper.PageHelper;
import com.three.memory.token.Token;
import com.three.memory.token.TokenUtil;
import com.three.memory.util.ResultUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PageAspect {
    @Before("execution(public * com.three.memory.service.impl.*.*(String,Integer,Integer,..))")
    public void before2(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        Integer pageNum = (Integer) args[1];
        Integer pageSize = (Integer) args[2];
        PageHelper.startPage(ResultUtil.getPageNum(pageNum),ResultUtil.getPageSize(pageSize));
    }


}
