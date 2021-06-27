package com.leahoop.pattern.agent.strategy;

public class People implements Run {
    @Override
    public void fast() {
        System.out.println("I can run 200m/s");
    }
}
