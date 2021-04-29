package com.leahoop.pattern.agent.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler {

    private Object object;

    public DynamicProxyHandler(Object o) {
        this.object = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("买房前先凑够首付");
        Object result = method.invoke(object, args);
        System.out.println("收房摆酒咯，轰轰烈烈！");
        return result;
    }
}
