package com.leahoop.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "producer", path = "producer", url = "${feign.producer}")
public interface ProducerService {

    @GetMapping("/hello")
    String hello(@RequestParam String str);


}
