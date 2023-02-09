package com.example.aspectdemo.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
// before springboot2.0,use jdk proxy default. after springboot2.0, use cglib proxy default
// in boot project, proxyTargetClass could not work. in spring project, proxyTargetClass work
// in boot project, you can config in application.properties with 'spring.aop.proxy-target-class = false' to force using jdk proxy
@EnableAspectJAutoProxy
public class AspectConfig {
}
