package com.example.spring.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTestService {


    @Async
    public void hello() {
        System.out.println("Hello async!");
    }

}
