package csce247project4;

/* Joseph O'Neill
 * CSCE 247
 * Project 4
 */
public class GroceryStore {
	
	/**
	 * Orders cereal by calling createCereal() and displaying the price
	 * @param type
	 * @return
	 */
	public Cereal orderCereal(String type) {
		Cereal cereal = createCereal(type);
		cereal.priceCereal();
		return cereal;
	}
	
	/**
	 * Takes in String type and creates the Cereal called
	 * @param type
	 * @return Cereal
	 */
	public Cereal createCereal(String type) {
		if (type.equals("frosted flakes")) {
			FrostedFlakes frostedFlakes = new FrostedFlakes();
			frostedFlakes.prepare();
			frostedFlakes.boxCereal();
			return frostedFlakes;
		}
		else if (type.equalsIgnoreCase("lucky charms")) {
			LuckyCharms luckyCharms = new LuckyCharms();
			luckyCharms.prepare();
			luckyCharms.boxCereal();
			return luckyCharms;
		}
		else if (type.equalsIgnoreCase("fruit loops")) {
			FruitLoops fruitLoops = new FruitLoops();
			fruitLoops.prepare();
			fruitLoops.boxCereal();
			return fruitLoops;
		}
		else {
			System.out.println("Error: That Cereal type does not exist.");
			return null;
		}
	}
	
}
