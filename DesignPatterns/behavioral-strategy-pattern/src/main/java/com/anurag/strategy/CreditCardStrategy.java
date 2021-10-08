package com.anurag.strategy;

public class CreditCardStrategy implements PaymentStrategy {

    String cardNo;
    String secretCode;

    public CreditCardStrategy(String cardno, String secretCode) {
        this.cardNo = cardno;
        this.secretCode = secretCode;
    }

    @Override
    public void pay(int amount) {

        System.out.println("paid by credit card= "+amount);
    }
}
