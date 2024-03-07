package com.anurag.models;

import com.anurag.strategy.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> items;
    PaymentStrategy paymentMethod;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    int calculateTotalPrice() {
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void doPayment() {
        int amount = calculateTotalPrice();
        paymentMethod.pay(amount);
    }

    public void setPayment(PaymentStrategy paymentStrategy){
        this.paymentMethod=paymentStrategy;
    }

}
