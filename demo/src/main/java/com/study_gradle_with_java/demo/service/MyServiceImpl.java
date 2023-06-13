package com.study_gradle_with_java.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

    @Override
    public String getHello() {
        return "Hello";
    }

}
