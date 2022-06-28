package registration.concretes;

import registration.abstracts.TwoFactorConfirmation;

public class SmsConfirmation implements TwoFactorConfirmation{

	@Override
	public void sendConfirmationRequestToUser(Customer customer) {
		
		System.out.println("Confirmation sms was sent to the user\n User phone number is: " + customer.getPhoneNumber());
		
	}

}
