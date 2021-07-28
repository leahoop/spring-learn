package com.leahoop.pattern.agent.decorator;

/**
 * @description 调料装饰着抽象类（继承自饮料抽象类）
 */
public abstract class CondimentDecorator extends Beverage {

    /**
     * 所有的调料装饰者都必须重新实现getDescription()方法
     * 这样才能够用递归的方式来得到所选饮料的整体描述
     *
     * @return
     */
    public abstract String getDescription();
}
