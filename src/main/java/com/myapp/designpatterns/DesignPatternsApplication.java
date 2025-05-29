package com.myapp.designpatterns;

import com.myapp.designpatterns.dto.LoanInterest;
import com.myapp.designpatterns.dto.Passbook;
import com.myapp.designpatterns.service.LoanService;
import com.myapp.designpatterns.service.NotificationService;
import com.myapp.designpatterns.service.PrintService;

public class DesignPatternsApplication {

	public static void main(String[] args) {
		Passbook passbook = new Passbook("john doe", "savings");
		new PrintService().print(passbook);
		System.out.println(new LoanService().getLoanInterestInfo("home").toString());
		new NotificationService().sendOTP("mobile");
	}

}
