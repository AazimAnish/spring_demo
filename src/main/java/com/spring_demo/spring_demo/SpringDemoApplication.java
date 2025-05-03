package com.spring_demo.spring_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SpringDemoApplication.class, args);

		var orderService = new OrderService();
		// orderService.setPaymentService(new PayPalPaymentService());
		orderService.placeOrder();
	}

}
