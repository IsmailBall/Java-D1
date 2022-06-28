package Entities;

public class Game {

	private String name;
	private double price;
	private int ageLimit;
	
	public Game(String name, double price, int ageLimit) {
		super();
		this.name = name;
		this.price = price;
		this.ageLimit = ageLimit;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getAgeLimit() {
		return ageLimit;
	}
	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}
	
	
}
