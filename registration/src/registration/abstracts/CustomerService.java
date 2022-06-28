package registration.abstracts;

import java.util.List;

import registration.concretes.Customer;

public interface CustomerService {

	void addCustomer(Customer customer);
	Customer getCustomer(int id);
	List<Customer> getCustomers();
	void updateCustomer(Customer customer);
	void deleteCustomer(int id);
}
