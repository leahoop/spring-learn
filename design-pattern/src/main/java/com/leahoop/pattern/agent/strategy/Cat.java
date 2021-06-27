package com.leahoop.pattern.agent.strategy;

public class Cat implements Run {
    @Override
    public void fast() {
        System.out.println("cat can run 50m/min");
    }
}
