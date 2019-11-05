public class Human extends Primate {
  private boolean hasFacialHair;
  private boolean isStudent;
  private String name;
  private static final String speciesName = "Canis lupus familiaris";

  public Human() {

    super();

    
    isStudent = true;
    hasFacialHair = false;
    name = "Joe";

    
  }

  public Human(boolean isWarmBloodedIn, boolean hasFurIn, boolean isTiredIn, int weightIn, String soundIn, boolean isHungryIn, boolean isWildIn, boolean isPetIn, boolean isFriendlyIn, boolean isBipedalIn, boolean canClimbIn, String foodEatenIn, boolean isStudentIn, boolean hasFacialHairIn, String nameIn) {

    super(isWarmBloodedIn, hasFurIn, isTiredIn,  weightIn, soundIn, isHungryIn, isWildIn,  isPetIn, isFriendlyIn, isBipedalIn,  canClimbIn, foodEatenIn);

    hasFacialHair = hasFacialHairIn;
    isStudent = isStudentIn;
    name = nameIn;
  }

  public boolean getHasFacialHair() {
    return hasFacialHair;
  }
  public boolean getIsStudent() {
    return isStudent;
  }
  public String getName() {
    return name;
  }
  public String getSpeciesName() {
    return speciesName;
  }

  public void setHasFacialHair(boolean x) {
    hasFacialHair = x;
  }
  public void setIsStudent(boolean x) {
    isStudent = x;
  }
  public void setName(String x) {
    name = x;
  }
  public String speed() {
		return "fast speed";
	}
}