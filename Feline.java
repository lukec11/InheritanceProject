public class Feline extends Animal implements Comparable {
	private boolean isBigCat;
	private boolean isHairless;
	private String furColor;
	private static final String speciesName = "Feline";

	public Feline() {
		super();

		isHairless = true;
		isBigCat = true;
		furColor = "white";

	}

	public Feline(boolean isWildIn, boolean isHairlessIn, boolean isBigCatIn, boolean isFriendlyIn, String speciesNameIn,
			boolean isWarmBloodedIn, boolean hasFurIn, boolean isTiredIn, int weightIn, String soundIn, String furColorIn,
			boolean isPetIn, boolean isHungryIn) {

		super(isWarmBloodedIn, hasFurIn, isTiredIn, weightIn, soundIn, isHungryIn, isWildIn, isPetIn, isFriendlyIn);

		isBigCat = isBigCatIn;
		isHairless = isHairlessIn;
		furColor = furColorIn;

	}

	public boolean getIsHairless() {
		return isHairless;
	}

	public boolean getIsBigCat() {
		return isBigCat;
	}

	public String getFurColor() {
		return furColor;
	}

	public String getSpeciesName(String x) {
		return speciesName;
	}

	public void setIsHairless(boolean x) {
		isHairless = x;
	}

	public void setIsBigCat(boolean x) {
		isBigCat = x;
	}

	public void setFurColor(String x) {
		furColor = x;
	}

	public boolean equals(Animal animal) {
		if (this.getIsHungry() == animal.getIsHungry() && this.getIsFriendly() == animal.getIsFriendly()
				&& this.getSound().equals(animal.getSound()) && this.getWeight() == animal.getWeight()) {
			return true;
		}
		return false;
	}

	public String speed() {
		return "slow speed";
	}

}