import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import project.tests.OrganicVirtualPet;

public class OrganicPetsTests {

    // Test feed method 
  @Test
  
  public void feedMethodTest(){
    OrganicVirtualPet pet = new OrganicVirtualPet(" Max", "Even tempered and loves his squeaky toy");
    pet.feed();
    assertEquals(94, pet.getHunger()); // built in tick method also adds 1
    assertEquals(59, pet.getThirst()); // built in tick method also adds 1
    System.out.println(pet.getHunger());
  }

  @Test
  public void thirstMethodTest(){
    OrganicVirtualPet pet = new OrganicVirtualPet(" Chloe", "Young cat with multicolored fur");
    pet.giveWater();
    assertEquals(94, pet.getThirst()); // built in tick method also adds 1
  }

  @Test
  public void sleepMethodTest(){
    OrganicVirtualPet pet = new OrganicVirtualPet("Bega", "Very chill Lizard who loves to bask under his lamp");
    pet.sleep();
    assertEquals(0, pet.getTiredness());
  }

  
}

