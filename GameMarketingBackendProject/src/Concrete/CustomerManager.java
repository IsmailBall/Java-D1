package Concrete;

import java.util.List;

import Abstract.CustomerCheck;
import Abstract.CustomerService;
import DatabaseSimulation.CustomerDb;
import Entities.Customer;

public class CustomerManager implements CustomerService {

	
	private CustomerCheck customerCheck;
	
	public CustomerManager(CustomerCheck customerCheck) {
		
		this.customerCheck = customerCheck;
	}
	
	@Override
	public void addCustomer(Customer customer) {
		
		if(customerCheck.checkCustomerIsValid(customer)) {
			CustomerDb.addCustomer(customer);
		}
		
	}

	@Override
	public void deleteCustomer(int id) {
		
		CustomerDb.deleteCustomer(id);
	}

	@Override
	public void updateCustomer(Customer customer) {

		CustomerDb.updateCustomer(customer);
	}

	@Override
	public Customer getCustomer(int id) {
		
		return CustomerDb.geCustomer(id);
	}

	@Override
	public List<Customer> geCustomers() {
		
		return CustomerDb.geCustomers();
	}

}
