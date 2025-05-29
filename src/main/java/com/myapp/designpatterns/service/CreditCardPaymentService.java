package com.myapp.designpatterns.service;

public class CreditCardPaymentService implements PaymentProcessor{
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment");
    }
}
