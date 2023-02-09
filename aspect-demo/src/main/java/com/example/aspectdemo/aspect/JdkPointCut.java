package com.example.aspectdemo.aspect;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Component
//切点不需要被spring管理，网上有些教程
public class JdkPointCut {

    @Pointcut("execution(* com.example.aspectdemo.service.IJdkProxyService.*(..))")
//  定义一个切点方法，用于给切点一个名字，没有其他作用，定义成void返回值，任意参数的空方法即可
    public void jdkProxyPointCutMethod(){}

}
