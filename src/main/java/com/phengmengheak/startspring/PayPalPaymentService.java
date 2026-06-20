package com.phengmengheak.startspring;

public class PayPalPaymentService implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal Payment:");
        System.out.println(amount);
    }
}
