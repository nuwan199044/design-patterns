package com.myapp.designpatterns;

public class DesignPatternsApplication {

	public static void main(String[] args) {
		MessageSender sender = new EmailSender(); // or new SmsSender()
		NotificationService service = new NotificationService(sender);

		service.notifyUser("Your OTP is 123456");
	}

}
