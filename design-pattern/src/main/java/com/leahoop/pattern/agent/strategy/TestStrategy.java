package com.leahoop.pattern.agent.strategy;

public class TestStrategy {

    public static void main(String[] args) {


        Context context = new Context(new Cat());
        context.goRun();

        Context context2 = new Context(new People());
        context2.goRun();

    }

}
