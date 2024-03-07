package com.anurag.pizzaflavours;

import com.anurag.models.Pizza;
import com.anurag.decorator.PizzaDecorator;

public class CheesePizza extends PizzaDecorator {

    public CheesePizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void assemblePizza() {
        super.assemblePizza();

        //decorate pizza with cheese
        this.adddCheese();

    }

    private void adddCheese() {
        System.out.println("decorate pizza with cheese");
    }
}
