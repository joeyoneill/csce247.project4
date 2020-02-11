package csce247project4;

public class FruitLoops extends Cereal {

	/**
	 * Default constructor
	 */
	public FruitLoops() {
		this.name = "Fruit Loops";
		this.price = 1.89;
	}
	
	/**
	 * Displays the preperation of the cereal
	 */
	@Override
	public void prepare() {
		super.prepare();
		System.out.println("    - Gather the grain");
		System.out.println("    - Shape into circles");
		System.out.println("    - Randomly color circles");
		System.out.println("    - Let circles dry");
	}
}
