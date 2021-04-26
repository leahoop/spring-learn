package com.leahoop.producer.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("producer")
public class ProducerController {

    @GetMapping("/hello")
    public String hello(@RequestParam String str) {
        return str + " , Hello!";
    }

}
