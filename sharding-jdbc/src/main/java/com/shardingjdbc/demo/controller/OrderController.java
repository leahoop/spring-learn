package com.shardingjdbc.demo.controller;

import com.shardingjdbc.demo.entity.Order;
import com.shardingjdbc.demo.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping(value = "/addOrder")
    public void addOrder() {
        orderService.addOrder();
    }

    @GetMapping(value = "/find")
    public List<Order> findOrder() {
        return orderService.findOrder();
    }

}
