package com.leahoop.consumer.controller;


import com.leahoop.consumer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consumer")
public class TestController {

    @Autowired
    private ProducerService service;

    @GetMapping("/hello")
    public String hello(@RequestParam String str) {
        return service.hello(str);
    }

}
