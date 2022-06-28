package registration.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import registration.abstracts.CustomerService;
import registration.dbSimulation.Result;

public class CustomerManagerBusinessRules {

	public static Result checkPasswordGreaterThanSix(Customer customer) {
		boolean response = customer.getPassword().length() > 6;

		return response ? new Result(true) : new Result("Password length must be greater than six!", false);
	}

	public static Result checkeMailIsValid(Customer customer) {
		String regex = "^(.+)@(.+)$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(customer.geteMail());

		boolean response = matcher.matches();

		return response ? new Result(true) : new Result("EMail must be a valid!", false);
	}

	public static Result checkeMailIsUnique(Customer customer, CustomerService customerService) {
		boolean response = customerService.getCustomers().stream()
				.anyMatch(c -> c.geteMail().equals(customer.geteMail()));

		return !response ? new Result(true) : new Result("This eMail address is already in use!", false);
	}

	public static Result checkNamesAreGreaterThanTwoCharacter(Customer customer) {
		boolean response = customer.getFirstName().length() > 2 && customer.getLastName().length() > 2;
		return response ? new Result(true)
				: new Result("First name or last names' length must be greater than 2!", false);
	}
	
	public static Result runRules(Result... results)
	{
		for (Result result : results) {
			if(!result.isSuccess())
				return result;
		}
		return new Result(true);
	}

}
