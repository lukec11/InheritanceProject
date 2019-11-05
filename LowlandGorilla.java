public class LowlandGorilla extends Gorilla implements Dangerable {
  private boolean isDangerous;
  private boolean isSilverBack;
  private boolean livesInRainforest;
  private static final String speciesName = "Lowland Gorilla";

  public LowlandGorilla() {

    super();

    
    isSilverBack = false;
    livesInRainforest = true;

    
  }

  public LowlandGorilla(boolean isWarmBloodedIn, boolean hasFurIn, boolean isTiredIn, int weightIn, String soundIn, boolean isHungryIn, boolean isWildIn, boolean isPetIn, boolean isFriendlyIn, boolean isBipedalIn, boolean canClimbIn, String foodEatenIn, boolean isCaptiveIn, String gorillaSubspeciesIn, boolean isSilverBackIn, boolean livesInRainforestIn) {
    
    super(isWarmBloodedIn, hasFurIn, isTiredIn, weightIn, soundIn, isHungryIn, isWildIn, false, isFriendlyIn, isBipedalIn, canClimbIn, foodEatenIn, isCaptiveIn, gorillaSubspeciesIn);

    isSilverBack = isSilverBackIn;
    livesInRainforest = livesInRainforestIn;
    isDangerous = true;
  }

  public boolean getIsSilverBack() {
    return isSilverBack;
  }
  public boolean getIsDangerous() {
    return isDangerous;
  }
  public boolean getLivesInRainforest() {
    return livesInRainforest;
  }

  public void setIsSilverBack(boolean x) {
    isSilverBack = x;
  }
  public void setIsDangerous(boolean x) {
    isDangerous = x;
  }
  public void setLivesInRainforest(boolean x) {
    livesInRainforest = x;
  }
}