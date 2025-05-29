package com.myapp.designpatterns.service;

public class PaymentService {
    public void process(PaymentProcessor processor) {
        processor.processPayment();
    }
}
