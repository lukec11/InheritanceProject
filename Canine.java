public class Canine extends Animal implements Comparable {
	private boolean hasSpots;
	private boolean floppyEars;
	private String furColor;
	private static final String speciesName = "Canine";

	public Canine() {
		super();

		floppyEars = true;
		hasSpots = true;
		furColor = "white";

	}

	public Canine(boolean isWildIn, boolean floppyEarsIn, boolean hasSpotsIn, boolean isFriendlyIn, String speciesNameIn,
			boolean isWarmBloodedIn, boolean hasFurIn, boolean isTiredIn, int weightIn, String soundIn, String furColorIn,
			boolean isPetIn, boolean isHungryIn) {

		super(isWarmBloodedIn, hasFurIn, isTiredIn, weightIn, soundIn, isHungryIn, isWildIn, isPetIn, isFriendlyIn);

		hasSpots = hasSpotsIn;
		floppyEars = floppyEarsIn;
		furColor = furColorIn;

	}

	public boolean getFloppyEars() {
		return floppyEars;
	}

	public boolean getHasSpots() {
		return hasSpots;
	}

	public String getFurColor() {
		return furColor;
	}

	public void setFloppyEars(boolean x) {
		floppyEars = x;
	}

	public void setHasSpots(boolean x) {
		hasSpots = x;
	}

	public void getFurColor(String x) {
		furColor = x;
	}

	public boolean equals(Animal animal) {
		if (valuesAreEqual(animal)) {
			return true;
		} else {
			return false;
		}
	}

	private boolean valuesAreEqual(Animal animal) {
		return (this.getIsHungry() == animal.getIsHungry() && this.getIsFriendly() == animal.getIsFriendly()
				&& this.getSound().equals(animal.getSound()) && this.getWeight() == animal.getWeight()
				&& this.getSpeciesName().equals(animal.getSpeciesName()));
	}

	public String speed() {
		return "Average canine speed";
	}
}