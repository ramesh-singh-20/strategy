package com.alphacoder.designpattern;

public class Order {

    public void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay();
    }
}
