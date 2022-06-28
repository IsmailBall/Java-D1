package Abstract;

import Entities.Game;

public abstract class BaseCampaignManager implements CampaignService{

	public double calculatePriceWithDiscount(Game game) {
		
		return game.getPrice() - spesificCampaignCalculation(game);
		
	}
	
	protected abstract double spesificCampaignCalculation(Game game);
}
