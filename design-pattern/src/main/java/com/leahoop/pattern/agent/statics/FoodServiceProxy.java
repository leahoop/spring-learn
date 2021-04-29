package com.leahoop.pattern.agent.statics;

public class FoodServiceProxy implements FoodService {

    private FoodService foodService;

    public FoodServiceProxy (FoodService foodService) {
        this.foodService = foodService;
    }

    @Override
    public Food makeChicken() {
        Food food = foodService.makeChicken();
        System.out.println(food.toString());
        System.out.println("增强chicken！！！");
        return null;
    }

    @Override
    public Food makeNoodle() {
        Food food = foodService.makeNoodle();
        System.out.println(food.toString());
        System.out.println("增强noodle!!!");
        return null;
    }
}
