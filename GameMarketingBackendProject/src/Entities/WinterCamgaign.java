package Entities;

import Abstract.BaseCampaignManager;

public class WinterCamgaign extends BaseCampaignManager{

	@Override
	protected double spesificCampaignCalculation(Game game) {

		return (game.getPrice() * 15) / 100;
	}

}
