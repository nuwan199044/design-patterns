package com.myapp.designpatterns.service;

public class PayPalPaymentService implements PaymentProcessor{
    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment");
    }
}
