package com.example.spring.controller;

import com.example.spring.config.aop.Limit;
import com.example.spring.service.AsyncTestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private AsyncTestService asyncTestService;

    @GetMapping
    @Limit(key = "limit3", permitsPerSecond = 2, timeout = 500, msg = "系统繁忙，请稍后再试！")
    public String hello() {
        return "请求成功";
    }

}


