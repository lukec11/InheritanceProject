public class MountainGorilla extends Gorilla implements Dangerable {
  private boolean isDangerous = true;
  private boolean isSilverBack;
  private boolean livesInMountains;
  private static final String speciesName = "Mountain Gorilla";

  public MountainGorilla() {

    super();

    
    isSilverBack = false;
    livesInMountains = true;

    
  }

  public MountainGorilla(boolean isWarmBloodedIn, boolean hasFurIn, boolean isTiredIn, int weightIn, String soundIn, boolean isHungryIn, boolean isWildIn, boolean isPetIn, boolean isFriendlyIn, boolean isBipedalIn, boolean canClimbIn, String foodEatenIn, boolean isCaptiveIn, String gorillaSubspeciesIn, boolean isSilverBackIn, boolean livesInMountainsIn) {
    
    super(isWarmBloodedIn, hasFurIn, isTiredIn, weightIn, soundIn, isHungryIn, isWildIn, isPetIn, isFriendlyIn, isBipedalIn, canClimbIn, foodEatenIn, isCaptiveIn, gorillaSubspeciesIn);

    isSilverBack = isSilverBackIn;
    livesInMountains = livesInMountainsIn;
  }

  public boolean getIsDangerous() {
    return isDangerous;
  }
  public boolean getIsSilverBack() {
    return isSilverBack;
  }
  public boolean getLivesInMountains() {
    return livesInMountains;
  }
  public boolean getCanClimb() {
    return true;
  }
  public String getSpeciesName() {
    return speciesName;
  }

  public void setIsDangerous(boolean x) {
    isDangerous = x;
  }
  public void setIsSilverBack(boolean x) {
    isSilverBack = x;
  }
  public void setLivesInMountains(boolean x) {
    livesInMountains = x;
  }
	public String speed() {
		return "slow speed";
	}
}