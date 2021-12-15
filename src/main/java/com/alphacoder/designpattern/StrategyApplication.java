package com.alphacoder.designpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyApplication {

	public static void main(String[] args) {
		SpringApplication.run(StrategyApplication.class, args);

		PaymentStrategy paymentStrategy= new CreditCardPaymentStrategy();
		Order order= new Order();
		order.pay(paymentStrategy);

		paymentStrategy= new CryptoPaymentStrategy();
		order.pay(paymentStrategy);
	}

}
