package Virtual_pet;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class VirtualPetShelterApp {
  public static void main(String[] args) {

    // Starting pets in the shelter
    OrganicCat pet1 = new OrganicCat("Jackson", "He is an older, cuddly cat with golden fur and yellow eyes.");
    OrganicDog pet2 = new OrganicDog("Oliver", "He is a young cat with bronze and gold fur and green eyes.");
    RoboticDog pet3 = new RoboticDog("Sammy", "He is a 7 year old bearded dragon who loves to bask in the sun.");
    OrganicCat pet4 = new OrganicCat("Bega", "He is the younger sibling of Sammy, but is larger and loves mealworms.");
    OrganicDog pet5 = new OrganicDog("Blue", "He is a younger cat with blueish grey fur and prefers all doors opened.");

    // Initializing my shelter
    VirtualPetShelter myShelter = new VirtualPetShelter();

    // Put the pets in the shelter
    myShelter.intakePet(pet1);
    myShelter.intakePet(pet2);
    myShelter.intakePet(pet3);
    myShelter.intakePet(pet4);
    myShelter.intakePet(pet5);

    // Implement a game loop.
    int choice = 0;
    // User options
    while (choice != 13) {
      System.out.println();
      welcomeMessage();
      System.out.println();
      System.out.println("Shelter LitterBox Level: " + myShelter.getShelterLitterBox());
      System.out.println();
      myShelter.getNameAndDescription();

      System.out.println("--------------------------------------------------");
      System.out.println();

      // User interaction screen
      System.out.println("How would you like to interact with the pets?");
      System.out.println("1. Feed the pets");
      System.out.println("2. Give the pets fresh water");
      System.out.println("3. Play with a individual pet");
      System.out.println("4. Take pets out to use bathroom");
      System.out.println("5. Pets take a nap");
      System.out.println("6. Adopt a pet");
      System.out.println("7. Add a new pet ");
      System.out.println("8. Oil robotic pets");
      System.out.println("9. Charge robotic pets");
      System.out.println("10. Walk all dogs");
      System.out.println("11. Clean Shelter litterbox.");
      System.out.println("12. Clean the dog cages");
      System.out.println("13. Leave the shelter");
      System.out.print("Which do you choose: ");

      // Asks for user petInfo.
      Scanner petInfo = new Scanner(System.in);
      choice = petInfo.nextInt();

      switch (choice) {
        case 1:
          myShelter.feedAllPets();
          break;
        case 2:
          myShelter.giveAllPetsWater();
          break;
        case 3:
          System.out.println("List of pets available");
          System.out.println("Please choose a pet to play with: ");
          myShelter.receivePetNames();
          String chosenPet = petInfo.next();
          if (myShelter.isPetAvailable(chosenPet)) {
            myShelter.playWithOnePet(chosenPet);
          } else {
            System.out.println("Please choose from selected names: ");
          }
          break;
        case 4:
          myShelter.takeAllPetToBathroom();
          break;
        case 5:
          myShelter.allPetsTakeNap();
          break;
        case 6:
          adoptPet(petInfo, myShelter);
          break;
        case 7:
          addPet(petInfo, myShelter);
          break;
        case 8:
          myShelter.oilRoboticPets();
          break;
        case 9:
          myShelter.chargeRoboticPets();
          break;
        case 10:
          myShelter.walkDogs();
          break;
        case 11:
          myShelter.cleanLitterBox();
          break;
        case 12:
          myShelter.cleanDogCages();
          break;
        case 13:
          petInfo.close();
        default:
          System.out.println("Invalid choice please choose from listed options");
          break;
      }
    }
    System.out.println("Thank you for visiting our VirtualPet Shelter.");
    System.out.println("Have a nice day");
  }

  private static void welcomeMessage() {
    System.out.println("                     Welcome to our VirtualPet Shelter");
    System.out.println("                           ---CURRENT PETS---");
    System.out
        .println("---------------------------------------------------------------------------------------------------");
  }

  private static void addPet(Scanner petInfo, VirtualPetShelter myShelter) {
    String petName;
    String petDescription;
    int petType;

    petInfo.nextLine();
    System.out.println("Looking to add a new pet, great! What is the pet name?  ");
    try {
      petName = petInfo.nextLine();

      System.out.println("Please give a short description of " + petName);
      petDescription = petInfo.nextLine();

      System.out.println("What is the type of animal you would like to add.");
      System.out.println("1. Organic Dog");
      System.out.println("2. Organic Cat");
      System.out.println("3. Robotic Dog");
      System.out.println("4. Robotic Cat");

      petType = petInfo.nextInt();
      petInfo.nextLine();
      switch (petType) {
        case 1:
          myShelter.intakePet(new OrganicDog(petName, petDescription));
          System.out.println(petName + " added. We'll take great care of " + petName);
          break;
        case 2:
          myShelter.intakePet(new OrganicCat(petName, petDescription));
          System.out.println(petName + " added. We'll take great care of " + petName);
          break;
        case 3:
          myShelter.intakePet(new RoboticDog(petName, petDescription));
          System.out.println(petName + " added. We'll take great care of " + petName);
          break;
        case 4:
          myShelter.intakePet(new RoboticCat(petName, petDescription));
          System.out.println(petName + " added. We'll take great care of " + petName);
          break;
        default:
          System.out.println("Invalid Pet Type");
          break;
      }
    } catch (NoSuchElementException e) {
      System.out.println("Error: Missing input. Please provide valid input");
    }
  }

  private static void adoptPet(Scanner petInfo, VirtualPetShelter myShelter) {
    String petName;
    petInfo.nextLine();
    myShelter.receivePetNames();
    System.out.println("Which animal would you like to adopt today: ");
    petName = petInfo.nextLine();
    if (petName.equalsIgnoreCase(petName)) {
      System.out.println(petName + " was just adopted. You'll absolutely love your new pet.");
      myShelter.adoptedPet(petName);
    } else {
      System.out.println("Please choose from available pets.");
    }
  }
}
