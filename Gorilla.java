public abstract class Gorilla extends Primate {
  private boolean isCaptive;
  private static final String speciesName = "Gorilla";
  private String gorillaSubSpecies = "Gorilla gorilla"; //scientific name 

  public Gorilla() {

    super();

    
    isCaptive = true;

    
  }

  public Gorilla(boolean isWarmBloodedIn, boolean hasFurIn, boolean isTiredIn, int weightIn, String soundIn, boolean isHungryIn, boolean isWildIn, boolean isPetIn, boolean isFriendlyIn, boolean isBipedalIn, boolean canClimbIn, String foodEatenIn, boolean isCaptiveIn, String gorillaSubspeciesIn) {

    super(isWarmBloodedIn, hasFurIn, isTiredIn,  weightIn, soundIn,  isHungryIn, isWildIn, isPetIn, isFriendlyIn, isBipedalIn,  canClimbIn, foodEatenIn);
    gorillaSubSpecies = gorillaSubspeciesIn;
    isCaptive = isCaptiveIn;
  }
  
}