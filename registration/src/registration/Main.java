package registration;

import registration.abstracts.CustomerService;
import registration.concretes.Customer;
import registration.concretes.CustomerManager;
import registration.concretes.SmsConfirmation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerService customerService =  new CustomerManager(new SmsConfirmation());
		Customer customer = new Customer(6, "Customer7", "Customer7F", "zibam.@hotmail.com", "3212423", "sdagdgx");
		customerService.addCustomer(customer);

	}

}
