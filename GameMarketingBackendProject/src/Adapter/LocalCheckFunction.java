package Adapter;

import Abstract.CustomerCheck;
import Abstract.CustomerService;
import Entities.Customer;

public class LocalCheckFunction implements CustomerCheck{

	@Override
	public boolean checkCustomerIsValid(Customer customer) {
		
		return customer.getNationalId().length() == 11;
		
	}

}
