package com.leahoop.pattern.agent.strategy;

public class Context {

    private Run run;


    public Context(Run run) {
        this.run = run;
    }

    public void goRun() {
        run.fast();
    }

}
