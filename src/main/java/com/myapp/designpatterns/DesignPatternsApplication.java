package com.myapp.designpatterns;

public class DesignPatternsApplication {

	public static void main(String[] args) {
		BasicPrinter basicPrinter = new BasicPrinter();
		basicPrinter.print("test content");

		AdvancedPrinter advancedPrinter = new AdvancedPrinter();
		advancedPrinter.print("test content");
		advancedPrinter.scan("test scan");
		advancedPrinter.fax("test fax");
	}

}
