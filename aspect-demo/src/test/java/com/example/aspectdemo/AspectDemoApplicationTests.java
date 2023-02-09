package com.example.aspectdemo;

import com.example.aspectdemo.service.CglibProxyServiceImpl;
import com.example.aspectdemo.service.IJdkProxyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AspectDemoApplicationTests {

    @Autowired
    private IJdkProxyService jdkProxyService;

    @Autowired
    private CglibProxyServiceImpl cglibProxyService;

    @Test
    void testJdkProxy(){
        jdkProxyService.doListen("what's your name");
    }

    @Test
    void testCglibProxy(){
        cglibProxyService.doListen("how old are you");
    }
}
