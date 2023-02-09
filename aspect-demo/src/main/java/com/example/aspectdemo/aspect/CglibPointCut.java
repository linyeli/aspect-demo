package com.example.aspectdemo.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CglibPointCut {

    @Pointcut("execution(* com.example.aspectdemo.service.CglibProxyServiceImpl.*(..))")
    public void cglibPointCutMethod(){}
}
