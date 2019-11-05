public abstract class Animal implements Comparable {
	private boolean isWarmBlooded;
	private boolean hasFur;
	private boolean isTired;
	private boolean isHungry;
	private boolean isWild;
	private boolean isPet;
	private boolean isFriendly;
	private int weight;
	private String sound;
  private static String speciesName = "Animal";

	public Animal() {
		isWarmBlooded = true;
		hasFur = true;
		isTired = true;
		weight = 0;
		sound = "AnimalSound!";
		isHungry = false;
		isWild = true;
		isPet = false;
		isFriendly = false;
	}

	public Animal(boolean isWarmBloodedIn, boolean hasFurIn, boolean isTiredIn, int weightIn, String soundIn,
			boolean isHungryIn, boolean isWildIn, boolean isPetIn, boolean isFriendlyIn) {

		isWarmBlooded = isWarmBloodedIn;
		hasFur = hasFurIn;
		isTired = isTiredIn;
		weight = weightIn;
		sound = soundIn;
		isHungry = isHungryIn;
		isWild = isWildIn;
		isPet = isPetIn;
		isFriendly = isFriendlyIn;
	}

	public boolean getIsWarmBlooded() {
		return isWarmBlooded;
	}

	public boolean getHasFur() {
		return hasFur;
	}

	public boolean getIsTired() {
		return isTired;
	}

	public boolean getIsHungry() {
		return isHungry;
	}

	public boolean getIsWild() {
		return isWild;
	}
  public String getSpeciesName() {
    return speciesName;
  }

	public boolean getIsFriendly() {
		return isFriendly;
	}

	public boolean getIsPet() {
		return isPet;
	}

	public int getWeight() {
		return weight;
	}

	public String getSound() {
		return sound;
	}

	public void setIsWarmBlooded(boolean x) {
		isWarmBlooded = x;
	}

	public void setHasFur(boolean x) {
		hasFur = x;
	}

	public void setIsTired(boolean x) {
		isTired = x;
	}

	public void setIsHungry(boolean x) {
		isHungry = x;
	}

	public void setIsFriendly(boolean x) {
		isFriendly = x;
	}

	public void setIsPet(boolean x) {
		isPet = x;
	}

	public void setIsWild(boolean x) {
		isWild = x;
	}

	public void setWeight(int x) {
		weight = x;
	}

	public void setSound(String x) {
		sound = x;
	}

  public void setSpeciesName(String x) {
    speciesName = x;
  }

}