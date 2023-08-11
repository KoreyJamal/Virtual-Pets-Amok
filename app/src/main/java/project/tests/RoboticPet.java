package project.tests;

import java.util.concurrent.ThreadLocalRandom;

public class RoboticPet extends VirtualPet{
    protected int oilLevel;
    protected int batteryLevel;


    public RoboticPet(String name, String description) {
        super(name, description);
        this.oilLevel = ThreadLocalRandom.current().nextInt(50, 80);
        this.batteryLevel = ThreadLocalRandom.current().nextInt(50, 80);
    }


    public int getOilLevel() {
        return oilLevel;
    }


    public int getBatterLevel() {
        return batteryLevel;
    }

    public void addOil(){
        System.out.println("You oiled " + name);
        this.oilLevel+= 25;
        this.batteryLevel+=5;
        tick();

        oilLevel = Math.max(0, Math.min(100, oilLevel));
        batteryLevel = Math.max(0, Math.min(100, batteryLevel));  
    }


    public void chargeBattery(){
        System.out.println("You charged " + name);
        this.batteryLevel+=50;
        this.oilLevel+=5;
        tick();
        
        oilLevel = Math.max(0, Math.min(100, oilLevel));
        batteryLevel = Math.max(0, Math.min(100, batteryLevel));   
    }
    
    public void tick() {
        batteryLevel+= ThreadLocalRandom.current().nextInt(1, 3);
        oilLevel+= ThreadLocalRandom.current().nextInt(1, 3);
    }

    public String toString(){
        return getName() + " - " + getDescription()+"\n"+ "Oil Level: "+ oilLevel+"\n"+"Battery Level: "+ batteryLevel;
    
    }
}
