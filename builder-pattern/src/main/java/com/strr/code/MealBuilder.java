package com.strr.code;

import com.strr.code.burger.ChickenBurger;
import com.strr.code.burger.VegBurger;
import com.strr.code.drink.Coke;
import com.strr.code.drink.Pepsi;

public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
