package com.anurag.pizzaflavours;

import com.anurag.decorator.PizzaDecorator;
import com.anurag.models.Pizza;


public class CornPizza extends PizzaDecorator {

    public CornPizza(Pizza pizza) {
        super(pizza);
    }

    public void assemblePizza() {

        super.assemblePizza();

        //decorate pizza with corn
        this.addCorn();
    }

    private void addCorn() {
        System.out.println("decorate pizza with corn");
    }
}
