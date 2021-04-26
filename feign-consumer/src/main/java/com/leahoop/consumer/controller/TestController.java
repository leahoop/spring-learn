package com.leahoop.consumer.controller;


import com.leahoop.consumer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
