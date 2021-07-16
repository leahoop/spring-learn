package com.leahoop.producer.service.pay;

import org.springframework.stereotype.Component;

@Component
public class AliPay implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("pay to ali!");
    }

    @Override
    public void getBack() {
        System.out.println("get money from ali");
    }
}
