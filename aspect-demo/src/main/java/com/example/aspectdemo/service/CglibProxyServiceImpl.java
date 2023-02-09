package com.example.aspectdemo.service;

import org.springframework.stereotype.Service;

@Service
public class CglibProxyServiceImpl {

    public String doListen(String question) {
        System.out.println("... listen to question ...");
//        throw new RuntimeException("I’m an exception");
        return question;
    }

    public void doThink() {
        System.out.println("... think the question ...");
    }

    public void doWrite(String answer) {
        System.out.println("... write answer ...");
    }
}
