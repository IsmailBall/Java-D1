package registration.dbSimulation;

import java.util.LinkedList;
import java.util.List;

import registration.concretes.Customer;

public class CustomerDb {

	private static List<Customer> customers;

	static {
		customers = new LinkedList<>();
		customers.add(new Customer(1, "CustomerF1", "CustomerL1", "abc@outlook.com","123324","14359783423"));
		customers.add(new Customer(2, "CustomerF2", "CustomerL2", "abc@hotmail.com","122343","14334563423"));
		customers.add(new Customer(3, "CustomerF3", "CustomerL3", "abc@gmail.com","121233","1435234423"));
		customers.add(new Customer(4, "CustomerF4", "CustomerL4", "abc@yandex.com","145623","114783423"));
		customers.add(new Customer(5, "CustomerF5", "CustomerL5", "abc@bcd.com","134523","175659783423"));
		customers.add(new Customer(6, "CustomerF6", "CustomerL6", "abc@tscr.com","1287683","14353483423"));
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
			customerToBeUpdated.setFirstName(customer.getFirstName());
			customerToBeUpdated.setLastName(customer.getLastName());
			customerToBeUpdated.seteMail(customer.geteMail());
			customerToBeUpdated.setPassword(customer.getPassword());
			customerToBeUpdated.setPhoneNumber(customer.getPhoneNumber());
		}

	}

}
