package Virtual_pet;

public class VirtualPetTest {
  public static void main(String[] args) {


    OrganicDog dog = new OrganicDog("RealDog", "Full of spunk");
    OrganicCat cat = new OrganicCat("RealCat", "Full of hiss");
    System.out.println(dog);
    System.out.println("Hunger Level: " + dog.getHunger());
    System.out.println("=================================================================");
    System.out.println();
    RoboticDog roboDog = new RoboticDog("Charger", "Needs electricity");
    

    VirtualPet kitten = new OrganicCat("LuLu", "Beautiful cat with the most unique tail");
    
    
  }
}
