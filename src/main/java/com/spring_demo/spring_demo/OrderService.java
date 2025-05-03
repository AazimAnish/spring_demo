package com.spring_demo.spring_demo;

public class OrderService {
    public void placeOrder () {
        PaymentService paymentService = new StripePaymentService();
        paymentService.processPayment(10);
    }
}
