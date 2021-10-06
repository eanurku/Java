package com.anurag;

import com.anurag.models.Pizza;
import com.anurag.pizzas.BasicPizza;
import com.anurag.pizzas.CheesePizza;
import com.anurag.pizzas.CornPizza;

public class App {

    public static void main(String[] args) {

        Pizza basicPizza = new BasicPizza();
        CheesePizza cheesePizza = new CheesePizza(basicPizza);
        cheesePizza.assemblePizza();

        CornPizza cornPizza = new CornPizza(basicPizza);
        cornPizza.assemblePizza();
    }
}
