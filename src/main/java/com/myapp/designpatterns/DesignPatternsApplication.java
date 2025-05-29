package com.myapp.designpatterns;

import com.myapp.designpatterns.service.BankTransferPaymentService;
import com.myapp.designpatterns.service.CreditCardPaymentService;
import com.myapp.designpatterns.service.PayPalPaymentService;
import com.myapp.designpatterns.service.PaymentProcessor;
import com.myapp.designpatterns.service.PaymentService;

public class DesignPatternsApplication {

	public static void main(String[] args) {
		PaymentService service = new PaymentService();

		PaymentProcessor credit = new CreditCardPaymentService();
		PaymentProcessor paypal = new PayPalPaymentService();
		PaymentProcessor bank = new BankTransferPaymentService();

		service.process(credit);
		service.process(paypal);
		service.process(bank);
	}

}
