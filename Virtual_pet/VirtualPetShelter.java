package Virtual_pet;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class VirtualPetShelter {
  
  private Map<String, VirtualPet> pets = new HashMap<>();

  private  int shelterLitterBox = ThreadLocalRandom.current().nextInt(50, 80);


  public int getShelterLitterBox() {
    return shelterLitterBox;
  }

  // Method to clean the litterbox
  public void cleanLitterBox(){
    System.out.println("Thank you for cleaning the shelter's litter box. The cats thank you.");
    tickAllPets();
    shelterLitterBox = 0;
  }

  // Method to clean all the dog cages
  public void cleanDogCages(){
    for (VirtualPet cleanPetCage : showAllPets()){
      if (cleanPetCage instanceof OrganicDog){
        ((OrganicDog)cleanPetCage).cleanCage();
      }
    }
    System.out.println("All of the Organic Dog cages are now spotless.");
    tickAllPets();
  }

  // Return a *Collection* pets in shelter
  public Collection<VirtualPet>showAllPets(){
    return pets.values();
  }

  // Return a specific VirtualPet given its name
  public VirtualPet getName(String name){
    return pets.get(name);
  }

  public void receivePetNames(){
    for (VirtualPet pet : pets.values()){
      System.out.println(pet.getName());
    }
  }

  // Check if pet is in shelter
  public boolean isPetAvailable(String petName){
    return pets.containsKey(petName);
  }

  // Allow intake of a homeless pet (adding a pet to the shelter)
  public void intakePet(VirtualPet takePet){
    pets.put(takePet.getName(), takePet);
  }

  // Allow adoption of a homeless pet (Removing a pet from the shelter)
  public void adoptedPet(String name){
    pets.remove(name);
  }

  // Feed all of the pets in the shelter
  public void feedAllPets(){
    for (VirtualPet hungryPet : showAllPets()){
      if (hungryPet instanceof OrganicVirtualPet){
        ((OrganicVirtualPet)hungryPet).feed();
      }
    }
    System.out.println("All the organic animals have food. Thank you.");
    tickAllPets();
  }

  // Water all of the pets in the shelter
  public void giveAllPetsWater(){
    for (VirtualPet thirstyPet : showAllPets()){
      if (thirstyPet instanceof OrganicVirtualPet){
        ((OrganicVirtualPet)thirstyPet).giveWater();
      }
    }
    System.out.println("All the Organic animals now have water. Thank you.");
    tickAllPets();
  }

  // Plays (or performs some other interaction(s)) with an individual pet in the shelter
  public void playWithOnePet(String petName){
    pets.get(petName).play();
    tickAllPets();
  }

  // Takes all pets to use bathroom
  public void takeAllPetToBathroom(){
    for (VirtualPet poopyPet : showAllPets()){
      if (poopyPet instanceof OrganicVirtualPet){
        ((OrganicVirtualPet)poopyPet).useBathroom();
      }
    }
    System.out.println("All the animals have relieved themselves.");
    tickAllPets();
  }

  // Method to have pets take a nap
  public void allPetsTakeNap(){
    for (VirtualPet thirstyPet : showAllPets()){
      if (thirstyPet instanceof OrganicVirtualPet){
        ((OrganicVirtualPet)thirstyPet).sleep();
      }
    }
    System.out.println("All the Animals are now tucked away sleeping.");
    tickAllPets();
  }

  // Oil Robotic Pets method
  public void oilRoboticPets(){
    for (VirtualPet oilPet : showAllPets()){
      if (oilPet instanceof RoboticPet){
        ((RoboticPet)oilPet).addOil();
      }
    }
    System.out.println("All the Robotic animals have been oiled. Thank you.");
    tickAllPets();
  }

  // Charge Robotic Pets method
  public void chargeRoboticPets(){
    for (VirtualPet chargePet : showAllPets()){
      if (chargePet instanceof RoboticPet){
        ((RoboticPet)chargePet).chargeBattery();
      }
    }
    System.out.println("All the Robotic animals batteries have been charged. Thank you.");
    tickAllPets();
  }

  // Walk all dogs Method
  public void walkDogs(){
    for (VirtualPet walkDog : showAllPets()){
      if (walkDog instanceof RoboticDog){
        ((RoboticDog)walkDog).walk();
      }
      if (walkDog instanceof OrganicDog){
        ((OrganicDog)walkDog).walk();
      }
    }
    System.out.println("You've taken all the dogs for a walk");
    tickAllPets();
  }

  // Include a tick method that calls the tick method for each of the pets in the shelter
  // updting their needs
  public void tickAllPets(){
    for (VirtualPet pet : showAllPets()){
      if (pet instanceof OrganicVirtualPet){
        ((OrganicVirtualPet)pet).tick();
      }
      if (pet instanceof RoboticPet){
        ((RoboticPet)pet).tick();
      }
      if (pet instanceof OrganicDog){
        ((OrganicDog)pet).cageWasteTick();
      }
    }
    shelterLitterBox+= ThreadLocalRandom.current().nextInt(1, 10);
  }

  public void getNameAndDescription(){
    for (VirtualPet pet : showAllPets()){
      if (pet instanceof OrganicDog){
        System.out.println(pet.getName().toUpperCase() + " - " + pet.getDescription()+"\n"+ "\n"+ "Health: "+ ((OrganicDog) pet).getHealth()+"\n" + "Hunger: "+ ((OrganicDog) pet).getHunger()+"\n"+ "Thirst: " + ((OrganicDog) pet).getThirst()+
      "\n"+ "Boredom: "+ ((OrganicDog) pet).getBoredom()+"\n"+ "Tiredness: " + ((OrganicDog) pet).getTiredness()+"\n"+ "Waste: " + ((OrganicDog) pet).getWaste()+"\n" + "Cage mess Level " + ((OrganicDog) pet).getCageMessLvl()
      + "\n" + "========================================================================================================================");
      System.out.println();
      }
      if (pet instanceof OrganicCat){
        System.out.println(pet.getName().toUpperCase() + " - " + pet.getDescription()+"\n"+ "\n"+ "Health: "+ ((OrganicCat) pet).getHealth()+"\n" + "Hunger: "+ ((OrganicCat) pet).getHunger()+"\n"+ "Thirst: " + ((OrganicCat) pet).getThirst()+
      "\n"+ "Boredom: "+ ((OrganicCat) pet).getBoredom()+"\n"+ "Tiredness: " + ((OrganicCat) pet).getTiredness()+"\n"+ "Waste: " + ((OrganicCat) pet).getWaste()
      + "\n" + "========================================================================================================================");
      System.out.println();
      }
      if (pet instanceof RoboticPet){
        System.out.println(pet.getName().toUpperCase() + " " + pet.getDescription()+"\n"+ "\n"+ "Oil Level: "+ ((RoboticPet) pet).getOilLevel()+"\n"+ "Battery Level: " + ((RoboticPet) pet).getBatterLevel()
      + "\n" + "========================================================================================================================");
      System.out.println();
      }
    }
  }
}
