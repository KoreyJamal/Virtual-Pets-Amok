package Virtual_pet;


import java.util.concurrent.ThreadLocalRandom;

public class OrganicVirtualPet extends VirtualPet{

  protected int health;
  private int hunger;
  private int thirst;
  protected int boredom;
  protected int waste;
  private int tiredness;


public OrganicVirtualPet(String name, String description) {
    super(name, description);
    this.health = ThreadLocalRandom.current().nextInt(50, 80);
    this.hunger = ThreadLocalRandom.current().nextInt(50, 80);
    this.thirst = ThreadLocalRandom.current().nextInt(50, 80);
    this.boredom = ThreadLocalRandom.current().nextInt(50, 80);
    this.waste = ThreadLocalRandom.current().nextInt(50, 80);
    this.tiredness = ThreadLocalRandom.current().nextInt(50, 80);
}

// Getters and setters
public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }


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
    health+= 5;
    hunger+= 15;
    thirst-= 10;
    waste+= 10;

    health = Math.max(0, Math.min(100, health));
    hunger = Math.max(0, Math.min(100, hunger));
    thirst = Math.max(0, Math.min(100, thirst));
    waste = Math.max(0, Math.min(100, waste));
  }

  public void giveWater(){
    tick();
    health+= 20;
    thirst+= 15;
    waste+= 5;

    health = Math.max(0, Math.min(100, health));
    thirst = Math.max(0, Math.min(100, thirst));
    waste = Math.max(0, Math.min(100, waste));
  }

  public void play(){
    tick();
    System.out.println(getName() + " had fun playing");
    health+= 15;
    boredom+= 15;
    tiredness-= 15;

    health = Math.max(0, Math.min(100, health));
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
    health+= 10;
    tiredness = 100;
    hunger-= 20;
    thirst-= 20;
    waste += 30;
    
    health = Math.max(0, Math.min(100, health));
    tiredness = Math.max(0, Math.min(100, tiredness));
    hunger = Math.max(0, Math.min(100, hunger));
    thirst = Math.max(0, Math.min(100, thirst));
    waste = Math.max(0, Math.min(100, waste));
  }

  public void tick(){
    health-= ThreadLocalRandom.current().nextInt(1, 5);
    hunger-= ThreadLocalRandom.current().nextInt(1, 5);
    thirst-= ThreadLocalRandom.current().nextInt(1, 5);
    boredom-= ThreadLocalRandom.current().nextInt(1, 5);
    tiredness-= ThreadLocalRandom.current().nextInt(1, 5);
    waste+= ThreadLocalRandom.current().nextInt(1, 5);


    health = Math.max(0, Math.min(100, health));
    tiredness = Math.max(0, Math.min(100, tiredness));
    hunger = Math.max(0, Math.min(100, hunger));
    thirst = Math.max(0, Math.min(100, thirst));
    boredom = Math.max(0, Math.min(100, boredom));
    waste = Math.max(0, Math.min(100, waste));
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
