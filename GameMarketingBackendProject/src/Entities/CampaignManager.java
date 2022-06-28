package Entities;

import Abstract.BaseCampaignManager;

public class CampaignManager extends BaseCampaignManager{
	
	private String camppaignName;
	private int discount;

	public CampaignManager(String camppaignName, int discount) {
		super();
		this.camppaignName = camppaignName;
		this.discount = discount;
	}

	public String getCamppaignName() {
		return camppaignName;
	}

	public void setCamppaignName(String camppaignName) {
		this.camppaignName = camppaignName;
	}

	public int getDiscount() {
		return discount;
	}
	
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	@Override
	protected double spesificCampaignCalculation(Game game) {

		return (game.getPrice() * discount) / 100;
	}

}
