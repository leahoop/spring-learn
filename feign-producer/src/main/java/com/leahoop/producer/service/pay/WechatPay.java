package com.leahoop.producer.service.pay;

public class WechatPay implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("pay to wechat");
    }

    @Override
    public void getBack() {
        System.out.println("get back from wechat");
    }
}
