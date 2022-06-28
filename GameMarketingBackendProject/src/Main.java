import Abstract.BuyAndSellerService;
import Abstract.CampaignService;
import Abstract.CustomerService;
import Adapter.LocalCheckFunction;
import Concrete.BuyAndSellManager;
import Concrete.CustomerManager;
import Entities.CampaignManager;
import Entities.Customer;
import Entities.Game;

public class Main {
	
	public static void main(String[] args) {
		
		CustomerService customerService = new CustomerManager(new LocalCheckFunction());
		
		Game game = new Game("CS GO", 300, 12);
		Customer customer = customerService.getCustomer(2);
		CampaignService campaignService = new CampaignManager("WinterCampaign", 25);
		
		BuyAndSellerService buyAndSellerService = new BuyAndSellManager(campaignService, customerService);
		
		
		buyAndSellerService.buyGame(game,customer);

	}
	
}
