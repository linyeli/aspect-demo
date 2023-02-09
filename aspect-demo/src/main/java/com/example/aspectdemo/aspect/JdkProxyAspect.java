package com.example.aspectdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
// 本切面皆是通过切点方式进行通知
public class JdkProxyAspect {

    @Before("com.example.aspectdemo.aspect.JdkPointCut.jdkProxyPointCutMethod()")
    public void doBefore(JoinPoint joinPoint){
        //此处写切面的逻辑，本例中只打印一条语句
        System.out.println("--- Jdk proxy 前置通知 --- " + joinPoint);
    }

    @AfterReturning(pointcut = "com.example.aspectdemo.aspect.JdkPointCut.jdkProxyPointCutMethod()", returning = "result")
    public void doAfterReturning(JoinPoint joinPoint, Object result){
        System.out.println("--- Jdk proxy 后置返回通知 --- " + result);
    }

    @AfterThrowing(pointcut = "com.example.aspectdemo.aspect.JdkPointCut.jdkProxyPointCutMethod()", throwing = "e")
    public void doAfterThrowing(Throwable e){
        System.out.println("--- Jdk proxy 后置异常通知 --- " + e);
    }

    @After("com.example.aspectdemo.aspect.JdkPointCut.jdkProxyPointCutMethod()")
    public void doAfter() {
        System.out.println("--- Jdk proxy 后置通知 ---");
    }

    @Around("com.example.aspectdemo.aspect.JdkPointCut.jdkProxyPointCutMethod()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //只有around才能使用ProceedingJoinPoint
        System.out.println("--- Jdk proxy 环绕通知进入方法 --- " + proceedingJoinPoint);
        Object object = proceedingJoinPoint.proceed();
        System.out.println("--- Jdk proxy 环绕通知退出方法 --- " + object);
        return object;
    }

}
