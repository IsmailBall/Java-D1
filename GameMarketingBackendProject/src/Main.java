import Abstract.BuyAndSellerService;
import Abstract.CampaignService;
import Abstract.CustomerService;
import Adapter.LocalCheckFunction;
import Concrete.BuyAndSellManager;
import Concrete.CustomerManager;
import Entities.Customer;
import Entities.Game;
import Entities.NoCampaign;
import Entities.SummerCampaign;
import Entities.WinterCamgaign;

public class Main {
	
	public static void main(String[] args) {
		
		CustomerService customerService = new CustomerManager(new LocalCheckFunction());
		
		Game game = new Game("CS GO", 300, 12);
		Customer customer = customerService.getCustomer(2);
		
		BuyAndSellerService buyAndSellerService = new BuyAndSellManager(new NoCampaign(), customerService);
		
		
		buyAndSellerService.buyGame(game,customer);

	}
	
}
