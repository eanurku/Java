package com.anurag.strategy;

public class PaypalStrategy implements PaymentStrategy {

    String email;
    String password;

    public PaypalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {

        System.out.println("paid by Paypal= "+amount);
    }
}
