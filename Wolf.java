public class Wolf extends Canine {
	private String wolfSubspecies;
	private static final String speciesName = "Canis Lupis";

	public Wolf() {
		super();
		wolfSubspecies = "Eurasian Wolf";
	}

	public Wolf(boolean isWildIn, boolean floppyEarsIn, boolean hasSpotsIn, boolean isFriendlyIn, String speciesNameIn,
			boolean isWarmBloodedIn, boolean hasFurIn, boolean isTiredIn, int weightIn, String soundIn, String furColorIn,
			String wolfSubspeciesIn, boolean isHungryIn, boolean isPetIn) {

		super(isWildIn, floppyEarsIn, hasSpotsIn, isFriendlyIn, speciesNameIn, isWarmBloodedIn, hasFurIn, isTiredIn,
				weightIn, soundIn, furColorIn, isPetIn, isHungryIn);

		wolfSubspecies = wolfSubspeciesIn;
	}

	public String getWolfSubspecies() {
		return wolfSubspecies;
	}

	public String speed() {
		return "fast speed";
	}
}