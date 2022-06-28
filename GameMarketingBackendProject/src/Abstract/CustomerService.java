package Abstract;

import java.util.List;

import Entities.Customer;

public interface CustomerService {
	
	void addCustomer(Customer customer);
	
	void deleteCustomer(int id);
	
	void updateCustomer(Customer customer);
	
	Customer getCustomer(int id);
	
	List<Customer> geCustomers();
	
}
