package registration.concretes;

import registration.abstracts.TwoFactorConfirmation;

public class MailConfirmation implements TwoFactorConfirmation{

	@Override
	public void sendConfirmationRequestToUser(Customer customer) {

		System.out.println("Confirmation mail was sent to the user\n User mail is: " + customer.geteMail());
		
	}

}
