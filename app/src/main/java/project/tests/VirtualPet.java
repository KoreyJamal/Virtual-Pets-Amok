package project.tests;


import java.util.concurrent.ThreadLocalRandom;

public class VirtualPet {
  
  protected int health;
  protected String name;
  protected String description;
  
  

  // Constructors
  // public VirtualPet(String name, String description, int hunger, int thirst, int boredom, int tiredness, int waste) {
  //   this.name = name;
  //   this.description = description;
  //   this.hunger = 5;
  //   this.thirst = 5;
  //   this.boredom = 5;
  //   this.tiredness = 5;
  //   this.waste = 0;
  // }

  public VirtualPet(String name, String description){
    this.name = name;
    this.description = description;
    this.health = ThreadLocalRandom.current().nextInt(80, 100);
    


  }


  // Getters and Setters

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description){
    this.description = description;
  }

  public int getHealth(){
    return health;
  }

  


  public void play() {
    System.out.println(name + " had fun playing");
    health++;
  }

}

