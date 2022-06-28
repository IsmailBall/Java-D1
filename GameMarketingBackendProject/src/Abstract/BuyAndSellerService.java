package Abstract;

import Entities.Customer;
import Entities.Game;

public interface BuyAndSellerService {

	void buyGame(Game game, Customer customer);
}
