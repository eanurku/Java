package com.anurag.decorator;

import com.anurag.models.Pizza;

public abstract class PizzaDecorator implements Pizza {

    private Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void assemblePizza() {
       this.pizza.assemblePizza();
    }
}
