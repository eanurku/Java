package com.anurag.pizzas;

import com.anurag.models.Pizza;

public class BasicPizza implements Pizza {

    @Override
    public void assemblePizza() {
        System.out.println("assembling basic pizza");

    }
}
