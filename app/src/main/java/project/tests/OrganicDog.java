package project.tests;


import java.util.concurrent.ThreadLocalRandom;

public class OrganicDog extends OrganicVirtualPet{

    private int cageMessLvl;

    

    public OrganicDog(String name, String description) {
        super(name, description);
        this.cageMessLvl = ThreadLocalRandom.current().nextInt(5, 20);
        
    }

    public int getCageMessLvl() {
        return cageMessLvl;
    }



    public void cleanCage(){
        cageMessLvl= 0;
        cageMessLvl = Math.max(0, Math.min(100, cageMessLvl));
    }

    public void walk(){
        tick();
        System.out.println("You took " + name + " for a walk");
        health+= 10;
        boredom+= 15;
        waste = 0;

        health = Math.max(0, Math.min(100, health));
        boredom = Math.max(0, Math.min(100, boredom));
        waste = Math.max(0, Math.min(100, waste));
    }

    public void cageWasteTick(){
        cageMessLvl+= ThreadLocalRandom.current().nextInt(1, 5);
        cageMessLvl = Math.max(0, Math.min(100, cageMessLvl));
    }

    public String toString(){
        return getName() + " - " + getDescription()+"\n"+ "Health: " + getHealth()+"\n"+ "Hunger: " + getHunger()+"\n"+ "Thirst: "+ getThirst()+"\n"+"Boredom: "+ getBoredom()+"\n"+"Tiredness: "+ getTiredness()+"\n"+ "Waste: "+ getWaste()+
        "\n"+ "Cage waste level: " + getCageMessLvl();
    }
}
