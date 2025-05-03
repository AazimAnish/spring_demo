package com.spring_demo.spring_demo;

public class OrderService {

    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder () {
        PaymentService paymentService = new StripePaymentService();
        paymentService.processPayment(10);
    }
}
