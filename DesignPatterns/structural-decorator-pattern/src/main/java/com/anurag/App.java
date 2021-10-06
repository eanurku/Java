package com.anurag;

import com.anurag.models.Pizza;
import com.anurag.pizzaflavours.CheesePizza;
import com.anurag.pizzaflavours.CornPizza;
import com.anurag.pizzas.BasicPizza;

public class App {

    public static void main(String[] args) {

        Pizza basicPizza = new BasicPizza();
        CheesePizza cheesePizza = new CheesePizza(basicPizza);
        cheesePizza.assemblePizza();

        CornPizza cornPizza = new CornPizza(basicPizza);
        cornPizza.assemblePizza();
    }
}
