package com.leahoop.pattern.agent.statics;

public class FoodServiceImpl implements FoodService {

    @Override
    public Food makeChicken() {
        Food f = new Food();
        f.setSpicy("1g");
        f.setSalt("3g");
        f.setType("chicken");
        return f;
    }

    @Override
    public Food makeNoodle() {
        Food f = new Food();
        f.setSpicy("500g");
        f.setSalt("5g");
        f.setType("noodle");
        return f;
    }

}
