package com.leahoop.pattern.agent.dynamic;

import java.lang.reflect.Proxy;

/**
 * 动态代理实现增强，必须要有接口，没有接口可以通过cglib字节码技术实现动态代理
 */
public class DynamicProxyTest {

    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();
        BuyHouse proxyBuyHouse = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(),
                new Class[]{BuyHouse.class}, new DynamicProxyHandler(buyHouse));
        proxyBuyHouse.buyHouse();
    }

}
