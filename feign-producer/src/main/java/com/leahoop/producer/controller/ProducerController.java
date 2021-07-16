package com.leahoop.producer.controller;

import com.leahoop.producer.service.pay.PaymentContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("producer")
public class ProducerController {

    @Autowired
    private PaymentContext paymentContext;

    @GetMapping("/hello")
    public String hello(@RequestParam String str) {
        return str + " , Hello!";
    }


    @GetMapping("/pay")
    public void pay() {
        paymentContext.pay();
    }
}
