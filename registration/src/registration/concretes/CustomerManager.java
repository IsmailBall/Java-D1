package registration.concretes;

import java.util.List;

import registration.abstracts.CustomerService;
import registration.abstracts.TwoFactorConfirmation;
import registration.dbSimulation.CustomerDb;
import registration.dbSimulation.Result;

public class CustomerManager implements CustomerService {

	
	private TwoFactorConfirmation confirmation;
	
	
	
	public CustomerManager(TwoFactorConfirmation confirmation) {
		super();
		this.confirmation = confirmation;
	}

	@Override
	public void addCustomer(Customer customer) {

		Result result = CustomerManagerBusinessRules.runRules(
				CustomerManagerBusinessRules.checkeMailIsUnique(customer, this),
				CustomerManagerBusinessRules.checkeMailIsValid(customer),
				CustomerManagerBusinessRules.checkNamesAreGreaterThanTwoCharacter(customer),
				CustomerManagerBusinessRules.checkPasswordGreaterThanSix(customer));
		
		if (result.isSuccess()) {
			CustomerDb.addCustomer(customer);
			confirmation.sendConfirmationRequestToUser(customer);
		}
		else {
			System.out.println("Error!!! Definition: " + result.getDescription());
		}
	}

	@Override
	public Customer getCustomer(int id) {
		return CustomerDb.geCustomer(id);
	}

	@Override
	public List<Customer> getCustomers() {
		return CustomerDb.geCustomers();
	}

	@Override
	public void updateCustomer(Customer customer) {
		
		CustomerDb.updateCustomer(customer);
	}

	@Override
	public void deleteCustomer(int id) {

		CustomerDb.deleteCustomer(id);
		
	}

}
