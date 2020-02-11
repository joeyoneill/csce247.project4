package csce247project4;

public class FrostedFlakes extends Cereal {
	
	/**
	 * Default constructor
	 */
	public FrostedFlakes() {
		this.name = "Frosted Flakes";
		this.price = 2.99;
	}
	
	/**
	 * Displays the preperation of the cereal
	 */
	@Override
	public void prepare() {
		super.prepare();
		System.out.println("    - Gather the grain");
		System.out.println("    - Shape into flakes");
		System.out.println("    - Sprinkle with frosting");
	}
}
