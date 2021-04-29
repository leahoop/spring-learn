package com.leahoop.pattern.agent.statics;

/**
 * 静态代理，需要为每个目标对象创建代理类，不方便使用
 */
public class Test {

    public static void main(String[] args) {

        FoodService service = new FoodServiceProxy(new FoodServiceImpl());
        service.makeNoodle();
        service.makeChicken();

    }

}
