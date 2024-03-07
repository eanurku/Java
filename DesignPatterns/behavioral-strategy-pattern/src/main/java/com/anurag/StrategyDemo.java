package com.anurag;

import com.anurag.models.Item;
import com.anurag.models.ShoppingCart;
import com.anurag.strategy.CreditCardStrategy;
import com.anurag.strategy.PaymentStrategy;
import com.anurag.strategy.PaypalStrategy;

public class StrategyDemo {
    public static void main( String[] args ) {

        //construct cart items
        ShoppingCart cart=new ShoppingCart();
        cart.addItem(new Item("mouse","MCC",10));
        cart.addItem(new Item("keyboard","KBB",20));


        //credit card payment
        PaymentStrategy paymentMethod = new CreditCardStrategy("card no","secretkey");
        cart.setPayment(paymentMethod);
        cart.doPayment();

        //paypal payment
        paymentMethod = new PaypalStrategy("email","pass");
        cart.setPayment(paymentMethod);
        cart.doPayment();

    }
}
