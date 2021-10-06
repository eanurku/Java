package com.anurag.pizzas;

import com.anurag.models.Pizza;


public class CornPizza  {

    Pizza pizza;

    public CornPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public void assemblePizza() {

        this.pizza.assemblePizza();

        //decorate pizza with corn
        System.out.println("decorate pizza with corn");
    }
}
