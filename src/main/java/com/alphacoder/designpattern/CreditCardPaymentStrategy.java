package com.alphacoder.designpattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CreditCardPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay() {
        log.info("Payment done using credit card.");
    }
}
