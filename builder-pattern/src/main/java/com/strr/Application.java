package com.strr;

import com.strr.code.Meal;
import com.strr.code.MealBuilder;

/**
 * 建造者模式
 * 将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。
 */
public class Application {
    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();
        Meal meal = builder.prepareVegMeal();
        System.out.println("Veg Meal");
        meal.showItems();
        System.out.println("Total Cost: " + meal.getCost());
    }
}
