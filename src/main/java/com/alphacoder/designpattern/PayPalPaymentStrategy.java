package com.alphacoder.designpattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PayPalPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay() {
        log.info("Payment done via paypal.");
    }
}
