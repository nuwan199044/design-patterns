package com.myapp.designpatterns.service;

public class BankTransferPaymentService implements PaymentProcessor{
    @Override
    public void processPayment() {
        System.out.println("Processing bank transfer payment");
    }
}
