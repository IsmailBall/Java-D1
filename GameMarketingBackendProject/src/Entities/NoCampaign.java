package Entities;

import Abstract.BaseCampaignManager;

public class NoCampaign extends BaseCampaignManager {

	@Override
	protected double spesificCampaignCalculation(Game game) {
	
		return 0;
	}

}
