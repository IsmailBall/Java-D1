package DatabaseSimulation;

import java.util.LinkedList;
import java.util.List;

import Entities.Customer;

public class CustomerDb {

	private static List<Customer> customers;

	static {
		customers = new LinkedList<>();
		customers.add(new Customer(1, "CustomerF1", "CustomerL1", 13, "12345678912", 200));
		customers.add(new Customer(2, "CustomerF2", "CustomerL2", 14, "12345643353", 225));
		customers.add(new Customer(3, "CustomerF3", "CustomerL3", 15, "32523542344", 400));
		customers.add(new Customer(4, "CustomerF4", "CustomerL4", 16, "32432423655", 500));
		customers.add(new Customer(5, "CustomerF5", "CustomerL5", 17, "53452345234", 600));
		customers.add(new Customer(6, "CustomerF6", "CustomerL6", 18, "32432432432", 400));
	}

	public static List<Customer> geCustomers() {
		return customers;
	}

	public static Customer geCustomer(int id) {

		for (Customer customer : customers) {

			if (customer.getId() == id)
				return customer;
		}

		return null;
	}

	public static void addCustomer(Customer customer) {
		customers.add(customer);
	}

	public static void deleteCustomer(int id) {

		var customer = geCustomer(id);
		boolean result = customer == null ? false : customers.remove(customer);

	}

	public static void updateCustomer(Customer customer) {

		var customerToBeUpdated = geCustomer(customer.getId());

		if (customerToBeUpdated != null) {
			customerToBeUpdated.setAge(customer.getAge());
			customerToBeUpdated.setBalance(customer.getBalance());
			customerToBeUpdated.setFirstName(customer.getFirstName());
			customerToBeUpdated.setLastName(customer.getLastName());
			customerToBeUpdated.setNationalId(customer.getNationalId());
		}

	}

}
