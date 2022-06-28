package registration.abstracts;

import registration.concretes.Customer;

public interface TwoFactorConfirmation {

	void sendConfirmationRequestToUser(Customer customer);
}
