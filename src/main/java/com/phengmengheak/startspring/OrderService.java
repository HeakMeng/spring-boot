package com.phengmengheak.startspring;

public class OrderService {
    private PaymentService paymentService;
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        var payment = new PayPalPaymentService();
        payment.processPayment(10);
    }
}
