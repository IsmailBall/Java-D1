package Concrete;

import Abstract.BuyAndSellerService;
import Abstract.CampaignService;
import Abstract.CustomerService;
import Entities.Customer;
import Entities.Game;

public class BuyAndSellManager implements BuyAndSellerService{

	private CampaignService campaignService;
	private CustomerService customerService;
	
	public BuyAndSellManager(CampaignService campaignService, CustomerService customerService) {

		this.campaignService = campaignService;
		this.customerService = customerService;
	}
	
	@Override
	public void buyGame(Game game, Customer customer) {
		
		var newPrice = campaignService.calculatePriceWithDiscount(game);
		
		if(customer.getBalance() - newPrice >= 0) {
			
			customer.setBalance(customer.getBalance() - newPrice);
			customerService.updateCustomer(customer);
			
			System.out.println("Customer: " + customer.getFirstName() + " Game Price: " + game.getPrice() + " Game price after Discount: " + newPrice);
			System.out.println("Transaction was completed successfuly!");
		}
		else {
			System.out.println("Transaction was failed! " + customer.getFirstName() + " has insufficent balance");
		}
		
	}

}
