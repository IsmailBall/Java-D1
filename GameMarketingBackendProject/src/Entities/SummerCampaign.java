package Entities;

import Abstract.BaseCampaignManager;

public class SummerCampaign extends BaseCampaignManager {

	@Override
	protected double spesificCampaignCalculation(Game game) {

		return (game.getPrice() * 25) / 100;
	}

}
