package com.leahoop.producer.service.pay;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;


@Service
public class PaymentContext implements ApplicationContextAware {

    @Value("${pay.type}")
    private String type;

    private static ApplicationContext ctx;

    public PaymentStrategy pay() {
        return ctx.getBean(type, PaymentStrategy.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        PaymentContext.ctx = applicationContext;
    }
}
