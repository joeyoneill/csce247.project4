package csce247project4;

public class LuckyCharms extends Cereal {

	/**
	 * Default constructor
	 */
	public LuckyCharms() {
		this.name = "Lucky Charms";
		this.price = 1.55;
	}
	
	/**
	 * Displays the preperation of the cereal
	 */
	@Override
	public void prepare() {
		super.prepare();
		System.out.println("    - Gather the grain");
		System.out.println("    - Shape into circles");
		System.out.println("    - Create marshmellow shapes");
		System.out.println("    - Mix circles and marshmellows");
	}
}
