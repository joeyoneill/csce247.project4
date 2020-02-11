package csce247project4;

public class Cereal {
	
	protected String name;
	protected double price;
	
	/**
	 * Displays preparation
	 */
	public void prepare() {
		System.out.println("Preparing the " + name);
	}
	
	/**
	 * Displays boxing of the cereal
	 */
	public void boxCereal() {
		System.out.println("Putting fun pictures of " + name + " on a box");
		System.out.println("Pouring the " + name + " into the box");
	}
	
	/**
	 * Displays pricing of the cereal
	 */
	public void priceCereal() {
		System.out.println("Putting price tags of $" + price + " on the " + name + " box");
	}
}
