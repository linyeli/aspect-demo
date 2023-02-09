package com.example.aspectdemo.service;

import org.springframework.stereotype.Service;

@Service
public class JdkProxyServiceImpl implements IJdkProxyService{

    @Override
    public String doListen(String question) {
        System.out.println("... listen to question ...");
//        throw new RuntimeException("I’m an exception");
        return question;
    }

    @Override
    public void doThink() {
        System.out.println("... think the question ...");
    }

    @Override
    public void doWrite(String answer) {
        System.out.println("... write answer ...");
    }
}
