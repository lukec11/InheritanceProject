public abstract class Primate extends Animal {
  private boolean isBipedal;
  private boolean canClimb;  
  private String foodEaten;
  private static final String speciesName = "Primate";


  public Primate() {
    super();

    isBipedal = true;
    canClimb = true;
    foodEaten = "Omnivore";
    
    
  }

  public Primate(boolean isWarmBloodedIn, boolean hasFurIn, boolean isTiredIn, int weightIn, String soundIn, boolean isHungryIn, boolean isWildIn, boolean isPetIn, boolean isFriendlyIn, boolean isBipedalIn, boolean canClimbIn, String foodEatenIn) {

    super(isWarmBloodedIn, hasFurIn, isTiredIn, weightIn, soundIn, isHungryIn, isWildIn, isPetIn, isFriendlyIn);

    
    isBipedal = isBipedalIn;
    canClimb = canClimbIn;
    foodEaten = foodEatenIn;
    

  }

  
  public boolean getCanClimb() {
    return canClimb;
  }
  public boolean getIsBipedal() {
    return isBipedal;
  }
  public String getFoodEaten() {
    return foodEaten;
  }

  public void setCanClimb(boolean x) {
    canClimb = x;
  }
  public void setIsBipedal(boolean x) {
    isBipedal = x;
  }
  public void getFoodEaten(String x) {
    foodEaten = x;
  }

}