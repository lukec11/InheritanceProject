import java.util.Random;

class Main {
  public static void main(String[] args) {
    runner();
}

public static void runner() {
    
    

  //Dog methods
    Dog dogObj = new Dog();

    System.out.println("Properties of a Dog: \n");

    System.out.println("Is Warm Blooded: " + dogObj.getIsWarmBlooded());
    System.out.println("Does Have Fur: " + dogObj.getHasFur());
    System.out.println("Is Tired: " + dogObj.getIsTired());
    System.out.println("Is Hungry: " + dogObj.getIsHungry());
    System.out.println("Is Wild: " + dogObj.getIsWild());
    System.out.println("Is a Pet: " + dogObj.getIsPet());
    System.out.println("Is Friendly: " + dogObj.getIsFriendly());
    System.out.println("It's Weight: " + dogObj.getWeight());
    System.out.println("The Sound that it Makes: " + dogObj.getSound());

    System.out.println("Does it have Spots: " + dogObj.getHasSpots());
    System.out.println("Does it Have Floppy Ears: " + dogObj.getFloppyEars());
    System.out.println("The Fur Color of the It" + dogObj.getFurColor());

    System.out.println("The Dog Breed is: " + dogObj.getDogBreed());

    System.out.println("The Species Is: " + dogObj.getSpeciesName() + "\n\n");

    

  //Wolf Methods
    Wolf wolfObj = new Wolf();


    System.out.println("Properties of a Wolf: \n");

    System.out.println("Is Warm Blooded: " + wolfObj.getIsWarmBlooded());
    System.out.println("Does Have Fur: " + wolfObj.getHasFur());
    System.out.println("Is Tired: " + wolfObj.getIsTired());
    System.out.println("Is Hungry: " + wolfObj.getIsHungry());
    System.out.println("Is Wild: " + wolfObj.getIsWild());
    System.out.println("Is a Pet: " + wolfObj.getIsPet());
    System.out.println("Is Friendly: " + wolfObj.getIsFriendly());
    System.out.println("It's Weight: " + wolfObj.getWeight());
    System.out.println("The Sound that it Makes: " + wolfObj.getSound());

    System.out.println("Does it have Spots: " + wolfObj.getHasSpots());
    System.out.println("Does it Have Floppy Ears: " + wolfObj.getFloppyEars());
    System.out.println("The Fur Color of the It" + wolfObj.getFurColor());

    System.out.println("The Wolf Subspecies is: " + wolfObj.getWolfSubspecies());

    System.out.println("The Species Is: " + wolfObj.getSpeciesName() + "\n\n");
    
  //Human Methods
    Human humanObj = new Human();

    System.out.println("Properties of a Human: \n");

    System.out.println("Is Warm Blooded: " + humanObj.getIsWarmBlooded());
    System.out.println("Does Have Fur: " + humanObj.getHasFur());
    System.out.println("Is Tired: " + humanObj.getIsTired());
    System.out.println("Is Hungry: " + humanObj.getIsHungry());
    System.out.println("Is Wild: " + humanObj.getIsWild());
    System.out.println("Is a Pet: " + humanObj.getIsPet());
    System.out.println("Is Friendly: " + humanObj.getIsFriendly());
    System.out.println("It's Weight: " + humanObj.getWeight());
    System.out.println("The Sound that it Makes: " + humanObj.getSound());

    System.out.println("Is it Bipedal: " + humanObj.getIsBipedal());
    System.out.println("Can it Climb: " + humanObj.getCanClimb());
    System.out.println("The Food that it Eats: " + humanObj.getFoodEaten());

    System.out.println("Does the Human have Facial Hair: " + humanObj.getHasFacialHair());
    System.out.println("Is the Human a Student: " + humanObj.getIsStudent());
    System.out.println("The Human's Name: " + humanObj.getName());

    System.out.println("The Species Is: " + humanObj.getSpeciesName() + "\n\n");

  //Lowland Gorilla Methods
    LowlandGorilla lowlandGorillaObj = new LowlandGorilla();

    System.out.println("Properties of a Lowland Gorilla: \n");

    System.out.println("Is Warm Blooded: " + lowlandGorillaObj.getIsWarmBlooded());
    System.out.println("Does Have Fur: " + lowlandGorillaObj.getHasFur());
    System.out.println("Is Tired: " + lowlandGorillaObj.getIsTired());
    System.out.println("Is Hungry: " + lowlandGorillaObj.getIsHungry());
    System.out.println("Is Wild: " + lowlandGorillaObj.getIsWild());
    System.out.println("Is a Pet: " + lowlandGorillaObj.getIsPet());
    System.out.println("Is Friendly: " + lowlandGorillaObj.getIsFriendly());
    System.out.println("It's Weight: " + lowlandGorillaObj.getWeight());
    System.out.println("The Sound that it Makes: " + lowlandGorillaObj.getSound());

    System.out.println("Is it Bipedal: " + lowlandGorillaObj.getIsBipedal());
    System.out.println("Can it Climb: " + lowlandGorillaObj.getCanClimb());
    System.out.println("The Food that it Eats: " + lowlandGorillaObj.getFoodEaten());

    System.out.println("Is it Dangerous: " + lowlandGorillaObj.getIsDangerous());
    System.out.println("Is it a Silverback Gorilla: " + lowlandGorillaObj.getIsSilverBack());
    System.out.println("Does it Live in the Rainforest: " + lowlandGorillaObj.getLivesInRainforest());

    System.out.println("The Species Is: " + lowlandGorillaObj.getSpeciesName() + "\n\n");
  //Mountain Gorilla Methods
    MountainGorilla mountainGorillaObj = new MountainGorilla();

    System.out.println("Properties of a Mountain Gorilla: \n");

    System.out.println("Is Warm Blooded: " + mountainGorillaObj.getIsWarmBlooded());
    System.out.println("Does Have Fur: " + mountainGorillaObj.getHasFur());
    System.out.println("Is Tired: " + mountainGorillaObj.getIsTired());
    System.out.println("Is Hungry: " + mountainGorillaObj.getIsHungry());
    System.out.println("Is Wild: " + mountainGorillaObj.getIsWild());
    System.out.println("Is a Pet: " + mountainGorillaObj.getIsPet());
    System.out.println("Is Friendly: " + mountainGorillaObj.getIsFriendly());
    System.out.println("It's Weight: " + mountainGorillaObj.getWeight());
    System.out.println("The Sound that it Makes: " + mountainGorillaObj.getSound());

    System.out.println("Is it Bipedal: " + mountainGorillaObj.getIsBipedal());
    System.out.println("Can it Climb: " + mountainGorillaObj.getCanClimb());
    System.out.println("The Food that it Eats: " + mountainGorillaObj.getFoodEaten());

    System.out.println("Is it Dangerous: " + mountainGorillaObj.getIsDangerous());
    System.out.println("Is it a Silverback Gorilla: " + mountainGorillaObj.getIsSilverBack());
    System.out.println("Does it Live in the Mountains: " + mountainGorillaObj.getLivesInMountains());

    System.out.println("The Species Is: " + mountainGorillaObj.getSpeciesName() + "\n\n");
  //Feline Methods
    Feline felineObj = new Feline();

    System.out.println("Properties of a Feline: \n");

    System.out.println("Is Warm Blooded: " + felineObj.getIsWarmBlooded());
    System.out.println("Does Have Fur: " + felineObj.getHasFur());
    System.out.println("Is Tired: " + felineObj.getIsTired());
    System.out.println("Is Hungry: " + felineObj.getIsHungry());
    System.out.println("Is Wild: " + felineObj.getIsWild());
    System.out.println("Is a Pet: " + felineObj.getIsPet());
    System.out.println("Is Friendly: " + felineObj.getIsFriendly());
    System.out.println("It's Weight: " + felineObj.getWeight());
    System.out.println("The Sound that it Makes: " + felineObj.getSound());

    System.out.println("Is it a Big Cat: " + felineObj.getIsBigCat());
    System.out.println("Is it Hairless: " + felineObj.getIsHairless());
    System.out.println("It's Fur Color: " + felineObj.getFurColor());

    System.out.println("The Species Is: " + felineObj.getSpeciesName() + "\n\n");

  //aliasing Canine to C

  Canine C = new Canine(); //aliases Canine to C

  
  Canine newCanineFromWolf = (Canine) wolfObj; //calls Canine via alias C
  //Feline -> Animal Polymorphism
  
  System.out.println("Is the Polymorph Canine -> Wolf hungry: " + newCanineFromWolf.getIsHungry());


  Object[] objArray = new Object[]{dogObj, humanObj, lowlandGorillaObj, mountainGorillaObj, felineObj};

  MountainGorilla[] mountainGorillaObjArray = new MountainGorilla[]{new MountainGorilla(), new MountainGorilla(), new MountainGorilla(), new MountainGorilla(), new MountainGorilla()};

Random random = new Random(); //initializes randomizer
for (MountainGorilla obj: mountainGorillaObjArray) {
  obj.setIsHungry(random.nextBoolean()); //sets isHungry value to random boolean
}


System.out.print(dogObj.toString());

}
}