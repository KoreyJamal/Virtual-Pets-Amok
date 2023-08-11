package project.tests;


import java.util.concurrent.ThreadLocalRandom;

public class OrganicVirtualPet extends VirtualPet{

  private int hunger;
  private int thirst;
  protected int boredom;
  protected int waste;
  private int tiredness;


public OrganicVirtualPet(String name, String description) {
    super(name, description);
    this.hunger = 70;
    this.thirst = 70;
    this.boredom = 70;
    this.waste = 70;
    this.tiredness = 70;
}

// Getters and setters
public int getHunger() {
    return hunger;
  }

  public void setHunger(int hunger) {
    this.hunger = hunger;
  }

  public int getThirst() {
    return thirst;
  }

  public void setThirst(int thirst) {
    this.thirst = thirst;
  }

  public int getBoredom() {
    return boredom;
  }

  public void setBoredom(int boredom) {
    this.boredom = boredom;
  }

  public int getWaste() {
    return waste;
  }

  public void setWaste(int waste) {
    this.waste = waste;
  }

  
  public int getTiredness() {
    return tiredness;
  }


  public void setTiredness(int tiredness) {
    this.tiredness = tiredness;
  }

  //Methods for organic pets
  public void feed(){
    tick();
    System.out.println("You fed " + getName());
    hunger+= 25;
    thirst-= 10;
    waste+= 10;
    
    hunger = Math.max(0, Math.min(100, hunger));
    thirst = Math.max(0, Math.min(100, thirst));
    waste = Math.max(0, Math.min(100, waste));
  }

  public void giveWater(){
    tick();
    thirst+= 25;
    waste+= 5;
    
    thirst = Math.max(0, Math.min(100, thirst));
    waste = Math.max(0, Math.min(100, waste));
  }

  public void play(){
    tick();
    System.out.println(getName() + " had fun playing");
    boredom+= 25;
    tiredness-= 15;
    
    boredom = Math.max(0, Math.min(100, boredom));
    tiredness = Math.max(0, Math.min(100, tiredness));
  }

  void useBathroom(){
    tick();
    waste = 0;
    
    waste = Math.max(0, Math.min(100, waste));
  }

  public void sleep(){
    tick();
    tiredness = 0;
    hunger-= 20;
    thirst-= 20;
    
    tiredness = Math.max(0, Math.min(100, tiredness));
    hunger= Math.max(0, Math.min(100, hunger));
    thirst = Math.max(0, Math.min(100, thirst));
  }

  public void tick(){
    hunger--;
    thirst--;
    boredom--;
    tiredness--;
    waste++;

  }

  public String toString(){
    return getName() + " - " + getDescription()+"\n"+ "Health: " + getHealth()+"\n"+ "Hunger: " + hunger+"\n"+ "Thirst: "+ thirst+"\n"+"Boredom: "+ boredom+"\n"+"Tiredness: "+ tiredness+"\n"+ "Waste: "+ waste;

  }
  
  public void displayStatus() {
    tick();
    System.out.println("Name of pet: "+ getName());
    System.out.println("Hunger: " + hunger);
    System.out.println("Thirst: " + thirst);
    System.out.println("Boredom: " + boredom);
    System.out.println("Tiredness: " + tiredness);
    System.out.println("Waste: " + waste);
  }
}
