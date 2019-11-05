public class Dog extends Canine {
  private String dogBreed;
  private static final String speciesName = "Canis lupus familiaris";

  public Dog() {

    super();

    
    dogBreed = "Mixed Breed";

    
  }

  public Dog(boolean isWildIn, boolean floppyEarsIn, boolean hasSpotsIn, boolean isFriendlyIn, String speciesNameIn, boolean isWarmBloodedIn, boolean hasFurIn, boolean isTiredIn, int weightIn, String soundIn, boolean isPetIn, String dogBreedIn, String furColorIn, boolean isHungryIn) {

    super(isWildIn, floppyEarsIn, hasSpotsIn, isFriendlyIn, speciesNameIn, isWarmBloodedIn, hasFurIn, isTiredIn, weightIn, soundIn, furColorIn, isPetIn, isHungryIn);

    dogBreed = dogBreedIn;
  }

  public String toString() {
    String x = "Is the Dog Wild:" + getIsWild() + "\nDoes the Dog have floppy ears:" +  getFloppyEars() + "\nDoes the Dog have spots:" +  getHasSpots() + "\nIs the Dog friendly:" +  getIsFriendly() + "\nThe name of the Dog:" +  speciesName + "\nIs the Dog warm blooded:" +  getIsWarmBlooded() + "\nDoes the Dog have fur:" +  getHasFur() + "\nIs the Dog tired:" +  getIsTired() + "\nWhat is the weight of the Dog:" +  getWeight() + "\nWhat sound does the Dog make:" +  getSound() + "\nIs the dog a pet:" +  getIsPet() + "\nWhat breed is the Dog:" +  dogBreed + "\nWhat color is the Dog's fur:" +  getFurColor() + "\nIs the Dog Hungry:" +  getIsHungry();
    return x;
  }

  public String getDogBreed() {
    return dogBreed;
  }
  public String getSpeciesName() {
    return speciesName;
  }

  public void setDogBreed(String x) {
    dogBreed = x;
  }
  
}